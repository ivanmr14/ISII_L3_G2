/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campingparty;


import java.sql.*;
import java.sql.Connection;
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
            System.out.println("Erro de conexión" + e.getMessage());
        }
    
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
