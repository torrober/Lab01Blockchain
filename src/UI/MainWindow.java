/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Objetos.Usuario;
import UI.Panels.History;
import UI.Panels.Home;
import UI.Panels.MyData;
import UI.Panels.Transactions;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author guest
 */
public class MainWindow extends javax.swing.JFrame {

    ArrayList<String> pics = new ArrayList<>();
    private int mouseX;
    private int mouseY;
    private Usuario u;

    /**
     * Creates new form JTestFrame
     */
    public MainWindow(Usuario u) {
        initComponents();
        this.u = u;
        setBackground(new Color(0, 0, 0, 0));
        jLabel4.setText(u.getNickname());
        Home h = new Home();
        addPanel(h);
    }

    public void addPanel(JPanel p) {
        p.setSize(jPanel2.getWidth() - 1, jPanel2.getHeight() - 1);
        p.setLocation(0,0);
        p.setBackground(Color.white);
        jPanel2.removeAll();
        jPanel2.add(p, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tRShadowPane6 = new ComponentesUI.TRShadowPane();
        tRShadowPane1 = new ComponentesUI.TRShadowPane();
        jLabel1 = new javax.swing.JLabel();
        menuItem5 = new UI.Elementos.MenuItem();
        menuItem6 = new UI.Elementos.MenuItem();
        menuItem7 = new UI.Elementos.MenuItem();
        menuItem8 = new UI.Elementos.MenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tRShadowPane7 = new ComponentesUI.TRShadowPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        tRShadowPane6.setBackground(new java.awt.Color(255, 255, 255));
        tRShadowPane6.setBorderRadius(30);
        tRShadowPane6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tRShadowPane6MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tRShadowPane6MouseMoved(evt);
            }
        });
        tRShadowPane6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tRShadowPane6MousePressed(evt);
            }
        });

        tRShadowPane1.setBackground(new java.awt.Color(255, 255, 255));
        tRShadowPane1.setBorderRadius(30);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 127, 23));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SwingPay");

        menuItem5.setItemName("Inicio");
        menuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem5MouseClicked(evt);
            }
        });

        menuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icons8_payment_history_24px.png"))); // NOI18N
        menuItem6.setItemName("Mi historial");
        menuItem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem6MouseClicked(evt);
            }
        });

        menuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icons8_currency_exchange_24px.png"))); // NOI18N
        menuItem7.setItemName("Mis transacciones");
        menuItem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem7MouseClicked(evt);
            }
        });

        menuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icons8_user_24px.png"))); // NOI18N
        menuItem8.setItemName("Mis datos");
        menuItem8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tRShadowPane1Layout = new javax.swing.GroupLayout(tRShadowPane1);
        tRShadowPane1.setLayout(tRShadowPane1Layout);
        tRShadowPane1Layout.setHorizontalGroup(
            tRShadowPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tRShadowPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tRShadowPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuItem5, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(menuItem6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuItem7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuItem8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tRShadowPane1Layout.setVerticalGroup(
            tRShadowPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tRShadowPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuItem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuItem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuItem7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuItem8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icons8_delete_24px_2.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tRShadowPane7.setBackground(new java.awt.Color(245, 127, 23));
        tRShadowPane7.setBorderRadius(30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icons8_male_user_48px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("user");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SwingPay");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icons8_exit_24px.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tRShadowPane7Layout = new javax.swing.GroupLayout(tRShadowPane7);
        tRShadowPane7.setLayout(tRShadowPane7Layout);
        tRShadowPane7Layout.setHorizontalGroup(
            tRShadowPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tRShadowPane7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(tRShadowPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(tRShadowPane7Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(20, 20, 20))
        );
        tRShadowPane7Layout.setVerticalGroup(
            tRShadowPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tRShadowPane7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(tRShadowPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tRShadowPane7Layout.createSequentialGroup()
                        .addGroup(tRShadowPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout tRShadowPane6Layout = new javax.swing.GroupLayout(tRShadowPane6);
        tRShadowPane6.setLayout(tRShadowPane6Layout);
        tRShadowPane6Layout.setHorizontalGroup(
            tRShadowPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tRShadowPane6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(tRShadowPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tRShadowPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tRShadowPane7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        tRShadowPane6Layout.setVerticalGroup(
            tRShadowPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tRShadowPane6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(tRShadowPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tRShadowPane6Layout.createSequentialGroup()
                        .addComponent(tRShadowPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tRShadowPane7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tRShadowPane6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tRShadowPane6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tRShadowPane6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tRShadowPane6MouseDragged
        // TODO add your handling code here:
        this.setLocation(evt.getXOnScreen() - mouseX, evt.getYOnScreen() - mouseY);

    }//GEN-LAST:event_tRShadowPane6MouseDragged

    private void tRShadowPane6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tRShadowPane6MouseMoved
        // TODO add your handling code here:  
    }//GEN-LAST:event_tRShadowPane6MouseMoved

    private void tRShadowPane6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tRShadowPane6MousePressed
        // TODO add your handling code here:
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_tRShadowPane6MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void menuItem6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem6MouseClicked
        // TODO add your handling code here:
        addPanel(new History());
    }//GEN-LAST:event_menuItem6MouseClicked

    private void menuItem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem5MouseClicked
        // TODO add your handling code here:
        Home home = new Home();
        addPanel(home);
    }//GEN-LAST:event_menuItem5MouseClicked

    private void menuItem7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem7MouseClicked
        // TODO add your handling code here:
        addPanel(new Transactions(u));
    }//GEN-LAST:event_menuItem7MouseClicked

    private void menuItem8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem8MouseClicked
        // TODO add your handling code here:
        addPanel(new MyData(u));
    }//GEN-LAST:event_menuItem8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.dispose();
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private UI.Elementos.MenuItem menuItem5;
    private UI.Elementos.MenuItem menuItem6;
    private UI.Elementos.MenuItem menuItem7;
    private UI.Elementos.MenuItem menuItem8;
    private ComponentesUI.TRShadowPane tRShadowPane1;
    private ComponentesUI.TRShadowPane tRShadowPane6;
    private ComponentesUI.TRShadowPane tRShadowPane7;
    // End of variables declaration//GEN-END:variables
}
