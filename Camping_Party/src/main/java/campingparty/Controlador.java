/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campingparty;

import Modelo.Camping;
import Modelo.ClienteDatos;
import Modelo.Gerente;
import java.util.ArrayList;
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
    
    public Controlador(){
        
        
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
            
            //comprobamos que los datos introducidos son válidos
            for (ClienteDatos i : ){
            
                if (i.getDNI() == cliente.getDNI()){
                    JOptionPane.showMessageDialog(new JFrame(), "Ya hay un cliente registrado con el DNI introducido.", "Dialog", JOptionPane.ERROR_MESSAGE);
                    validos = false;
                }
                else if(i.getUser() == cliente.getUser()){
                    JOptionPane.showMessageDialog(new JFrame(), "Username no está disponible.", "Dialog", JOptionPane.ERROR_MESSAGE);
                    validos = false;
                }
            
            //Si todo está en orden añadimos el cliente al array de clientes
                if(validos){
                clientes.add(cliente);
                }
            }
    
    }
            
    
}
