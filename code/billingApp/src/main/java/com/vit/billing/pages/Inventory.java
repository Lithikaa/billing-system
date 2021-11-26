package com.vit.billing.pages;

import java.awt.BorderLayout;
import java.awt.Dimension;
//import java.awt.FlowLayout;
//import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Inventory {

    private JFrame frame;
    private JPanel mainPane;
    private JPanel topPane;
    private JPanel tablePane;
    private JPanel bottomPane;

    private JLabel selectAccountLabel;
    /*
     * private JLabel userNameLabel; private JLabel passwordLabel; private JLabel
     * homeWorldLabel;
     * 
     * private JTextField userNameField; private JTextField homeWorldField; private
     * JPasswordField passwordField;
     * 
     * private JCheckBox membersBox; private JCheckBox randomBox;
     * 
     * private JButton selectAccountButton;
     */
    private JButton addButton;
    private JButton deleteButton;

    private JTable table;

    private JScrollPane scroll;

    public void createAndShowGui() {
        frame = new JFrame(getClass().getSimpleName());

        // int rows = 5;
        // int cols = 5;

        String[][] data = { { "1", "Wheat", "1000", "80", "100" }, { "2", "Rice", "700", "42", "50" },
                { "3", "Sugar", "1200", "14", "20" }, { "4", "Oil", "1100", "38", "50" },
                { "5", "Cereals", "850", "22", "30" } };

        /*
         * for (int i = 0; i < rows; i++) { for (int j = 0; j < cols; j++) { data[i][j]
         * = i + "-" + j; } }
         */

        String[] columnNames = { "S.No", "Product Name", "Quantity", "Purchase Price", "Selling Price" };

        table = new JTable(data, columnNames);

        scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        table.setPreferredScrollableViewportSize(new Dimension(420, 250));
        table.setFillsViewportHeight(true);

        selectAccountLabel = new JLabel("Inventory of ABC");
        // userNameLabel = new JLabel("Username: ");
        // passwordLabel = new JLabel("Password: ");
        // homeWorldLabel = new JLabel("Home world");

        // selectAccountButton = new JButton("Select Account");
        addButton = new JButton("Add");
        deleteButton = new JButton("Delete");

        // userNameField = new JTextField(10);
        // passwordField = new JPasswordField(10);
        // homeWorldField = new JTextField(3);

        // membersBox = new JCheckBox("Members");
        // randomBox = new JCheckBox("Random world");

        topPane = new JPanel();
        topPane.setLayout(new BorderLayout());

        topPane.add(selectAccountLabel, BorderLayout.WEST);
        // topPane.add(selectAccountButton, BorderLayout.EAST);

        tablePane = new JPanel();
        tablePane.add(scroll);

        bottomPane = new JPanel();
        bottomPane.setLayout(new GridLayout(0, 5, 3, 3));

        // bottomPane.add(userNameLabel);
        // bottomPane.add(userNameField);
        // bottomPane.add(membersBox);
        bottomPane.add(addButton);
        bottomPane.add(deleteButton);
        // bottomPane.add(passwordLabel);
        // bottomPane.add(passwordField);
        // bottomPane.add(randomBox);
        // bottomPane.add(homeWorldLabel);
        // bottomPane.add(homeWorldField);

        mainPane = new JPanel();
        mainPane.setLayout(new BoxLayout(mainPane, BoxLayout.PAGE_AXIS));

        frame.add(topPane, BorderLayout.NORTH);
        frame.add(tablePane, BorderLayout.CENTER);
        frame.add(bottomPane, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}