/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.view;

import java.awt.Color;

/**
 *
 * @author Fajr
 */
public class Fichier extends javax.swing.JFrame {

    /**
     * Creates new form Fichier
     */
    public Fichier() {
        initComponents();
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
        client = new javax.swing.JLabel();
        produit = new javax.swing.JLabel();
        commande = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTION DES COMMANDES");

        client.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        client.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        client.setText("Client");
        client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clientEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clientMouseExited(evt);
            }
        });

        produit.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        produit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        produit.setText("Produit");
        produit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        produit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                produitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                produitMouseExited(evt);
            }
        });

        commande.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        commande.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        commande.setText("Commande");
        commande.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        commande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                commandeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commandeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commandeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(client, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(produit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(commande, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(261, 261, 261))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(client)
                .addGap(18, 18, 18)
                .addComponent(produit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(commande)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void produitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produitMouseExited
        // TODO add your handling code here:
        produit.setForeground(Color.BLACK);
    }//GEN-LAST:event_produitMouseExited

    private void commandeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commandeMouseEntered
        // TODO add your handling code here:
        commande.setForeground(Color.blue);
    }//GEN-LAST:event_commandeMouseEntered

    private void produitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produitMouseEntered
        // TODO add your handling code here:
        produit.setForeground(Color.blue);
    }//GEN-LAST:event_produitMouseEntered

    private void commandeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commandeMouseExited
        // TODO add your handling code here:
        commande.setForeground(Color.BLACK);
    }//GEN-LAST:event_commandeMouseExited

    private void clientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientMouseExited
        // TODO add your handling code here:
        client.setForeground(Color.BLACK);
    }//GEN-LAST:event_clientMouseExited

    private void clientEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientEntered
        // TODO add your handling code here:
        client.setForeground(Color.blue);
    }//GEN-LAST:event_clientEntered

    private void clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientMouseClicked
        client cli=new client(this, rootPaneCheckingEnabled);
        cli.setVisible(true);
    }//GEN-LAST:event_clientMouseClicked

    private void produitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produitMouseClicked
//        Commandes com = new Commandes(this, rootPaneCheckingEnabled);
//        com.setVisible(true);
    }//GEN-LAST:event_produitMouseClicked

    private void commandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commandeMouseClicked
        Commandes com = new Commandes(this, rootPaneCheckingEnabled);
        com.setVisible(true);
    }//GEN-LAST:event_commandeMouseClicked

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
            java.util.logging.Logger.getLogger(Fichier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fichier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fichier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fichier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fichier().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel client;
    private javax.swing.JLabel commande;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel produit;
    // End of variables declaration//GEN-END:variables
}
