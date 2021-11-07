package com.vit.billing.pages;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;

import net.miginfocom.swing.MigLayout;

public class Home {

  JFrame homeFrame;
  JPanel homePanel;

  public Home() {
    homeFrame = new JFrame("Login VIT Billing System");
    homeFrame.setSize(500, 300);

    homePanel = new JPanel(new MigLayout());

    JLabel homeTitle = new JLabel("Home | VIT Billing System");
    homeTitle.setFont(new FontUIResource("Noto Sans", FontUIResource.BOLD, 20));
    homeTitle.setBorder(new EmptyBorder(10, 10, 10, 10));

    homePanel.add(homeTitle, "wrap");
    // createLoginForm(homePanel, homeFrame);

    JButton bu1 = new JButton("Invoice");
    bu1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {
        new Invoice();
      }
    });
    JButton bu2 = new JButton("Inventory");

    homePanel.add(bu1);
    homePanel.add(bu2, "wrap");

    homeFrame.add(homePanel);
    homeFrame.pack();
    homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    homeFrame.setLocationRelativeTo(null);
    homeFrame.setVisible(true);
  }
}
