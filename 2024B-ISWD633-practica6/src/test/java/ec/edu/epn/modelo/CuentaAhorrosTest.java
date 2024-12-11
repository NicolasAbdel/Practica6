package ec.edu.epn.modelo;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import ec.edu.epn.excepciones.ExcepcionCuentaNoCreada;

public class CuentaAhorrosTest {

    @Test
    public void testCuentaAhorro() throws ExcepcionCuentaNoCreada {
        double monto = 2501;
        CuentaAhorros cuenta = new CuentaAhorros(monto);
        int antiguedadEsperada = 0;
        String categoriaEsperada = "VIP";
        assertEquals(antiguedadEsperada, cuenta.getAntiguedad());
        assertEquals(categoriaEsperada, cuenta.getCategoria());
    }
}

