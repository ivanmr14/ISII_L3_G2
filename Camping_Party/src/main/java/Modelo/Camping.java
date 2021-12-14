/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;
import vista.Cliente;
import Modelo.Actividad;

/**
 *
 * @author IvanMR
 */
public class Camping {
    
    private ArrayList<ClienteDatos> clientes;
    private ArrayList<Gerente> gerentes;
    protected ArrayList<Parcela> parcelas;
    private ArrayList<Reserva> reservas;
    private ArrayList actividades;
    private ArrayList<Reserva> entradas;
    
    public void setGerentes(ArrayList<Gerente> gerentes){
        this.gerentes = gerentes;
    }

    public void setParcelas(ArrayList<Parcela> parcelas) {
        this.parcelas = parcelas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void setActividades(ArrayList actividades) {
        this.actividades = actividades;
    }

    //private ArrayList<Cliente> clientesEnElCamping;
    public void setEntradas(ArrayList<Reserva> entradas) {
        this.entradas = entradas;
    }

    public Camping() {
        clientes = new ArrayList();
        gerentes = new ArrayList();
        parcelas = new ArrayList();
        reservas = new ArrayList();
        actividades = new ArrayList();
        entradas = new ArrayList();
    }
    
   public void cargarDatosIniciales(){
        //Cargo clientes iniciales   //   user     password    dni         name         surname 
        clientes.add(new ClienteDatos("clienteUno","pass1","11111111a","Cliente Uno","Apellido Uno"));
        clientes.add(new ClienteDatos("clienteDos","pass2","22222222b","Cliente Dos","Apellido Dos"));
        clientes.add(new ClienteDatos("clenteTres","pass3","33333333c","Cliente Tres","Apellido Tres"));
        clientes.add(new ClienteDatos("clienteCuatro","pass4","44444444d","Cliente Cuatro","Apellido Cuatro"));
        clientes.add(new ClienteDatos("clienteCinco","pass5","55555555e","Cliente Cinco","Apellido Cinco"));
        clientes.add(new ClienteDatos("misge","1234","112","Mirena","Gerova"));
        clientes.add(new ClienteDatos("alex","alex","123","alex","alexllido"));
        
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
        
        reservas.add(new Reserva("1",3,parcelas));
        reservas.add(new Reserva("2",5,parcelas));
        reservas.add(new Reserva("3",2,parcelas));
        reservas.add(new Reserva("4",1,parcelas));
        
        
        //cargo entradas
        
        entradas.add(new Reserva("1",3));
        entradas.add(new Reserva("2",5));
        entradas.add(new Reserva("3",2));
        entradas.add(new Reserva("4",1));
        
        //cargo actividades
        
        Actividad actividad1 = new Actividad("Fronton", "Lunes 11:00-13:00");
        Actividad actividad2 = new Actividad("Natacion", "Lunes 14:00-17:00");
        actividad1.addCliente(new ClienteDatos("clienteUno","pass1","11111111a","Cliente Uno","Apellido Uno"));
        actividad1.addCliente(new ClienteDatos("clienteDos","pass2","22222222b","Cliente Dos","Apellido Dos"));
        actividad2.addCliente(new ClienteDatos("clienteCinco","pass5","55555555e","Cliente Cinco","Apellido Cinco"));
        actividades.add(actividad1);
        actividades.add(actividad2);
    }
    
    public void sancionar(ClienteDatos cliente){
        
        /*
        for (Object a : actividades){
            Actividad acv = (Actividad) a;
            for (ClienteDatos c : acv.getClientes()){
                actividades.remove((Object)c);
                actividades.add(c);
            }
        }
        */
        
        for (Object c : clientes){
            
            if(c == cliente){
                clientes.remove(c);//borramos el cliente sin sancionar
                cliente.setSancionado(true);
                clientes.add(cliente);//añadimos el mismo cliente pwero sancionado
            }  
        }
        
    }
    
    /**
     * Función que te devuelve la lista de fechas en als que
     * el usuario con dni pasado por parámetro tiene una reserva.
     * @param dni
     * @return 
     */
    public ArrayList<Date> getFecha(String dni){
        ArrayList<Date> res = new ArrayList();
        
        //Recorro todas las reservas
        for(Reserva r: reservas)
            if(r.cliente.getDni().equals(dni)) //Me quedo con las fechas de inicio de las que son mias
                res.add(r.fechaEntrada);
        
        return res;
    }
    
    public ArrayList getReservasConDni(String dni){
        ArrayList<Reserva> res = new ArrayList();
        
        //Recorro todas las reservas
        for(Reserva r: reservas)
            if(r.cliente.getDni().equals(dni)) //Me quedo con las fechas de inicio de las que son mias
                res.add(r);
        
        return res;
    }
   
    /**
     * Método que devuelve una lista de reservas que contienen la parcela
     * con la id pasada por parámetro.
     *      Objetivo: Comparar las fechas para hacer las nuevas reservas
     * Alex - 16.11.2021
     * 
     * @param id
     * @return 
     */
    public ArrayList<Reserva> reservasDeParcela(String id)
    {
        ArrayList<Reserva> res  = new ArrayList<Reserva>();
        ArrayList<Parcela> parc = new ArrayList<Parcela>();
        boolean anyade = false;
        
        for(Reserva r: reservas)        //recorro reservas
        {
            anyade = false;
            //Obtengo parcelas a comprobar
            parc = r.getParcelas();
            if(parc!=null)
            for(Parcela p: parc)        //recorro parcelas reservadas
            {
                if(p.parcelaID.equals(id))   //Si es mi parcela guardo la reserva
                    anyade = true;      //para comparar las fechas
            }
            
            if(anyade) res.add(r);
            
            anyade = false;
        }
        
        return res;
    }
    
   public ArrayList getActividades(){
       return this.actividades;
   }
   
    public void registrarSalida(Reserva re){
        entradas.remove(re);
    }
    
    public void registrarEntrada(Reserva re){
        
        reservas.remove(re);
        entradas.add(re);
        
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
   
   /**
    * Devuelve todas las IDs de las parcelas existentes en una lista.
    * Alex - 16.11.2021
    * 
    * @return 
    */
   public ArrayList<String> getIDs(){
       ArrayList<String> aux = new ArrayList<String>();
       for(Parcela p: parcelas)
            aux.add(p.getParcelaID());
       return aux;
   }
   
   /**
    * Esta función devuelve una parcela con el id que se le pasa por parametro.
    * Alex - 16.11.2021
    * 
    * @param id
    * @return 
    */
   public Parcela getPardela(String id)
   {
       Parcela res = new Parcela();
        for(Parcela p: parcelas)
           if (p.getParcelaID().equals(id))
               res = p;
               
        return res;
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
    
    public ArrayList<Reserva> getEntradas(){
        return entradas;
    }

    public void setClientes(ArrayList<ClienteDatos> clientes) {
        this.clientes = clientes;
    }
    
    /**
     * Esta función crea un nuevo gerente
     * Alex - 29.11.2021
     * 
     * @param user
     * @param pass 
     */
    public void addGerentes(String user, String pass) {
        this.gerentes.add(new Gerente(user, pass));
    }
    
    public void almacenarClientes(String dni, String nombre, String apellido, String usuario, String pass){
   
        clientes.add(new ClienteDatos(usuario, pass, dni, nombre, apellido));
 

    }
    
    /**
     * Este método crea una reserva con los datos pasados por parámetro.Alex - 16.11.2021
     *
     * @param parcelaID
     * @param numTiendas
     * @param entrada
     * @param salida
     * @param nombres
     * @param tamanyos
     * @param numParcelas 
     */
    public void nuevaReserva(ArrayList<String> parcelaID, int numTiendas, Date entrada,Date salida,ArrayList nombres,ArrayList tamanyos, int numParcelas){
        //Transformo la lista de las parcelasID a parcelas
        ArrayList<Parcela> parcelasT = new ArrayList<>();
        for(String p: parcelaID)
        {
            parcelasT.add(this.getPardela(p));
        }
        reservas.add(new Reserva(parcelasT, parcelaID, numTiendas, entrada, salida, nombres,tamanyos, numParcelas));
    }
    
    public void nuevaEntrada(ArrayList<String> parcelaID, int numTiendas, Date entrada,Date salida,ArrayList nombres,ArrayList tamanyos, int numParcelas, String idP){
        ArrayList<Parcela> parcelasT = new ArrayList<>();
        for(String p: parcelaID)
        {
            parcelasT.add(this.getPardela(p));
        }
        
        entradas.add(new Reserva( parcelasT,  parcelaID, numTiendas, entrada, salida, nombres,tamanyos, numParcelas,idP));
    
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
               cancelada.borrarCliente(cliente);
           }
       }
      
      

        
      
      }
    
        
     public Reserva getReservaID(ArrayList<String> id){
     
        Reserva resultado = null;
         
        for(Reserva res : reservas){
            if(res.getParcelasID() == id){
                resultado = res;
            }
        }
        return resultado;
    }
        
    
}
