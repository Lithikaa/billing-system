package com.vit.billing.pages;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;
import com.vit.billing.utils.Database;
public class signin{
    JFrame f1;
    Database database;
    public signin(Database db){
        database = db;
        JFrame f1=new JFrame("Signin Page");
        JLabel la1=new JLabel("Username");
        la1.setBounds(600, 150, 80, 40);
        JLabel la2=new JLabel("Password");
        la2.setBounds(600,200,80,40);
        JTextField text=new JTextField();
        text.setBounds(700,150,150,30);
        JPasswordField value=new JPasswordField();
        value.setBounds(700,200,150,30);
        JButton b = new JButton("Submit");  
        b.setBounds(700,250, 100,40);
        JButton cancelBttn = new JButton("Exit");
        cancelBttn.setBounds(700,300,100,40);
        JLabel invalid=new JLabel("");
        invalid.setBounds(650,360,300,50); 
        JLabel Title = new JLabel("VIT Billing System");
        Title.setFont(new FontUIResource("Noto Sans", FontUIResource.BOLD, 25));
        Title.setBorder(new EmptyBorder(10, 10, 10, 10));
        Title.setBounds(625,25, 400,40);
        JLabel Titl = new JLabel("Signin page");
        Titl.setFont(new FontUIResource("Noto Sans", FontUIResource.BOLD, 25));
        Titl.setBorder(new EmptyBorder(10, 10, 10, 10));
        Titl.setBounds(660,75, 400,40);
        f1.add(Titl); 
        f1.add(Title);  
        f1.add(invalid);f1.add(la1);f1.add(text);f1.add(la2);f1.add(value);f1.add(b);f1.add(cancelBttn);
        f1.setSize(400,400);
        f1.setLayout(null);
        f1.setVisible(true);
        b.addActionListener(new java.awt.event.ActionListener() {  
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        String Username=text.getText();
                        String Password=value.getText();
                        System.out.println(Username+","+Password);    
                    if (Username.equals("jeeva") || Password.equals("1234")) {
                                  f1.dispose();
                                  System.out.println("Login Successful");
                                  new Home();
                                } else {
                                    if (Username.equals("") || Password.equals("")) {
                                    invalid.setText("please enter the username and password");
                                    }
                                    else{
                                        invalid.setText("invalid username or password");
                                    }
                                }
                            }
                          
                        });  
                        
                        cancelBttn.addActionListener(new java.awt.event. ActionListener() {
                          public void actionPerformed(java.awt.event.ActionEvent e) {
                            System.exit(0);
                          }
                        });
     
  }
}