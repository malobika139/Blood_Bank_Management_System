package com.mycompany.bloodbank;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EligibilityCheck extends JFrame {

    JPanel headerPanel, menuPanel, formPanel;

    JLabel headerLabel, titleLabel;
    JLabel idLabel, nameLabel, ageLabel;
    JLabel genderLabel, bloodLabel;
    JLabel heightLabel, weightLabel;
    JLabel bmiLabel, statusLabel;

    JTextField idField, nameField, ageField;
    JTextField genderField, bloodField;
    JTextField heightField, weightField;
    JTextField bmiField, statusField;

    JButton checkButton, clearButton, backButton;
    JButton homeButton, addButton, searchButton;
    JButton viewButton, availableBloodButton;
    JButton eligibilityButton, aboutButton, exitButton;

    Cursor cursor;

    EligibilityCheck() {

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

        formPanel = new JPanel();
        formPanel.setBounds(170, 40, 730, 520);
        formPanel.setBackground(Color.WHITE);
        formPanel.setLayout(null);

        titleLabel = new JLabel("DONOR ELIGIBILITY CHECK");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setForeground(new Color(150, 0, 0));
        titleLabel.setBounds(50, 20, 350, 30);

        idLabel = new JLabel("Donor ID");
        nameLabel = new JLabel("Name");
        ageLabel = new JLabel("Age");
        genderLabel = new JLabel("Gender");
        bloodLabel = new JLabel("Blood Group");
        heightLabel = new JLabel("Height (ft)");
        weightLabel = new JLabel("Weight (kg)");
        bmiLabel = new JLabel("BMI");
        statusLabel = new JLabel("Eligibility Status");

        idLabel.setBounds(50, 70, 120, 25);
        nameLabel.setBounds(50, 110, 120, 25);
        ageLabel.setBounds(50, 150, 120, 25);
        genderLabel.setBounds(50, 190, 120, 25);
        bloodLabel.setBounds(50, 230, 120, 25);
        heightLabel.setBounds(50, 270, 120, 25);
        weightLabel.setBounds(50, 310, 120, 25);
        bmiLabel.setBounds(50, 350, 120, 25);
        statusLabel.setBounds(50, 390, 150, 25);

        idField = new JTextField();
        nameField = new JTextField();
        ageField = new JTextField();
        genderField = new JTextField();
        bloodField = new JTextField();
        heightField = new JTextField();
        weightField = new JTextField();
        bmiField = new JTextField();
        statusField = new JTextField();

        idField.setBounds(200, 70, 230, 30);
        nameField.setBounds(200, 110, 230, 30);
        ageField.setBounds(200, 150, 230, 30);
        genderField.setBounds(200, 190, 230, 30);
        bloodField.setBounds(200, 230, 230, 30);
        heightField.setBounds(200, 270, 230, 30);
        weightField.setBounds(200, 310, 230, 30);
        bmiField.setBounds(200, 350, 230, 30);
        statusField.setBounds(200, 390, 230, 30);

        nameField.setEditable(false);
        ageField.setEditable(false);
        genderField.setEditable(false);
        bloodField.setEditable(false);
        heightField.setEditable(false);
        weightField.setEditable(false);
        bmiField.setEditable(false);
        statusField.setEditable(false);

        checkButton = new JButton("CHECK");
        clearButton = new JButton("CLEAR");
        backButton = new JButton("BACK");

        checkButton.setBounds(450, 70, 100, 40);
        clearButton.setBounds(250, 445, 100, 40);
        backButton.setBounds(370, 445, 100, 40);

        checkButton.setBackground(new Color(128, 0, 0));
        checkButton.setForeground(Color.WHITE);
        checkButton.setFocusPainted(false);
        checkButton.setCursor(cursor);

        clearButton.setBackground(new Color(128, 0, 0));
        clearButton.setForeground(Color.WHITE);
        clearButton.setFocusPainted(false);
        clearButton.setCursor(cursor);

        backButton.setBackground(new Color(128, 0, 0));
        backButton.setForeground(Color.WHITE);
        backButton.setFocusPainted(false);
        backButton.setCursor(cursor);

        formPanel.add(titleLabel);

        formPanel.add(idLabel);
        formPanel.add(nameLabel);
        formPanel.add(ageLabel);
        formPanel.add(genderLabel);
        formPanel.add(bloodLabel);
        formPanel.add(heightLabel);
        formPanel.add(weightLabel);
        formPanel.add(bmiLabel);
        formPanel.add(statusLabel);

        formPanel.add(idField);
        formPanel.add(nameField);
        formPanel.add(ageField);
        formPanel.add(genderField);
        formPanel.add(bloodField);
        formPanel.add(heightField);
        formPanel.add(weightField);
        formPanel.add(bmiField);
        formPanel.add(statusField);

        formPanel.add(checkButton);
        formPanel.add(clearButton);
        formPanel.add(backButton);

        add(formPanel);

        checkButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String id = idField.getText().trim();

                if (id.isEmpty()) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Please enter Donor ID."
                    );
                    return;
                }

                Donor found = null;

                for (Donor d : DonorList.getDonors()) {

                    if (d.getId().equals(id)) {
                        found = d;
                        break;
                    }
                }

                if (found == null) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Donor not found."
                    );
                    return;
                }

                nameField.setText(found.getName());
                ageField.setText(found.getAge());
                genderField.setText(found.getGender());
                bloodField.setText(found.getBloodGroup());
                heightField.setText(found.getHeight());
                weightField.setText(found.getWeight());

                try {

                    double age = Double.parseDouble(found.getAge());
                    double heightFt = Double.parseDouble(found.getHeight());
                    double weight = Double.parseDouble(found.getWeight());

                    if (heightFt <= 0 || weight <= 0) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Height and Weight must be positive."
                        );
                        return;
                    }

                    double heightMeter = heightFt * 0.3048;

                    double bmi = weight /
                            (heightMeter * heightMeter);

                    bmiField.setText(
                            String.format("%.2f", bmi)
                    );

                    if (age >= 18 &&
                        age <= 60 &&
                        bmi >= 18.5 &&
                        bmi <= 30) {

                        statusField.setText("ELIGIBLE");

                    } else {

                        statusField.setText("NOT ELIGIBLE");
                    }

                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Invalid age, height or weight."
                    );
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
                heightField.setText("");
                weightField.setText("");
                bmiField.setText("");
                statusField.setText("");
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

                AvailableBlood blood = new AvailableBlood();
                openPage(blood);
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