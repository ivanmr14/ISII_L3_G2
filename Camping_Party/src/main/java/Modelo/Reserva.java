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
 * En esta clase que almacena datos de  una reserva de los clientes.
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
    Cliente cliente;                        //Cliente que reserva
    Date fechaEntrada, fechaSalida;         //Fechas de la reserva
    int nTiendas;                           //nº de tiendas que va a meter
    ArrayList<TiendaCampanya> tiendas;      //Tiendas que va a meter
    int nParcelas;                          //nº de parcelas reservadas
    ArrayList<Parcela> parcelas;            //Parcelas reservadas
    
    public Reserva()
    {
        //Constructor
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
}
