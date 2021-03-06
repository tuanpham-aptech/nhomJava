/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nthan
 */

package b2;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultListModel;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class Dictionnary extends javax.swing.JFrame {
    
    
    final static int EN_VN = 1; // translate from English to Vietnamese
    final static int VN_EN = 2; //translate from Vietnamese to English
    static int Translation = 1; // 
    static String KeyWord = "";
    static ProcessWord Obj;
    /**
     * Creates new form Dictionnary
     */
    public Dictionnary() {
        initComponents();
        setTitle("Dictionnary");
        setResizable(false);
        // override luu ky tu yeu thich xuong file trong qua trinh windows dang tat
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                Obj.SaveFileListWordLove();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_backroud = new javax.swing.JPanel();
        tf_KeyWord = new javax.swing.JTextField();
        btn_Search = new javax.swing.JButton();
        cb_SelectLanguage = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea_trans = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 255));

        tf_KeyWord.setToolTipText("Enter your word");
        tf_KeyWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_KeyWordActionPerformed(evt);
            }
        });
        tf_KeyWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_KeyWordKeyReleased(evt);
            }
        });
        tf_KeyWord.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                tf_KeyWordVetoableChange(evt);
            }
        });

        btn_Search.setText("Tra từ");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });

        cb_SelectLanguage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English-Vietnamese", "Vietnamese - English" }));
        cb_SelectLanguage.setName("cb_select"); // NOI18N
        cb_SelectLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_SelectLanguageActionPerformed(evt);
            }
        });

        textarea_trans.setEditable(false);
        textarea_trans.setColumns(20);
        textarea_trans.setRows(5);
        jScrollPane1.setViewportView(textarea_trans);

        javax.swing.GroupLayout pn_backroudLayout = new javax.swing.GroupLayout(pn_backroud);
        pn_backroud.setLayout(pn_backroudLayout);
        pn_backroudLayout.setHorizontalGroup(
            pn_backroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_backroudLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb_SelectLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_backroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pn_backroudLayout.createSequentialGroup()
                        .addComponent(tf_KeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(284, 284, 284))
        );
        pn_backroudLayout.setVerticalGroup(
            pn_backroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_backroudLayout.createSequentialGroup()
                .addGroup(pn_backroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_backroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_KeyWord, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_SelectLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(51, 255, 51));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DICTIONNARY");

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pn_backroud, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_backroud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void cb_SelectLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_SelectLanguageActionPerformed
        if(cb_SelectLanguage.getSelectedItem().toString() == "English-Vietnamese"){
            Translation = 1;
        }
            if(cb_SelectLanguage.getSelectedItem().toString() == "Vietnamese - English"){
                Translation = 2;
            }
    }//GEN-LAST:event_cb_SelectLanguageActionPerformed

    private void tf_KeyWordVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_tf_KeyWordVetoableChange
        
    }//GEN-LAST:event_tf_KeyWordVetoableChange

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed

        // Search KeyWOrd
        KeyWord = tf_KeyWord.getText();
        if(Translation == 1){
            Meanings tempEN_VN =  Obj.LookUpEN_VN(KeyWord);
            if(tempEN_VN != null){
            textarea_trans.setText(tempEN_VN.getPronunciation() + "\n" 
                    + "--------------------------------------------------" + "\n"
                    + "* " + tempEN_VN.getAttribute() + "\n"
                    + tempEN_VN.getlistWordtrans());
        
           
            }
            else
            textarea_trans.setText("Nofound!!!");
        }
        else if(Translation == 2){
            Meanings tempVN_EN = Obj.lookUpVn_EN(KeyWord);
            if(tempVN_EN != null){
                 textarea_trans.setText(tempVN_EN.getPronunciation() + "\n" 
                    + "--------------------------------------------------" + "\n"
                    + "* " + tempVN_EN.getAttribute() + "\n"
                    + tempVN_EN.getlistWordtrans());
           
            }
            else
            textarea_trans.setText("Nofound!!!");
        }    
        else{}
        
        // Check Other KeyWord EN
        if(Translation == 1){
            for(int i = 0; i < Obj.listWordOther.size(); i++){
                if(KeyWord.equals(Obj.listWordOther.get(i).getKey())){
                   
                }
            }
        }
        //---------------------------------------------------------------------
        //CHECK OTHER KEY WORD
        if(Translation == 2){
            for(int i = 0; i < Obj.listWordOther_VN.size(); i++){
                if(KeyWord.equals(Obj.listWordOther_VN.get(i).getKey())){
                    
                }
            }  
        }
        //---------------------------------------------------------------------

    }//GEN-LAST:event_btn_SearchActionPerformed

    private void tf_KeyWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_KeyWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_KeyWordActionPerformed

    private void tf_KeyWordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_KeyWordKeyReleased
 
        KeyWord = tf_KeyWord.getText();
        if(Translation == 1){
            Meanings tempEN_VN =  Obj.LookUpEN_VN(KeyWord);
            if(tempEN_VN != null){
            textarea_trans.setText(tempEN_VN.getPronunciation() + "\n" 
                    + "--------------------------------------------------" + "\n"
                    + "* " + tempEN_VN.getAttribute() + "\n"
                    + tempEN_VN.getlistWordtrans());
            // save history search
            History temp = new History();
            temp.setKey(KeyWord);
            Obj.historyEN.add(temp);
            }
            else
            textarea_trans.setText("Nofound!!!");
        }
        else if(Translation == 2){
            Meanings tempVN_EN = Obj.lookUpVn_EN(KeyWord);
            if(tempVN_EN != null){
                 textarea_trans.setText(tempVN_EN.getPronunciation() + "\n" 
                    + "--------------------------------------------------" + "\n"
                    + "* " + tempVN_EN.getAttribute() + "\n"
                    + tempVN_EN.getlistWordtrans());
            // save History search
            History temp = new History();
            temp.setKey(KeyWord);
          
            Obj.historyVN.add(temp);
            }
            else
            textarea_trans.setText("Nofound!!!");
        }    
        else{}
        
        // Check Other KeyWord EN
        if(Translation == 1){
            for(int i = 0; i < Obj.listWordOther.size(); i++){
                if(KeyWord.equals(Obj.listWordOther.get(i).getKey())){
                    if(Obj.listWordOther.get(i).getLike() == true){
                       
                    }
                    if(Obj.listWordOther.get(i).getDislike() == true){;
                        
                    }
                    if(Obj.listWordOther.get(i).getPopular() == true){
                        
                    }
                }
            }
        }
        //---------------------------------------------------------------------
        //CHECK OTHER KEY WORD
        if(Translation == 2){
            for(int i = 0; i < Obj.listWordOther_VN.size(); i++){
                if(KeyWord.equals(Obj.listWordOther_VN.get(i).getKey())){
                    if(Obj.listWordOther_VN.get(i).getLike() == true){
                      
                    }
                    else{
                        
                    }
                    if(Obj.listWordOther_VN.get(i).getPopular() == true){
                        
                    }
                }
            }  
        }
        //---------------------------------------------------------------------


    }//GEN-LAST:event_tf_KeyWordKeyReleased

    
     
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
            java.util.logging.Logger.getLogger(Dictionnary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dictionnary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dictionnary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dictionnary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Dictionnary().setVisible(true);
                Obj = new ProcessWord();
                Obj.ReadFile_EN_VN();
                Obj.ReadFileVN_EN();
                Obj.ReadFileListWordLove();
                          }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton btn_Search;
    private javax.swing.JComboBox<String> cb_SelectLanguage;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JPanel pn_backroud;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTextArea textarea_trans;
    private javax.swing.JTextField tf_KeyWord;
    // End of variables declaration//GEN-END:variables

}
