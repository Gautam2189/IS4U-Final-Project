/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author gautam
 */
public class Battle1 extends javax.swing.JFrame {
    Scene1 firstWindow;
    private boolean play = true;
    public Battle1(Scene1 s) {
        initComponents();
        firstWindow = s;
        Sound b = new Sound();
        b.playMusic("src\\music\\battleMusic.wav", play);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCloud = new javax.swing.JLabel();
        lblMinion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCloud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Resources/hero.gif"))); // NOI18N
        getContentPane().add(lblCloud, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 250, 200));

        lblMinion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Resources/minion.gif"))); // NOI18N
        getContentPane().add(lblMinion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 300, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Resources/battleScene.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCloud;
    private javax.swing.JLabel lblMinion;
    // End of variables declaration//GEN-END:variables
}
