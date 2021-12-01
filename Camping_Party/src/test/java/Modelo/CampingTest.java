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

    @Test
    public void testGetLuz() {
    }

    @Test
    public void testGetPrecio() {
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
    }

    @Test
    public void testDevolverActividadesClientes() {
    }

    @Test
    public void testBorrarActividad() {
    }
    
}
