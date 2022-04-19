package com.company.Classes;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Claro para la validación de los datos que son ingresados por teclado.
 * @author Cristian Suárez Acosta
 * @author Yeisson Vahos Cortes
 */
public class Input {

    /**
     * Método para validación que no haya un campo vacío en la entrada de
     * texto.
     * @param string Parámetro para almacenar el texto ingresado por teclado.
     * @return Texto ingresado.
     */
    public static String verificationString (String string) {
        while (string.isEmpty()){
            Scanner input = new Scanner(System.in);
            System.out.println("El campo de texto no puede estar vacío, por " +
                    "favor ingrese el texto soliciado");
            string = input.nextLine();
        }
        return string;
    } //Cierre del método verificationString.

    /**
     * Método para validación del ingreso de la fecha en el formato
     * correspondiente.
     * @return Fecha de la canción.
     */
    public static LocalDate verificationDate () {
        Boolean verification = false;
        Scanner input = new Scanner(System.in);
        LocalDate date = null;
        while (!verification){
            try {
                System.out.println("Ingrese la fecha de la canción en formato" +
                        " YYYY-MM-DD");
                date = LocalDate.parse(input.nextLine());
                verification = true;
            } catch (Exception e) {
                System.out.println("La fecha debe ser ingresada en formato " +
                        "yyyy-mm-dd");
            }
        } //Cierre del ciclo While.
        return date;
    } //Cierre del método verificationDate.

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
