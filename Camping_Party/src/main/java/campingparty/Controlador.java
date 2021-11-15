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
    private ArrayList<Actividad> actividades;
    private Reserva reserva;
    private int numParcelas;
    
    public Controlador(){
        camping = new Camping();
        gerentes = new ArrayList<Gerente>();
        clientes = new ArrayList<ClienteDatos>();
        reservas = new ArrayList<Reserva>();
        actividades = new ArrayList<Actividad>();
        numParcelas = 0;
        
    }
     public void cargarDatosIniciales(){
        camping.cargarDatosIniciales();
    }
     
    public void nuevaReserva(String parcela, /*ClienteDatos cliente,*/ int numTiendas, Date entrada, Date salida, ArrayList nombres, ArrayList tamanyos, int numParcelas){
        //reservas.add(reserva = new Reserva( parcela, /*cliente,*/ numTiendas, entrada, salida, nombres, tamanyos));
        reservas = camping.getReservas();
        String idParcela = Integer.toString(reservas.size() + 1);
        camping.nuevaReserva(idParcela, numTiendas, entrada, salida, nombres, tamanyos, numParcelas);
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
    
     
    public int numeroDeParcelas(){
        return camping.numeroDeParcelas();
    }
     
    public ArrayList<String> getPosicionesX(){
        return camping.getPosicionesX();
    }
    
    public ArrayList<String> getPosicionesY(){
        return camping.getPosicionesY();
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
    
    public String getOcupada(String id){
        return "Libre";//reserva.estaOcupada(id);
    }
    
    public boolean estaOcupada(Parcela parcelaAComprobar, Date fechaEntreada, Date fechaSalida){
        return false; //reserva.estaOcupada( parcelaAComprobar,  fechaEntreada,  fechaSalida);
    }
    
    public void registrarEntrada(Reserva reserva){
       camping.registrarEntrada(reserva);
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



