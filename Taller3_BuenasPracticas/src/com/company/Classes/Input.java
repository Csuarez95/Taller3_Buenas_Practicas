package com.company.Classes;

import java.util.Scanner;

public class Input {

    /**
     * Método para validación del ingreso de la duración en segundos.
     * @return Duración de la canción.
     */
    public static int verificationDuration () {
        Boolean verification = false;
        Scanner input = new Scanner(System.in);
        int duration = 0;
        while (!verification){
            try {
                System.out.println("Ingrese la duración de la canción en " +
                        "segundos");
                duration = Integer.parseInt(input.nextLine());
                verification = true;
            } catch (Exception e) {
                System.out.println("El valor debe ser un numero entero, " +
                        "por favor, ingrese uno válido");
            }
        } //Cierre del ciclo While.
        return duration;
    } //Cierre del método verificationDuration

    /**
     * Método para validación del ingreso de la duración en número entero.
     * @return Número entero comprobado.
     */
    public static int verificationNumber () {
        Boolean verification = false;
        Scanner input = new Scanner(System.in);
        int number = 0;
        while (!verification){
            try {
                System.out.println("Ingrese un número dentro de las opciones");
                number = Integer.parseInt(input.nextLine());
                verification = true;
            } catch (Exception e) {
                System.out.println("El valor debe ser un numero entero, " +
                        "por favor, ingrese uno válido");
            }
        } //Cierre del ciclo While.
        return number;
    } //Cierre del método verificationDuration
} //Cierre de la clase Input
