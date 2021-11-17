/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campingparty;

import Modelo.*;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vista.Cliente;

/**
 *
 * @author MIRENA
 */
public class Controlador {
    
    private Camping camping;
    private ArrayList<Gerente> gerentes;
    private ArrayList<ClienteDatos> clientes;
    private ArrayList<Reserva> reservas;
    private ArrayList<Actividad> actividadesLista;
    private Reserva reserva;
    private int numParcelas;
    private ArrayList<Reserva> entradas;
    
    public Controlador(){
        camping = new Camping();
        gerentes = new ArrayList<Gerente>();
        clientes = new ArrayList<ClienteDatos>();
        reservas = new ArrayList<Reserva>();
        actividadesLista = new ArrayList<Actividad>();
        entradas = new ArrayList<Reserva>();
        numParcelas = 0;
        
    }
    
    public void cargarDatosIniciales(){
        camping.cargarDatosIniciales();
    }
    
    /**
     * Esta función comprueba si la parcela con identificador id está
     * ocupada entre la fecha entrada y la fecha salida
     * 
     *      Devuelve true  si    está ocupada
     *      Devuelve false si NO está ocupada
     * 
     * Alex - 16.11.2021
     * 
     * @param id        identificador de la parcela
     * @param entrada   Fecha de entrada para hacer la reserva
     * @param salida    Fecha de salida  para hacer la reserva
     * @return 
     */
    public boolean parcelaOcupada(String id, Date entrada, Date salida)
    {
        Boolean ocupada = false;
        ArrayList<Reserva> reser = new ArrayList<Reserva>();
        Date fechaIni, fechaFin;
        
        //obtener reservas de id
        reser = camping.reservasDeParcela(id);
        
        //comprobar si hay alguna fecha de entrada o salida entre mis fechas
        for(Reserva r: reser)
        {
            fechaIni = r.getFechaEntrada();
            fechaFin = r.getFechaSalida();
            if( fechaIni.before(entrada) && fechaFin.before(entrada) )   //    if |    |   
                ocupada = false;
            if( fechaIni.after(salida) && fechaFin.after(salida) )     //       |    | if 
                ocupada = false;
            if( (!fechaIni.before(entrada) && !fechaIni.after(salida)) ||
                (!fechaFin.before(entrada) && !fechaFin.after(salida))     )   //       | if |       o    i  |  f |      o      | i  |  f
                ocupada = true;
            if( fechaIni.before(entrada) && fechaFin.after(salida) )     //    i  |    |  f
                ocupada = true;
        }
        
        return ocupada;
    }
    
    
    public ArrayList<Date> getFecha(String dni){
        return camping.getFecha(dni);
    }
    
    public ArrayList getReservasConDni(String dni){
        return camping.getReservasConDni(dni);
    }
    
    public void ModificarReservaAux(Object ro,Date entrada,Date salida){
        Reserva r = (Reserva) ro;
        r.setFechaEntrada(entrada);
        r.setFechaSalida(salida);
    }
    
    public void nuevaReserva(ArrayList<String> parcelas, /*ClienteDatos cliente,*/ int numTiendas, Date entrada, Date salida, ArrayList nombres, ArrayList tamanyos, int numParcelas){
        //reservas.add(reserva = new Reserva( parcela, /*cliente,*/ numTiendas, entrada, salida, nombres, tamanyos));
        camping.nuevaReserva(parcelas, numTiendas, entrada, salida, nombres, tamanyos, numParcelas);
    }
    
    /**
     *  QUIENQUIERA QUE HAYA HECHO ESTO LO HA HECHO MAL Y LO TIENE QUE REHACER
     *          ANTES DE REHACERLO QUE SE MIRE COMO FUNCIONA LA CLASE PARCELA
     *          //Con cariño Alex <3
     * 
     * @param parcela
     * @param numTiendas
     * @param entrada
     * @param salida
     * @param nombresS
     * @param tamanyos
     * @param numParcelas 
     */
    public void nuevaEntrada(ArrayList<String> parcelas, int numTiendas, Date entrada, Date salida, ArrayList nombres, ArrayList tamanyos, int numParcelas){
        reservas = camping.getReservas();
        String idParcela = Integer.toString((reservas.size() + 1));
        camping.nuevaEntrada(parcelas, numTiendas, entrada, salida, nombres, tamanyos, numParcelas,idParcela);
    }
     
