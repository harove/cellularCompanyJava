
package com.mycompany.evaluacion2_i;

public class Celular extends Company {
    private int numero;
    private String marca;

    public Celular(int numero, String marca, int capacidadMaxima) {
        super(capacidadMaxima);
        this.numero = numero;
        this.marca = marca;
    }


    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        String num = ""+numero;
        if (num.length()==8){
             this.numero = numero;
        }else{
            System.out.println("El número ingresado debe contener 8 digitos");
        }
   
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Celular{" + "numero=" + numero + ", marca=" + marca + '}';
    }
    
    
    
}
