/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.js11_myinputform;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyInputFrom1941723006Pandu extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton mButton;
    private JButton mButton2;
    private JPanel mPanel;

    public MyInputFrom1941723006Pandu() {
        createTextFieldPandu();
        createButtonPandu();
        createPanelPandu();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    private void createTextFieldPandu(){
        aLabel = new JLabel("Nilai A : ");
        bLabel = new JLabel("Nilai C : ");
        cLabel = new JLabel("Hasil : ");
        
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }
    
    private void createButtonPandu(){
        mButton = new JButton("calculate");
        mButton2 = new JButton("Tambah");
        
        class AddInterestListener implements ActionListener{
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil : " + c);
            }
        }
        
        class AddTambahListener implements ActionListener{
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a + b;
                cLabel.setText("Hasil : " + c);
            }
        }
        
        ActionListener lsitener = new AddInterestListener();
        ActionListener lsitener2 = new AddTambahListener();
        mButton.addActionListener(lsitener);
        mButton2.addActionListener(lsitener2);
    }
    
    private void createPanelPandu(){
        mPanel = new JPanel();
        mPanel.add(aLabel);
        mPanel.add(aField);
        mPanel.add(bLabel);
        mPanel.add(bField);
        mPanel.add(mButton);
        mPanel.add(mButton2);
        mPanel.add(cLabel); 
        add(mPanel);
    }
    
    public static void main(String[] args) {
        JFrame frame = new MyInputFrom1941723006Pandu();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
