/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Ala;
import Logica_Negocio.Llanta;
import Logica_Negocio.Motor;
import Logica_Negocio.Vuelo;
import java.util.ArrayList;

/**
 *
 * @author jarol
 */
//public class HelperImpresion implements IHelperImpresion {
//
//    @Override
//    public void ImprimirVuelo(Vuelo objVuelo) {
//     ArrayList<Motor> listamotores;
//        ArrayList<Ala> listaalas;
//        ArrayList<Llanta> listallantas;
//        System.out.println("**INFORMACION DEL VUELO:**");
//        System.out.println("ID DE VUELO: "+"\t"+ objVuelo.getId_Vuelo());
//        System.out.println("AEROLINEA: "+"\t"+ objVuelo.getAerolinea());
//        System.out.println("NOMBRE DE PASAJERO:"+"\t"+ objVuelo.getObjPasajero().getNombre());
//        System.out.println("IDENTIFICACION DE PASAJERO:"+"\t"+ objVuelo.getObjPasajero().getIdentificacion());
//        System.out.println("CODIGO DE PASAJERO:"+"\t"+ objVuelo.getObjPasajero().getCodigo());
//    
//        listaalas=objVuelo.getObjAvion().getListaalas();
//        listamotores=objVuelo.getObjAvion().getListamotores();
//        listallantas=objVuelo.getObjAvion().getListallantas();
//        
//        for (int i = 0; i < 2; i++) {
//            System.out.println("**INFORMACIONES TECNICAS DEL AVION**");
//            System.out.println("ALAS DEL AVION: "+"\t"+listaalas.get(i).getPosicion());
//            System.out.println("MOTORES DEL AVION: "+"\t"+listamotores.get(i).getTamaño_Motor());
//            System.out.println("LLANTAS DEL AVION: "+"\t"+listallantas.get(i).getTamaño());
//            
//        }
//    }
//    public static void ImprimirInfoVuelo(Vuelo vuelo){
//        HelperImpresion objHelperImpresion = new HelperImpresion();
//        objHelperImpresion.ImprimirVuelo(vuelo);
//        
//    }
//    
//}

public class HelperImpresion implements IHelperImpresion {

    @Override
    public void ImprimirVuelo(Vuelo objVuelo) {
        ArrayList<Motor> listamotores = objVuelo.getObjAvion().getListamotores();
        ArrayList<Ala> listaalas = objVuelo.getObjAvion().getListaalas();
        ArrayList<Llanta> listallantas = objVuelo.getObjAvion().getListallantas();

        // Encabezado del ticket
        System.out.println("------------------------------------------------");
        System.out.println("|               INFORMACIÓN DEL VUELO          |");
        System.out.println("------------------------------------------------");

        // Información del vuelo
        System.out.println("| ID DE VUELO: \t\t" + objVuelo.getId_Vuelo() + " \t\t|");
        System.out.println("| AEROLÍNEA: \t\t" + objVuelo.getAerolinea() + " \t\t|");
        System.out.println("| PASAJERO: \t\t" + objVuelo.getObjPasajero().getNombre() + " \t\t|");
        System.out.println("| IDENTIFICACIÓN: \t" + objVuelo.getObjPasajero().getIdentificacion() + " \t\t|");
        System.out.println("| CÓDIGO: \t\t" + objVuelo.getObjPasajero().getCodigo() + " \t\t|");
        System.out.println("------------------------------------------------");

        // Información técnica del avión
        System.out.println("|           INFORMACIÓN TÉCNICA DEL AVION       |");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < listaalas.size(); i++) {
            System.out.println("| ALA " + (i + 1) + ": \t\t" + listaalas.get(i).getPosicion() + " \t\t|");
            System.out.println("| MOTOR " + (i + 1) + ": \t\t" + listamotores.get(i).getTamaño_Motor() + " \t\t|");
            System.out.println("| LLANTA " + (i + 1) + ": \t\t" + listallantas.get(i).getTamaño() + " \t\t|");
            System.out.println("------------------------------------------------");
        }

        // Pie del ticket
        System.out.println("|         ¡GRACIAS POR ELEGIR NUESTRA AEROLÍNEA! |");
        System.out.println("------------------------------------------------");
    }

    public static void ImprimirInfoVuelo(Vuelo vuelo) {
        HelperImpresion objHelperImpresion = new HelperImpresion();
        objHelperImpresion.ImprimirVuelo(vuelo);
    }
}