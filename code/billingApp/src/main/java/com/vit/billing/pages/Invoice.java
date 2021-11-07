package com.vit.billing.pages;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;

import net.miginfocom.swing.MigLayout;

public class Invoice {

    JFrame invoiceFrame;
    JPanel invoicePanel;

    public Invoice() {
        invoiceFrame = new JFrame("Invoice | VIT Billing System");
        invoiceFrame.setSize(500, 300);

        invoicePanel = new JPanel(new MigLayout());

        JLabel invoiceTitle = new JLabel("Invoice | VIT Billing System");
        invoiceTitle.setFont(new FontUIResource("Noto Sans", FontUIResource.BOLD, 20));
        invoiceTitle.setBorder(new EmptyBorder(10, 10, 10, 10));

        invoicePanel.add(invoiceTitle, "wrap");
        // createLoginForm(invoicePanel, invoiceFrame);

        invoiceFrame.add(invoicePanel);
        invoiceFrame.pack();
        invoiceFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        invoiceFrame.setLocationRelativeTo(null);
        invoiceFrame.setVisible(true);
    }
}
