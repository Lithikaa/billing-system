package com.vit.billing.pages;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator  {
    JFrame f;
JTextField t;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
 
static double a=0,b=0,result=0;
static int operator=0;
 
    

    Calculator()
    {
        f=new JFrame("Calculator");
t=new JTextField();
b1=new JButton("1");
b2=new JButton("2");
b3=new JButton("3");
b4=new JButton("4");
b5=new JButton("5");
b6=new JButton("6");
b7=new JButton("7");
b8=new JButton("8");
b9=new JButton("9");
b0=new JButton("0");
bdiv=new JButton("/");
bmul=new JButton("*");
bsub=new JButton("-");
badd=new JButton("+");
bdec=new JButton(".");
beq=new JButton("=");
bdel=new JButton("Delete");
bclr=new JButton("Clear");
t.setBounds(30,40,280,30);
b7.setBounds(40,100,50,40);
b8.setBounds(110,100,50,40);
b9.setBounds(180,100,50,40);
bdiv.setBounds(250,100,50,40);
b4.setBounds(40,170,50,40);
b5.setBounds(110,170,50,40);
b6.setBounds(180,170,50,40);
bmul.setBounds(250,170,50,40);
b1.setBounds(40,240,50,40);
b2.setBounds(110,240,50,40);
b3.setBounds(180,240,50,40);
bsub.setBounds(250,240,50,40);
bdec.setBounds(40,310,50,40);
b0.setBounds(110,310,50,40);
beq.setBounds(180,310,50,40);
badd.setBounds(250,310,50,40);
bdel.setBounds(60,380,100,40);
bclr.setBounds(180,380,100,40);
f.add(t);
f.add(b7);
f.add(b8);
f.add(b9);
f.add(bdiv);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(bmul);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(bsub);
f.add(bdec);
f.add(b0);
f.add(beq);
f.add(badd);
f.add(bdel);
f.add(bclr);
f.setLayout(null);
f.setVisible(true);
f.setSize(350,500);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setResizable(false);
b1.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("1"));

    }
        

       

       
  });
  b2.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("2"));

    }
        

       

       
  });
  b3.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("3"));

    }
        

       

       
  });
  b4.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("4"));

    }
        

       

       
  });
  b5.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("5"));

    }
        

       

       
  });
  b6.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("6"));

    }
        

       

       
  });
  b7.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("7"));

    }
        

       

       
  });
  b8.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("8"));

    }
        

       

       
  });
  b9.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("9"));

    }
        

       

       
  });
  b0.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("0"));

    }
        

       

       
  });
  bdec.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText(t.getText().concat("."));

    }
        

       

       
  });
  badd.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent e) {

        a=Double.parseDouble(t.getText());
        operator=1;
        t.setText("");

    }
    
        

       

       
  });
  bsub.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent e) {

        a=Double.parseDouble(t.getText());
        operator=2;
        t.setText("");

    }
    
        

       

       
  });
  bmul.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent e) {

        a=Double.parseDouble(t.getText());
        operator=3;
        t.setText("");

    }
    
        

       

       
  });
  bdiv.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent e) {

        a=Double.parseDouble(t.getText());
        operator=4;
        t.setText("");

    }
    
        

       

       
  });
  beq.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent e) {

        b=Double.parseDouble(t.getText());
switch(operator)
{
case 1: result=a+b;
break;
case 2: result=a-b;
break;
case 3: result=a*b;
break;
case 4: result=a/b;
break;
default: result=0;
}
t.setText(""+result);

    }
    
        

       

       
  });
  bdel.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent e) {

        String s=t.getText();
        t.setText("");
        for(int i=0;i<s.length()-1;i++)
        t.setText(t.getText()+s.charAt(i));

    }
    
        

       

       
  });
  bclr.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent e) {

        t.setText("");

    }
    
        

       

       
  });
  
  
  
}
  

    


    
}

