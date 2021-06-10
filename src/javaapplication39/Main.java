/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class Main extends JFrame {
    
    public Main() {
        setTitle("Konversi AlfabetTeks Menjadi Morse");
        setBounds(5, 5, 500, 350);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        
        JTextField input = new JTextField();
        input.setBounds(50, 50, 400, 30);
        add(input);
        
        JButton submit = new JButton("Convert");
        submit.setBounds(200, 100, 100, 50);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String mentah = input.getText();
            }
        });
        add(submit);
        
        JTextField result = new JTextField("asdasd");
        result.setBounds(50, 180, 400, 100);
        result.setEditable(false);
        add(result);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main m = new Main();
    }
    
}
