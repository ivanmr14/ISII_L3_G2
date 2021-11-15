/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import vista.Cliente;
import java.util.ArrayList;
//import com.toedter.calendar.JCalendar;
import java.util.Date;

/**
 * En esta clase que gestiona las reservas las parcelas de los clientes.
 * Incluye un booleano para ver si está reservada y el cliente que
 * la ha reservado
 * 26.10.2021 - Alex
 * 
 *      //////  ERRORES
 *          -Falta poner bien la fecha de fechaEntrada, fechaSalida
 * 
 * 
 * @author alex
 */
public class Reserva {
    String parcela;
    ClienteDatos cliente;                   //Cliente que reserva
    Date fechaEntrada, fechaSalida;         //Fechas de la reserva
    int nTiendas;                           //nº de tiendas que va a meter
    ArrayList<TiendaCampanya> tiendas;      //Tiendas que va a meter
    int nParcelas;                          //nº de parcelas reservadas
    ArrayList<Parcela> parcelas;            //Parcelas reservadas
    
    public Reserva()
    {
        //Constructor
    }
    
    /**  Constructor con parámetros
     * 
     * @param parcelaID
     * @param numTiendas
     * @param entrada
     * @param salida
     * @param nombres
     * @param tamanyos 
     */
    public Reserva(String parcelaID,/* ClienteDatos cliente,*/ int numTiendas, Date entrada, Date salida, ArrayList nombres, ArrayList tamanyos, int numParcelas)
    {
        this.parcela = parcelaID;
        this.nTiendas = numTiendas;
        this.fechaEntrada = entrada;
        this.fechaSalida = salida;
        this.nParcelas = numParcelas;
        
        //Constructor
    }
    
    //Constructor para cargar datos iniciales de prueba
    public Reserva(String parcelaID, int numParcelas){
        this.parcela = parcelaID;
        this.nParcelas = numParcelas;
        
    }
    
    //Métodos
    /**
     * Método para saber si a parcela a reservar está ocuapada.
     * 
     * @param parcelaAComprobar     parcela que quiero comprobar que esté vacia para reservarla
     * @param fechaEntreada         Fecha de entrada para comprobar si ya está reservada
     * @param fechaSalida           Fecha de salida  para comprobar si ya está reservada
     * @return                      Devuelvo un true si está ocupada en esos días.
     */
    public boolean estaOcupada(Parcela parcelaAComprobar, Date fechaEntreada, Date fechaSalida)
    {
        Boolean ocupada = false;
        
        //RELLENAR CON COMPROBACIÓN.
        
        return ocupada;
    }
    
    //GETTERS
    
    public Date getFechaEntrada()
    {
        return this.fechaEntrada;
    }
    
    public Date getFechaSalida()
    {
        return this.fechaSalida;
    }
    
    public int getNumeroTiendas()
    {
        return this.nTiendas;
    }
    

    public ArrayList<TiendaCampanya> getTiendas()
    {
        return this.tiendas;
    }

    public int getNumeroParcelas()
    {
        return this.nParcelas;
    }
    
    public ArrayList<Parcela> getParcelas()
    {
        return parcelas;
    }
    
    //SETTERS
    
    public void setFechaEntrada( Date NuevaFechaEntrada)
    {
        this.fechaEntrada = NuevaFechaEntrada;
    }
    
    public void setFechaSalida( Date NuevaFechaSalida)
    {
        this.fechaSalida = NuevaFechaSalida;
    }
    
    public void setNumeroTiendas(int NewNumeroTiendas)
    {
        this.nTiendas = NewNumeroTiendas;
    }
    
    //Añade una nueva tienda a la lista
    public void setNuevaTienda( TiendaCampanya nuevaTienda)
    {
        this.tiendas.add(nuevaTienda);
    }
    
    //Elimina la tienda que le des como parametro de la lista.
    public void eliminaTienda( TiendaCampanya tiendaAEliminar)
    {
        this.tiendas.remove(tiendaAEliminar);
    }

    public void setNumeroParcelas( int NuevoNumeroParcelas )
    {
        this.nParcelas = NuevoNumeroParcelas;
    }
    
    //Añade una nueva tienda a la lista
    public void setNuevaParcela( Parcela nuevaParcela)
    {
        this.parcelas.add(nuevaParcela);
    }
    
    //Elimina la tienda que le des como parametro de la lista.
    public void eliminaParcela( Parcela nuevaParcela)
    {
        this.parcelas.remove(nuevaParcela);
    }
    
    //Sobreescribo el metodo toString para mostrar los datos especificos en los jList
    public String toString(){
        return "ID: "+this.parcela+" | Num.Parcelas: "+this.nParcelas;
    }
}
