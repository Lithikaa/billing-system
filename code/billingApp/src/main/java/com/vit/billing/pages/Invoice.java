package com.vit.billing.pages;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Invoice {

    JButton b1, b2, b3, b4, b5;
    JCheckBox cb1, cb2, cb3, cb4, cb5;

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, lspl, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22,
            l23, lq1, lq2, lq3, lq4, lq5, r1, r2, r3, r4, r5, a1, a2, a3, a4, a5, t;
    JTextField t1, t2, t3, t4, t5, t6, t7;

    public Invoice() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        JFrame f = new JFrame("INVOICE");
        f.setBounds(0, 0, 800, 600);

        l1 = new JLabel("VIT BILLING SYSTEM");
        l1.setBounds(555, 25, 300, 30);
        l1.setFont(new Font("Verdana", Font.PLAIN, 20));
        l2 = new JLabel("Chennai-600028");
        l2.setBounds(580, 50, 200, 30);
        l2.setFont(new Font("Verdana", Font.PLAIN, 20));
        l3 = new JLabel("Bill no:");
        l3.setBounds(880, 75, 300, 30);
        t1 = new JTextField();
        t1.setBounds(930, 80, 50, 20);
        t2 = new JTextField();
        t2.setBounds(880, 185, 50, 20);
        t3 = new JTextField();
        t3.setBounds(880, 215, 50, 20);
        t4 = new JTextField();
        t4.setBounds(880, 245, 50, 20);
        t5 = new JTextField();
        t5.setBounds(880, 275, 50, 20);
        t6 = new JTextField();
        t6.setBounds(880, 305, 50, 20);
        l4 = new JLabel("Date and Time:" + dtf.format(now));
        l4.setBounds(860, 95, 300, 30);
        l5 = new JLabel("PRODUCT ITEMS:");
        l5.setBounds(390, 160, 300, 30);
        l6 = new JLabel("QUANTITY IN KG/L:");
        l6.setBounds(810, 150, 300, 30);
        l7 = new JLabel("wheat:");
        l7.setBounds(830, 180, 300, 30);
        l8 = new JLabel("rice:");
        l8.setBounds(830, 210, 300, 30);
        l9 = new JLabel("sugar:");
        l9.setBounds(830, 240, 300, 30);
        l10 = new JLabel("oil:");
        l10.setBounds(830, 270, 300, 30);
        l11 = new JLabel("cereals:");
        l11.setBounds(830, 300, 300, 30);
        l6.setFont(new Font("Verdana", Font.PLAIN, 16));
        l5.setFont(new Font("Verdana", Font.PLAIN, 16));
        cb1 = new JCheckBox("WHEAT");
        cb1.setBounds(410, 190, 150, 20);
        cb2 = new JCheckBox("RICE");
        cb2.setBounds(410, 210, 150, 20);
        cb3 = new JCheckBox("SUGAR");
        cb3.setBounds(410, 230, 150, 20);
        cb4 = new JCheckBox("OIL");
        cb4.setBounds(410, 250, 150, 20);
        cb5 = new JCheckBox("CEREALS");
        cb5.setBounds(410, 270, 150, 20);
        t7 = new JTextField();
        t7.setBounds(940, 555, 50, 20);
        f.add(t7);

        lspl = new JLabel(
                "-----------------------------------------------------------------------------------------------------------------------------");
        lspl.setBounds(400, 380, 800, 30);
        f.add(lspl);
        l12 = new JLabel("PRODUCT NAME");
        l12.setBounds(415, 400, 300, 30);
        f.add(l12);
        l13 = new JLabel(
                "-----------------------------------------------------------------------------------------------------------------------------");
        l13.setBounds(400, 410, 800, 30);
        f.add(l13);
        l22 = new JLabel(
                "-----------------------------------------------------------------------------------------------------------------------------");
        l22.setBounds(400, 530, 800, 30);
        f.add(l22);
        l14 = new JLabel("QUANTITY");
        l14.setBounds(590, 400, 300, 30);
        f.add(l14);
        l20 = new JLabel("RATE");
        l20.setBounds(765, 400, 300, 30);
        f.add(l20);
        l21 = new JLabel("AMOUNT");
        l21.setBounds(940, 400, 300, 30);
        f.add(l21);
        l23 = new JLabel("TOTAL:");
        l23.setBounds(890, 550, 300, 30);
        f.add(l23);
        b1 = new JButton("Generate");
        b1.setBounds(390, 320, 120, 30);
        b2 = new JButton("Exit");
        b2.setBounds(890, 25, 120, 30);
        b3 = new JButton("Printbill");
        b3.setBounds(910, 600, 120, 30);
        b4 = new JButton("Calculator");
        b4.setBounds(360, 95, 120, 30);
        b5 = new JButton("Clear");
        b5.setBounds(360, 600, 120, 30);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (cb1.isSelected()) {
                    l15.setText("");
                    lq1.setText("");
                    r1.setText("");
                    a1.setText("");
                    t7.setText("");

                }

                if (cb2.isSelected()) {
                    l16.setText("");
                    lq2.setText("");
                    r2.setText("");
                    a2.setText("");
                    t7.setText("");
                }
                if (cb3.isSelected()) {
                    l17.setText("");
                    lq3.setText("");
                    r3.setText("");
                    a3.setText("");
                    t7.setText("");
                }
                if (cb4.isSelected()) {
                    l18.setText("");
                    lq4.setText("");
                    r4.setText("");
                    a4.setText("");
                    t7.setText("");
                }
                if (cb5.isSelected()) {
                    l19.setText("");
                    lq5.setText("");
                    r5.setText("");
                    a5.setText("");
                    t7.setText("");
                }
            }
        });
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println("Logout Successful");
                System.exit(0);
            }
        });
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {

                new Calculator();

            }

        });
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                /*
                 * t7=new JTextField(); t7.setBounds(630,555, 50,20); f.add(t7);
                 * 
                 * lspl=new JLabel(
                 * "-----------------------------------------------------------------------------------------------------------------------------"
                 * ); lspl.setBounds(90,380, 800,30); f.add(lspl); l12=new
                 * JLabel("PRODUCT NAME"); l12.setBounds(105,400, 300,30); f.add(l12); l13=new
                 * JLabel(
                 * "-----------------------------------------------------------------------------------------------------------------------------"
                 * ); l13.setBounds(90,410, 800,30); f.add(l13); l22=new JLabel(
                 * "-----------------------------------------------------------------------------------------------------------------------------"
                 * ); l22.setBounds(90,530, 800,30); f.add(l22); l14=new JLabel("QUANTITY");
                 * l14.setBounds(280,400, 300,30); f.add(l14); l20=new JLabel("RATE");
                 * l20.setBounds(455,400, 300,30); f.add(l20); l21=new JLabel("AMOUNT");
                 * l21.setBounds(630,400, 300,30); f.add(l21); l23=new JLabel("TOTAL:");
                 * l23.setBounds(580,550, 300,30); f.add(l23);
                 */

                if (cb1.isSelected()) {
                    l15 = new JLabel("wheat");
                    l15.setBounds(445, 430, 300, 30);
                    f.add(l15);

                    String q1 = t2.getText();
                    lq1 = new JLabel();
                    lq1.setText(String.valueOf(q1));
                    lq1.setBounds(600, 430, 300, 30);
                    f.add(lq1);
                    r1 = new JLabel("100");
                    r1.setBounds(770, 430, 300, 30);
                    f.add(r1);
                    a1 = new JLabel();
                    float amount = 100 * Float.parseFloat(q1);
                    String am = String.valueOf(amount);
                    a1.setText(String.valueOf(am));
                    a1.setBounds(950, 430, 300, 30);
                    f.add(a1);
                    t7.setText(String.valueOf(am));

                }
                if (cb2.isSelected()) {

                    String q2 = t3.getText();
                    if (cb1.isSelected()) {
                        l16 = new JLabel("rice");
                        l16.setBounds(445, 450, 300, 30);
                        f.add(l16);
                        lq2 = new JLabel();
                        lq2.setText(String.valueOf(q2));
                        lq2.setBounds(600, 450, 300, 30);
                        f.add(lq2);
                        r2 = new JLabel("50");
                        r2.setBounds(770, 450, 300, 30);
                        f.add(r2);
                        a2 = new JLabel();
                        float amount = 50 * Float.parseFloat(q2);
                        String am = String.valueOf(amount);
                        a2.setText(String.valueOf(am));
                        a2.setBounds(950, 450, 300, 30);
                        f.add(a2);
                        String amount1 = a1.getText();
                        String amount2 = a2.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am2 = Float.parseFloat(amount2);
                        float total = am1 + am2;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));

                    } else {
                        l16 = new JLabel("rice");
                        l16.setBounds(445, 430, 300, 30);
                        f.add(l16);
                        lq2 = new JLabel();
                        lq2.setText(String.valueOf(q2));
                        lq2.setBounds(600, 430, 300, 30);
                        f.add(lq2);
                        r2 = new JLabel("50");
                        r2.setBounds(770, 430, 300, 30);
                        f.add(r2);
                        a2 = new JLabel();
                        float amount = 50 * Float.parseFloat(q2);
                        String am = String.valueOf(amount);
                        a2.setText(String.valueOf(am));
                        a2.setBounds(950, 430, 300, 30);
                        f.add(a2);
                        t7.setText(String.valueOf(am));

                    }
                }
                if (cb3.isSelected()) {

                    if (cb1.isSelected() && cb2.isSelected()) {
                        l17 = new JLabel("sugar");
                        l17.setBounds(445, 470, 300, 30);
                        f.add(l17);
                        String q3 = t4.getText();
                        lq3 = new JLabel();
                        lq3.setText(String.valueOf(q3));
                        lq3.setBounds(600, 470, 300, 30);
                        f.add(lq3);
                        r3 = new JLabel("20");
                        r3.setBounds(770, 470, 300, 30);
                        f.add(r3);
                        a3 = new JLabel();
                        float amount = 20 * Float.parseFloat(q3);
                        String am = String.valueOf(amount);
                        a3.setText(String.valueOf(am));
                        a3.setBounds(950, 470, 300, 30);
                        f.add(a3);
                        String amount1 = a1.getText();
                        String amount2 = a2.getText();
                        String amount3 = a3.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am2 = Float.parseFloat(amount2);
                        Float am3 = Float.parseFloat(amount3);
                        float total = am1 + am2 + am3;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));

                    }

                    else if (cb1.isSelected()) {
                        l17 = new JLabel("sugar");
                        l17.setBounds(445, 450, 300, 30);
                        f.add(l17);
                        String q3 = t4.getText();
                        lq3 = new JLabel();
                        lq3.setText(String.valueOf(q3));
                        lq3.setBounds(600, 450, 300, 30);
                        f.add(lq3);
                        r3 = new JLabel("20");
                        r3.setBounds(770, 450, 300, 30);
                        f.add(r3);
                        a3 = new JLabel();
                        float amount = 20 * Float.parseFloat(q3);
                        String am = String.valueOf(amount);
                        a3.setText(String.valueOf(am));
                        a3.setBounds(950, 450, 300, 30);
                        f.add(a3);
                        String amount1 = a1.getText();
                        String amount3 = a3.getText();
                        float am1 = Float.parseFloat(amount1);
                        int am3 = Integer.parseInt(amount3);
                        float total = am1 + am3;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));

                    }

                    else if (cb2.isSelected()) {
                        l17 = new JLabel("sugar");
                        l17.setBounds(445, 450, 300, 30);
                        f.add(l17);
                        String q3 = t4.getText();
                        lq3 = new JLabel();
                        lq3.setText(String.valueOf(q3));
                        lq3.setBounds(600, 450, 300, 30);
                        f.add(lq3);
                        r3 = new JLabel("20");
                        r3.setBounds(770, 450, 300, 30);
                        f.add(r3);
                        a3 = new JLabel();
                        float amount = 20 * Float.parseFloat(q3);
                        String am = String.valueOf(amount);
                        a3.setText(String.valueOf(am));
                        a3.setBounds(950, 450, 300, 30);
                        f.add(a3);
                        String amount2 = a2.getText();
                        String amount3 = a3.getText();
                        float am2 = Float.parseFloat(amount2);
                        float am3 = Float.parseFloat(amount3);
                        float total = am2 + am3;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else {
                        l17 = new JLabel("sugar");
                        l17.setBounds(445, 430, 300, 30);
                        f.add(l17);
                        String q3 = t4.getText();
                        lq3 = new JLabel();
                        lq3.setText(String.valueOf(q3));
                        lq3.setBounds(600, 430, 300, 30);
                        f.add(lq3);
                        r3 = new JLabel("20");
                        r3.setBounds(770, 430, 300, 30);
                        f.add(r3);
                        a3 = new JLabel();
                        float amount = 20 * Float.parseFloat(q3);
                        String am = String.valueOf(amount);
                        a3.setText(String.valueOf(am));
                        a3.setBounds(950, 430, 300, 30);
                        f.add(a3);
                        t7.setText(String.valueOf(am));
                    }
                }
                if (cb4.isSelected()) {

                    if (cb1.isSelected() && cb2.isSelected() && cb3.isSelected()) {
                        l18 = new JLabel("oil");
                        l18.setBounds(445, 490, 300, 30);
                        f.add(l18);
                        String q4 = t5.getText();
                        lq4 = new JLabel();
                        lq4.setText(String.valueOf(q4));
                        lq4.setBounds(600, 490, 300, 30);
                        f.add(lq4);
                        r4 = new JLabel("50");
                        r4.setBounds(770, 490, 300, 30);
                        f.add(r4);
                        a4 = new JLabel();
                        float amount = 50 * Float.parseFloat(q4);
                        String am = String.valueOf(amount);
                        a4.setText(String.valueOf(am));
                        a4.setBounds(950, 490, 300, 30);
                        f.add(a4);
                        String amount1 = a1.getText();
                        String amount2 = a2.getText();
                        String amount3 = a3.getText();
                        String amount4 = a4.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am2 = Float.parseFloat(amount2);
                        float am3 = Float.parseFloat(amount3);
                        float am4 = Float.parseFloat(amount4);
                        float total = am1 + am2 + am3 + am4;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } 
                    else if (cb2.isSelected() && cb3.isSelected()) {
                        l18 = new JLabel("oil");
                        l18.setBounds(445, 470, 300, 30);
                        f.add(l18);
                        String q4 = t5.getText();
                        lq4 = new JLabel();
                        lq4.setText(String.valueOf(q4));
                        lq4.setBounds(600, 470, 300, 30);
                        f.add(lq4);
                        r4 = new JLabel("50");
                        r4.setBounds(770, 470, 300, 30);
                        f.add(r4);
                        a4 = new JLabel();
                        float amount = 50 * Float.parseFloat(q4);
                        String am = String.valueOf(amount);
                        a4.setText(String.valueOf(am));
                        a4.setBounds(950, 470, 300, 30);
                        f.add(a4);
                        String amount2 = a2.getText();
                        String amount3 = a3.getText();
                        String amount4 = a4.getText();
                        float am2 = Float.parseFloat(amount2);
                        float am3 = Float.parseFloat(amount3);
                        float am4 = Float.parseFloat(amount4);
                        float total =  am2 + am3 + am4;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));

                    } else if (cb1.isSelected() && cb3.isSelected()) {
                        l18 = new JLabel("oil");
                        l18.setBounds(445, 470, 300, 30);
                        f.add(l18);
                        String q4 = t5.getText();
                        lq4 = new JLabel();
                        lq4.setText(String.valueOf(q4));
                        lq4.setBounds(600, 470, 300, 30);
                        f.add(lq4);
                        r4 = new JLabel("50");
                        r4.setBounds(770, 470, 300, 30);
                        f.add(r4);
                        a4 = new JLabel();
                        float amount = 50 * Float.parseFloat(q4);
                        String am = String.valueOf(amount);
                        a4.setText(String.valueOf(am));
                        a4.setBounds(950, 470, 300, 30);
                        f.add(a4);
                        String amount1 = a1.getText();
                        String amount3 = a3.getText();
                        String amount4 = a4.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am3 = Float.parseFloat(amount3);
                        float am4 = Float.parseFloat(amount4);
                        float total = am1 + am3 + am4;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    }

                    else if (cb1.isSelected() && cb2.isSelected()) {
                        l18 = new JLabel("oil");
                        l18.setBounds(445, 470, 300, 30);
                        f.add(l18);
                        String q4 = t5.getText();
                        lq4 = new JLabel();
                        lq4.setText(String.valueOf(q4));
                        lq4.setBounds(600, 470, 300, 30);
                        f.add(lq4);
                        r4 = new JLabel("50");
                        r4.setBounds(770, 470, 300, 30);
                        f.add(r4);
                        a4 = new JLabel();
                        float amount = 50 * Float.parseFloat(q4);
                        String am = String.valueOf(amount);
                        a4.setText(String.valueOf(am));
                        a4.setBounds(950, 470, 300, 30);
                        f.add(a4);
                        String amount1 = a1.getText();
                        String amount2 = a2.getText();
                        String amount4 = a4.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am2 = Float.parseFloat(amount2);
                        float am4 = Float.parseFloat(amount4);
                        float total = am1 + am2 + am4;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (cb3.isSelected()) {
                        l18 = new JLabel("oil");
                        l18.setBounds(445, 450, 300, 30);
                        f.add(l18);
                        String q4 = t5.getText();
                        lq4 = new JLabel();
                        lq4.setText(String.valueOf(q4));
                        lq4.setBounds(600, 450, 300, 30);
                        f.add(lq4);
                        r4 = new JLabel("50");
                        r4.setBounds(770, 450, 300, 30);
                        f.add(r4);
                        a4 = new JLabel();
                        float amount = 50 * Float.parseFloat(q4);
                        String am = String.valueOf(amount);
                        a4.setText(String.valueOf(am));
                        a4.setBounds(950, 450, 300, 30);
                        f.add(a4);
                        String amount3 = a3.getText();
                        String amount4 = a4.getText();
                        float am3 = Float.parseFloat(amount3);
                        float am4 = Float.parseFloat(amount4);
                        float total =  am3 + am4;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (cb2.isSelected()) {
                        l18 = new JLabel("oil");
                        l18.setBounds(445, 450, 300, 30);
                        f.add(l18);
                        String q4 = t5.getText();
                        lq4 = new JLabel();
                        lq4.setText(String.valueOf(q4));
                        lq4.setBounds(600, 450, 300, 30);
                        f.add(lq4);
                        r4 = new JLabel("50");
                        r4.setBounds(770, 450, 300, 30);
                        f.add(r4);
                        a4 = new JLabel();
                        float amount = 50 * Float.parseFloat(q4);
                        String am = String.valueOf(amount);
                        a4.setText(String.valueOf(am));
                        a4.setBounds(950, 450, 300, 30);
                        f.add(a4);
                        String amount2 = a2.getText();
                        String amount4 = a4.getText();
                        float am2 = Float.parseFloat(amount2);
                        float am4 = Float.parseFloat(amount4);
                        float total = am2  + am4;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (cb1.isSelected()) {
                        l18 = new JLabel("oil");
                        l18.setBounds(445, 450, 300, 30);
                        f.add(l18);
                        String q4 = t5.getText();
                        lq4 = new JLabel();
                        lq4.setText(String.valueOf(q4));
                        lq4.setBounds(600, 450, 300, 30);
                        f.add(lq4);
                        r4 = new JLabel("50");
                        r4.setBounds(770, 450, 300, 30);
                        f.add(r4);
                        a4 = new JLabel();
                        float amount = 50 * Float.parseFloat(q4);
                        String am = String.valueOf(amount);
                        a4.setText(String.valueOf(am));
                        a4.setBounds(950, 450, 300, 30);
                        f.add(a4);
                        String amount1 = a1.getText();
                        String amount4 = a4.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am4 = Float.parseFloat(amount4);
                        float total = am1 + am4;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else {
                        l18 = new JLabel("oil");
                        l18.setBounds(445, 430, 300, 30);
                        f.add(l18);
                        String q4 = t5.getText();
                        lq4 = new JLabel();
                        lq4.setText(String.valueOf(q4));
                        lq4.setBounds(600, 430, 300, 30);
                        f.add(lq4);
                        r4 = new JLabel("50");
                        r4.setBounds(770, 430, 300, 30);
                        f.add(r4);
                        a4 = new JLabel();
                        float amount = 50 * Float.parseFloat(q4);
                        String am = String.valueOf(amount);
                        a4.setText(String.valueOf(am));
                        a4.setBounds(950, 430, 300, 30);
                        f.add(a4);
                        t7.setText(String.valueOf(am));
                    }
                }
                if (cb5.isSelected()) {
                    if (cb1.isSelected() && cb2.isSelected() && cb3.isSelected() && cb4.isSelected()) {
                        l19 = new JLabel("cerelas");
                        l19.setBounds(445, 510, 300, 30);
                        f.add(l19);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 510, 300, 30);
                        f.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 510, 300, 30);
                        f.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 510, 300, 30);
                        f.add(a5);
                        String amount1 = a1.getText();
                        String amount2 = a2.getText();
                        String amount3 = a3.getText();
                        String amount4 = a4.getText();
                        String amount5 = a5.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am2 = Float.parseFloat(amount2);
                        float am3 = Float.parseFloat(amount3);
                        float am4 = Float.parseFloat(amount4);
                        float am5= Float.parseFloat(amount5);
                        float total = am1 + am2 + am3 + am4+am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (cb1.isSelected() && cb2.isSelected() && cb3.isSelected()) {
                        l19 = new JLabel("cerelas");
                        l19.setBounds(445, 490, 300, 30);
                        f.add(l19);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 490, 300, 30);
                        f.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 490, 300, 30);
                        f.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 490, 300, 30);
                        f.add(a5);
                        String amount1 = a1.getText();
                        String amount2 = a2.getText();
                        String amount3 = a3.getText();
                        String amount5 = a5.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am2 = Float.parseFloat(amount2);
                        float am3 = Float.parseFloat(amount3);
                        float am5= Float.parseFloat(amount5);
                        float total = am1 + am2 + am3 + am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (cb1.isSelected() && cb2.isSelected() && cb4.isSelected()) {
                        l19 = new JLabel("cerelas");
                        l19.setBounds(445, 490, 300, 30);
                        f.add(l19);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 490, 300, 30);
                        f.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 490, 300, 30);
                        f.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 490, 300, 30);
                        f.add(a5);
                        String amount1 = a1.getText();
                        String amount2 = a2.getText();
                        String amount4 = a4.getText();
                        String amount5 = a5.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am2 = Float.parseFloat(amount2);
                        float am4 = Float.parseFloat(amount4);
                        float am5= Float.parseFloat(amount5);
                        float total = am1 + am2 + am4+am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (cb1.isSelected() && cb3.isSelected() && cb4.isSelected()) {
                        l19 = new JLabel("cerelas");
                        l19.setBounds(445, 490, 300, 30);
                        f.add(l19);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 490, 300, 30);
                        f.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 490, 300, 30);
                        f.add(r5);
                        a4 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 490, 300, 30);
                        f.add(a5);
                        String amount1 = a1.getText();
                        String amount3 = a3.getText();
                        String amount4 = a4.getText();
                        String amount5 = a5.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am3 = Float.parseFloat(amount3);
                        float am4 = Float.parseFloat(amount4);
                        float am5= Float.parseFloat(amount5);
                        float total = am1  + am3 + am4+am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (cb2.isSelected() && cb3.isSelected() && cb4.isSelected()) {
                        l19 = new JLabel("cerelas");
                        l19.setBounds(445, 490, 300, 30);
                        f.add(l19);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 490, 300, 30);
                        f.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 490, 300, 30);
                        f.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 490, 300, 30);
                        f.add(a5);
                        String amount2 = a2.getText();
                        String amount3 = a3.getText();
                        String amount4 = a4.getText();
                        String amount5 = a5.getText();
                        float am2 = Float.parseFloat(amount2);
                        float am3 = Float.parseFloat(amount3);
                        float am4 = Float.parseFloat(amount4);
                        float am5= Float.parseFloat(amount5);
                        float total =  am2 + am3 + am4+am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    }

                    else if (cb1.isSelected() && cb2.isSelected()) {
                        l19 = new JLabel("cerelas");
                        l19.setBounds(445, 470, 300, 30);
                        f.add(l19);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 470, 300, 30);
                        f.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 470, 300, 30);
                        f.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 470, 300, 30);
                        f.add(a5);
                        String amount1 = a1.getText();
                        String amount2 = a2.getText();
                        String amount5 = a5.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am2 = Float.parseFloat(amount2);
                        float am5= Float.parseFloat(amount5);
                        float total = am1 + am2 + am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (cb1.isSelected() && cb3.isSelected()) {
                        l19 = new JLabel("cerelas");
                        l19.setBounds(445, 470, 300, 30);
                        f.add(l19);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 470, 300, 30);
                        f.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 470, 300, 30);
                        f.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 470, 300, 30);
                        f.add(a5);
                        String amount1 = a1.getText();
                        String amount3 = a3.getText();
                        String amount5 = a5.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am3 = Float.parseFloat(amount3);
                        float am5= Float.parseFloat(amount5);
                        float total = am1 + am3 +am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (cb1.isSelected() && cb4.isSelected()) {
                        l19 = new JLabel("cerelas");
                        l19.setBounds(445, 470, 300, 30);
                        f.add(l19);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 470, 300, 30);
                        f.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 470, 300, 30);
                        f.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 470, 300, 30);
                        f.add(a5);
                        String amount1 = a1.getText();
                        String amount4 = a4.getText();
                        String amount5 = a4.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am4 = Float.parseFloat(amount4);
                        float am5= Float.parseFloat(amount5);
                        float total = am1 + am4+am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (cb2.isSelected() && cb3.isSelected()) {
                        l19 = new JLabel("cerelas");
                        l19.setBounds(445, 470, 300, 30);
                        f.add(l19);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 470, 300, 30);
                        f.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 470, 300, 30);
                        f.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 470, 300, 30);
                        f.add(a5);
                        String amount2 = a2.getText();
                        String amount3 = a3.getText();
                        String amount5 = a5.getText();
                        float am2 = Float.parseFloat(amount2);
                        float am3 = Float.parseFloat(amount3);
                        float am5= Float.parseFloat(amount5);
                        float total =  am2 + am3 +am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (cb2.isSelected() && cb4.isSelected()) {
                        l19 = new JLabel("cerelas");
                        l19.setBounds(445, 470, 300, 30);
                        f.add(l19);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 470, 300, 30);
                        f.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 470, 300, 30);
                        f.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 470, 300, 30);
                        f.add(a5);
                        String amount2 = a2.getText();
                        String amount4 = a4.getText();
                        String amount5 = a5.getText();
                        float am2 = Float.parseFloat(amount2);
                        float am4 = Float.parseFloat(amount4);
                        float am5= Float.parseFloat(amount5);
                        float total =  am2  + am4+am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (cb3.isSelected() && cb4.isSelected()) {
                        l19 = new JLabel("cerelas");
                        l19.setBounds(445, 470, 300, 30);
                        f.add(l19);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 470, 300, 30);
                        f.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 470, 300, 30);
                        f.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 470, 300, 30);
                        f.add(a5);
                        String amount3 = a3.getText();
                        String amount4 = a4.getText();
                        String amount5 = a5.getText();
                        float am3 = Float.parseFloat(amount3);
                        float am4 = Float.parseFloat(amount4);
                        float am5= Float.parseFloat(amount5);
                        float total =   am3 + am4+am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (cb1.isSelected()) {
                        l19 = new JLabel("cerelas");
                        l19.setBounds(445, 450, 300, 30);
                        f.add(l19);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 450, 300, 30);
                        f.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 450, 300, 30);
                        f.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 450, 300, 30);
                        f.add(a5);
                        String amount1 = a1.getText();
                        String amount5 = a5.getText();
                        float am1 = Float.parseFloat(amount1);
                        float am5= Float.parseFloat(amount5);
                        float total = am1 +am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (cb2.isSelected()) {
                        l19 = new JLabel("cerelas");
                        l19.setBounds(445, 450, 300, 30);
                        f.add(l19);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 450, 300, 30);
                        f.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 450, 300, 30);
                        f.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 450, 300, 30);
                        f.add(a5);
                        String amount2 = a2.getText();
                        String amount5 = a5.getText();
                        float am2 = Float.parseFloat(amount2);
                        float am5= Float.parseFloat(amount5);
                        float total =  am2 + am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (cb3.isSelected()) {
                        l19 = new JLabel("cerelas");
                        l19.setBounds(445, 450, 300, 30);
                        f.add(l19);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 450, 300, 30);
                        f.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 450, 300, 30);
                        f.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 450, 300, 30);
                        f.add(a5);
                        String amount3 = a3.getText();
                        String amount5 = a5.getText();
                        float am3 = Float.parseFloat(amount3);
                        float am5= Float.parseFloat(amount5);
                        float total =  am3 + am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    } else if (cb4.isSelected()) {
                        l19 = new JLabel("cerelas");
                        l19.setBounds(445, 450, 300, 30);
                        f.add(l19);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 450, 300, 30);
                        f.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 450, 300, 30);
                        f.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 450, 300, 30);
                        f.add(a5);
                        String amount4 = a4.getText();
                        String amount5 = a5.getText();
                        float am4 = Float.parseFloat(amount4);
                        float am5= Float.parseFloat(amount5);
                        float total =  am4+am5;
                        String tl = String.valueOf(total);
                        t7.setText(String.valueOf(tl));
                    }

                    else {

                        l19 = new JLabel("cerelas");
                        l19.setBounds(445, 430, 300, 30);
                        f.add(l19);
                        String q5 = t6.getText();
                        lq5 = new JLabel();
                        lq5.setText(String.valueOf(q5));
                        lq5.setBounds(600, 430, 300, 30);
                        f.add(lq5);
                        r5 = new JLabel("30");
                        r5.setBounds(770, 430, 300, 30);
                        f.add(r5);
                        a5 = new JLabel();
                        float amount = 30 * Float.parseFloat(q5);
                        String am = String.valueOf(amount);
                        a5.setText(String.valueOf(am));
                        a5.setBounds(950, 430, 300, 30);
                        f.add(a5);
                        t7.setText(String.valueOf(am));

                    }

                }

            }

        });

        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
        f.add(cb5);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(t1);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(t2);
        f.add(l8);
        f.add(t3);
        f.add(l9);
        f.add(l10);
        f.add(l11);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        f.setSize(1650,1080);
        f.setLayout(null);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
