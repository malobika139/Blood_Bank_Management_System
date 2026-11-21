
package com.mycompany.bloodbank;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchDonor extends JFrame {

    JPanel headerPanel, menuPanel, searchPanel;

    JLabel headerLabel, titleLabel;
    JLabel idLabel, nameLabel, ageLabel;
    JLabel genderLabel, bloodLabel;
    JLabel phoneLabel, addressLabel;
    JLabel heightLabel, weightLabel;

    JTextField idField;
    JTextField nameField;
    JTextField ageField;
    JTextField genderField;
    JTextField bloodField;
    JTextField phoneField;
    JTextField heightField;
    JTextField weightField;

    JTextArea addressArea;

    JButton searchButton;
    JButton clearButton;
    JButton backButton;

    JButton homeButton;
    JButton addButton;
    JButton searchMenuButton;
    JButton viewButton;
    JButton availableBloodButton;
    JButton eligibilityButton;
    JButton aboutButton;
    JButton exitButton;

    Cursor cursor;

    SearchDonor() {

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
        searchMenuButton = new JButton("Search Donor");
        viewButton = new JButton("View Donors");
        availableBloodButton = new JButton("Available Blood");
        eligibilityButton = new JButton("Eligibility Check");
        aboutButton = new JButton("About");
        exitButton = new JButton("Exit");

        homeButton.setBounds(15, 8, 140, 38);
        homeButton.setBackground(new Color(180, 0, 0));
        homeButton.setForeground(Color.WHITE);
        homeButton.setFocusPainted(false);
        homeButton.setCursor(cursor);
        menuPanel.add(homeButton);

        addButton.setBounds(15, 63, 140, 38);
        addButton.setBackground(new Color(180, 0, 0));
        addButton.setForeground(Color.WHITE);
        addButton.setFocusPainted(false);
        addButton.setCursor(cursor);
        menuPanel.add(addButton);

        searchMenuButton.setBounds(15, 118, 140, 38);
        searchMenuButton.setBackground(new Color(180, 0, 0));
        searchMenuButton.setForeground(Color.WHITE);
        searchMenuButton.setFocusPainted(false);
        searchMenuButton.setCursor(cursor);
        menuPanel.add(searchMenuButton);

        viewButton.setBounds(15, 173, 140, 38);
        viewButton.setBackground(new Color(180, 0, 0));
        viewButton.setForeground(Color.WHITE);
        viewButton.setFocusPainted(false);
        viewButton.setCursor(cursor);
        menuPanel.add(viewButton);

        availableBloodButton.setBounds(15, 228, 140, 38);
        availableBloodButton.setBackground(new Color(180, 0, 0));
        availableBloodButton.setForeground(Color.WHITE);
        availableBloodButton.setFocusPainted(false);
        availableBloodButton.setCursor(cursor);
        menuPanel.add(availableBloodButton);

        eligibilityButton.setBounds(15, 283, 140, 38);
        eligibilityButton.setBackground(new Color(180, 0, 0));
        eligibilityButton.setForeground(Color.WHITE);
        eligibilityButton.setFocusPainted(false);
        eligibilityButton.setCursor(cursor);
        menuPanel.add(eligibilityButton);

        aboutButton.setBounds(15, 338, 140, 38);
        aboutButton.setBackground(new Color(180, 0, 0));
        aboutButton.setForeground(Color.WHITE);
        aboutButton.setFocusPainted(false);
        aboutButton.setCursor(cursor);
        menuPanel.add(aboutButton);

        exitButton.setBounds(15, 393, 140, 38);
        exitButton.setBackground(new Color(180, 0, 0));
        exitButton.setForeground(Color.WHITE);
        exitButton.setFocusPainted(false);
        exitButton.setCursor(cursor);
        menuPanel.add(exitButton);

        add(menuPanel);

        searchPanel = new JPanel();
        searchPanel.setBounds(170, 40, 730, 520);
        searchPanel.setLayout(null);
        searchPanel.setBackground(Color.WHITE);

        titleLabel = new JLabel("SEARCH DONOR");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setForeground(new Color(150, 0, 0));
        titleLabel.setBounds(50, 20, 250, 30);

        idLabel = new JLabel("Donor ID");
        nameLabel = new JLabel("Name");
        ageLabel = new JLabel("Age");
        genderLabel = new JLabel("Gender");
        bloodLabel = new JLabel("Blood Group");
        phoneLabel = new JLabel("Phone");
        addressLabel = new JLabel("Address");
        heightLabel = new JLabel("Height (ft)");
        weightLabel = new JLabel("Weight (kg)");

        idLabel.setBounds(40, 70, 100, 25);
        nameLabel.setBounds(40, 110, 100, 25);
        ageLabel.setBounds(40, 150, 100, 25);
        genderLabel.setBounds(40, 190, 100, 25);
        bloodLabel.setBounds(40, 230, 100, 25);
        phoneLabel.setBounds(40, 270, 100, 25);
        addressLabel.setBounds(40, 310, 100, 25);

        heightLabel.setBounds(400, 70, 100, 25);
        weightLabel.setBounds(400, 110, 100, 25);

        idField = new JTextField();
        nameField = new JTextField();
        ageField = new JTextField();
        genderField = new JTextField();
        bloodField = new JTextField();
        phoneField = new JTextField();
        heightField = new JTextField();
        weightField = new JTextField();

        idField.setBounds(160, 70, 210, 30);
        nameField.setBounds(160, 110, 210, 30);
        ageField.setBounds(160, 150, 210, 30);
        genderField.setBounds(160, 190, 210, 30);
        bloodField.setBounds(160, 230, 210, 30);
        phoneField.setBounds(160, 270, 210, 30);

        heightField.setBounds(500, 70, 160, 30);
        weightField.setBounds(500, 110, 160, 30);

        nameField.setEditable(false);
        ageField.setEditable(false);
        genderField.setEditable(false);
        bloodField.setEditable(false);
        phoneField.setEditable(false);
        heightField.setEditable(false);
        weightField.setEditable(false);

        addressArea = new JTextArea();
        addressArea.setEditable(false);

        JScrollPane scroll = new JScrollPane(addressArea);
        scroll.setBounds(160, 310, 210, 65);

        searchButton = new JButton("SEARCH");
        clearButton = new JButton("CLEAR");
        backButton = new JButton("BACK");

        searchButton.setBounds(180, 425, 100, 40);
        clearButton.setBounds(300, 425, 100, 40);
        backButton.setBounds(420, 425, 100, 40);

        searchButton.setBackground(new Color(128, 0, 0));
        searchButton.setForeground(Color.WHITE);

        clearButton.setBackground(new Color(128, 0, 0));
        clearButton.setForeground(Color.WHITE);

        backButton.setBackground(new Color(128, 0, 0));
        backButton.setForeground(Color.WHITE);

        searchButton.setFocusPainted(false);
        clearButton.setFocusPainted(false);
        backButton.setFocusPainted(false);

        searchButton.setCursor(cursor);
        clearButton.setCursor(cursor);
        backButton.setCursor(cursor);

        searchPanel.add(titleLabel);

        searchPanel.add(idLabel);
        searchPanel.add(nameLabel);
        searchPanel.add(ageLabel);
        searchPanel.add(genderLabel);
        searchPanel.add(bloodLabel);
        searchPanel.add(phoneLabel);
        searchPanel.add(addressLabel);
        searchPanel.add(heightLabel);
        searchPanel.add(weightLabel);

        searchPanel.add(idField);
        searchPanel.add(nameField);
        searchPanel.add(ageField);
        searchPanel.add(genderField);
        searchPanel.add(bloodField);
        searchPanel.add(phoneField);
        searchPanel.add(heightField);
        searchPanel.add(weightField);

        searchPanel.add(scroll);

        searchPanel.add(searchButton);
        searchPanel.add(clearButton);
        searchPanel.add(backButton);

        add(searchPanel);

        searchButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String id = idField.getText();

                if (id.isEmpty()) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Please enter Donor ID."
                    );
                    return;
                }

                boolean found = false;

                for (Donor d : DonorList.getDonors()) {

                    if (d.id.equals(id)) {

                        nameField.setText(d.name);
                        ageField.setText(d.age);
                        genderField.setText(d.gender);
                        bloodField.setText(d.bloodGroup);
                        phoneField.setText(d.phone);
                        addressArea.setText(d.address);
                        heightField.setText(d.height);
                        weightField.setText(d.weight);

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Donor not found!"
                    );

                    nameField.setText("");
                    ageField.setText("");
                    genderField.setText("");
                    bloodField.setText("");
                    phoneField.setText("");
                    addressArea.setText("");
                    heightField.setText("");
                    weightField.setText("");
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                idField.setText("");
                nameField.setText("");
                ageField.setText("");
                genderField.setText("");
                bloodField.setText("");
                phoneField.setText("");
                addressArea.setText("");
                heightField.setText("");
                weightField.setText("");
            }
        });

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

                AddDonor add = new AddDonor();
                openPage(add);
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

                AvailableBlood blood = new AvailableBlood();
                openPage(blood);
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

