package com.company.Main;

import com.company.Classes.Input;
import com.company.Classes.Song;
import com.company.Classes.SongList;
import com.company.Interfaces.Filter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Programa para organizar la bibliotecla de música.
 * @author Cristian Suárez Acosta.
 * @author Yeisson Vahos Cortes.
 *
 */

public class Main {

    /**
     * Metodo que inicializar el proyecto para que el usuario de manera
     * interactiva añada canciones a una biblioteca de música, creando un
     * playlist con sus canciones favoritas y eliminando de la biblioteca las
     * canciones que no desee escuchar.
     * Se emplea los condicionales switch-case para acceder a las opciones
     * que son otorgadas en el menú,
     * adicional, tomando decisiones con condicionales if.
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Mensaje de bienvenida.
         */
        System.out.println("-------------------------------------------------");
        System.out.println("Biblioteca de canciones personalizada");
        System.out.println("-------------------------------------------------");
        ArrayList<SongList> mainList = new ArrayList<>();
        ArrayList<SongList> playList = new ArrayList<>();
        boolean mainFlag = true;

        while (mainFlag) {
            /**
             * Menú inicial para que el usuario seleccione la opción que
             * desea realizar.
             */
            System.out.println("Menú inicial");
            System.out.println("Seleccione una de las siguientes opciones");
            System.out.println("1. Agregar canción \n2. Ver canciones \n3. " +
                    "Salir");
            int selection = Input.verificationNumber();

            /**
             * Condicional switch case para acceder a las diversas opciones.
             */
            switch (selection) {
                case 1:
                    System.out.println("Ingrese los datos correspondientes " +
                            "para la canción");
                    SongList.addSong(mainList);
                    break;
                case 2:
                    boolean flag2 = true;
                    while (flag2){
                        if (mainList.isEmpty()) {
                            System.out.println("La biblioteca de canciones se" +
                                    " encuentra vacía\n");
                            flag2 = false;
                        } else {
                            System.out.println("Lista de biblioteca");
                            for (Song i: mainList) {
                                System.out.println(i.toString());
                            }
                            System.out.println("Seleccione una de las " +
                                    "siguientes opciones");
                            System.out.println("1. Crear Playlist \n2. " +
                                    "Eliminar canción \n3. Filtrar canciones " +
                                    "\n4. Organizar canciones \n5. Salir");
                            int musicMenu = Input.verificationNumber();

                            switch (musicMenu) {
                                case 1:
                                    if (playList.isEmpty()) {
                                        playList.add(SongList.createPlayList(
                                                mainList, playList));
                                        System.out.println("Lista actual de " +
                                                "Playlist");
                                        for (Song i: playList) {
                                            System.out.println(i.toString());
                                        }
                                        boolean flag3 = true;
                                        while (flag3){
                                            System.out.println("¿Desea " +
                                                    "agregar otra canción?");
                                            System.out.println("1. SI\n 2. NO");
                                            int option =
                                                    Input.verificationNumber();
                                            switch (option) {
                                                case 1:
                                                    SongList songForPlayList =
                                                        SongList.createPlayList(
                                                                mainList,
                                                                playList);
                                                    if (songForPlayList != null)
                                                    {
                                                        playList.add(
                                                                songForPlayList);
                                                        System.out.println(
                                                            "Lista actual" +
                                                                    " de " +
                                                                    "Playlist");
                                                        for (Song i: playList) {
                                                            System.out.println(
                                                                i.toString());
                                                        }
                                                    }
                                                    break;
                                                case 2:
                                                    System.out.println("Lista" +
                                                            " creada de Playlist");
                                                    for (Song i: playList) {
                                                        System.out.println(
                                                                i.toString());
                                                    }
                                                    flag3 = false;
                                                    break;
                                                default:
                                                    System.out.println(
                                                            "Ingrese opción " +
                                                                    "válida");
                                            }
                                        } //Cierre while flag3.
                                    } else {
                                        boolean flag4 = true;
                                        while (flag4){
                                            System.out.println("¿Desea " +
                                                    "reemplazar la Playlist " +
                                                    "existente?");
                                            System.out.println("1. SI \n2. NO");
                                            int option1 =
                                                    Input.verificationNumber();
                                            switch (option1) {
                                                case 1:
                                                    playList.removeAll(playList);
                                                    playList.add(
                                                            SongList.createPlayList(
                                                                    mainList,
                                                                    playList));
                                                    System.out.println("Canci" +
                                                            "ón agregada a la" +
                                                            " playlist");
                                                    boolean flag3 = true;
                                                    while (flag3){
                                                        System.out.println(
                                                            "¿Desea agregar " +
                                                                "otra canción?");
                                                        System.out.println("1" +
                                                                ". SI \n2. NO");
                                                        int option2 =
                                                            Input.
                                                            verificationNumber();
                                                        switch (option2) {
                                                            case 1:
                                                                playList.add(
                                                                    SongList.
                                                                    createPlayList(
                                                                        mainList,
                                                                        playList));
                                                                System.out.println(
                                                                    "Canción " +
                                                                    "agregada" +
                                                                    " a la " +
                                                                    "playlist");
                                                                break;
                                                            case 2:
                                                                System.out.println(
                                                                    "Lista " +
                                                                    "creada " +
                                                                    "de " +
                                                                    "Playlist");
                                                                for (Song i:
                                                                        playList)
                                                                {
                                                                    System.out.
                                                                    println(
                                                                    i.toString());
                                                                }
                                                                flag3 = false;
                                                                flag4 = false;
                                                                break;
                                                            default:
                                                                System.out.println(
                                                                    "Ingrese " +
                                                                    "opción " +
                                                                    "válida");
                                                        }
                                                    }
                                                    break;
                                                case 2:
                                                    flag4 = false;
                                                    break;
                                                default:
                                                    System.out.println("" +
                                                        "Ingrese opción válida");
                                            }
                                        } //Cierre de while con flag4.
                                    }
                                    break;
                                case 2:
                                    System.out.println("Eliminando canción");
                                    if (mainList.isEmpty()){
                                        System.out.println("No hay canciones " +
                                                "para eliminar");
                                    } else {
                                        mainList =
                                                SongList.eliminateSong(mainList);
                                    }

                                    boolean flag5 = true;
                                    while (flag5){
                                        System.out.println("¿Desea eliminar " +
                                                "otra canción?");
                                        System.out.println("1. SI \n 2. NO");
                                        int option = Input.verificationNumber();
                                        switch (option) {
                                            case 1:
                                                mainList =
                                                        SongList.
                                                                eliminateSong(mainList);
                                                break;
                                            case 2:
                                                if (mainList.isEmpty()){
                                                    System.out.println("No " +
                                                            "hay canciones para " +
                                                            "eliminar");
                                                }
                                                flag5 = false;
                                                break;
                                            default:
                                                System.out.println("Ingrese " +
                                                        "opción válida");
                                        }
                                    } //Cierre while flag5
                                    break;
                                case 3:
                                    boolean flag6 = true;
                                    while (flag6) {
                                        System.out.println("Filtrado de " +
                                            "canciones de la biblioteca");
                                        System.out.println("¿Que tipo de " +
                                            "filtro desea aplicar a la " +
                                                "biblioteca?");
                                        System.out.println("1. Por género \n2" +
                                            ". Por año\n3. Regresar al menú");
                                        int option2 = Input.verificationNumber();
                                        switch (option2){
                                            case 1:
                                                System.out.println("¿Por cual" +
                                                        " género desea filtrar?");
                                                Scanner input =
                                                        new Scanner(System.in);
                                                String genre = input.nextLine();
                                                genre =
                                                        Input.verificationString(
                                                                genre);
                                                Filter.genreFilter(mainList,
                                                        genre);
                                                break;
                                            case 2:
                                                System.out.println("¿Por cual" +
                                                        " año desea filtrar?");
                                                int year =
                                                        Input.verificationNumber();
                                                Filter.yearFilter(mainList,
                                                        year);
                                                break;
                                            case 3:
                                                flag6 = false;
                                                break;
                                            default:
                                                System.out.println("Ingrese " +
                                                        "opción válida");
                                        }
                                    }
                                    break;
                                case 4:
                                    boolean flag7 = true;
                                    while (flag7) {
                                        System.out.println("Organización de " +
                                                "canciones");
                                        System.out.println("¿Que tipo de " +
                                                "organización desea aplicar a" +
                                                " la biblioteca?");
                                        System.out.println("1. Por duración " +
                                                "\n2. Por fecha\n3. Regresar " +
                                                "al menú");
                                        int option3 = Input.verificationNumber();
                                        switch (option3){
                                            case 1:
                                                System.out.println(
                                                        "Organizando por " +
                                                                "duración");
                                                Organize.organizeListDuration(
                                                        mainList);
                                                break;
                                            case 2:
                                                System.out.println(
                                                        "Organizando por fecha");
                                                Organize.organizeListDate(
                                                        mainList);
                                                break;
                                            case 3:
                                                flag7 = false;
                                                break;
                                            default:
                                                System.out.println("Ingrese " +
                                                        "opción válida");
                                        }
                                    }
                                    break;
                                case 5:
                                    System.out.println("Saliendo al menú " +
                                            "inicial");
                                    flag2 = false;
                                    break;
                                default:

                            } //Cierre del condicional musicMenu
                        }
                    } //Cierre while flag2
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    mainFlag = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese un número dentro de las " +
                            "opciones dadas");
            }
        }
    }
}
