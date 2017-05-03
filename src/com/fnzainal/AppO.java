package com.fnzainal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zainal on 5/3/17.
 */
public class AppO {
    private JPanel panelMain;
    private JButton btnLogin;


    public AppO() {
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Bismillah..");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AppO");
        frame.setContentPane(new AppO().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
