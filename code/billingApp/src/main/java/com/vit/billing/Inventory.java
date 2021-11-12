package com.vit.billing;

import java.awt.FlowLayout;

import javax.swing.table.TableCellRenderer;
import javax.swing.*;
import javax.swing.table.*;

public class Inventory {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Inventory");
        JButton b = new JButton("Add Product");
        b.setBounds(1050, 550, 120, 30);
        frame.add(b);
        JLabel label = new JLabel("List of Products");
        frame.add(label);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        String data[][] = { { "101", "Wheat", "670000", "90", "100", "Delete" },{ "102", "Rice", "780000", "20", "50", "Delete" }, 
        { "103", "Sugar","700000", "15", "20", "Delete" } };
        String column[] = { "PRODUCT ID", "PRODUCT NAME", "QUANTITY", "PURCHASE PRICE", "SELLING PRICE", "EDIT" };
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 300, 400);
        JScrollPane jp = new JScrollPane(jt);
        frame.add(jp);
        // JButton b = new JButton("Add");
        // b.setBounds(10, 10, 10, 10);
        // frame.add(b);
        // TableColumn tc = jt.getColumnModel().getColumn(5);
        // JComboBox jc = new JComboBox();
        // jc.addItem("Edit");
        // jc.addItem("Clone");
        // tc.setCellEditor(new DefaultCellEditor(jc));
        // frame.add(jc);
        // frame.setSize(800, 600);
        // frame.setVisible(true);

    }
}
