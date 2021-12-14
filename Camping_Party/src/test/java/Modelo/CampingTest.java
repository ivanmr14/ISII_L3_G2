/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;


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
        ArrayList clientes = new ArrayList();
        ClienteDatos aux;
        for (Object cl : clientes){
            
                aux = (ClienteDatos) cl;
                if (aux.getDni() == "11111111a"){
                    sancionado = aux.isSancionado();
                }
        }
        
        assertTrue(sancionado);
    }

    @Test
    public void testGetFecha() {
    }

    @Test
    public void testGetReservasConDni() {
        ArrayList actividades = null;
        actividades = camping.getReservasConDni("112");
        //int tamanyo = actividades.size();
        System.out.println(actividades.size());
        assertTrue(actividades.size()!=0);
        
        
       
       
        
        
    }

    @Test
    public void testReservasDeParcela() {
        String parcelaPrueba = "A" + "1" + "";
        ArrayList<Reserva> res  = new ArrayList<Reserva>();
        int preEjecucion = res.size();
        int postEjecucion = camping.reservasDeParcela(parcelaPrueba).size();
        assertNotSame(preEjecucion,postEjecucion);
        
        
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
        //añadimos la reserva de prueba al array de reservas de camping
        Reserva res = new Reserva("1",8);
        ArrayList arr = camping.getReservas();
        arr.add(res);
        camping.setReservas(arr);
        
        //modificamos la reserva, registramos una entrada usandola, y comprobamos q se ha modificado en camping
        res = new Reserva("1", 9);
        camping.registrarEntrada(res);
        ArrayList<String> IDparcelas = new ArrayList();
        IDparcelas.add("1");
        assertEquals(res, camping.getReservaID(IDparcelas));
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
        boolean ok = true;
        ArrayList listaIDS = new ArrayList();
        ArrayList listaIDSaux = new ArrayList();
        ArrayList parcelasAux = new ArrayList();
        Parcela p;
        
        //definimos una lista de ids para comprarar
        listaIDS.add("id1");
        listaIDS.add("id2");
        listaIDS.add("id3");
        
        //asosciamos dichos ids a parcelas
        p = new Parcela("A","1",34,14,true);
        p.forzarSetID("id1");
        parcelasAux.add(p);
        
        p = new Parcela("A","2",24,15,false);
        p.forzarSetID("id2");
        parcelasAux.add(p);
        
        p = new Parcela("A","3",33,11,true);
        p.forzarSetID("id3");
        parcelasAux.add(p);
        
        //añadimos las creadas parcelas al camping
        camping.setParcelas(parcelasAux);
        
        //comprobamos que devuelve la cadena de ids esperada
        listaIDSaux = camping.getIDs();
        
        
        for (int i = 0; i < 3; i++){
            if (listaIDSaux.get(i) != listaIDS.get(i)){
                ok = false;
            }
        }
        
        //miramos si se ha complido el comportamineto esperado
        assertTrue(ok);
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
        ArrayList nombres =  new ArrayList();
        ArrayList tamanyos =  new ArrayList();
        ArrayList parcelas = new ArrayList();
        
        parcelas.add("1");
        nombres.add("nombre1");
        tamanyos.add(10);
        int tamanyo = camping.getReservas().size();
        System.out.println(tamanyo);
        
        camping.nuevaReserva(parcelas, 1,Date.valueOf("01/02/2021") , Date.valueOf("03/02/2021"), nombres, tamanyos, 1);
        
        int tamanyonuevo = camping.getReservas().size();
        System.out.println(tamanyonuevo);
        
        assertTrue(tamanyonuevo ==  tamanyo + 1);
        
        
        
    }

    /*Problemas con el tratamiento del tipo Date
        Importa java.sql.Date en vez de java.util.Date
    
    */
    @Test
    public void testNuevaEntrada() {
        int preEjecucion = camping.getEntradas().size();
        ArrayList<String> al = new ArrayList();
        al.add("Prueba");
        ArrayList nombres = new ArrayList();
        nombres.add("Nombre");
        ArrayList tam = new ArrayList();
        tam.add(2);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fEntrada = null;
        Date fSalida = null;
        try{
            fEntrada = (Date) formato.parse("16/12/2021");
            fSalida = (Date) formato.parse("23/12/2021");
        }catch(ParseException ex){
            System.out.println(ex);
        }
        
        camping.nuevaEntrada(al, 2, fEntrada, fSalida, nombres, tam, 2, "Prueba");
        int postEjecucion = camping.getEntradas().size();
        assertNotSame(preEjecucion,postEjecucion);
    }

    @Test
    public void testComprobarExistenciasCliente() {
        
        assertTrue(camping.comprobarExistenciasCliente("misge", "1234"));
    }

    @Test
    public void testComprobarLoginGerente() {
       String user = "admin";
       String pass = "admin";
        
       
       assertTrue(camping.comprobarLoginGerente(user, pass));
       
    }

    @Test
    public void testDevolverUsuario() {
        String test = camping.devolverUsuario("Cliente Uno");
        assertNotSame(test, "");
    }

    @Test
    public void testDevolverPass() {
        String test = camping.devolverPass("clienteUno");
        assertNotSame(test, "");
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
         camping.devolverActividadesClientes("112");
         Actividad a  = new Actividad("piscina", "Lunes 8:30-9:30");
         ArrayList<Actividad> actividades = null;
         ArrayList<Actividad> actividadesfinal = null;
         actividades = camping.devolverActividadesClientes("112");
          int tamanyoinicial = actividades.size();
      
         camping.borrarActividad(a, "112");
         actividadesfinal = camping.devolverActividadesClientes("112");
         int tamanyofinal = actividadesfinal.size();
        
       
       
      // System.out.println(tamanyoinicial);
       //System.out.println(tamanyofinal);
       assertTrue(tamanyofinal==tamanyoinicial-1);
        
    }
    
}
