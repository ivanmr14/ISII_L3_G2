/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import campingparty.Controlador;
import java.util.ArrayList;
import vista.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author alex
 */
public class ActividadesCliente extends javax.swing.JFrame {

    /**
     * Creates new form ActividadesCliente
     */
    
    private String dni;
    private Controlador controlador;
    public ActividadesCliente(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
    }

   public ActividadesCliente(Controlador controlador, String dni) {
        this.controlador = controlador;
        this.dni = dni;
        initComponents();
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        piscina = new javax.swing.JRadioButton();
        comboPiscina = new javax.swing.JComboBox<>();
        fronton = new javax.swing.JRadioButton();
        comboFronton = new javax.swing.JComboBox<>();
        club = new javax.swing.JRadioButton();
        comboClub = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("RESERVA DE ACTIVIDADES");

        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        piscina.setText("Piscina");

        comboPiscina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Martes-17:00-18:00", "Miercoles-9:00-10:00" }));

        fronton.setText("Frontón");

        comboFronton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes-17:00-18:00", "Sábado-9:00-10:00" }));

        club.setText("Club Social");

        comboClub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Viernes-17:00-18:00", "Jueves-9:00-10:00" }));
        comboClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(club)
                    .addComponent(fronton)
                    .addComponent(piscina)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboFronton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboPiscina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(volver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aceptar)
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(piscina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboPiscina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(fronton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboFronton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(club)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar)
                    .addComponent(volver))
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Cliente cliente = new Cliente(controlador);
        cliente.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_volverActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
      
        if(piscina.isSelected()){
            controlador.anyadirActividadCliente("piscina",comboPiscina.getSelectedItem().toString(), dni);
           
        }
        if(fronton.isSelected()){
            controlador.anyadirActividadCliente("fronton",comboFronton.getSelectedItem().toString(), dni);
           
        }
        if(club.isSelected()){
            controlador.anyadirActividadCliente("club Social",comboClub.getSelectedItem().toString(), dni);
           
        }
        
      
        
        
         JOptionPane.showMessageDialog(this, "Actividad reservada! A divertirse!");
        
        
        Cliente cliente = new Cliente(controlador, dni);
        cliente.setVisible(true);
        this.dispose();
        
        
        
    }//GEN-LAST:event_aceptarActionPerformed

    private void comboClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClubActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JRadioButton club;
    private javax.swing.JComboBox<String> comboClub;
    private javax.swing.JComboBox<String> comboFronton;
    private javax.swing.JComboBox<String> comboPiscina;
    private javax.swing.JRadioButton fronton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton piscina;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
