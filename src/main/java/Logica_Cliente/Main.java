/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Ala;
import Logica_Negocio.Avion;
import Logica_Negocio.Comun;
import Logica_Negocio.Fuselaje;
import Logica_Negocio.Llanta;
import Logica_Negocio.Motor;
import Logica_Negocio.Pasajero;
import Logica_Negocio.Vip;
import Logica_Negocio.Vuelo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1002805933
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String codigo, identificacion, nombre, marca, fuselaje, motor1, motor2, ala1,ala2,id_vuelo,aerolinea;
        Fuselaje objFuselaje;
        Motor objmotor1;
        Motor objmotor2;
        Ala objala1;
        Ala objala2;
        Llanta objllanta1= new Llanta("Grande");
        Llanta objllanta2= new Llanta("Grande");
        ArrayList<Motor>listamotores= new ArrayList<>();
        ArrayList<Llanta>listallantas= new ArrayList<>();
        ArrayList<Ala>listaalas= new ArrayList<>();
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Digite el código del cliente:");
        codigo= scan.nextLine();
        System.out.println("Digite la identificación del cliente:");
        identificacion= scan.nextLine();
        System.out.println("Digite nombre del cliente:");
        nombre= scan.nextLine();
        System.out.println("Digite la marca del avión:");
        marca= scan.nextLine();
    System.out.println("Digite el tipo del fuselaje del avion");
        fuselaje=scan.nextLine();
        objFuselaje=new Fuselaje(fuselaje);
        
        System.out.println("Digite el tamaño del motor 1 del avion");
        motor1=scan.nextLine();
        objmotor1=new Motor(motor1);
        
        System.out.println("Digite el tamaño del motor 2 del avion");
        motor2=scan.nextLine();
        objmotor2=new Motor(motor2);
        
        System.out.println("Digite la posicion del ala 1 del avion");
        ala1=scan.nextLine();
        objala1=new Ala(ala1);
        
        System.out.println("Digite la posicion del ala 2 del avion");
        ala2=scan.nextLine();
        objala2=new Ala(ala2);
        
        listamotores.add(objmotor1);
        listamotores.add(objmotor2);
        
        listaalas.add(objala1);
        listaalas.add(objala2);
        
        listallantas.add(objllanta1);
        listallantas.add(objllanta2);
        
        System.out.println("Digite el id del vuelo");
        id_vuelo=scan.nextLine();
        
        System.out.println("Digite la aerolinea del vuelo");
        aerolinea=scan.nextLine();

        Pasajero objpaPasajero = new Vip(codigo, identificacion, nombre);
                if(objpaPasajero instanceof Vip){
                    System.out.println("Cliente VIP");
                }else if(objpaPasajero instanceof Comun){
                    System.out.println("Cliente Comun");
                }
        Avion objavion= new Avion(marca, objFuselaje, listamotores, listaalas, listallantas);
        Vuelo objvuelo= new Vuelo(id_vuelo, aerolinea, objavion, objpaPasajero);
        Helpers.HelperImpresion.ImprimirInfoVuelo(objvuelo);
    }
    
}
