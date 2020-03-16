
package com.mycompany.evaluacion2_i;


public class Cliente{
    private String rut; 
    private String nombre;
    private int edad;
    private char sexo;
    private boolean plan;
    private Celular celular;

    public Cliente(String rut, String nombre, int edad, char sexo, boolean plan, Celular celular) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.plan = plan;
        this.celular = celular;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        
        if (edad>18){
            this.edad = edad;
        }else{
            System.out.println("La edad debe ser mas de 18");
        }
       
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        
        if (sexo == 'M'){
            this.sexo = sexo;
        }else{
            System.out.println("M o F");
        }
        
    }

    public boolean isPlan() {
        return plan;
    }

    public void setPlan(boolean plan) {
        this.plan = plan;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", plan=" + plan + ", celular=" + celular + '}';
    }

    
    
    
    
}
