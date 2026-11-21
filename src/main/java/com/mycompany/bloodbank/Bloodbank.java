

package com.mycompany.bloodbank;

import javax.swing.JFrame;
public class Bloodbank {

    public static void main(String[] args) {
        Home home = new Home();
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setSize(900, 600);
        home.setTitle("BLOOD BANK MANAGEMENT SYSTEM");
        home.setLocationRelativeTo(null);
        home.setVisible(true);
    }
}

