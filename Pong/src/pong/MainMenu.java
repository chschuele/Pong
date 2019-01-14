/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

/**
 *
 * @author chSch
 */
import AfterGame.AfterGame;
import AfterGame.Highscores;
import InGame.Pong;
import java.awt.Dimension;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static pong.Application.ROOTFRAME;

/**
 * First JPanel that get's visible, asking for width and height of playfield.
 * Buttons for exiting and starting the game.
 */
public class MainMenu extends JPanel {
    
    static public MainMenu mainMenu = new MainMenu();
    static public Pong pong;
    static public AfterGame afterGame;
    static public Highscores highscores;

    /**
     * Operation MainMenu.
     *
     * - construct this JPanel - init the components you need for this (see
     * method below) - remove all elements from the root frame - add this panel
     * to the root frame
     *
     * @return
     */
    public MainMenu() {
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
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnStartNewGame = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtWidth = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Pong");

        jLabel2.setText("Please fill out width and height to create your preferred playfield");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnStartNewGame.setText("Start New Game");
        btnStartNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartNewGameActionPerformed(evt);
            }
        });

        jLabel3.setText("Width");

        jLabel4.setText("Height");

        txtWidth.setText("500");
        txtWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWidthActionPerformed(evt);
            }
        });

        txtHeight.setText("500");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStartNewGame))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(10, 10, 10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtHeight)
                            .addComponent(txtWidth, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnStartNewGame))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWidthActionPerformed

    }//GEN-LAST:event_txtWidthActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnStartNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartNewGameActionPerformed

        if (txtHeight.getText().isEmpty() || txtWidth.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill out width and Height");
        } else if (!Pattern.matches("^\\d+$", txtHeight.getText() + txtWidth.getText())) {
            JOptionPane.showMessageDialog(null, "Please enter only numbers");
        } else {
            showPong();
        }
    }//GEN-LAST:event_btnStartNewGameActionPerformed

    static public void changeView(JPanel view) {
        ROOTFRAME.getContentPane().removeAll();
        ROOTFRAME.setLocationRelativeTo(null);
        ROOTFRAME.setLocationRelativeTo(null);
        ROOTFRAME.add(view);
        ROOTFRAME.setVisible(true);
        ROOTFRAME.repaint(); 
        view.setFocusable(true);
        view.setFocusTraversalKeysEnabled(false);
        view.grabFocus();
    }
    
    static public void showMainMenu() {
        ROOTFRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ROOTFRAME.setSize(500, 300);
        ROOTFRAME.setTitle("Pong Main Menu");
        changeView(mainMenu);
    }
    
    static public void showPong() {
        ROOTFRAME.setTitle("Pong");
        pong = new Pong();
        ROOTFRAME.setSize(getWidthPlayfield(), getHeightPlayfield());
        changeView(pong);
    }
    
    static public void showAfterGame() {
        ROOTFRAME.setTitle("Game Over");
        afterGame = new AfterGame();
        ROOTFRAME.setSize(500, 300);
        changeView(afterGame);
    }
    
    static public void showHighscores() {
        ROOTFRAME.setTitle("Scoreboard");
        highscores = new Highscores();
        ROOTFRAME.setSize(500, 400);
        changeView(highscores);
    }
    
    static public void clearPong() {
        pong = null;
    }
    
    public static Dimension getDimension() {
        Dimension playFieldSize = new Dimension(getWidthPlayfield(), getHeightPlayfield());
        return playFieldSize;
    }

    public static int getWidthPlayfield() {
        return Integer.valueOf(txtWidth.getText());
    }

    public static int getHeightPlayfield() {
        return Integer.valueOf(txtHeight.getText());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnStartNewGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JTextField txtHeight;
    public static javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables
}
