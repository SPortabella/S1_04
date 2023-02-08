package S1_04_N1_E3;

import org.itacademy.S1_04_N1_E3.LanzaException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class LanzaExceptionTest {
    @Test
    void lanzaException() {
        LanzaException lanzaException = new LanzaException();
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () ->
                lanzaException.checkException(3, 4));
    }

}
