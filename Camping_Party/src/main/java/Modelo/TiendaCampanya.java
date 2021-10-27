/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Esta clase sirve para gestionar, guardar, mantener y acceder a los
 * datos referentes a todas la tiendas de campaña que vayan a usarse.
 * 26.10.2021 - Alex
 *
 * @author alex
 */
public class TiendaCampanya {
    String nombre;
    int tamanyo;
    
    
    //CONSTRUCTOR
    public TiendaCampanya(String nombreNuevo, int tamanyoNuevo)
    {
        this.nombre  = nombreNuevo;
        this.tamanyo = tamanyoNuevo;
    }
    
    //GETTERS
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public int getTamanyo()
    {
        return this.tamanyo;
    }
    
    //SETTERS
    
    public void setNombre(String nombreNuevo)
    {
        this.nombre = nombreNuevo;
    }
    
    public void setTamanyo(int tamanyoNuevo)
    {
        this.tamanyo = tamanyoNuevo;
    }
}
