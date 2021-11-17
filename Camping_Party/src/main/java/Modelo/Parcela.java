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
    boolean luz;
    //Boolean reservada; //esto lo decidirá un metodo de la clase reserva en el modelo.
    //Cliente cliente = null;
    
    //Constructor
    public Parcela(String posX, String posY, int tamanyoParcela, float precioPorDia, boolean luz)
    {
        setPosicion(posX, posY);
        parcelaID = posX + posY+"";
        this.tamanyoParcela = tamanyoParcela;
        this.precioPorDia = precioPorDia;
        this.luz = luz;
    }
    
    public Parcela(){}
    
    //Carga parcelas iniciales
    public void cargarParcelasIniciales(){
        
    }
    
    //SETTERS
    
    private void setID() //está correcto privado
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
    
    public void setLuz(boolean b){
        this.luz = b;
    }
    
//    public void setCliente(Cliente client)
//    {
//        this.cliente = client;
//    }
    
    //GETTERS
    
    public String getParcelaID()
    {
        return this.parcelaID;
    }
    
    public String getPosicionX()
    {
        return this.posicionX;
    }
    
    public String getPosicionY()
    {
        return this.posicionY;
    }
    
    public int getTamanyoParcela()
    {
        return this.tamanyoParcela;
    }
    
    public float getPrecioPorDia()
    {
        return this.precioPorDia;
    }
    
    public boolean getLuz(){
        return this.luz;
    }
    
//    public Cliente GetCliente()
//    {
//        return this.cliente;
//    }
}
