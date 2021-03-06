/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

/**
 *
 * @author chSch aliv grdo
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

        btnExit = new javax.swing.JButton();
        btnStartNewGame = new javax.swing.JButton();
        headPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputsPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtWidth = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        infoPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

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

        headPanel.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pong");
        jLabel1.setAlignmentY(0.0F);
        headPanel.add(jLabel1, java.awt.BorderLayout.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Please fill out width and height to create your preferred playfield");
        headPanel.add(jLabel2, java.awt.BorderLayout.PAGE_END);

        jLabel3.setText("Width");

        jLabel4.setText("Height");

        txtWidth.setText("500");
        txtWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWidthActionPerformed(evt);
            }
        });

        txtHeight.setText("500");

        javax.swing.GroupLayout inputsPanelLayout = new javax.swing.GroupLayout(inputsPanel);
        inputsPanel.setLayout(inputsPanelLayout);
        inputsPanelLayout.setHorizontalGroup(
            inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
            .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(inputsPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtWidth)
                        .addComponent(txtHeight, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        inputsPanelLayout.setVerticalGroup(
            inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(inputsPanelLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(inputsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        jLabel5.setText("Controls:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("TopPlayer:  a and d");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("BottomPlayer: left and right");

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(infoPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5)
                    .addContainerGap(359, Short.MAX_VALUE)))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
            .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(infoPanelLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel5)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(headPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStartNewGame)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inputsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(inputsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        ROOTFRAME.setSize(500, 350);
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
    private javax.swing.JPanel headPanel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JPanel inputsPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JTextField txtHeight;
    public static javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables
}
