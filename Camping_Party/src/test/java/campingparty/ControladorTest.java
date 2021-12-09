/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campingparty;

import Modelo.Camping;
import java.text.ParseException;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author alex
 */
public class ControladorTest {
    Camping camping;
    Controlador controlador;
    public ControladorTest() {
       camping = new Camping();
       camping.cargarDatosIniciales();
       controlador = new Controlador();
    }

    @Test
    public void testCargarDatosIniciales() {
    }

    @Test
    public void testParcelaOcupada() throws ParseException {
        boolean test;
        
        SimpleDateFormat sdfINI = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdfFIN = new SimpleDateFormat("yyyy-MM-dd");
        
        Date dateIni = sdfINI.parse("2021-12-04");
        Date dateFin = sdfFIN.parse("2021-12-04");
        
        test = controlador.parcelaOcupada("a1",dateIni,dateFin);
        
        assertFalse(test);
    }

    @Test
    public void testGetFecha() {
    }

    @Test
    public void testGetReservasConDni() {
    }

    @Test
    public void testModificarReservaAux() {
    }

    @Test
    public void testNuevaReserva() {
    }

    @Test
    public void testNuevaEntrada() {
    }

    @Test
    public void testActualizarActividadEnBD() {
    }

    @Test
    public void testComprobarLoginGerente() {
    }

    @Test
    public void testSancionar() {
    }

    @Test
    public void testNumeroDeParcelas() {
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
    public void testGetTamanyo() {
    }

    @Test
    public void testGetLuz() {
    }

    @Test
    public void testGetPrecio() {
    }

    @Test
    public void testEstaOcupada() {
    }

    @Test
    public void testRegistrarEntrada() {
    }

    @Test
    public void testRegistrarSalida() {
    }

    @Test
    public void testRegistrarClienteNuevo() {
    }

    @Test
    public void testGetListaClientes() {
    }

    @Test
    public void testGetReservas() {
    }

    @Test
    public void testGetEntradas() {
    }

    @Test
    public void testGetActividades() {
    }

    @Test
    public void testRegistrarCliente() {
    }

    @Test
    public void testComprobarExistenciaCliente() {
    }

    @Test
    public void testGetNumParcelas() {
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

    @Test
    public void testAddGerentes() {
    }

    @Test
    public void testAumentarNumParcelas() {
    }

    @Test
    public void testSetNumParcelas() {
    }
    
}
