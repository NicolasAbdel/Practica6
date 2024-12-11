package ec.edu.epn.modelo;

import ec.edu.epn.excepciones.ExcepcionCuentaNoCreada;

public class CuentaAhorros {
    private double monto;
    private String categoria;
    private int antiguedad;

    public CuentaAhorros(double monto) throws ExcepcionCuentaNoCreada {
        if (monto >= 180) {
            this.monto = monto;
            identificarCategoria();
            antiguedad = 0;
        } else {
            throw new ExcepcionCuentaNoCreada();
        }
    }

    public double getMonto() {
        return monto;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.monto += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (this.monto >= cantidad && puedeRetirar()) {
            this.monto -= cantidad;
        }
        identificarCategoria();
    }

    private void identificarCategoria() {
        if (this.monto > 2500) {
            this.categoria = "VIP";
        } else {
            this.categoria = "NORMAL";
        }
    }

    public boolean puedeRetirar() {
        return antiguedad > 4;
    }

    public void incrementarAntiguedad() {
        antiguedad++;
    }
}
