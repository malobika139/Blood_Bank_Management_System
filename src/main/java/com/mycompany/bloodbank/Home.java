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

public class Home extends JFrame {

    JPanel headerPanel, menuPanel, mainPanel;

    JLabel headerLabel;
    JLabel titleLabel;
    JLabel subTitleLabel;

    JButton homeButton;
    JButton addButton;
    JButton searchButton;
    JButton viewButton;
    JButton availableBloodButton;
    JButton eligibilityButton;
    JButton aboutButton;
    JButton exitButton;

    JButton addDonorBtn;
    JButton searchDonorBtn;
    JButton viewDonorBtn;
    JButton availableBloodBtn;
    JButton eligibilityBtn;

    Cursor cursor;

    Home() {

        setLayout(null);

        headerPanel = new JPanel();

        headerPanel.setBounds(
                0, 0, 900, 40
        );

        headerPanel.setBackground(
                new Color(128, 0, 0)
        );

        headerPanel.setLayout(null);

        headerLabel = new JLabel(
                "BLOOD BANK MANAGEMENT SYSTEM"
        );

        headerLabel.setForeground(
                Color.WHITE
        );

        headerLabel.setFont(
                new Font("Arial", Font.BOLD, 16)
        );

        headerLabel.setBounds(
                20, 8, 350, 25
        );

        headerPanel.add(headerLabel);

        add(headerPanel);


        menuPanel = new JPanel();

        menuPanel.setBounds(
                0, 40, 170, 520
        );

        menuPanel.setBackground(
                new Color(120, 0, 0)
        );

        menuPanel.setLayout(null);


        cursor = new Cursor(
                Cursor.HAND_CURSOR
        );


        homeButton = new JButton("Home");

        addButton = new JButton("Add Donor");

        searchButton = new JButton("Search Donor");

        viewButton = new JButton("View Donors");

        availableBloodButton =
                new JButton("Available Blood");

        eligibilityButton =
                new JButton("Eligibility Check");

        aboutButton = new JButton("About");

        exitButton = new JButton("Exit");


        homeButton.setCursor(cursor);
        addButton.setCursor(cursor);
        searchButton.setCursor(cursor);
        viewButton.setCursor(cursor);
        availableBloodButton.setCursor(cursor);
        eligibilityButton.setCursor(cursor);
        aboutButton.setCursor(cursor);
        exitButton.setCursor(cursor);


        JButton buttons[] = {
            homeButton,
            addButton,
            searchButton,
            viewButton,
            availableBloodButton,
            eligibilityButton,
            aboutButton,
            exitButton
        };


        int y = 5;


        for (JButton b : buttons) {

            b.setBounds(
                    15, y, 140, 38
            );

            b.setBackground(
                    new Color(180, 0, 0)
            );

            b.setForeground(
                    Color.WHITE
            );

            b.setFocusPainted(false);

            menuPanel.add(b);

            y += 52;
        }


        add(menuPanel);


        mainPanel = new JPanel();

        mainPanel.setBounds(
                170, 40, 730, 520
        );

        mainPanel.setBackground(
                Color.WHITE
        );

        mainPanel.setLayout(null);


        titleLabel = new JLabel(
                "BLOOD BANK"
        );

        titleLabel.setFont(
                new Font("Arial", Font.BOLD, 28)
        );

        titleLabel.setForeground(
                new Color(150, 0, 0)
        );

        titleLabel.setBounds(
                220, 50, 300, 40
        );


        JLabel title2 = new JLabel(
                "MANAGEMENT SYSTEM"
        );

        title2.setFont(
                new Font("Arial", Font.BOLD, 24)
        );

        title2.setBounds(
                170, 90, 380, 40
        );


        subTitleLabel = new JLabel(
                "Save Blood, Save Life"
        );

        subTitleLabel.setFont(
                new Font("Arial", Font.PLAIN, 18)
        );

        subTitleLabel.setBounds(
                240, 135, 250, 30
        );


        addDonorBtn = new JButton(
                "ADD DONOR"
        );

        searchDonorBtn = new JButton(
                "SEARCH DONOR"
        );

        viewDonorBtn = new JButton(
                "VIEW DONORS"
        );

        availableBloodBtn = new JButton(
                "AVAILABLE BLOOD"
        );

        eligibilityBtn = new JButton(
                "ELIGIBILITY CHECK"
        );


        addDonorBtn.setBounds(
                60, 220, 130, 70
        );

        searchDonorBtn.setBounds(
                210, 220, 150, 70
        );

        viewDonorBtn.setBounds(
                380, 220, 150, 70
        );

        availableBloodBtn.setBounds(
                550, 220, 150, 70
        );


        eligibilityBtn.setBounds(
                285, 330, 180, 70
        );


        addDonorBtn.setCursor(cursor);
        searchDonorBtn.setCursor(cursor);
        viewDonorBtn.setCursor(cursor);
        availableBloodBtn.setCursor(cursor);
        eligibilityBtn.setCursor(cursor);


        mainPanel.add(titleLabel);

        mainPanel.add(title2);

        mainPanel.add(subTitleLabel);

        mainPanel.add(addDonorBtn);

        mainPanel.add(searchDonorBtn);

        mainPanel.add(viewDonorBtn);

        mainPanel.add(availableBloodBtn);

        mainPanel.add(eligibilityBtn);


        add(mainPanel);


        addDonorBtn.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e) {

                AddDonor donor =
                        new AddDonor();

                donor.setTitle(
                        "BLOOD BANK MANAGEMENT SYSTEM"
                );

                donor.setSize(
                        900, 600
                );

                donor.setLocationRelativeTo(null);

                donor.setDefaultCloseOperation(
                        JFrame.DISPOSE_ON_CLOSE
                );

                donor.setVisible(true);

                dispose();
            }
        });


        addButton.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e) {

                AddDonor donor =
                        new AddDonor();

                donor.setTitle(
                        "BLOOD BANK MANAGEMENT SYSTEM"
                );

                donor.setSize(
                        900, 600
                );

                donor.setLocationRelativeTo(null);

                donor.setDefaultCloseOperation(
                        JFrame.DISPOSE_ON_CLOSE
                );

                donor.setVisible(true);

                dispose();
            }
        });


        searchDonorBtn.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e) {

                SearchDonor search =
                        new SearchDonor();

                search.setTitle(
                        "BLOOD BANK MANAGEMENT SYSTEM"
                );

                search.setSize(
                        900, 600
                );

                search.setLocationRelativeTo(null);

                search.setDefaultCloseOperation(
                        JFrame.DISPOSE_ON_CLOSE
                );

                search.setVisible(true);

                dispose();
            }
        });


        searchButton.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e) {

                SearchDonor search =
                        new SearchDonor();

                search.setTitle(
                        "BLOOD BANK MANAGEMENT SYSTEM"
                );

                search.setSize(
                        900, 600
                );

                search.setLocationRelativeTo(null);

                search.setDefaultCloseOperation(
                        JFrame.DISPOSE_ON_CLOSE
                );

                search.setVisible(true);

                dispose();
            }
        });


        viewDonorBtn.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e) {

                ViewDonor view =
                        new ViewDonor();

                view.setTitle(
                        "BLOOD BANK MANAGEMENT SYSTEM"
                );

                view.setSize(
                        900, 600
                );

                view.setLocationRelativeTo(null);

                view.setDefaultCloseOperation(
                        JFrame.DISPOSE_ON_CLOSE
                );

                view.setVisible(true);

                dispose();
            }
        });


        viewButton.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e) {

                ViewDonor view =
                        new ViewDonor();

                view.setTitle(
                        "BLOOD BANK MANAGEMENT SYSTEM"
                );

                view.setSize(
                        900, 600
                );

                view.setLocationRelativeTo(null);

                view.setDefaultCloseOperation(
                        JFrame.DISPOSE_ON_CLOSE
                );

                view.setVisible(true);

                dispose();
            }
        });


        availableBloodBtn.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e) {

                AvailableBlood blood =
                        new AvailableBlood();

                blood.setTitle(
                        "BLOOD BANK MANAGEMENT SYSTEM"
                );

                blood.setSize(
                        900, 600
                );

                blood.setLocationRelativeTo(null);

                blood.setDefaultCloseOperation(
                        JFrame.DISPOSE_ON_CLOSE
                );

                blood.setVisible(true);

                dispose();
            }
        });


        availableBloodButton.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e) {

                AvailableBlood blood =
                        new AvailableBlood();

                blood.setTitle(
                        "BLOOD BANK MANAGEMENT SYSTEM"
                );

                blood.setSize(
                        900, 600
                );

                blood.setLocationRelativeTo(null);

                blood.setDefaultCloseOperation(
                        JFrame.DISPOSE_ON_CLOSE
                );

                blood.setVisible(true);

                dispose();
            }
        });


        eligibilityBtn.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e) {

                EligibilityCheck check =
                        new EligibilityCheck();

                check.setTitle(
                        "BLOOD BANK MANAGEMENT SYSTEM"
                );

                check.setSize(
                        900, 600
                );

                check.setLocationRelativeTo(null);

                check.setDefaultCloseOperation(
                        JFrame.DISPOSE_ON_CLOSE
                );

                check.setVisible(true);

                dispose();
            }
        });


        eligibilityButton.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e) {

                EligibilityCheck check =
                        new EligibilityCheck();

                check.setTitle(
                        "BLOOD BANK MANAGEMENT SYSTEM"
                );

                check.setSize(
                        900, 600
                );

                check.setLocationRelativeTo(null);

                check.setDefaultCloseOperation(
                        JFrame.DISPOSE_ON_CLOSE
                );

                check.setVisible(true);

                dispose();
            }
        });


        aboutButton.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e) {

                About about =
                        new About();

                about.setTitle(
                        "BLOOD BANK MANAGEMENT SYSTEM"
                );

                about.setSize(
                        900, 600
                );

                about.setLocationRelativeTo(null);

                about.setDefaultCloseOperation(
                        JFrame.DISPOSE_ON_CLOSE
                );

                about.setVisible(true);

                dispose();
            }
        });


        exitButton.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e) {

                System.exit(0);
            }
        });
    }
}