/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanpis;

import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    
    public Main() {
        initComponents();
    }
    String programVersion = "v1.0";
    
    public void successSignal() {
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JOptionPane.showMessageDialog(this, "Tweet posted successfully.");
    }
    
    public void errorSignal() {
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JOptionPane.showMessageDialog(this, "Your tweet couldn't be posted; please check any errors and try again.");
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        API_Label = new java.awt.Label();
        API_KeyTF = new java.awt.TextField();
        SecretAPI_Label = new java.awt.Label();
        SecretAPI_KeyTF = new java.awt.TextField();
        AccessTokenLabel = new java.awt.Label();
        AccessTokenTF = new java.awt.TextField();
        SecretAccessToken = new java.awt.Label();
        SecretAccessTokenTF = new java.awt.TextField();
        TweetContent = new java.awt.Label();
        TweetContentTF = new java.awt.TextField();
        tweetButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TweetFromX - " + programVersion);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        API_Label.setAlignment(java.awt.Label.RIGHT);
        API_Label.setText("API Key");

        SecretAPI_Label.setAlignment(java.awt.Label.RIGHT);
        SecretAPI_Label.setText("Secret API Key");

        AccessTokenLabel.setAlignment(java.awt.Label.RIGHT);
        AccessTokenLabel.setText("Access Token");

        SecretAccessToken.setAlignment(java.awt.Label.RIGHT);
        SecretAccessToken.setText("Access Token Secret");

        TweetContent.setAlignment(java.awt.Label.RIGHT);
        TweetContent.setText("Tweet Content");

        tweetButton.setLabel("Tweet!");
        tweetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tweetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TweetContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(SecretAccessToken, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SecretAPI_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(API_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(AccessTokenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SecretAccessTokenTF, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(API_KeyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SecretAPI_KeyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(AccessTokenTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TweetContentTF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 184, Short.MAX_VALUE)
                .addComponent(tweetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(API_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(API_KeyTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SecretAPI_KeyTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SecretAPI_Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AccessTokenTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AccessTokenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SecretAccessToken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SecretAccessTokenTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TweetContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TweetContentTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(tweetButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        SecretAccessToken.getAccessibleContext().setAccessibleName("Access Token Secret");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tweetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tweetButtonActionPerformed
        twtAPI twitterAPI = new twtAPI();
        String API_Key = API_KeyTF.getText();
        String SecretAPI_Key = SecretAPI_KeyTF.getText();
        String AccessToken = AccessTokenTF.getText();
        String SecretAccessToken = SecretAccessTokenTF.getText();
        String TweetContent = TweetContentTF.getText();
        int tweetLength = TweetContent.length();      
        String[] TFs = {API_Key, SecretAPI_Key, AccessToken, SecretAccessToken, TweetContent};
          
        boolean TFsFilled = false;
        for (String text : TFs) { // checks if all fields are filled
            int TFLength = text.length();
            if (TFLength > 0) {
                TFsFilled = true;
            } else {
                JOptionPane.showMessageDialog(this, "Please fill all the text boxes.");
                break;
            } } 
        
        if (TFsFilled) { // if fields are filled, will start the procedure to tweet
            boolean isTweetMaximum = twtAPI.isTweetMaximum(tweetLength);
            if (isTweetMaximum) { // checks if content field surpasses character limit
                JOptionPane.showMessageDialog(this, "Your tweet surpasses the character limit, please summarize it and try again.");
            } 
            else { // tweet procedure starts here if all fields are filled
                setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
                twitterAPI.tweet(API_Key, SecretAPI_Key, AccessToken, SecretAccessToken, TweetContent);
                setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }
        } else {
            System.out.println("Waiting for the user to fill all text boxes...");
        }     
       
        // how did i manage to understand this back then
    }//GEN-LAST:event_tweetButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField API_KeyTF;
    private java.awt.Label API_Label;
    private java.awt.Label AccessTokenLabel;
    private java.awt.TextField AccessTokenTF;
    private java.awt.TextField SecretAPI_KeyTF;
    private java.awt.Label SecretAPI_Label;
    private java.awt.Label SecretAccessToken;
    private java.awt.TextField SecretAccessTokenTF;
    private java.awt.Label TweetContent;
    private java.awt.TextField TweetContentTF;
    private java.awt.Button tweetButton;
    // End of variables declaration//GEN-END:variables
}