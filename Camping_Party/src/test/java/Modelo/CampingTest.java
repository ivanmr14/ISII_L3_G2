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

    @Test
    public void testGetTamanyo() {
    }

    /**             Hecho
     * Compruebo el correcto funcinamiento de comprobar si hay
     * luz en una parcela.
     * Alex - 1.12.2021
     */
    @Test
    public void testGetLuz() {
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

    @Test
    public void testGetPardela() {
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
    }
    
}
