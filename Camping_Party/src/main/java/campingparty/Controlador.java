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
    
    public Controlador(){
        camping = new Camping();
        gerentes = new ArrayList<Gerente>();
        clientes = new ArrayList<ClienteDatos>();
        reservas = new ArrayList<Reserva>();
        
    }
     public void cargarDatosIniciales(){
        camping.cargarDatosIniciales();
    }
     
     public boolean comprobarLoginGerente(String u, String p){
         boolean existe = false;
         gerentes = camping.getGerentes();
         
         Gerente ger = new Gerente(u,p);
            
         if(gerentes.indexOf(ger)>=0){
             existe = true;
         }
         
         
         return existe;
     }
    
    public void nuevaReserva(String parcela, int numTiendas, Date entrada, Date salida, ArrayList nombres, ArrayList tamanyos){
        reservas.add(new Reserva(parcela, numTiendas, entrada, salida, nombres, tamanyos));
    }
    
    public boolean estaOcupada(Parcela parcelaAComprobar, Date fechaEntreada, Date fechaSalida){
        return false; //reserva.estaOcupada( parcelaAComprobar,  fechaEntreada,  fechaSalida);
    }
    
    public void registrarEntrada(Object c){
       /* ClienteDatos cli = (Cliente) c;
        clientesDatos.add(cli);*/
    }
    
    public void registrarSalida(Object c){
        
        ClienteDatos cli = (ClienteDatos) c;
        camping.registrarSalida(cli);
        
    }
    
    public void registrarClienteNuevo(ClienteDatos cliente){
       //0 clientesEnElCamping.add(cliente);
    }
    
    public ArrayList getListaClientes(){
        clientes = camping.getClientes();
        
        return clientes;
    }
    
    public void registrarCliente(String dni, String nombre, String apellido, String usuario, String pass){
        ClienteDatos cliente = new ClienteDatos(usuario, pass, dni, nombre, apellido);
        
        camping.almacenarClientes(cliente);   
    }
    
    public boolean comprobarExistenciaCliente(String usuario, String pass){
        
            boolean ok = false;
        if(camping.comprobarExistenciasCliente(usuario, pass)){
            ok = true;
                
        
        }
        
        return ok;
    }
           
            
  
            
    
}



