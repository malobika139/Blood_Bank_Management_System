
package com.mycompany.bloodbank;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AvailableBlood extends JFrame {

    JPanel headerPanel, menuPanel, bloodPanel;

    JLabel headerLabel, titleLabel;

    JTable bloodTable;

    JScrollPane scrollPane;

    JButton backButton;
    JButton homeButton, addButton, searchButton;
    JButton viewButton, availableBloodButton;
    JButton eligibilityButton, aboutButton, exitButton;

    Cursor cursor;

    String bloodGroups[] = {
        "A+",
        "A-",
        "B+",
        "B-",
        "AB+",
        "AB-",
        "O+",
        "O-"
    };

    AvailableBlood() {

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

        menuPanel = new JPanel();
        menuPanel.setBounds(0, 40, 170, 520);
        menuPanel.setBackground(new Color(120, 0, 0));
        menuPanel.setLayout(null);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        homeButton = new JButton("Home");
        addButton = new JButton("Add Donor");
        searchButton = new JButton("Search Donor");
        viewButton = new JButton("View Donors");
        availableBloodButton = new JButton("Available Blood");
        eligibilityButton = new JButton("Eligibility Check");
        aboutButton = new JButton("About");
        exitButton = new JButton("Exit");

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

        int y = 8;

        for (JButton b : buttons) {
            b.setBounds(15, y, 140, 38);
            b.setBackground(new Color(180, 0, 0));
            b.setForeground(Color.WHITE);
            b.setFocusPainted(false);
            b.setCursor(cursor);
            menuPanel.add(b);
            y += 55;
        }

        add(menuPanel);

        bloodPanel = new JPanel();
        bloodPanel.setBounds(170, 40, 730, 520);
        bloodPanel.setBackground(Color.WHITE);
        bloodPanel.setLayout(null);

        titleLabel = new JLabel("AVAILABLE BLOOD");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setForeground(new Color(150, 0, 0));
        titleLabel.setBounds(40, 25, 300, 30);

        bloodPanel.add(titleLabel);

        String columns[] = {
            "Blood Group",
            "Available Units"
        };

        DefaultTableModel model = new DefaultTableModel(
                columns, 0
        );

        bloodTable = new JTable(model);
        bloodTable.setRowHeight(35);

        scrollPane = new JScrollPane(bloodTable);
        scrollPane.setBounds(100, 80, 530, 300);

        bloodPanel.add(scrollPane);

        backButton = new JButton("BACK");
        backButton.setBounds(305, 420, 120, 40);
        backButton.setBackground(new Color(128, 0, 0));
        backButton.setForeground(Color.WHITE);
        backButton.setFocusPainted(false);
        backButton.setCursor(cursor);

        bloodPanel.add(backButton);

        add(bloodPanel);

        showBlood();

        backButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                openHome();
            }
        });

        homeButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                openHome();
            }
        });

        addButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                AddDonor donor = new AddDonor();
                openPage(donor);
            }
        });

        searchButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                SearchDonor search = new SearchDonor();
                openPage(search);
            }
        });

        viewButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                ViewDonor view = new ViewDonor();
                openPage(view);
            }
        });

        availableBloodButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                showBlood();
            }
        });

        eligibilityButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                EligibilityCheck check = new EligibilityCheck();
                openPage(check);
            }
        });

        aboutButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                About about = new About();
                openPage(about);
            }
        });

        exitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });
    }

    public void showBlood() {

        DefaultTableModel model =
                (DefaultTableModel) bloodTable.getModel();

        model.setRowCount(0);

        for (int i = 0; i < bloodGroups.length; i++) {

            int count = 0;

            for (Donor d : DonorList.getDonors()) {

                if (d.getBloodGroup().equals(
                        bloodGroups[i])) {

                    count++;
                }
            }

            model.addRow(new Object[] {
                bloodGroups[i],
                count
            });
        }
    }

    public void openHome() {

        Home home = new Home();

        home.setTitle("BLOOD BANK MANAGEMENT SYSTEM");
        home.setSize(900, 600);
        home.setLocationRelativeTo(null);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setVisible(true);

        dispose();
    }

    public void openPage(JFrame page) {

        page.setTitle("BLOOD BANK MANAGEMENT SYSTEM");
        page.setSize(900, 600);
        page.setLocationRelativeTo(null);
        page.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        page.setVisible(true);

        dispose();
    }
}
