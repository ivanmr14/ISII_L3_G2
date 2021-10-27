/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campingparty;

import Modelo.ClienteDatos;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vista.Cliente;

/**
 *
 * @author MIRENA
 */
public class Controlador {
    
    
     /*public void cargarClientesIniciales(){
        clienteDatos.add(new ClienteDatos("clienteUno","pass1","11111111a","Cliente Uno","Apellido Uno"));
        clienteDatos.add(new ClienteDatos("clienteDos","pass2","22222222b","Cliente Dos","Apellido Dos"));
        clienteDatos.add(new ClienteDatos("clenteTres","pass3","33333333c","Cliente Tres","Apellido Tres"));
        clienteDatos.add(new ClienteDatos("clienteCuatro","pass4","44444444d","Cliente Cuatro","Apellido Cuatro"));
        clienteDatos.add(new ClienteDatos("clienteCinco","pass5","55555555e","Cliente Cinco","Apellido Cinco"));
    }*/
    
    public void registrarEntrada(Object c){
       /* ClienteDatos cli = (Cliente) c;
        clientesDatos.add(cli);*/
    }
    
    public void registrarSalida(Object c){
        /*Cliente cli = (Cliente) c;
        clientes.remove(cli);*/
    }
    
    public void registrarClienteNuevo(ClienteDatos cliente){
       //0 clientesEnElCamping.add(cliente);
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
