
package finalproject;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Scene1 extends javax.swing.JFrame {
    
    MainMenu firstWindow;
    Battle1 otherWindow;
    static Sound s = new Sound();
    private boolean play = true;
    
    private static int counter = 0;
    
    public Scene1(MainMenu m){
        initComponents();
        
        s.playMusic("src\\music\\storyMusic.wav", play);
        
        lblSpeech1.setVisible(false);
        lblSpeech2.setVisible(false);
        lblSpeech3.setVisible(false);
        lblSpeech4.setVisible(false);
        lblSpeech5.setVisible(false);
        lblSpeech6.setVisible(false);
        lblSpeech7.setVisible(false);
        lblSpeech8.setVisible(false);
        lblSpeech9.setVisible(false);
        setResizable(false);
        firstWindow = m;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEnemy = new javax.swing.JLabel();
        lblChar1 = new javax.swing.JLabel();
        lblSpeech2 = new javax.swing.JLabel();
        lblSpeech1 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        lblSpeech3 = new javax.swing.JLabel();
        lblSpeech4 = new javax.swing.JLabel();
        lblSpeech5 = new javax.swing.JLabel();
        lblSpeech6 = new javax.swing.JLabel();
        lblSpeech7 = new javax.swing.JLabel();
        lblSpeech8 = new javax.swing.JLabel();
        lblSpeech9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEnemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Resources/villian.gif"))); // NOI18N
        getContentPane().add(lblEnemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 320, 200));

        lblChar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Resources/hero.gif"))); // NOI18N
        getContentPane().add(lblChar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 250, 200));

        lblSpeech2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/speech/speech2.png"))); // NOI18N
        getContentPane().add(lblSpeech2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 350, 70));

        lblSpeech1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/speech/speech1.png"))); // NOI18N
        getContentPane().add(lblSpeech1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 420, 60));

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Resources/nextLine.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 40));

        lblSpeech3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/speech/speech3.png"))); // NOI18N
        getContentPane().add(lblSpeech3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 400, 70));

        lblSpeech4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/speech/speech4.png"))); // NOI18N
        getContentPane().add(lblSpeech4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 340, 60));

        lblSpeech5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/speech/speech5.png"))); // NOI18N
        getContentPane().add(lblSpeech5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 350, 70));

        lblSpeech6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/speech/speech6.png"))); // NOI18N
        getContentPane().add(lblSpeech6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 350, 70));

        lblSpeech7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/speech/speech7.png"))); // NOI18N
        getContentPane().add(lblSpeech7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 350, 70));

        lblSpeech8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/speech/speech8.png"))); // NOI18N
        getContentPane().add(lblSpeech8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 440, 70));

        lblSpeech9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/speech/speech9.png"))); // NOI18N
        getContentPane().add(lblSpeech9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 450, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproject/Resources/battleScene.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if(counter == 0){
            lblSpeech1.setVisible(true);
            lblSpeech2.setVisible(false);
            lblSpeech3.setVisible(false);
            lblSpeech4.setVisible(false);
            lblSpeech5.setVisible(false);
            lblSpeech6.setVisible(false);
            lblSpeech7.setVisible(false);
            lblSpeech8.setVisible(false);
            lblSpeech9.setVisible(false);
        }
        if(counter == 1){
            lblSpeech1.setVisible(false);
            lblSpeech2.setVisible(true);
            lblSpeech3.setVisible(false);
            lblSpeech4.setVisible(false);
            lblSpeech5.setVisible(false);
            lblSpeech6.setVisible(false);
            lblSpeech7.setVisible(false);
            lblSpeech8.setVisible(false);
            lblSpeech9.setVisible(false);
        }
        if(counter == 2){
            lblSpeech1.setVisible(false);
            lblSpeech2.setVisible(false);
            lblSpeech3.setVisible(true);
            lblSpeech4.setVisible(false);
            lblSpeech5.setVisible(false);
            lblSpeech6.setVisible(false);
            lblSpeech7.setVisible(false);
            lblSpeech8.setVisible(false);
            lblSpeech9.setVisible(false);
        }
        if(counter == 3){
            lblSpeech1.setVisible(false);
            lblSpeech2.setVisible(false);
            lblSpeech3.setVisible(false);
            lblSpeech4.setVisible(true);
            lblSpeech5.setVisible(false);
            lblSpeech6.setVisible(false);
            lblSpeech7.setVisible(false);
            lblSpeech8.setVisible(false);
            lblSpeech9.setVisible(false);
        }
        if(counter == 4){
            lblSpeech1.setVisible(false);
            lblSpeech2.setVisible(false);
            lblSpeech3.setVisible(false);
            lblSpeech4.setVisible(false);
            lblSpeech5.setVisible(true);
            lblSpeech6.setVisible(false);
            lblSpeech7.setVisible(false);
            lblSpeech8.setVisible(false);
            lblSpeech9.setVisible(false);
        }
        if(counter == 5){
            lblSpeech1.setVisible(false);
            lblSpeech2.setVisible(false);
            lblSpeech3.setVisible(false);
            lblSpeech4.setVisible(false);
            lblSpeech5.setVisible(false);
            lblSpeech6.setVisible(true);
            lblSpeech7.setVisible(false);
            lblSpeech8.setVisible(false);
            lblSpeech9.setVisible(false);
        }
        if(counter == 6){
            lblSpeech1.setVisible(false);
            lblSpeech2.setVisible(false);
            lblSpeech3.setVisible(false);
            lblSpeech4.setVisible(false);
            lblSpeech5.setVisible(false);
            lblSpeech6.setVisible(false);
            lblSpeech7.setVisible(true);
            lblSpeech8.setVisible(false);
            lblSpeech9.setVisible(false);
        }
        if(counter == 7){
            lblSpeech1.setVisible(false);
            lblSpeech2.setVisible(false);
            lblSpeech3.setVisible(false);
            lblSpeech4.setVisible(false);
            lblSpeech5.setVisible(false);
            lblSpeech6.setVisible(false);
            lblSpeech7.setVisible(false);
            lblSpeech8.setVisible(true);
            lblSpeech9.setVisible(false);
        }
        if(counter == 8){
            lblSpeech1.setVisible(false);
            lblSpeech2.setVisible(false);
            lblSpeech3.setVisible(false);
            lblSpeech4.setVisible(false);
            lblSpeech5.setVisible(false);
            lblSpeech6.setVisible(false);
            lblSpeech7.setVisible(false);
            lblSpeech8.setVisible(false);
            lblSpeech9.setVisible(true);
        }
        if(counter == 9){
            play = false;
            if(otherWindow == null){
                    otherWindow = new Battle1(this);
        }
                otherWindow.setVisible(true);
                this.hide();
        }
        
        counter++;
    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblChar1;
    private javax.swing.JLabel lblEnemy;
    private javax.swing.JLabel lblSpeech1;
    private javax.swing.JLabel lblSpeech2;
    private javax.swing.JLabel lblSpeech3;
    private javax.swing.JLabel lblSpeech4;
    private javax.swing.JLabel lblSpeech5;
    private javax.swing.JLabel lblSpeech6;
    private javax.swing.JLabel lblSpeech7;
    private javax.swing.JLabel lblSpeech8;
    private javax.swing.JLabel lblSpeech9;
    // End of variables declaration//GEN-END:variables
}
