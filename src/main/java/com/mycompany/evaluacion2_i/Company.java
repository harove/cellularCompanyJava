
package com.mycompany.evaluacion2_i;
import java.util.Scanner;
public class Company {
    private String nombre;
    private Cliente []clienteCelular;
    private int cantidadCliente;
    private int capacidadMaxima;

    public Company(int capacidadMaxima) {
        clienteCelular = new Cliente[capacidadMaxima];
        this.capacidadMaxima = capacidadMaxima;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente[] getClienteCelular() {
        return clienteCelular;
    }

    public void setClienteCelular(Cliente[] clienteCelular) {
        this.clienteCelular = clienteCelular;
    }

    public int getCantidadCliente() {
        return cantidadCliente;
    }

    public void setCantidadCliente(int cantidadCliente) {
        this.cantidadCliente = cantidadCliente;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void agregarCliente(Cliente cliente){
        
        if(cantidadCliente < capacidadMaxima){
            clienteCelular[cantidadCliente] = cliente;
            cantidadCliente++;
        }else{
            System.out.println("Se ha alcanzado el límite de clientes");
        }
       
    }

    public void listarCliente(){
        for(Cliente cliente:clienteCelular){
            System.out.println("Nombre del cliente: " + cliente.getNombre());
            System.out.println("Numero del celular: " + cliente.getCelular().getNumero());
            if (cliente.isPlan()){
                System.out.println("Sí plan");
            }else{
                System.out.println("No plan");
            }
            
        }
    }
    
    public boolean buscarCliente(String rut){
        boolean flag = false;
        System.out.println("rut recibido"+rut);
        for(Cliente cliente:clienteCelular){
            
            if (cliente.getRut().equals(rut)){
                flag = true;
            }
        }
        return flag;
    }
    
    
    public void modificarCelular(String rut,int numero){
        Scanner valor = new Scanner(System.in);
        if (buscarCliente(rut)){
            System.out.println("Cliente encontrado");
            for (Cliente cliente:clienteCelular){
                if (rut.equals(cliente.getRut())){
                    cliente.getCelular().setNumero(valor.nextInt());
                }
            }       
        }else{
            System.out.println("Cliente no encontrado");
        }
    }   
}
