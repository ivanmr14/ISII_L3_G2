/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import vista.Cliente;

/**
 * Esta clase almacena y gestiona pa información de cada parcela.
 * 26.10.2021 - Alex
 * 
 * @author alex
 */
public class Parcela {
    String parcelaID = "";      //Es la posición de la parcela    ej:A02
    String posicionX = "";      //Posicion x es una letra         ej:  A
    String posicionY = "";      //Posición y son 2 numeros        ej: 02
    int tamanyoParcela;
    float precioPorDia;
    Boolean reservada;
    Cliente cliente = null;
    
    //Constructor
    public Parcela(String posX, String posY)
    {
        setPosicion(posX, posY);
    }
    
    //SETTERS
    
    private void setID()
    {
        parcelaID = posicionX + posicionY;
    }
    
    public void setPosicion(String posX, String posY)
    {
        this.posicionX = posX;
        this.posicionY = posY;
        setID();
    }
    
    public void setTamanyoParcela(int tam)
    {
        this.tamanyoParcela = tam;
    }
    
    public void setPrecioPorDia(float precio)
    {
        this.precioPorDia = precio;
    }
    
    public void setReservada(Boolean res)
    {
        this.reservada = res;
    }
    
    public void setCliente(Cliente client)
    {
        this.cliente = client;
    }
    
    //GETTERS
    
    public String GetParcelaID()
    {
        return this.parcelaID;
    }
    
    public String GetPosicionX()
    {
        return this.posicionX;
    }
    
    public String GetPosicionY()
    {
        return this.posicionY;
    }
    
    public int GetTamanyoParcela()
    {
        return this.tamanyoParcela;
    }
    
    public float GetPrecioPorDia()
    {
        return this.precioPorDia;
    }
    
    public Boolean GetReservada()
    {
        return this.reservada;
    }
    
    public Cliente GetCliente()
    {
        return this.cliente;
    }
}
