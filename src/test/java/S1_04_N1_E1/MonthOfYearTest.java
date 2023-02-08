package S1_04_N1_E1;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.itacademy.S1_04_N1_E1.MonthOfYear;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MonthOfYearTest {

    @Test
    @DisplayName("Number of Months 12")
    void calNumberOfMonths() {
        ArrayList<String> months = new MonthOfYear().insertMonth();
        assertEquals(12, months.size(), "Meses han de ser 12");
    }

    @Test
    @DisplayName("Is not null")
    void isNotNull() {
        ArrayList<String> months = new MonthOfYear().insertMonth();
        assertEquals(false, months.isEmpty(), "La taula es nul·la");
    }

    @Test
    @DisplayName("Agost is in 8 position")
    void checkAgost() {
        ArrayList<String> months = new MonthOfYear().insertMonth();
        assertEquals(8, (months.indexOf("Agost")+1), "Agost no està a la possició 8");
    }
}
