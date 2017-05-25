/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SlideTest;

import com.sun.prism.impl.PrismSettings;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Desarrollo234
 */
public class Slide extends javax.swing.JFrame {

    /**
     * Creates new form Slide
     */
    public Slide() {
        initComponents();
        creapaneles();
        jPanel1.setBorder(null);
        jPanel2.setBorder(null);
        setLocationRelativeTo(null);
        btnMenu.setOpaque(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        pnlBusqueda = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setBorder(null);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlideTest/Images/Checked Checkbox_48px_3.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setIconTextGap(-1);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlideTest/Images/Conference_48px_2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlideTest/Images/Money Bag_48px_2.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlideTest/Images/Search_48px_2.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, -1, 380));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SlideTest/Images/Menu_50px_1.png"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(770, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 826, -1));

        pnlBusqueda.setBackground(new java.awt.Color(0, 0, 255));
        pnlBusqueda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(pnlBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 830, 380));
        pnlBusqueda.getAccessibleContext().setAccessibleParent(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        try {
            // TODO add your handling code here:
            slide(jPanel1);
        } catch (InterruptedException ex) {
            Logger.getLogger(Slide.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       OcultaPaneles();
       MuestraPanel(pnlReportes);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          OcultaPaneles();
        MuestraPanel(pnlUsuarios);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        OcultaPaneles();
        MuestraPanel(pnlCuentas);        // TODO add your handling code here:     // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //OcultaPaneles();
       MuestraPanel(pnlBusqueda);

    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Slide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Slide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Slide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Slide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Slide().setVisible(true);
            }
        });
    }

    
    public void slide(JPanel panel) throws InterruptedException{
        int x = panel.getX();
        int y = panel.getY();
        int width = panel.getWidth();
        int height = panel.getHeight();
        System.out.println("Y = "+ (y + height));
        System.out.println("x = "+ (x + width));
        System.out.println("Width: "+width);
        if (panel.isVisible()) {
             new Timer(1, new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  panel.setLocation(panel.getX() - 10, y);
                  if (panel.getX() + panel.getWidth() <= 0) {
                     ((Timer) e.getSource()).stop();
               System.out.println("Timer stopped");
               panel.setVisible(false);
            }
               }
            }).start();
        }else{
           panel.setVisible(true);/*
            new Timer(1, new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                  panel.setLocation(x + 10, y);
                  if (panel.getX() + panel.getWidth() == width) {
                     ((Timer) e.getSource()).stop();
               System.out.println("Timer stopped");
               panel.setVisible(false);
            }
               }
            }).start();*/
        }
         
        
    }
    
    public void OcultaPaneles(){
        pnlBusqueda.setVisible(false);
        pnlCuentas.setVisible(false);
        pnlReportes.setVisible(false);
        pnlUsuarios.setVisible(false);
    }
    public void MuestraPanel(JPanel panel){
        if (!panel.isVisible()) {
             panel.setVisible(true);
             repaint();
        }
    }
    
    public void creapaneles(){

    pnlCuentas.setBackground(new java.awt.Color(0, 255, 255));
    pnlCuentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    getContentPane().add(pnlCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 850, 390));
    pnlCuentas.getAccessibleContext().setAccessibleParent(null); 
    //
    pnlUsuarios.setBackground(new java.awt.Color(0, 255, 0));
    pnlUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    getContentPane().add(pnlUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 850, 390));
    pnlUsuarios.getAccessibleContext().setAccessibleParent(null); 
    //
    pnlReportes.setBackground(new java.awt.Color(100, 100, 255));
    pnlReportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    getContentPane().add(pnlReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 850, 390));
    pnlReportes.getAccessibleContext().setAccessibleParent(null); 
    }
    
    JPanel   pnlCuentas = new javax.swing.JPanel();
    JPanel   pnlUsuarios = new javax.swing.JPanel();
    JPanel   pnlReportes = new javax.swing.JPanel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pnlBusqueda;
    // End of variables declaration//GEN-END:variables
}
