/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Pham Tuan
 */
public class LogView extends JScrollPane implements Observer {
    public LogView(String title){
        super(transactionArea);
        setBorder(new TitledBorder(title));
    }
    public void update(Observable account, Object message){
        if(message == null){
            transactionArea.setText("");
        }else{
            transactionArea.append((String)message);
        }
    }
    
    private  static JTextArea transactionArea = new JTextArea(40,45);


}