    public boolean comprobarLoginGerente(String u, String p){
        boolean existe = false;
        /*gerentes = camping.getGerentes();

        Gerente ger = new Gerente(u,p);

        if(gerentes.indexOf(ger)>=0){
            existe = true;
        }


        return existe;*/

        if(camping.comprobarLoginGerente(u,p)){
            existe = true;
        }

        return existe;
    }
    
    /*public void nuevaReserva(String parcela, int numTiendas, Date entrada, Date salida, ArrayList nombres, ArrayList tamanyos){
        reservas.add(new Reserva(parcela, numTiendas, entrada, salida, nombres, tamanyos));
    }*/
     
     
    public void sancionar(ClienteDatos cliente){
        camping.sancionar(cliente);
    }
     
    public int numeroDeParcelas(){
        return camping.numeroDeParcelas();
    }
     
    public ArrayList<String> getPosicionesX(){
        return camping.getPosicionesX();
    }
    
    public ArrayList<String> getPosicionesY(){
        return camping.getPosicionesY();
    }
    
    public ArrayList<String> getIDs(){
        return camping.getIDs();
    }
    
    public String getTamanyo(String id){
        return camping.getTamanyo(id);
    }
    
    public String getLuz(String id){
        return camping.getLuz(id);
    }
    
    public String getPrecio(String id){
        return camping.getPrecio(id);
    }
    
//    public String getOcupada(String id){
//        return "Libre";//reserva.estaOcupada(id);
//    }
    
    public boolean estaOcupada(Parcela parcelaAComprobar, Date fechaEntreada, Date fechaSalida){
        return false; //reserva.estaOcupada( parcelaAComprobar,  fechaEntreada,  fechaSalida);
    }
    
    public void registrarEntrada(Object reserva){
       Reserva r = (Reserva) reserva;
       //r.setFechaEntrada(fecha);
       camping.registrarEntrada(r);
    }
    
    public void registrarSalida(Object re){
        
        Reserva r = (Reserva) re;
        camping.registrarSalida(r);
        
    }
    
    public void registrarClienteNuevo(ClienteDatos cliente){
       //0 clientesEnElCamping.add(cliente);
    }
    
    public ArrayList getListaClientes(){
        clientes = camping.getClientes();
        
        return clientes;
    }
    
    public ArrayList getReservas(){
        reservas = camping.getReservas();
        
        return reservas;
    }
    
    public ArrayList getEntradas(){
        entradas = camping.getEntradas();
        
        return entradas;
    }
    
    public ArrayList getActividades(){
        actividadesLista = camping.getActividades();
        return actividadesLista;
    }
    
    public void registrarCliente(String dni, String nombre, String apellido, String usuario, String pass){
        //ClienteDatos cliente = new ClienteDatos(usuario, pass, dni, nombre, apellido);
        
        camping.almacenarClientes(dni, nombre, apellido, usuario, pass);   
    }
    
    public boolean comprobarExistenciaCliente(String usuario, String pass){
        
            boolean ok = false;
        if(camping.comprobarExistenciasCliente(usuario, pass)){
            ok = true;
                
        
        }
        
        return ok;
    }
    
    public int getNumParcelas(){
        return this.numParcelas;
    }
    
    public String devolverUsuario(String nombre){
        String usuario ="";
        usuario = camping.devolverUsuario(nombre);
        
        return usuario;
    }
    
    public String devolverPass(String usuario){
        String pass = "";
        pass = camping.devolverPass(usuario);
        
        
        return pass;
       
    }
    
    public String devolverDni(String usuario){
        String dni = "";
        dni = camping.devolverDni(usuario);
        
        
        return dni;
       
    }
    
    public void anyadirActividadCliente(String nombre, String horario, String dni){
            camping.anyadirActividadCliente(nombre, horario, dni);
    
    }
    
    public ArrayList devolverActividadesClientes(String dni){     
           ArrayList<Actividad> actividadesaux = null;
           actividadesaux = camping.devolverActividadesClientes(dni);
           return actividadesaux;
    }
    
    public void borrarActividad(Actividad cancelada, String dni){
        camping.borrarActividad(cancelada, dni);
    }

    public void aumentarNumParcelas() {
        this.numParcelas++;
    }
    
    public void setNumParcelas(int numPar){
        this.numParcelas = numPar;
    }
            
  
            
    
}



