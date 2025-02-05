package javaapplication34;
import java.util.Scanner;

public class JavaApplication34 { 
    
//int pedirValores (){
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int numChicles, numDonuts, numCoca_Colas;
        
        Tienda Vicalvaro, Rivas;  
        Rivas = new Tienda ("Calle Inventada 2");//Inicializar los valores de la variable en la clase a traves del construtor
        Vicalvaro = new Tienda ("Calle Inventada 1"); //Inicializar los valores de la variable en la clase a traves del construtor
         
        //Preguntar al usuario cuanto se ha vendido de cada producto en la tienda de Vicalvaro      
        System.out.println("¿Cuantos chicles se han vendidos en la tienda de Vicalvaro?");
        numChicles = sc.nextInt();
            
            while (numChicles < 0){
                System.out.println("Ese numero es negativo, no vale ");
                System.out.println("¿Cuantos chicles se han vendidos en la tienda de Vicalvaro?");
                numChicles = sc.nextInt();
            }
        System.out.println("¿Cuantos donuts se han vendido en la tienda de Vicalvaro?");
        numDonuts = sc.nextInt();
        
            while (numDonuts < 0){
                System.out.println("Ese numero es negativo, no vale ");
                System.out.println("¿Cuantos donuts se han vendidos en la tienda de Vicalvaro?");
                numChicles = sc.nextInt();
            }
        
        System.out.println("¿Cuantas Coca-Colas se han vendido en la tienda de Vicalvaro?");
         numCoca_Colas = sc.nextInt();
         
            while (numCoca_Colas < 0){
                System.out.println("Ese numero es negativo, no vale ");
                System.out.println("¿Cuantas Coca-Colas se han vendidos en la tienda de Vicalvaro?");
                numChicles = sc.nextInt();
            }
        
        System.out.println(""); //Dar espacio    
        
       //Asignar los valores necesarios de cada metodo
        Vicalvaro.comprarChicles(numChicles);
        Vicalvaro.comprarDonuts(numDonuts);
        Vicalvaro.comprarCoca_Cola(numCoca_Colas);
        
        System.out.println("En Vicalvaro se han vendido:");//Mostrara un recuento de las ventas en Vicalvaro
        System.out.println(Vicalvaro.toString());;
        
        System.out.println("");//Dar espacio
        
        //Preguntar al usuario cuanto se ha vendido de cada producto en la tienda de Rivas  
        System.out.println("¿Cuantos chicles se han vendidos en la tienda de Rivas?");
        numChicles = sc.nextInt();
            
            while (numChicles < 0){
                System.out.println("Ese numero es negativo, no vale ");
                System.out.println("¿Cuantos chicles se han vendidos en la tienda de Vicalvaro?");
                numChicles = sc.nextInt();
            }
         
        System.out.println("¿Cuantos donuts se han vendido en la tienda de Rivas?");
        numDonuts = sc.nextInt();
            
            while (numDonuts < 0){
                System.out.println("Ese numero es negativo, no vale ");
                System.out.println("¿Cuantos donuts se han vendidos en la tienda de Vicalvaro?");
                numChicles = sc.nextInt();
            }
            
        System.out.println("¿Cuantas Coca-Colas se han vendido en la tienda de Rivas?");
        numCoca_Colas = sc.nextInt();
            
            while (numCoca_Colas < 0){
                System.out.println("Ese numero es negativo, no vale ");
                System.out.println("¿Cuantas Coca-Colas se han vendidos en la tienda de Vicalvaro?");
                numChicles = sc.nextInt();
            }
        
                    
        //Asignar los valores necesarios de cada metodo
        Rivas.comprarChicles(numChicles);
        Rivas.comprarDonuts(numDonuts);
        Rivas.comprarCoca_Cola(numCoca_Colas);
        
        System.out.println("");//Dar espacio
        System.out.println(Rivas.toString());
        //System.out.println("En Rivas se han vendido:");//Mostrara un recuento de las ventas en Rivas
        //Rivas.consultarVentasParciales();
        
        System.out.println("");//Dar espacio
        
        System.out.println("En total se han vendido: ");//Mostrara un recuento de las ventas entre todas las tiendas
        Rivas.consultarVentasTotales(); 
        //System.out.println(Rivas.toString());
    }    
}
