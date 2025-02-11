/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author 1002805933
 */
public class Avion {
    public String Marca;
    public Fuselaje objFuselaje;
    public ArrayList<Motor> listamotores;
    public ArrayList<Ala> listaalas;
    public ArrayList<Llanta> listallantas;
    
    public Avion(){
        
    }

    public Avion(String Marca, Fuselaje objFuselaje, ArrayList<Motor> listamotores, ArrayList<Ala> listaalas, ArrayList<Llanta> listallantas) {
        this.Marca = Marca;
        this.objFuselaje = objFuselaje;
        this.listamotores = listamotores;
        this.listaalas = listaalas;
        this.listallantas = listallantas;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public Fuselaje getObjFuselaje() {
        return objFuselaje;
    }

    public void setObjFuselaje(Fuselaje objFuselaje) {
        this.objFuselaje = objFuselaje;
    }

    public ArrayList<Motor> getListamotores() {
        return listamotores;
    }

    public void setListamotores(ArrayList<Motor> listamotores) {
        this.listamotores = listamotores;
    }

    public ArrayList<Ala> getListaalas() {
        return listaalas;
    }

    public void setListaalas(ArrayList<Ala> listaalas) {
        this.listaalas = listaalas;
    }

    public ArrayList<Llanta> getListallantas() {
        return listallantas;
    }

    public void setListallantas(ArrayList<Llanta> listallantas) {
        this.listallantas = listallantas;
    }
    
}