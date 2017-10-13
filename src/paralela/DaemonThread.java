/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paralela;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author personal
 */
public class DaemonThread extends JFrame implements Runnable{
    
    private Thread t;
    
    public DaemonThread(){
        setUndecorated(true);
        setSize(new Dimension(150,150));
        getContentPane().add(new JLabel("tazmanian devil"), BorderLayout.CENTER);
        pack();
        setLocation(50,50);
        setVisible(true);
        
        t = new Thread(this, "demonio");
        t.setDaemon(true);
        t.start();
    }
    public static void main(String[] args) {
        DaemonThread d = new DaemonThread();
    }

    @Override
    public void run() {
        while(true){
            setVisible(true);
            try{
                Thread.sleep(2000);
                setVisible(false);
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                
            }
        }
    }
    
}
