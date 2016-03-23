/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;

/**
 *
 * @author Matthias Carlier
 */
public class Start extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public Start() {
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

        lblLogo = new javax.swing.JLabel();
        btnOnlineGame = new javax.swing.JButton();
        btnLocalGame = new javax.swing.JButton();
        lblVersion = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 960));

        lblLogo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblLogo.setText("Dominion");
        lblLogo.setToolTipText("");

        btnOnlineGame.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOnlineGame.setText("Online Game With Friends");
        btnOnlineGame.setPreferredSize(new java.awt.Dimension(366, 96));
        btnOnlineGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnlineGameActionPerformed(evt);
            }
        });

        btnLocalGame.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLocalGame.setText("Local Game With Friends");
        btnLocalGame.setPreferredSize(new java.awt.Dimension(366, 96));
        btnLocalGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalGameActionPerformed(evt);
            }
        });

        lblVersion.setText("Version: Alpha 0.1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(466, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOnlineGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocalGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(448, 448, 448))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(537, 537, 537)
                        .addComponent(lblLogo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblVersion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(lblLogo)
                .addGap(124, 124, 124)
                .addComponent(btnLocalGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnOnlineGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
                .addComponent(lblVersion)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOnlineGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnlineGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOnlineGameActionPerformed

    private void btnLocalGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLocalGameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLocalGame;
    private javax.swing.JButton btnOnlineGame;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblVersion;
    // End of variables declaration//GEN-END:variables
}
