/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campingparty;


import Modelo.Actividad;
import Modelo.ClienteDatos;
import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.TimeZone;

/**
 *
 * @author MIRENA
 */
public class DAO {
    
    Connection conexionBD;

    public DAO() {
         String bd = "jdbc:mysql://localhost/practicais2?serverTimezone=" + TimeZone.getDefault().getID();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexionBD = DriverManager.getConnection(bd,"root","Mirena992108");     
        } catch(Exception e){
            System.out.println("Error de conexión" + e.getMessage());
        }
    
    }
    
    public void insertarEnTabla(String id){
        ResultSet resultado1 = null;
        ResultSet resultados2 = null;
        try {
            //int id = 10; // Valor a insertar
            Statement s = conexionBD.createStatement();
            // Operación SQL sobre la base de datos
            String con = "INSERT INTO actividad (nombre) VALUES ('" + id + "')";
            PreparedStatement preparedStmt = conexionBD.prepareStatement(con);
            preparedStmt.executeUpdate();
        }
        catch(Exception e){ // Error al realizar la operación
            System.out.println("No se ha completado la operación");
        }
    
    }
    
    /**
     * Esta función realiza una modificación en la base de
     * datos para modificar algún campo de una actividad.
     * Alex - 29.11.2021
     * 
     * @param id 
     * @param horaYDia 
     * @param actividad 
     */
    public void actualizarActividadEnBD(String id, String horaYDia, String actividad){
        try {
            //Me conecto a la base de datos.
            Statement s = conexionBD.createStatement();
            
            //Genero la operación SQL para la base de datos
            String query = "UPDATE actividad\n   SET horayDia = " + horaYDia +
                         "\n   SET actividad = " + actividad +
                         "WHERE id = " + id + ";";
            
            //Envío la query al la base de datos.
            PreparedStatement preparedStmt = conexionBD.prepareStatement(query);
            preparedStmt.executeUpdate();
        }
        catch(Exception e){     //Fallo durante la operación
            System.out.println("No se ha actualizar la actividad.");
        }
    
    }
    
    /**
     * Esta función realiza una consulta de actividad a la base de
     * datos.
     * Christian - 30.11.2021
     * 
     * @param id 
     * 
     * 
     */
    public Actividad consultarActividadEnBD(String id_actividad){
        
        Actividad a = new Actividad();
        a.setId(id_actividad);
        
        try {
            
            Statement s = conexionBD.createStatement();
            ResultSet res = null;
            
            
            String query = "SELECT *\n FROM actividad\n WHERE id = " + id_actividad + ";";
            res = s.executeQuery(query);
            
            
            while(res.next()){

                
                String nombre = res.getString("nombre");
                String horario = res.getString("horario");
                ArrayList<ClienteDatos> clientes = (ArrayList)res.getArray("lista_clientes");
                a.setNombre(nombre);
                a.setHorario(horario);
                a.setClientes(clientes);
            }
        }
        catch(Exception e){     //Fallo durante la operación
            System.out.println("No se ha consultar la actividad.");
        }
        
        return a;
        
    }   
    
    public void realizarConsulta(){
        ResultSet resultados = null;
        try {
            String con;
            Statement s = conexionBD.createStatement();
            // Consulta SQL
            con = "SELECT id_prueba FROM prueba";
            resultados = s.executeQuery(con);
            
            while (resultados.next()) {
                int id = resultados.getInt("id_prueba");
                System.out.print(id);
            }
        } catch (Exception e) { // Error en al realizar la consulta
            System.out.println("Error en la petición a la BD");
        }
    }
    
    public void realizarOperacion(){
        ResultSet resultados2 = null;
        try {
            int id = 10; // Valor a insertar
            Statement s = conexionBD.createStatement();
            // Operación SQL sobre la base de datos
            String con = "INSERT INTO prueba (id_prueba) VALUES ('" + id + "')";
            PreparedStatement preparedStmt = conexionBD.prepareStatement(con);
            preparedStmt.executeUpdate();
        }
        catch(Exception e){ // Error al realizar la operación
            System.out.println("No se ha completado la operación");
        }
    
    
    }
  
    
}
