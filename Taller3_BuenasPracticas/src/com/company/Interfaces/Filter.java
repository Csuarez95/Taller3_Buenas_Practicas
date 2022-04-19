package com.company.Interfaces;

import com.company.Classes.Song;
import com.company.Classes.SongList;

import java.util.ArrayList;

/**
 * Interfaz creada para el filtrado de las canciones por género y año.
 * @author Cristian Suárez Acosta
 * @author Yeisson Vahos Cortes
 */
public interface Filter {

    /**
     * Método para filtrado del año heredado de la interfaz Filter.
     * @param songs Objeto con las características de la canción.
     * @param year Parámetro que almacena el género de la canción.
     */
    static void yearFilter(ArrayList<SongList> songs, int year) {
        ArrayList<SongList> listFilterByYear = new ArrayList<SongList>();
        for (SongList i: songs) {
            if (i.getDate().getYear() == year){
                listFilterByYear.add(i);
            }
        }
        if (listFilterByYear.isEmpty()){
            System.out.println("No existen canciones asociadas al año " +
                    "ingresado.");
        } else {
            for (SongList j: listFilterByYear){
                System.out.println(j.toString());
            }
        }

    } //Cierre del método yearFilter.
}
