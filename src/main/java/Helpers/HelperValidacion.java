/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import java.util.ArrayList;

/**
 *
 * @author 1002805933
 */
public class HelperValidacion {
    public static int RetornarValor(String nombre)
    {
        int numero=0;
        int letra=0;

        
        for (int j = 0; j < nombre.length(); j++) {
             boolean flag = Character.isDigit(nombre.charAt(j));
             if(flag) {
                //System.out.println("'"+ nombre.charAt(j)+"' is a number");
                numero++;
             }
             else {
                //System.out.println("'"+ nombre.charAt(j)+"' is a letter");
                letra++;
             }

        }
        return numero;
    }
    
    public static int RetornarValorL(String nombre)
    {
        int numero=0;
        int letra=0;

        
        for (int j = 0; j < nombre.length(); j++) {
             boolean flag = Character.isDigit(nombre.charAt(j));
             if(flag) {
                //System.out.println("'"+ nombre.charAt(j)+"' is a number");
                numero++;
             }
             else {
                //System.out.println("'"+ nombre.charAt(j)+"' is a letter");
                letra++;
             }

        }
        return letra;
    }

    //Se validan caracteres especiales
     public static int RetornarCEV2(String nombre) {
        int ce = 0;
        
        ArrayList<Character> lscaracteres = new ArrayList<>();
        
        // Agregar todos los caracteres posibles excepto letras y números
        for (char c = Character.MIN_VALUE; c < Character.MAX_VALUE; c++) {
            if (!Character.isLetter(c) && !Character.isDigit(c)) {
                lscaracteres.add(c);
            }
        }
        
        // Iterar sobre la cadena y contar caracteres especiales
        for (int j = 0; j < nombre.length(); j++) {
            char caracterActual = nombre.charAt(j);
            if (!Character.isLetter(caracterActual) && !Character.isDigit(caracterActual)) {
                ce++;
            }
        }
        return ce;
    }
    //Se valida vacio

    public static boolean ValidarVacio(String cadena) {
        if (cadena.equals("")) {
            return true;
        } else {
            return false;
        }

    }

    //Se valida números en los nombres
    public static int RetornarLetra(String nombre) {
        int numero = 0;
        int letra = 0;

        for (int j = 0; j < nombre.length(); j++) {
            boolean flag = Character.isDigit(nombre.charAt(j));
            if (flag) {
                //System.out.println("'"+ nombre.charAt(j)+"' is a number");
                numero++;
            } else {
                //System.out.println("'"+ nombre.charAt(j)+"' is a letter");
                letra++;
            }

        }
        return letra;
    }

    public static int ValidarCantidadRango(int cantidad) {
        if (cantidad > 0 && cantidad < 1000) {
            return 1;
        } else {
            return 0;
        }
    }
    
}
