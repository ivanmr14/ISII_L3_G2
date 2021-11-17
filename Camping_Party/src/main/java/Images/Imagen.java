/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Images;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Image;

/**
 *
 * @author Alex
 */
public class Imagen extends javax.swing.JPanel {
    private Image imagen;
    
    @Override
    public void paint (Graphics g){
        imagen = new ImageIcon(getClass().getResource("Parcelas.png")).getImage();
        g.drawImage(imagen,0,0,getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
    
    
//    int x, y;
//
//    public Imagen(JPanel jPanel1) {
//        this.x = jPanel1.getWidth();
//        this.y = jPanel1.getHeight();
//        this.setSize(34, 34);
//    }
//
//    @Override
//    public void paint(Graphics g) {
//        ImageIcon Img = new ImageIcon(getClass().getResource("/Images/Parcelas.png"));
//        g.drawImage(Img.getImage(), 0, 0, x, y, null);
//    }    

}
