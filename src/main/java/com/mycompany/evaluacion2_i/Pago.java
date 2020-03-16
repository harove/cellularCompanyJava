/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.evaluacion2_i;

/**
 *
 * @author harove
 */
public class Pago extends Company{
    
    private String id;
    private int valor_mensual;
    private int fecha_emision;

    public Pago(String id, int valor_mensual, int fecha_emision, int capacidadMaxima) {
        super(capacidadMaxima);
        this.id = id;
        this.valor_mensual = valor_mensual;
        this.fecha_emision = fecha_emision;
    }


    
    
    
    
}
