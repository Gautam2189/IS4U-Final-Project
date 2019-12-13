
package finalproject;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Battle extends javax.swing.JFrame {
    MainMenu firstWindow;
    private Image mainChar;
    
    private void loadImages(){
        mainChar = new ImageIcon("src\\finalProject\\char.gif").getImage();
        
    }
    public Battle(MainMenu m){
        initComponents();
        setResizable(false);
        firstWindow = m;
        outputHealth();
    }
    public void outputHealth(){
        healthBar.setValue(50);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEnemy = new javax.swing.JLabel();
        lblChar1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        healthBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEnemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/enemy1.gif"))); // NOI18N
        getContentPane().add(lblEnemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 220, 200));

        lblChar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/char.gif"))); // NOI18N
        getContentPane().add(lblChar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 180, 200));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/speech1.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 340, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/healthText.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 100, 40));

        healthBar.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(healthBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/battleScene.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar healthBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblChar1;
    private javax.swing.JLabel lblEnemy;
    // End of variables declaration//GEN-END:variables
}
