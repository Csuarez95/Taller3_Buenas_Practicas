package com.company.Interfaces;

import com.company.Classes.Song;
import com.company.Classes.SongList;

import java.util.ArrayList;

/**
 * Interfaz creada para la organización de las canciones por fecha y duración.
 * @author Cristian Suárez Acosta.
 * @author Yeisson Vahos Cortes
 */
public interface Organize {

    /**
     * Método para organizar la canción por duración, heredado de la interfaz
     * Organize.
     * @param songs Objeto con las características de la canción.
     */
    static void organizeListDuration(ArrayList<SongList> songs) {
        ArrayList list1 = new ArrayList<>();
        ArrayList<SongList> listOrderByDuration = new ArrayList<SongList>();
        for (SongList i: songs) {
            ArrayList list2 = new ArrayList<>();
            list2.add(i.getDuration());
            list2.add(i.getId());
            list1.add(list2);
        }
        ArrayList OrderList1 = new ArrayList<>();
        while (list1.size() > 0) {
            for (int k = 0; k < list1.size(); k++){
                ArrayList Pos = (ArrayList) list1.get(k);
                int durat = (int) Pos.get(0);
                int ident = (int) Pos.get(1);
                boolean menor = true;

                for (int l = 0; l < list1.size(); l++){
                    if (l != k){
                        ArrayList Pos2 = (ArrayList) list1.get(l);
                        int durat2 = (int) Pos2.get(0);
                        int ident2 = (int) Pos2.get(1);
                        if (durat > durat2){
                            menor = false;
                        }
                    }
                }
                if (menor) {
                    OrderList1.add(Pos);
                    list1.remove(k);
                    k = k - 1;
                }
            }
        } //Cierre del ciclo While.

        for (int j = 0; j < OrderList1.size(); j++){
            for (SongList i: songs) {
                ArrayList Pos1 = (ArrayList) OrderList1.get(j);
                if ((Pos1.get(0).equals(i.getDuration())) &&
                        (Pos1.get(1).equals(i.getId())))
                {
                    listOrderByDuration.add(i);
                }
            }
        }
        for (Song j: listOrderByDuration){
            System.out.println(j.toString());
        }
    } //Cierre del método organizeListDuration.
}
