/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1002805933
 */
public class Vuelo {
    public String Id_Vuelo;
    public String Aerolinea;
    public Avion objAvion;
    public Pasajero objPasajero;
    
    public Vuelo(){
        
    }

    public Vuelo(String Id_Vuelo, String Aerolinea, Avion objAvion, Pasajero objPasajero) {
        this.Id_Vuelo = Id_Vuelo;
        this.Aerolinea = Aerolinea;
        this.objAvion = objAvion;
        this.objPasajero = objPasajero;
    }

    public String getId_Vuelo() {
        return Id_Vuelo;
    }

    public void setId_Vuelo(String Id_Vuelo) {
        this.Id_Vuelo = Id_Vuelo;
    }

    public String getAerolinea() {
        return Aerolinea;
    }

    public void setAerolinea(String Aerolinea) {
        this.Aerolinea = Aerolinea;
    }

    public Avion getObjAvion() {
        return objAvion;
    }

    public void setObjAvion(Avion objAvion) {
        this.objAvion = objAvion;
    }

    public Pasajero getObjPasajero() {
        return objPasajero;
    }

    public void setObjPasajero(Pasajero objPasajero) {
        this.objPasajero = objPasajero;
    }
    
}