package chessgui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;

/**
 *
 * @author tylar
 */

public class GameOverPanel extends javax.swing.JPanel {

    //winners color
    private final int isWhite;
    //winning method
    private final String method;
    //mainframe for new panel calls
    private final MainFrame mainFrame;
    //board background image
    private Image background;
    
    //GameOverPanel displayed when a game has been succesfully completed
    public GameOverPanel(String method, int isWhite, MainFrame mainFrame) throws IOException {
        //set variables
        initComponents();
        this.isWhite = isWhite;
        this.mainFrame = mainFrame;
        this.method = method;
        //make background pretty
        this.background = ImageIO.read(new File("images/" + mainFrame.boardName));
        this.background = background.getScaledInstance(880, 880, Image.SCALE_SMOOTH);
        this.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        
        //add options panel to interface for new game options
        GameOptionsPanel panel = new GameOptionsPanel(mainFrame);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        OptionsPanel.add(panel);
        OptionsPanel.setLayout(new FlowLayout());
        
        //endgame method indicated by winner's color
        switch (this.isWhite) {
            case 1:
                WinnerLabel.setText("White Has Won By " + this.method);
                break;
            case -1:
                WinnerLabel.setText("Black Has Won By " + this.method);
                break;
            case 0:
                WinnerLabel.setText("Game Has Drawn By " + this.method);
                break;
            default:
                break;
        }
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(background, 0, 0, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OptionsPanel = new javax.swing.JPanel();
        MainMenuButton = new javax.swing.JButton();
        HeaderPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        WinnerLabel = new javax.swing.JLabel();
        PlayAgainLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(880, 880));
        setMinimumSize(new java.awt.Dimension(880, 880));
        setPreferredSize(new java.awt.Dimension(880, 880));

        OptionsPanel.setBackground(new java.awt.Color(88, 88, 88));
        OptionsPanel.setOpaque(false);

        javax.swing.GroupLayout OptionsPanelLayout = new javax.swing.GroupLayout(OptionsPanel);
        OptionsPanel.setLayout(OptionsPanelLayout);
        OptionsPanelLayout.setHorizontalGroup(
            OptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        OptionsPanelLayout.setVerticalGroup(
            OptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );

        MainMenuButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        MainMenuButton.setText("Main Menu");
        MainMenuButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        MainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuButtonActionPerformed(evt);
            }
        });

        HeaderPanel.setBackground(new java.awt.Color(88, 88, 88));
        HeaderPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Game Over");

        WinnerLabel.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        WinnerLabel.setForeground(new java.awt.Color(255, 255, 255));
        WinnerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WinnerLabel.setText("jLabel2");

        PlayAgainLabel.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        PlayAgainLabel.setForeground(new java.awt.Color(255, 255, 255));
        PlayAgainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayAgainLabel.setText("Would you like to play again?");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WinnerLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PlayAgainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(WinnerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PlayAgainLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OptionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                    .addComponent(HeaderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OptionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuButtonActionPerformed
        mainFrame.setNewPanel(new StartMenu(mainFrame));
    }//GEN-LAST:event_MainMenuButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JButton MainMenuButton;
    private javax.swing.JPanel OptionsPanel;
    private javax.swing.JLabel PlayAgainLabel;
    private javax.swing.JLabel WinnerLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}