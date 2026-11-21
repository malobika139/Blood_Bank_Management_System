package com.mycompany.bloodbank;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame {

    JPanel headerPanel, aboutPanel;
    JLabel headerLabel;
    JLabel titleLabel;
    JLabel courseCodeLabel;
    JLabel courseTitleLabel;
    JLabel teacherLabel;
    JLabel student1Label;
    JLabel student2Label;
    JLabel student3Label;
    JButton backButton;
    Cursor cursor;
    About() {

        setLayout(null);
        headerPanel = new JPanel();
        headerPanel.setBounds(0, 0, 900, 40);
        headerPanel.setBackground(new Color(128, 0, 0));
        headerPanel.setLayout(null);

        headerLabel = new JLabel("BLOOD BANK MANAGEMENT SYSTEM");
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 16));
        headerLabel.setBounds(20, 8, 350, 25);
        headerPanel.add(headerLabel);
        add(headerPanel);

        aboutPanel = new JPanel();
        aboutPanel.setBounds(0, 40, 900, 520);
        aboutPanel.setBackground(Color.WHITE);
        aboutPanel.setLayout(null);
        titleLabel = new JLabel("ABOUT PROJECT");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(new Color(150, 0, 0));
        titleLabel.setBounds( 60, 30, 300, 35);

        courseCodeLabel = new JLabel("Course Code: CSE-222");
        courseCodeLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        courseCodeLabel.setBounds(100, 100, 400, 30);
        courseTitleLabel = new JLabel("Course Title: Database Management System Lab");

        courseTitleLabel.setFont(new Font("Arial", Font.PLAIN, 18));

        courseTitleLabel.setBounds(
                100, 145, 600, 30
        );


        teacherLabel = new JLabel(
                "Course Teacher: Shrabanti Chowdhury"
        );

        teacherLabel.setFont(
                new Font("Arial", Font.PLAIN, 18)
        );

        teacherLabel.setBounds(
                100, 190, 500, 30
        );


        student1Label = new JLabel(
                "Student Name: Malobika Bhattacharjee ;   ID: 251-115-139"
        );

        student1Label.setFont(
                new Font("Arial", Font.PLAIN, 18)
        );

        student1Label.setBounds(
                100, 250, 650, 30
        );


        student2Label = new JLabel(
                ""
        );

        student2Label.setFont(
                new Font("Arial", Font.PLAIN, 18)
        );

        student2Label.setBounds(
                100, 295, 650, 30
        );


        student3Label = new JLabel(
                ""
        );

        student3Label.setFont(
                new Font("Arial", Font.PLAIN, 18)
        );

        student3Label.setBounds(
                100, 340, 650, 30
        );


        backButton = new JButton("BACK");

        backButton.setBounds(
                350, 410, 120, 40
        );

        backButton.setBackground(
                new Color(128, 0, 0)
        );

        backButton.setForeground(Color.WHITE);

        backButton.setFocusPainted(false);


        cursor = new Cursor(
                Cursor.HAND_CURSOR
        );

        backButton.setCursor(cursor);


        aboutPanel.add(titleLabel);

        aboutPanel.add(courseCodeLabel);

        aboutPanel.add(courseTitleLabel);

        aboutPanel.add(teacherLabel);

        aboutPanel.add(student1Label);

        aboutPanel.add(student2Label);

        aboutPanel.add(student3Label);

        aboutPanel.add(backButton);


        add(aboutPanel);


        backButton.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Home home = new Home();

                home.setTitle(
                        "BLOOD BANK MANAGEMENT SYSTEM"
                );

                home.setSize(
                        900, 600
                );

                home.setLocationRelativeTo(null);

                home.setDefaultCloseOperation(
                        JFrame.EXIT_ON_CLOSE
                );

                home.setVisible(true);

                dispose();

            }
        });

    }

}
