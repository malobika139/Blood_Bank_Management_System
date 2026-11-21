package com.mycompany.bloodbank;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewDonor extends JFrame {

    JPanel headerPanel, menuPanel, viewPanel;

    JLabel headerLabel, titleLabel;

    JButton deleteButton, editButton, backButton;
    JButton homeButton, addButton, searchButton;
    JButton viewButton, availableBloodButton;
    JButton eligibilityButton, aboutButton, exitButton;

    JTable donorTable;
    JScrollPane scrollPane;

    Cursor cursor;

    DefaultTableModel model;

    ViewDonor() {

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

        viewPanel = new JPanel();
        viewPanel.setBounds(170, 40, 730, 520);
        viewPanel.setBackground(Color.WHITE);
        viewPanel.setLayout(null);

        titleLabel = new JLabel("VIEW ALL DONORS");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setForeground(new Color(150, 0, 0));
        titleLabel.setBounds(40, 20, 250, 30);

        viewPanel.add(titleLabel);

        String columns[] = {
            "Donor ID",
            "Name",
            "Age",
            "Gender",
            "Blood Group",
            "Phone",
            "Address",
            "Height",
            "Weight"
        };

        model = new DefaultTableModel(columns, 0);

        donorTable = new JTable(model);
        donorTable.setRowHeight(30);

        scrollPane = new JScrollPane(donorTable);
        scrollPane.setBounds(20, 65, 690, 300);

        viewPanel.add(scrollPane);

        deleteButton = new JButton("DELETE");
        editButton = new JButton("EDIT");
        backButton = new JButton("BACK");

        deleteButton.setBounds(180, 400, 110, 40);
        editButton.setBounds(310, 400, 110, 40);
        backButton.setBounds(440, 400, 110, 40);

        deleteButton.setBackground(new Color(128, 0, 0));
        deleteButton.setForeground(Color.WHITE);
        deleteButton.setFocusPainted(false);
        deleteButton.setCursor(cursor);

        editButton.setBackground(new Color(128, 0, 0));
        editButton.setForeground(Color.WHITE);
        editButton.setFocusPainted(false);
        editButton.setCursor(cursor);

        backButton.setBackground(new Color(128, 0, 0));
        backButton.setForeground(Color.WHITE);
        backButton.setFocusPainted(false);
        backButton.setCursor(cursor);

        viewPanel.add(deleteButton);
        viewPanel.add(editButton);
        viewPanel.add(backButton);

        add(viewPanel);

        loadDonors();

        deleteButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int row = donorTable.getSelectedRow();

                if (row == -1) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Please select a donor first."
                    );

                    return;
                }

                String id = model.getValueAt(row, 0).toString();
                String name = model.getValueAt(row, 1).toString();

                int confirm = JOptionPane.showConfirmDialog(
                        null,
                        "Are you sure you want to delete " + name + "?",
                        "Delete Donor",
                        JOptionPane.YES_NO_OPTION
                );

                if (confirm == JOptionPane.YES_OPTION) {

                    for (int i = 0; i < DonorList.donors.size(); i++) {

                        if (DonorList.donors.get(i).id.equals(id)) {

                            DonorList.donors.remove(i);

                            break;
                        }
                    }

                    loadDonors();

                    JOptionPane.showMessageDialog(
                            null,
                            "Donor deleted successfully!"
                    );
                }
            }
        });

        editButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int row = donorTable.getSelectedRow();

                if (row == -1) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Please select a donor first."
                    );

                    return;
                }

                editDonor(row);
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

    public void loadDonors() {

        model.setRowCount(0);

        for (Donor d : DonorList.donors) {

            model.addRow(new Object[] {
                d.id,
                d.name,
                d.age,
                d.gender,
                d.bloodGroup,
                d.phone,
                d.address,
                d.height,
                d.weight
            });
        }
    }

    public void editDonor(int row) {

        Donor d = DonorList.donors.get(row);

        JTextField nameField = new JTextField(d.name);
        JTextField ageField = new JTextField(d.age);
        JTextField phoneField = new JTextField(d.phone);
        JTextField heightField = new JTextField(d.height);
        JTextField weightField = new JTextField(d.weight);

        JComboBox genderBox = new JComboBox(
                new String[]{
                    "Male",
                    "Female",
                    "Other"
                }
        );

        JComboBox bloodBox = new JComboBox(
                new String[]{
                    "A+",
                    "A-",
                    "B+",
                    "B-",
                    "AB+",
                    "AB-",
                    "O+",
                    "O-"
                }
        );

        JTextArea addressArea = new JTextArea(d.address);

        genderBox.setSelectedItem(d.gender);
        bloodBox.setSelectedItem(d.bloodGroup);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        panel.add(new JLabel("Name"));
        panel.add(nameField);

        panel.add(new JLabel("Age"));
        panel.add(ageField);

        panel.add(new JLabel("Gender"));
        panel.add(genderBox);

        panel.add(new JLabel("Blood Group"));
        panel.add(bloodBox);

        panel.add(new JLabel("Phone"));
        panel.add(phoneField);

        panel.add(new JLabel("Height (ft)"));
        panel.add(heightField);

        panel.add(new JLabel("Weight (kg)"));
        panel.add(weightField);

        panel.add(new JLabel("Address"));
        panel.add(addressArea);

        panel.getComponent(0).setBounds(10, 10, 100, 25);
        nameField.setBounds(120, 10, 200, 25);

        panel.getComponent(2).setBounds(10, 45, 100, 25);
        ageField.setBounds(120, 45, 200, 25);

        panel.getComponent(4).setBounds(10, 80, 100, 25);
        genderBox.setBounds(120, 80, 200, 25);

        panel.getComponent(6).setBounds(10, 115, 100, 25);
        bloodBox.setBounds(120, 115, 200, 25);

        panel.getComponent(8).setBounds(10, 150, 100, 25);
        phoneField.setBounds(120, 150, 200, 25);

        panel.getComponent(10).setBounds(10, 185, 100, 25);
        heightField.setBounds(120, 185, 200, 25);

        panel.getComponent(12).setBounds(10, 220, 100, 25);
        weightField.setBounds(120, 220, 200, 25);

        panel.getComponent(14).setBounds(10, 255, 100, 25);
        addressArea.setBounds(120, 255, 200, 60);

        int result = JOptionPane.showConfirmDialog(
                this,
                panel,
                "EDIT DONOR - ID " + d.id,
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );

        if (result == JOptionPane.OK_OPTION) {

            if (nameField.getText().isEmpty()
                    || ageField.getText().isEmpty()
                    || phoneField.getText().isEmpty()
                    || heightField.getText().isEmpty()
                    || weightField.getText().isEmpty()
                    || addressArea.getText().isEmpty()) {

                JOptionPane.showMessageDialog(
                        null,
                        "Please fill all fields."
                );

                return;
            }

            try {

                Integer.parseInt(ageField.getText());
                Long.parseLong(phoneField.getText());
                Double.parseDouble(heightField.getText());
                Double.parseDouble(weightField.getText());

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                        null,
                        "Please enter valid numbers."
                );

                return;
            }

            d.name = nameField.getText();
            d.age = ageField.getText();
            d.gender = genderBox.getSelectedItem().toString();
            d.bloodGroup = bloodBox.getSelectedItem().toString();
            d.phone = phoneField.getText();
            d.height = heightField.getText();
            d.weight = weightField.getText();
            d.address = addressArea.getText();

            loadDonors();

            JOptionPane.showMessageDialog(
                    null,
                    "Donor information updated successfully!"
            );
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