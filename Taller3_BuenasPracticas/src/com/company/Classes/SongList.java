package com.company.Classes;

import com.company.Interfaces.Filter;
import com.company.Interfaces.Organize;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase creada para el ingreso de las características de la canción,
 * heredando la clase Song e implementando las interfaces Filter y Organize.
 * @author Cristian Suárez Acosta.
 * @author Yeisson Vahos Cortes.
 */
public class SongList extends Song implements Filter, Organize {

    /**
     * Constructor para la toma de información ingresada por teclado.
     * @param title Atributo para guardar el título
     * @param id Atributo para guardar la identificación
     * @param date Atributo para guardar la fecha
     * @param duration Atributo para guardar la duración.
     * @param genre Atributo para guardar el género musical.
     * @param cover Atributo para guardar la portada.
     * @param description Atributo para guardar la descripción de la canción.
     */
    public SongList(
            String title,
            int id,
            LocalDate date,
            int duration,
            String genre,
            String cover,
            String description)
    {
        /**
         * Atributos heredados de la clase abstracta Song.
         */
        super(title, id, date, duration, genre, cover, description);
    } //Cierre del constructor.

    /**
     * Método para creación de la lista con las características de la canción.
     * @param songs Lista creado para el almacenamiento de las características.
     * @return Objeto con las características de la canción.
     */
    public static ArrayList<SongList> addSong(ArrayList<SongList> songs) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la canción");
        String title = input.nextLine();
        title = Input.verificationString(title);

        int id = songs.size() + 1;

        LocalDate date = Input.verificationDate();

        int duration = Input.verificationDuration();

        System.out.println("Ingrese el género de la canción");
        String genre = input.nextLine();
        genre = Input.verificationString(genre);

        String cover = title.replace(" ", "") + ".png";

        System.out.println("Ingrese la descripción de la canción");
        String description = input.nextLine();
        description = Input.verificationString(description);

        SongList song = new SongList(
                title,
                id,
                date,
                duration,
                genre,
                cover,
                description);
        songs.add(song);

        System.out.println("La canción ha sido registrada con éxito");

        return songs;
    } //Cierre del método addSong.

    /**
     * Método para creación de la Playlist con las canciones de la biblioteca.
     * @param mainList Lista principal de la biblioteca.
     * @param playList Lista para almacenamiento de la playlist.
     * @return Lista de canciones que se encuentran añadidas a la playlist.
     */
    public static SongList createPlayList(
            ArrayList<SongList> mainList,
            ArrayList<SongList> playList)
    {
        SongList songForList = null;
        for (Song i: mainList) {
            System.out.println(i.toString());
        }

        System.out.println("Ingrese el identificador de la canción que desee " +
                "agregar");
        int idSong = Input.verificationNumber();

        boolean validate1 = false;
        for (SongList i: playList) {
            if (idSong == i.getId()) {
                System.out.println("La canción ya se encuentra en la " +
                        "Playlist");
                validate1 = true;
                break;
            }
        }

        if (!validate1) {
            boolean validate2 = false;
            for (SongList i: mainList) {
                if (idSong == i.getId()) {
                    songForList = i;
                    //System.out.println(songForList);
                    validate2 = true;
                    break;
                }
            }
            if (!validate2) {
                System.out.println("No existe canción con el identificador " +
                        "ingresado");
            }

        }

        return songForList;
    }

    /**
     * Método para eliminar canción de la Playlist.
     * @param mainList Parámetro donde se agrega la lista de la playlist
     * @return Lista con la playlist actualizada.
     */
    public static ArrayList<SongList> eliminateSong(
            ArrayList<SongList> mainList)
    {
        for (Song i: mainList) {
            System.out.println(i.toString());
        }
        System.out.println("Ingrese el identificador de la canción que desee " +
                "eliminar");
        int idSong = Input.verificationNumber();

        boolean validate1 = false;
        for (SongList i: mainList) {
            if (idSong == i.getId()) {
                mainList.remove(i);
                validate1 = true;
                System.out.println("Canción eliminada con éxito");
                break;
            }
        }
        if (!validate1) {
            System.out.println("La canción no existe en la biblioteca");
        }
        return mainList;
    }
}//Cierre de la clase SongList.
