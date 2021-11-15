/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;
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
    private ArrayList<Actividad> actividades;
    
    //private ArrayList<Cliente> clientesEnElCamping;
    
    public Camping(){
        clientes = new ArrayList();
        gerentes = new ArrayList();
        parcelas = new ArrayList();
        reservas = new ArrayList();
        actividades = new ArrayList();
    }
    
   public void cargarDatosIniciales(){
        //Cargo clientes iniciales   //   user     password    dni         name         surname 
        clientes.add(new ClienteDatos("clienteUno","pass1","11111111a","Cliente Uno","Apellido Uno"));
        clientes.add(new ClienteDatos("clienteDos","pass2","22222222b","Cliente Dos","Apellido Dos"));
        clientes.add(new ClienteDatos("clenteTres","pass3","33333333c","Cliente Tres","Apellido Tres"));
        clientes.add(new ClienteDatos("clienteCuatro","pass4","44444444d","Cliente Cuatro","Apellido Cuatro"));
        clientes.add(new ClienteDatos("clienteCinco","pass5","55555555e","Cliente Cinco","Apellido Cinco"));
        clientes.add(new ClienteDatos("misge","1234","112","Mirena","Gerova"));
        
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
        
        reservas.add(new Reserva("1",3));
        reservas.add(new Reserva("2",5));
        reservas.add(new Reserva("3",2));
        reservas.add(new Reserva("4",1));
      
    }
    
    public void registrarSalida(Reserva re){
        reservas.remove(re);
    }
    
    public void registrarEntrada(Reserva re){
        for(Reserva r : reservas){
            reservas.remove((Object)re);
            reservas.add(re);
        }
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
    
    public ArrayList<Reserva> getReservas(){
        return reservas;
    }

    public void setClientes(ArrayList<ClienteDatos> clientes) {
        this.clientes = clientes;
    }
    
    public void almacenarClientes(String dni, String nombre, String apellido, String usuario, String pass){
   
        clientes.add(new ClienteDatos(usuario, pass, dni, nombre, apellido));
 

    }
    
    public void nuevaReserva(String parcela, int numTiendas, Date entrada,Date salida,ArrayList nombres,ArrayList tamanyos, int numParcelas){
        reservas.add(new Reserva( parcela, numTiendas, entrada, salida, nombres,tamanyos, numParcelas));
    
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
    
    
    public String devolverUsuario(String nombre){
        String usuario = "";
        for(ClienteDatos cliente: clientes){
            if(cliente.getName().equals(nombre)){
                usuario = cliente.getUser();
            
            }
        
        }
        
        return usuario;
    }
    
     public String devolverPass(String usuario){
        String aux = "";
        for(ClienteDatos cliente: clientes){
            if(cliente.getUser().equals(usuario)){
                aux = cliente.getPassword();
            
            }
        
        }
        
        return aux;
    }
     
      public String devolverDni(String usuario){
        String aux = "";
        for(ClienteDatos cliente: clientes){
            if(cliente.getUser().equals(usuario)){
                aux = cliente.getDni();
            
            }
        
        }
        
        return aux;
    }
     
     public void anyadirActividadCliente(String nombre, String horario, String dni){
         Actividad actividad = new Actividad(nombre,horario);
         for(ClienteDatos cliente: clientes){
            if(cliente.getDni().equals(dni)){
               cliente.addActividad(actividad); 
                ClienteDatos clienteaux = new ClienteDatos(cliente.getUser(),cliente.getPassword(), dni, cliente.getName(), cliente.getSurname());
                 actividad.addCliente(clienteaux);
                 
            }
         }
         actividades.add(actividad);
        
        
         
        
         
     
     }
     
      public ArrayList<Actividad> devolverActividadesClientes(String dni){
                ArrayList<Actividad> actividadaux = null;
                for(ClienteDatos cliente:clientes){
                   if(cliente.getDni().equals(dni)){
                       actividadaux = cliente.getActividades();
                       
                   }
                }
                
              
                
                return actividadaux;
      
      }
      
      public void borrarActividad(Actividad cancelada, String dni){
        ArrayList<Actividad> actaux = null;
        ArrayList<ClienteDatos> clienteaux;
        
       //busco en mi array de clientes el que tiene ese DNI y saco sus actividades
       for(ClienteDatos cliente: clientes){
           if(cliente.getDni().equals(dni)){
               actaux = cliente.getActividades();
               actaux.remove(cancelada);
           }
       }
      
      

        
      
      }
    
        
        
        
    
}
