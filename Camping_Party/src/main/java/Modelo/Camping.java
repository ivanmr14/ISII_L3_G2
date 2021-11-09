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
public class Camping {
    
    private ArrayList<ClienteDatos> clientes;
    private ArrayList<Gerente> gerentes;
    private ArrayList<Parcela> parcelas;
    private ArrayList<Reserva> reservas;
    
    //private ArrayList<Cliente> clientesEnElCamping;
    
    public Camping(){
        clientes = new ArrayList();
        gerentes = new ArrayList();
        parcelas = new ArrayList();
    }
    
   public void cargarDatosIniciales(){
        //Cargo clientes iniciales   //   user     password    dni         name         surname 
        clientes.add(new ClienteDatos("clienteUno","pass1","11111111a","Cliente Uno","Apellido Uno"));
        clientes.add(new ClienteDatos("clienteDos","pass2","22222222b","Cliente Dos","Apellido Dos"));
        clientes.add(new ClienteDatos("clenteTres","pass3","33333333c","Cliente Tres","Apellido Tres"));
        clientes.add(new ClienteDatos("clienteCuatro","pass4","44444444d","Cliente Cuatro","Apellido Cuatro"));
        clientes.add(new ClienteDatos("clienteCinco","pass5","55555555e","Cliente Cinco","Apellido Cinco"));
        
        //Cargo gerente inicial
       gerentes.add(new Gerente("admin","admin"));
        
        //Cargo parcelas
        parcelas.add(new Parcela("A","1",34,14,true));
        parcelas.add(new Parcela("A","2",24,15,false));
        parcelas.add(new Parcela("A","3",33,11,true));
        parcelas.add(new Parcela("B","1",13,17,false));
        parcelas.add(new Parcela("B","2",27,19,true));
        parcelas.add(new Parcela("B","3",15,13,false));
        parcelas.add(new Parcela("C","1",17, 9,true));
        parcelas.add(new Parcela("C","2",46,24,false));
        parcelas.add(new Parcela("C","3",32,12,true));
        
        //cargo reservas
      
    }
    
    public void registrarSalida(ClienteDatos c){
        clientes.remove(c);
    }
    
   public int numeroDeParcelas(){
       return parcelas.size();
   }
   
    public String getTamanyo(String id){
        String res = "";
        for(Parcela p: parcelas){
            if(p.parcelaID.equals(id)){
                res = Integer.toString(p.getTamanyoParcela());
            }
        }
        return res;
    }
   
    public String getLuz(String id){
        String res = "";
        for(Parcela p: parcelas){
            if(p.parcelaID.equals(id)){
                if(p.getLuz())
                    res = "Sí";
                else
                    res = "No";
            }
        }
       return res;
    }
    
    public String getPrecio(String id){
        String res = "";
        for(Parcela p: parcelas){
            if(p.parcelaID.equals(id)){
                res = ""+p.getPrecioPorDia();
            }
        }
       return res;
    }
    
   
   public ArrayList<String> getPosicionesX(){
       ArrayList<String> aux = new ArrayList<String>();
       for(Parcela p: parcelas)
            aux.add(p.getPosicionX());
       return aux;
   }
   
   public ArrayList<String> getPosicionesY(){
       ArrayList<String> aux = new ArrayList<String>();
       for(Parcela p: parcelas)
            aux.add(p.getPosicionY());
       return aux;
   }

    public ArrayList<ClienteDatos> getClientes() {
        return clientes;
    }
    
    public ArrayList<Gerente> getGerentes(){
        return gerentes;
    }

    public void setClientes(ArrayList<ClienteDatos> clientes) {
        this.clientes = clientes;
    }
    
    public void almacenarClientes(ClienteDatos cliente){
   
        clientes.add(cliente);
 

    }
    
    
    public boolean comprobarExistenciasCliente(String user, String pass){
        boolean ok = false;
        
       for(ClienteDatos cliente: clientes){
           if(cliente.getUser().equals(user) && cliente.getPassword().equals(pass)){
               ok = true;
           }
       }
           
           return ok;
       
       
       
    }
       
    public boolean comprobarLoginGerente(String user, String pass){
        boolean ok = false;
        
        for(Gerente gerente: gerentes){
            if(gerente.getUser().equals(user) && gerente.getPass().equals(pass)){
                ok = true;
            }
        }
        
        return ok;
        
    
    }
        
        
        
    
}
