package javaapplication34;

public class Tienda { //Crear la clase
    //Meter las variables necesarias de la clase
    String direccion;    
    int chiclesVendidos;
    int donutsVendidos;
    int coca_ColasVendidas;
    //Inidicar ... ¿contadores?
    static int ventas_globales_chicles;
    static int ventas_globales_donuts;
    static int ventas_globales_Coca_Cola;
        
    Tienda(String direccion){ //Construtor
    this.direccion = direccion;
     }
    //Metodos que añaden las ventas parciales en los contadores
    int comprarChicles (int numChicles){ 
        ventas_globales_chicles += numChicles;
        chiclesVendidos += numChicles;
        return chiclesVendidos;        
    }
    int comprarDonuts (int numDonuts){
        ventas_globales_donuts += numDonuts;
        donutsVendidos += numDonuts;
        return donutsVendidos;
    }
    int comprarCoca_Cola (int numCoca_Cola){
        ventas_globales_Coca_Cola += numCoca_Cola;
        coca_ColasVendidas += numCoca_Cola;
        return coca_ColasVendidas;           
    }
    @Override
    public String toString(){
        return "Se han vendido " + chiclesVendidos +" chicles, " + donutsVendidos + " donuts y " + coca_ColasVendidas + " Coca-Colas.";
        
    }
   /* void consultarVentasParciales (){
        
        System.out.println("Chicles: " + chiclesVendidos);
        System.out.println("Donuts: " + donutsVendidos);
        System.out.println("Coca-Colas: " + coca_ColasVendidas);
    }*/
    //Mostrar las ventas totales
    static void consultarVentasTotales(){
        System.out.println("Chicles: " + ventas_globales_chicles);
        System.out.println("Donuts: " + ventas_globales_donuts);
        System.out.println("Coca-Colas: " + ventas_globales_Coca_Cola);
    }
}
