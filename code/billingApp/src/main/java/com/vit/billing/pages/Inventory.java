package com.vit.billing.pages;

import java.awt.FlowLayout;

import javax.swing.table.TableCellRenderer;

import com.vit.billing.components.TableComponent;

import javax.swing.*;
import javax.swing.table.*;

public class Inventory {
    JFrame inventoryFrame;

    public Inventory() {
        inventoryFrame = new JFrame("Inventory");
        JButton addBttn = new JButton("Add Product");
        addBttn.setBounds(1050, 550, 120, 30);
        inventoryFrame.add(addBttn);
        JLabel label = new JLabel("List of Products");
        label.setBounds(10, 20, 300, 30);
        inventoryFrame.add(label);
        inventoryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inventoryFrame.setVisible(true);
        TableComponent jt = new TableComponent();
        jt.scrollPane.setBounds(0, 50, 800, 400);
        JScrollPane jp = new JScrollPane(jt.scrollPane);
        inventoryFrame.add(jp);
        inventoryFrame.setSize(1650, 1080);
    }

}
