package com.ggave.gestorgastos;

public class Listado {

    private Integer monto;
    private String ingreso_egreso;
    private String tipo;

    public Listado(Integer monto, String ingreso_egreso, String tipo) {
        this.monto = monto;
        this.ingreso_egreso = ingreso_egreso;
        this.tipo = tipo;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public String getIngreso_egreso() {
        return ingreso_egreso;
    }

    public void setIngreso_egreso(String ingreso_egreso) {
        this.ingreso_egreso = ingreso_egreso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
