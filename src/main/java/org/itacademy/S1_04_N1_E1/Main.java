package org.itacademy.S1_04_N1_E1;

import java.util.ArrayList;

public class Main {
    // Crea una classe Java que insereixi en una llista ordenada els noms dels mesos
    // de l'any. Verifica amb jUnit que la llista té 12 posicions, i que la la seva posició 8
    // conté el nom 'agost'.

    public static void main(String[] args) {
        ArrayList<String> months = new MonthOfYear().insertMonth();
        System.out.println(months);
    }

}