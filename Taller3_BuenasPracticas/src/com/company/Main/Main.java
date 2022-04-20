package com.company.Main;

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
