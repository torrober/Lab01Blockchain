/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Elementos;

import Objetos.Usuario;
import UI.NewTransaction;

/**
 *
 * @author guest
 */
public class HeaderTransacciones extends javax.swing.JPanel {

    private Usuario a;

    /**
     * Creates new form Header
     */
    public HeaderTransacciones(Usuario u) {
        initComponents();
        this.a=u;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tRShadowPane1 = new ComponentesUI.TRShadowPane();
        jLabel1 = new javax.swing.JLabel();
        tROutlineButton1 = new ComponentesUI.TROutlineButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tRShadowPane1.setBackground(new java.awt.Color(245, 127, 23));
        tRShadowPane1.setBorderRadius(30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mis transacciones");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tROutlineButton1.setForeground(new java.awt.Color(255, 255, 255));
        tROutlineButton1.setText("Nueva transacción");
        tROutlineButton1.setBorderColor(new java.awt.Color(255, 255, 255));
        tROutlineButton1.setBorderRadius(10);
        tROutlineButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tROutlineButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SwingPay");

        javax.swing.GroupLayout tRShadowPane1Layout = new javax.swing.GroupLayout(tRShadowPane1);
        tRShadowPane1.setLayout(tRShadowPane1Layout);
        tRShadowPane1Layout.setHorizontalGroup(
            tRShadowPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tRShadowPane1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(tRShadowPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tROutlineButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        tRShadowPane1Layout.setVerticalGroup(
            tRShadowPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tRShadowPane1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tROutlineButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tRShadowPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tRShadowPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tROutlineButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tROutlineButton1ActionPerformed
        // TODO add your handling code here:
        NewTransaction n = new NewTransaction(a);
        n.setVisible(true);
    }//GEN-LAST:event_tROutlineButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private ComponentesUI.TROutlineButton tROutlineButton1;
    private ComponentesUI.TRShadowPane tRShadowPane1;
    // End of variables declaration//GEN-END:variables
}
