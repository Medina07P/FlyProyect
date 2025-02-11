/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperValidacion;
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
        String identificacion, nombre, marca, fuselaje, motor1, motor2, ala1,ala2,id_vuelo,aerolinea;
        String code="";
        int retorno, caracter_e;
        boolean rta;
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
        
        //Nombre
        System.out.println("Digite el nombre de la persona");
        nombre=scan.nextLine();
        rta= HelperValidacion.ValidarVacio(nombre);
        while (rta) {
                        System.out.println("Digite el nombre de la persona");
                        nombre = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(nombre);
                    }
                    rta = HelperValidacion.ValidarVacio(nombre);
                    retorno = HelperValidacion.RetornarValor(nombre);
                    caracter_e = HelperValidacion.RetornarCEV2(nombre);

                    while (retorno != 0 || rta == true || caracter_e != 0) {
                        System.out.println("Digite el nombre de la persona");
                        nombre = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(nombre);
                        retorno = HelperValidacion.RetornarValor(nombre);
                        caracter_e = HelperValidacion.RetornarCEV2(nombre);

                    }
                    //fin nombre
                
         //Identificacion
        System.out.println("Digite la identificacion de la persona");
        identificacion=scan.nextLine();
        rta= HelperValidacion.ValidarVacio(identificacion);
        while (rta) {
                        System.out.println("Digite la identificacion de la persona");
                        identificacion = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(identificacion);
                    }
                    rta = HelperValidacion.ValidarVacio(identificacion);
                    retorno = HelperValidacion.RetornarValor(identificacion);
                    caracter_e = HelperValidacion.RetornarCEV2(identificacion);

                    
                    while (retorno != 0 || rta == true || caracter_e != 0) {
                        System.out.println("Digite la identificacion de la persona");
                        identificacion = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(identificacion);
                        retorno = HelperValidacion.RetornarValorL(identificacion);
                        caracter_e = HelperValidacion.RetornarCEV2(identificacion);

                    }
                    //fin identificacion
                    
        
        
        //Marca
        System.out.println("Digite la marca del avión:");
        marca= scan.nextLine();
        rta= HelperValidacion.ValidarVacio(marca);
        while (rta) {
                        System.out.println("Digite la marca del avión:");
                        marca = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(marca);
                    }
                    rta = HelperValidacion.ValidarVacio(marca);
                    caracter_e = HelperValidacion.RetornarCEV2(marca);

                    while (rta == true || caracter_e != 0) {
                        System.out.println("Digite la marca del avión:");
                        nombre = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(marca);             
                        caracter_e = HelperValidacion.RetornarCEV2(marca);

                    }
                    //fin marca
        
    
        //Fuselaje
        System.out.println("Digite el tipo del fuselaje del avion");
        fuselaje=scan.nextLine();
        objFuselaje=new Fuselaje(fuselaje);
        rta= HelperValidacion.ValidarVacio(fuselaje);
        while (rta) {
                        System.out.println("Digite el tipo del fuselaje del avion");
                        fuselaje = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(fuselaje);
                    }
                    rta = HelperValidacion.ValidarVacio(fuselaje);
                    retorno = HelperValidacion.RetornarValor(fuselaje);
                    caracter_e = HelperValidacion.RetornarCEV2(fuselaje);

                    while (retorno != 0 || rta == true || caracter_e != 0) {
                        System.out.println("Digite el tipo del fuselaje del avion");
                        fuselaje = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(fuselaje);
                        retorno = HelperValidacion.RetornarValor(fuselaje);
                        caracter_e = HelperValidacion.RetornarCEV2(fuselaje);

                    }
                    //fin fuselaje
        
        
        //Motor
        System.out.println("Digite el tamaño del motor 1 del avion");
        motor1=scan.nextLine();
        objmotor1=new Motor(motor1);
        rta= HelperValidacion.ValidarVacio(motor1);
        while (rta) {
                        System.out.println("Digite el tamaño del motor 1 del avion");
                        motor1 = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(motor1);
                    }
                    rta = HelperValidacion.ValidarVacio(motor1);
                    retorno = HelperValidacion.RetornarValor(motor1);
                    caracter_e = HelperValidacion.RetornarCEV2(motor1);

                    while (retorno != 0 || rta == true || caracter_e != 0) {
                        System.out.println("Digite el tamaño del motor 1 del avion");
                        motor1 = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(motor1);
                        retorno = HelperValidacion.RetornarValor(motor1);
                        caracter_e = HelperValidacion.RetornarCEV2(motor1);

                    }
                    //fin motor
        
       //Motor2
        System.out.println("Digite el tamaño del motor 1 del avion");
        motor2=scan.nextLine();
        objmotor2=new Motor(motor2);
        rta= HelperValidacion.ValidarVacio(motor2);
        while (rta) {
                        System.out.println("Digite el tamaño del motor 1 del avion");
                        motor1 = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(motor2);
                    }
                    rta = HelperValidacion.ValidarVacio(motor2);
                    retorno = HelperValidacion.RetornarValor(motor2);
                    caracter_e = HelperValidacion.RetornarCEV2(motor2);

                    while (retorno != 0 || rta == true || caracter_e != 0) {
                        System.out.println("Digite el tamaño del motor 2 del avion");
                        motor2 = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(motor2);
                        retorno = HelperValidacion.RetornarValor(motor2);
                        caracter_e = HelperValidacion.RetornarCEV2(motor2);

                    }
                    //fin motor2
        
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

        Pasajero objpaPasajero = new Vip(code, identificacion, nombre);
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
