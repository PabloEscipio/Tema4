package lunes.uno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class mainTest {

    @Test
    public void testSumar() {
        assertEquals(Calculadora1.suma(2,3),5);
    }

}