/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class MainMenu extends javax.swing.JFrame {
    private Scene1 otherWindow;
    static Sound m = new Sound();
    private boolean play = true;
    
    public MainMenu() {
        initComponents();
        setResizable(false);
        
        m.playMusic("src\\music\\menuMusic.wav", play);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnBattle = new javax.swing.JButton();
        btnControls = new javax.swing.JButton();
        btnCredits = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setBackground(new java.awt.Color(0, 0, 0));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, -1));

        btnBattle.setText("Battle!");
        btnBattle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBattleActionPerformed(evt);
            }
        });
        getContentPane().add(btnBattle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 120, 60));

        btnControls.setText("Controls");
        btnControls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlsActionPerformed(evt);
            }
        });
        getContentPane().add(btnControls, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        btnCredits.setText("Credits");
        getContentPane().add(btnCredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        btnStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Resources/startText.png"))); // NOI18N
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 100, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Resources/mainBackground.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnControlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnControlsActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        Main f = new Main();
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnBattleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBattleActionPerformed
        play = false;
        if(otherWindow == null){
                    otherWindow = new Scene1(this);
        }
                otherWindow.setVisible(true);
                this.hide();
    }//GEN-LAST:event_btnBattleActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBattle;
    private javax.swing.JButton btnControls;
    private javax.swing.JButton btnCredits;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
