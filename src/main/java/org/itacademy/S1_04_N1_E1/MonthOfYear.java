package org.itacademy.S1_04_N1_E1;

import java.util.ArrayList;

public class MonthOfYear {
    public MonthOfYear() {
        insertMonth();
    }

    public ArrayList<String> insertMonth() {
        ArrayList<String> months = new ArrayList<>();
        months.add("Gener");
        months.add("Febrer");
        months.add("Març");
        months.add("Abril");
        months.add("Maig");
        months.add("Juny");
        months.add("Juliol");
        months.add("Agost");
        months.add("Setembre");
        months.add("Octubre");
        months.add("Novembre");
        months.add("Desembre");
        return months;
    }
}