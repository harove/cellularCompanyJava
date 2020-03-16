
package com.mycompany.evaluacion2_i;
import java.util.Scanner;

public class Principal {
      public static void main(String[] args){ 
          
          Celular cell1 = new Celular(12345678,"Huawei",3);
          Celular cell2 = new Celular(55555555,"Samsung",3);
          Celular cell3 = new Celular(12121212,"Apple",3);
          
          Cliente cliente1 = new Cliente("123-4","Pedrito",40,'M',true,cell1);
          Cliente cliente2 = new Cliente("555-4","Juanito",25,'M',true,cell2);
          Cliente cliente3 = new Cliente("1212-4","Erika",37,'F',true,cell3);  
          
          Company compania = new Company(3);
         
          
          compania.agregarCliente(cliente1);
          compania.agregarCliente(cliente2);
          compania.agregarCliente(cliente3);
          
          //compania.listarCliente();
        
          
          
//          System.out.println("Existe el cliente 123-"+compania.buscarCliente("123-"));
//          
//          compania.modificarCelular("123-4", 9);
            
          //System.out.println(cliente1);
          
          
          
          System.out.println("Bienvenidos a Celular.Com");
          System.out.println("Ingrese una opción: ");
          System.out.println("1.- Imprima los atributos de los clientes.");
          System.out.println("2.- Agrega un cliente. ");
          System.out.println("3.- Busque un cliente según su rut. ");
          System.out.println("4.- Modifique un celular según su rut.");
          System.out.println("5.- Imprimir lista de clientes.");
          System.out.println("6.- Salir. ");
          Scanner valorInt = new Scanner(System.in);
          Scanner valorStr = new Scanner(System.in);
          
          int a = valorInt.nextInt();
         
          if (a==1){
              System.out.println(cliente1);
              System.out.println(cliente2);
              System.out.println(cliente3);
          }
          if(a==2){
              
              System.out.println("Elija un cliente 1,2 o 3");
              int b = valorInt.nextInt(); 
              compania.agregarCliente(cliente1);
          }
          
          if (a==3){
              System.out.println("Ingrese el rut del cliente: ");
              String rut = valorStr.nextLine();
              System.out.println(rut);
              System.out.println(rut);
              if (compania.buscarCliente(rut)){
                  System.out.println("Cliente encontrado!");
          }
              else{
                  System.out.println("Cliente no encontrado");
              }
          }
          
          
          
          
      }
}
