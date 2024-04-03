package Marcos.calcupro;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.io.Console;
import java.util.logging.ConsoleHandler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import main.Calculadora;

class CalculadoraTest {

    Calculadora calculadora;

    @BeforeEach
    void setUp() throws Exception {
        calculadora = new Calculadora();
    }

    @Test
    void insertarTest() {
        calculadora.insertar(-1.22);
        calculadora.insertar(2);
        calculadora.insertar(3);
        assertTrue(calculadora.getMemoria().contains(-1.22));
        assertTrue(calculadora.getMemoria().contains(2.0));
        //El 3 no debería de estar en la memoria porque está llena
        assertFalse(calculadora.getMemoria().contains(3.0));
    }

    @Test
    void borrarTest() {
        calculadora.insertar(1.2);
        calculadora.borrar();
        assertTrue(calculadora.getMemoria().isEmpty());
    }

    @Test
    void sumarTest() {
        calculadora.insertar(3);
        calculadora.insertar(2);
        calculadora.borrar();
        calculadora.insertar(5);
        calculadora.sumar();
        //Ver que el resultado es el adecuado (3+5=8)
        assertEquals(8, calculadora.getMemoria().get(0));
        //Comparar el tamaño de la memoria para ver si añade
        //o quita elementos que no debería
        assertEquals(1, calculadora.getMemoria().size());
    }

    @Test
    void restarTest() {
        calculadora.insertar(3);
        calculadora.insertar(2);
        calculadora.borrar();
        calculadora.insertar(5);
        calculadora.restar();
        //Ver que el resultado es el adecuado (3-5=-2)
        assertEquals(-2, calculadora.getMemoria().get(0));
        //Comparar el tamaño de la memoria para ver si añade
        //o quita elementos que no debería
        assertEquals(1, calculadora.getMemoria().size());
    }

    @Test
    void multiplicarTest() {
        calculadora.insertar(3);
        calculadora.insertar(2);
        calculadora.borrar();
        calculadora.insertar(5);
        calculadora.multiplicar();
        //Ver que el resultado es el adecuado (3*5=15)
        assertEquals(15, calculadora.getMemoria().get(0));
        //Comparar el tamaño de la memoria para ver si añade
        //o quita elementos que no debería
        assertEquals(1, calculadora.getMemoria().size());
    }

    @Test
    void dividirTest() {
        calculadora.insertar(3);
        calculadora.insertar(2);
        calculadora.borrar();
        calculadora.insertar(3);
        calculadora.dividir();
        //Ver que el resultado es el adecuado (3/3=1)
        assertEquals(1, calculadora.getMemoria().get(0));
        //Comparar el tamaño de la memoria para ver si añade
        //o quita elementos que no debería
        assertEquals(1, calculadora.getMemoria().size());
    }

    @Test
    void dividirEntreCeroTest() {
        calculadora.insertar(3);
        calculadora.insertar(2);
        calculadora.borrar();
        calculadora.insertar(0);
        calculadora.dividir();
        //No debería efectuar la división si el divisor es 0
        assertEquals(2, calculadora.getMemoria().size());
    }

    @Test
    void potenciaTest() {
        calculadora.insertar(3);
        calculadora.insertar(2);
        calculadora.borrar();
        calculadora.insertar(3);
        calculadora.potencia();
        //Ver que el resultado es el adecuado (3^3=27)
        assertEquals(27, calculadora.getMemoria().get(0));
        //Comparar el tamaño de la memoria para ver si añade
        //o quita elementos que no debería
        assertEquals(1, calculadora.getMemoria().size());
    }

}