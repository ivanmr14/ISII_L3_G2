/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author alex
 */
public class CampingTest {
    Camping camping;
    public CampingTest() {
       camping = new Camping();
       camping.cargarDatosIniciales();
       
    }

    @Test
    public void testCargarDatosIniciales() {
    }

    @Test
    public void testSancionar() {
        boolean sancionado = false;
        ClienteDatos cliente = new ClienteDatos("clienteUno","pass1","11111111a","Cliente Uno","Apellido Uno");
        Actividad actividadTest = new Actividad("actividadTest", "Lunes 11:00-13:00");
        actividadTest.addCliente(cliente);
        
        ArrayList acts = camping.getActividades();
        acts.add(actividadTest);
        camping.setActividades(acts);
                
        
        camping.sancionar(cliente);
        //TODO get cliente y hacer sancionado = cliente.getSancionado();
        
        assertTrue(sancionado);
    }

    @Test
    public void testGetFecha() {
    }

    @Test
    public void testGetReservasConDni() {
    }

    @Test
    public void testReservasDeParcela() {
    }

    @Test
    public void testGetActividades() {
    }

    @Test
    public void testRegistrarSalida() {
        
        int entradas = camping.getEntradas().size();
        camping.registrarSalida(camping.getEntradas().get(0));
        int salidaRegistrada = camping.getEntradas().size();
        assertNotSame(entradas, salidaRegistrada);
    }

    @Test
    public void testRegistrarEntrada() {
    }

    @Test
    public void testNumeroDeParcelas() {
    }

    /**             Hecho
     * Compruebo el correcto funcinamiento de obtener
     * el tamaño de una parcela.
     * Alex - 9.12.2021
     */
    @Test
    public void testGetTamanyo() {
        
        String test;
        
        test = camping.getTamanyo("A1");
        
        assertTrue("34".equals(test));
    }

    /**             Hecho
     * Compruebo el correcto funcinamiento de comprobar si hay
     * luz en una parcela.
     * Alex - 1.12.2021
     */
    @Test
    public void testGetLuz() {  //Cualquiera de los asertos comentados tambien valen.
        //assertTrue("Sí".equals(camping.getLuz("A1")));
        assertEquals(camping.getLuz("A1"), "Sí");
        //assertTrue("No".equals(camping.getLuz("A2")));
    }

    /**             Hecho
     * Compruebo el correcto funcinamiento de obtener
     * el precio de una parcela.
     * Alex - 1.12.2021
     */
    @Test
    public void testGetPrecio() {
        assertEquals(camping.getPrecio("A1"),"14.0");
    }

    @Test
    public void testGetPosicionesX() {
    }

    @Test
    public void testGetPosicionesY() {
    }

    @Test
    public void testGetIDs() {
    }

    /**             Hecho
     * Compruebo el correcto funcinamiento de obtener
     * una parcela, el objeto en sí.
     * Alex - 9.12.2021
     */
    @Test
    public void testGetPardela() {
        Parcela p1 = camping.parcelas.get(0);
        Parcela p2 = camping.getPardela("A1");
        
        assertSame(p1,p2);
    }

    @Test
    public void testGetClientes() {
    }

    @Test
    public void testGetGerentes() {
    }

    @Test
    public void testGetReservas() {
    }

    @Test
    public void testGetEntradas() {
    }

    @Test
    public void testSetClientes() {
    }

    @Test
    public void testAddGerentes() {
    }

    @Test
    public void testAlmacenarClientes() {
    }

    @Test
    public void testNuevaReserva() {
    }

    @Test
    public void testNuevaEntrada() {
    }

    @Test
    public void testComprobarExistenciasCliente() {
    }

    @Test
    public void testComprobarLoginGerente() {
       String user = "admin";
       String pass = "admin";
        
       
       assertTrue(camping.comprobarLoginGerente(user, pass));
       
    }

    @Test
    public void testDevolverUsuario() {
    }

    @Test
    public void testDevolverPass() {
    }

    @Test
    public void testDevolverDni() {
    }

    @Test
    public void testAnyadirActividadCliente() {
        camping.anyadirActividadCliente("piscina", "Lunes 8:30-9:30", "112");
        ArrayList<Actividad> actividades = null;
       actividades = camping.devolverActividadesClientes("112");
        int tamanyo = actividades.size();
        
       System.out.println(tamanyo);
       assertTrue(tamanyo!=0);
        
    }

    @Test
    public void testDevolverActividadesClientes() {
        camping.anyadirActividadCliente("piscina", "Lunes 8:30-9:30", "112");
        ArrayList<Actividad> actividades = null;
       actividades = camping.devolverActividadesClientes("112");
        int tamanyo = actividades.size();
        
       System.out.println(tamanyo);
       assertTrue(tamanyo!=0);
    }

    @Test
    public void testBorrarActividad() {
         camping.anyadirActividadCliente("piscina", "Lunes 8:30-9:30", "112");
         Actividad a  = new Actividad("piscina", "Lunes 8:30-9:30");
   
         camping.borrarActividad(a, "112");
        ArrayList<Actividad> actividades = null;
       actividades = camping.devolverActividadesClientes("112");
        int tamanyo = actividades.size();
        
       System.out.println(tamanyo);
       assertTrue(tamanyo==0);
        
    }
    
}
