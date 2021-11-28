package com.vit.billing.pages;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Inventory {

    private JFrame frame;
    private JPanel mainPane;
    private JPanel topPane;
    private JPanel tablePane;
    private JPanel bottomPane;

    private JLabel selectAccountLabel;
    
    private JButton addButton;
    private JButton deleteButton;

    private JTable table;

    private JScrollPane scroll;

    public void createAndShowGui() {
        frame = new JFrame(getClass().getSimpleName());

        

        String[][] data = { { "1", "Wheat", "1000", "80", "100" }, { "2", "Rice", "700", "42", "50" },
                { "3", "Sugar", "1200", "14", "20" }, { "4", "Oil", "1100", "38", "50" },
                { "5", "Cereals", "850", "22", "30" } };

       

        String[] columnNames = { "S.No", "Product Name", "Quantity", "Purchase Price", "Selling Price" };

        table = new JTable(data, columnNames);

        scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        table.setPreferredScrollableViewportSize(new Dimension(420, 250));
        table.setFillsViewportHeight(true);

        selectAccountLabel = new JLabel("Inventory of ABC");
       
        addButton = new JButton("Add");
        deleteButton = new JButton("Delete");

        

        topPane = new JPanel();
        topPane.setLayout(new BorderLayout());

        topPane.add(selectAccountLabel, BorderLayout.WEST);
        

        tablePane = new JPanel();
        tablePane.add(scroll);

        bottomPane = new JPanel();
        bottomPane.setLayout(new GridLayout(0, 5, 3, 3));

        
        bottomPane.add(addButton);
        bottomPane.add(deleteButton);
        

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