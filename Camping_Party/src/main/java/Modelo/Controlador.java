/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import vista.Cliente;

/**
 *
 * @author IvanMR
 */
public class Controlador {
    
    private ArrayList<Cliente> clientes;
    
    private ArrayList<Cliente> clientesEnElCamping;
    
    public Controlador(){
        clientes = new ArrayList();
    }
    
    public void cargarClientesIniciales(){
        clientes.add(new Cliente("clienteUno","pass1","11111111a","Cliente Uno","Apellido Uno"));
        clientes.add(new Cliente("clienteDos","pass2","22222222b","Cliente Dos","Apellido Dos"));
        clientes.add(new Cliente("clenteTres","pass3","33333333c","Cliente Tres","Apellido Tres"));
        clientes.add(new Cliente("clienteCuatro","pass4","44444444d","Cliente Cuatro","Apellido Cuatro"));
        clientes.add(new Cliente("clienteCinco","pass5","55555555e","Cliente Cinco","Apellido Cinco"));
    }
    
    public void registrarEntrada(Object c){
        Cliente cli = (Cliente) c;
        clientes.add(cli);
    }
    
    public void registrarSalida(Object c){
        Cliente cli = (Cliente) c;
        clientes.remove(cli);
    }
    
    public ArrayList getListaClientes(){
        return clientes;
    }
    
    public ArrayList getListaClientesEnElCamping(){
        return clientesEnElCamping;
    }
    
    public void registrarClienteNuevo(Cliente cliente){
        clientesEnElCamping.add(cliente);
    }
}
