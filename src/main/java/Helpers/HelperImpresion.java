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
public class HelperImpresion implements IHelperImpresion {

    @Override
    public void ImprimirVuelo(Vuelo objVuelo) {
     ArrayList<Motor> listamotores;
        ArrayList<Ala> listaalas;
        ArrayList<Llanta> listallantas;
        System.out.println("**INFORMACION DEL VUELO:**");
        System.out.println("ID DE VUELO: "+"\t"+ objVuelo.getId_Vuelo());
        System.out.println("AEROLINEA: "+"\t"+ objVuelo.getAerolinea());
        System.out.println("NOMBRE DE PASAJERO:"+"\t"+ objVuelo.getObjPasajero().getNombre());
        System.out.println("IDENTIFICACION DE PASAJERO:"+"\t"+ objVuelo.getObjPasajero().getIdentificacion());
        System.out.println("CODIGO DE PASAJERO:"+"\t"+ objVuelo.getObjPasajero().getCodigo());
    
        listaalas=objVuelo.getObjAvion().getListaalas();
        listamotores=objVuelo.getObjAvion().getListamotores();
        listallantas=objVuelo.getObjAvion().getListallantas();
        
        for (int i = 0; i < 2; i++) {
            System.out.println("**INFORMACIONES TECNICAS DEL AVION**");
            System.out.println("ALAS DEL AVION: "+"\t"+listaalas.get(i).getPosicion());
            System.out.println("MOTORES DEL AVION: "+"\t"+listamotores.get(i).getTamaño_Motor());
            System.out.println("LLANTAS DEL AVION: "+"\t"+listallantas.get(i).getTamaño());
            
        }
    }
    public static void ImprimirInfoVuelo(Vuelo vuelo){
        HelperImpresion objHelperImpresion = new HelperImpresion();
        objHelperImpresion.ImprimirVuelo(vuelo);
        
    }
    
}
