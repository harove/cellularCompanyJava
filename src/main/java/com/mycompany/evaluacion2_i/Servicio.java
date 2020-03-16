
package com.mycompany.evaluacion2_i;

public class Servicio extends Company{
    private String codigo;
    private String tipo_servicio;

    public Servicio(String codigo, String tipo_servicio, int capacidadMaxima) {
        super(capacidadMaxima);
        this.codigo = codigo;
        this.tipo_servicio = tipo_servicio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

}
