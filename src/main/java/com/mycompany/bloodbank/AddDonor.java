
package com.mycompany.bloodbank;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDonor extends JFrame {

    JPanel headerPanel, menuPanel, formPanel;

    JLabel headerLabel, titleLabel;
    JLabel idLabel, nameLabel, ageLabel;
    JLabel genderLabel, bloodLabel;
    JLabel phoneLabel, addressLabel;
    JLabel heightLabel, weightLabel;

    JTextField idField, nameField, ageField;
    JTextField phoneField, heightField, weightField;

    JComboBox cb, bc;

    String[] genderBox = {
        "Select Gender", "Male", "Female", "Other"
    };

    String[] bloodBox = {
        "Select Blood Group", "A+", "A-", "B+", "B-",
        "AB+", "AB-", "O+", "O-"
    };

    JTextArea addressArea;

    JButton saveButton, clearButton, backButton;
    JButton homeButton, addButton, searchButton;
    JButton viewButton, availableBloodButton;
    JButton eligibilityButton, aboutButton, exitButton;

    Cursor cursor;

    AddDonor() {

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

        searchButton.setBounds(15, 118, 140, 38);
        searchButton.setBackground(new Color(180, 0, 0));
        searchButton.setForeground(Color.WHITE);
        searchButton.setFocusPainted(false);
        searchButton.setCursor(cursor);
        menuPanel.add(searchButton);

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

        formPanel = new JPanel();
        formPanel.setBounds(170, 40, 730, 520);
        formPanel.setLayout(null);
        formPanel.setBackground(Color.WHITE);

        titleLabel = new JLabel("ADD NEW DONOR");
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
        phoneField = new JTextField();
        heightField = new JTextField();
        weightField = new JTextField();

        idField.setEditable(false);

        int id = DonorList.getDonors().size() + 1;
        idField.setText(String.valueOf(id));

        idField.setBounds(160, 70, 210, 30);
        nameField.setBounds(160, 110, 210, 30);
        ageField.setBounds(160, 150, 210, 30);
        phoneField.setBounds(160, 270, 210, 30);

        heightField.setBounds(500, 70, 160, 30);
        weightField.setBounds(500, 110, 160, 30);

        cb = new JComboBox(genderBox);
        cb.setBounds(160, 190, 210, 30);

        bc = new JComboBox(bloodBox);
        bc.setBounds(160, 230, 210, 30);

        addressArea = new JTextArea();

        JScrollPane scroll = new JScrollPane(addressArea);
        scroll.setBounds(160, 310, 210, 65);

        saveButton = new JButton("SAVE");
        clearButton = new JButton("CLEAR");
        backButton = new JButton("BACK");

        saveButton.setBounds(180, 425, 100, 40);
        clearButton.setBounds(300, 425, 100, 40);
        backButton.setBounds(420, 425, 100, 40);

        saveButton.setBackground(new Color(128, 0, 0));
        saveButton.setForeground(Color.WHITE);

        clearButton.setBackground(new Color(128, 0, 0));
        clearButton.setForeground(Color.WHITE);

        backButton.setBackground(new Color(128, 0, 0));
        backButton.setForeground(Color.WHITE);

        saveButton.setCursor(cursor);
        clearButton.setCursor(cursor);
        backButton.setCursor(cursor);

        formPanel.add(titleLabel);

        formPanel.add(idLabel);
        formPanel.add(nameLabel);
        formPanel.add(ageLabel);
        formPanel.add(genderLabel);
        formPanel.add(bloodLabel);
        formPanel.add(phoneLabel);
        formPanel.add(addressLabel);
        formPanel.add(heightLabel);
        formPanel.add(weightLabel);

        formPanel.add(idField);
        formPanel.add(nameField);
        formPanel.add(ageField);
        formPanel.add(phoneField);
        formPanel.add(heightField);
        formPanel.add(weightField);

        formPanel.add(cb);
        formPanel.add(bc);
        formPanel.add(scroll);

        formPanel.add(saveButton);
        formPanel.add(clearButton);
        formPanel.add(backButton);

        add(formPanel);

        saveButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (nameField.getText().isEmpty()
                        || ageField.getText().isEmpty()
                        || phoneField.getText().isEmpty()
                        || addressArea.getText().isEmpty()
                        || heightField.getText().isEmpty()
                        || weightField.getText().isEmpty()
                        || cb.getSelectedIndex() == 0
                        || bc.getSelectedIndex() == 0) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Please fill all fields."
                    );

                    return;
                }

                try {
                    Integer.parseInt(ageField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Age must be an integer number."
                    );
                    return;
                }

                try {
                    Long.parseLong(phoneField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Phone must contain numbers only."
                    );
                    return;
                }

                try {
                    Double.parseDouble(heightField.getText());
                    Double.parseDouble(weightField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Height and Weight must be numbers."
                    );
                    return;
                }

                Donor d = new Donor(
                        idField.getText(),
                        nameField.getText(),
                        ageField.getText(),
                        cb.getSelectedItem().toString(),
                        bc.getSelectedItem().toString(),
                        phoneField.getText(),
                        addressArea.getText(),
                        heightField.getText(),
                        weightField.getText()
                );

                DonorList.addDonor(d);

                JOptionPane.showMessageDialog(
                        null,
                        "Donor Saved Successfully!"
                );

                int nextId = DonorList.getDonors().size() + 1;
                idField.setText(String.valueOf(nextId));

                nameField.setText("");
                ageField.setText("");
                phoneField.setText("");
                heightField.setText("");
                weightField.setText("");
                addressArea.setText("");

                cb.setSelectedIndex(0);
                bc.setSelectedIndex(0);
            }
        });

        clearButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                nameField.setText("");
                ageField.setText("");
                phoneField.setText("");
                heightField.setText("");
                weightField.setText("");
                addressArea.setText("");

                cb.setSelectedIndex(0);
                bc.setSelectedIndex(0);
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

