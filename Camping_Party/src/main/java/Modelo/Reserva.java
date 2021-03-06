/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
    ArrayList<String> parcelasID;
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
     * @param cliente
     * @param numTiendas
     * @param entrada
     * @param salida
     * @param nombres
     * @param tamanyos 
     * @param numParcelas 
     */
    public Reserva(String parcelaID, ClienteDatos cliente, int numTiendas, Date entrada, Date salida, ArrayList nombres, ArrayList tamanyos, int numParcelas)
    {
        this.parcela = parcelaID;
        this.nTiendas = numTiendas;
        this.fechaEntrada = entrada;
        this.fechaSalida = salida;
        this.nParcelas = numParcelas;
    }
    
    /**
     * Constructor con parcelaSSS en plural
     * Alex - 16.11.2021
     * 
     * @param parcelas
     * @param parcelasIDt
     * @param numTiendas
     * @param entrada
     * @param salida
     * @param nombres
     * @param tamanyos
     * @param numParcelas 
     */
    public Reserva(ArrayList<Parcela> parcelas, ArrayList<String> parcelasIDt, int numTiendas, Date entrada, Date salida, ArrayList nombres, ArrayList tamanyos, int numParcelas)
    {
        //Guardo datos
        this.parcelasID = parcelasIDt;
        this.nTiendas = numTiendas;
        this.fechaEntrada = entrada;
        this.fechaSalida = salida;
        this.nParcelas = numParcelas;
        tiendas = new ArrayList();
        
        //Construyo tiendas de campaña
        for(int i=0; i<nombres.size(); ++i)
            tiendas.add(new TiendaCampanya((String)nombres.get(i),(Integer)tamanyos.get(i)));
        
        //Guardo la lista de parcelas.
        this.parcelas = parcelas;
    }
    
    
    
    //Constructor sin cliente
    public Reserva(ArrayList<Parcela> parcelas, ArrayList<String> parcelasIDt, int numTiendas, Date entrada, Date salida, ArrayList nombres, ArrayList tamanyos, int numParcelas, String idP)
    {
        //Guardo datos
        this.parcelasID = parcelasIDt;
        this.nTiendas = numTiendas;
        this.fechaEntrada = entrada;
        this.fechaSalida = salida;
        this.nParcelas = numParcelas;
        tiendas = new ArrayList();
        
        //Construyo tiendas de campaña
        for(int i=0; i<nombres.size(); ++i)
            tiendas.add(new TiendaCampanya((String)nombres.get(i),(Integer)tamanyos.get(i)));
        
        //Guardo la lista de parcelas.
        this.parcelas = parcelas;
        this.parcela = idP;
    }
    
    /*
    //Constructor para entradas sin reserva
    public Reserva(String parcelaID, int numTiendas, Date entrada, Date salida, ArrayList nombres, ArrayList tamanyos, int numParcelas)
    {
        this.parcela = parcelaID;
        this.nTiendas = numTiendas;
        this.fechaEntrada = entrada;
        this.fechaSalida = salida;
        this.nParcelas = numParcelas;
        
     
    }
    
    */
    

    //Constructor para cargar datos iniciales de prueba
    public Reserva(String parcelasIDt, int numParcelas){
        this.parcela = parcelasIDt;
        this.nParcelas = numParcelas;
        
    }
    
    public Reserva(String parcelasIDt, int numParcelas, ArrayList<Parcela> p){
        this.parcela = parcelasIDt;
        this.nParcelas = numParcelas;
        this.parcelas = p;
        
    }
    
    public String getParcela()
    {
        return parcela;
    }

    public void setParcela(String parcela) {
        this.parcela = parcela;
    }

    public ArrayList<String> getParcelasID() {
        return parcelasID;
    }

    public void setParcelasID(ArrayList<String> parcelasID) {
        this.parcelasID = parcelasID;
    }

    public ClienteDatos getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDatos cliente) {
        this.cliente = cliente;
    }

    public int getnTiendas() {
        return nTiendas;
    }

    public void setnTiendas(int nTiendas) {
        this.nTiendas = nTiendas;
    }

    public int getnParcelas() {
        return nParcelas;
    }

//    //Métodos
//    /**
//     * Método para saber si a parcela a reservar está ocuapada.
//     * 
//     * @param parcelaAComprobar     parcela que quiero comprobar que esté vacia para reservarla
//     * @param fechaEntreada         Fecha de entrada para comprobar si ya está reservada
//     * @param fechaSalida           Fecha de salida  para comprobar si ya está reservada
//     * @return                      Devuelvo un true si está ocupada en esos días.
//     */
//    public boolean estaOcupada(Parcela parcelaAComprobar, Date fechaEntreada, Date fechaSalida)
//    {
//        Boolean ocupada = false;
//        
//        //RELLENAR CON COMPROBACIÓN.
//        
//        return ocupada;
//    }
    //GETTERS
    public void setnParcelas(int nParcelas) {
        this.nParcelas = nParcelas;
    }

    public Date getFechaEntrada() {
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
    @Override
    public String toString(){
        
        return "ID: "+this.parcela+" | Num.Parcelas: "+this.nParcelas;
    }
}
