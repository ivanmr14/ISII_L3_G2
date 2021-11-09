/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import Modelo.Camping;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

import Modelo.Camping;
import campingparty.Controlador;
import vista.Login;
import vista.RegistrarSalida;
import vista.ReservaCliente;
import vista.Fronton;
import javax.swing.JTabbedPane;
import Modelo.*;

import java.util.Date;
/**
 *
 * @author User
 */
public class RegistrarEntrada extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public RegistrarEntrada(Controlador controlador) {
        initComponents();
        this.controlador = controlador;
        DefaultListModel lista = new DefaultListModel();
        
        
        reservas = controlador.getReservas();
        for(Object o: reservas){
            lista.addElement((Object)o);
        }
        
       listaReservas.setModel(lista);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaReservas = new javax.swing.JList();
        labelRegistrarSalida = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnRegistrarEntrada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listaReservas);

        labelRegistrarSalida.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        labelRegistrarSalida.setText("Registrar Entrada");

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnRegistrarEntrada.setText("Registrar Entrada");
        btnRegistrarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnAtras)
                        .addGap(47, 47, 47)
                        .addComponent(btnRegistrarEntrada))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(labelRegistrarSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelRegistrarSalida)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btnRegistrarEntrada))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        MenuGerente menuGerente = new MenuGerente(controlador);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnRegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEntradaActionPerformed
        // TODO add your handling code here:
        //controlador.registrarEntrada(listaClientes.getSelectedValue());
        Date fecha = new Date();
        Reserva reserva = (Reserva)listaReservas.getSelectedValue();
        
        reserva.setFechaEntrada(fecha);
        controlador.registrarEntrada(reserva);
        
        this.dispose();
    }//GEN-LAST:event_btnRegistrarEntradaActionPerformed


    private ArrayList reservas;
    private Controlador controlador;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnRegistrarEntrada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelRegistrarSalida;
    private javax.swing.JList listaReservas;
    // End of variables declaration//GEN-END:variables
}
