package S1_04_N1_E2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.itacademy.S1_04_N1_E2.CalcDni;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcDniTest {
    @Test
    @DisplayName("Calcula lletra del DNI")
    void calcLetterDNI() {
        CalcDni calcDni = new CalcDni();
        assertEquals("M",calcDni.calcDNI(51393390), "Lletra DNI no correcte");
    }

    @ParameterizedTest(name = "{0} = {1}")
    @CsvSource({
            "51393390,    M",
            "384512,      K",
            "38741268,    E",
            "43000258,    X",
            "326580,      A",
            "48413025,    A",
            "37123321,    X",
            "00034564,    B",
            "31111222,    L",
            "48123951,    Q"
    })
    void add(Integer dni, String expectedResult) {
        CalcDni calcDni = new CalcDni();
        assertEquals(expectedResult,calcDni.calcDNI(dni), ()-> "La letra del dni " + dni+ "-"+ expectedResult + " no es correcta");

    }
}