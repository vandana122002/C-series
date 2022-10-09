package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ques1 {
    public static void main(String[] args) {

        JFrame obj1 = new JFrame("example");
        JButton b1;
        JTextField f1, f2,f3,f4,f5,f6;
        JLabel l1, l2,l3,l4,l5,l6,l7,l8,l9,l10;
        JRadioButton r1,r2;
        JComboBox c1,c2;
        String br[]={"BTECH","BSC","MSC","MTECH"};
        String sem[]={"one","two","three","four"};
        l1 = new JLabel("Name ");
        f1 = new JTextField();

        l2 = new JLabel("Age ");
        f2 = new JTextField();

        l3 = new JLabel("Address ");
        f3 = new JTextField();

        l4 = new JLabel("Contact ");
        f4 = new JTextField();

        l5 = new JLabel("Roll No ");
        f5 = new JTextField();

        l6 = new JLabel("Email ");
        f6 = new JTextField();

        l7 = new JLabel("Gender");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");

        l8 = new JLabel("Branch");
        c1=new JComboBox(br);


        b1=new JButton("Submit");


        l1.setBounds(100,50,100,50);
        l2.setBounds(100,100,100,50);
        l3.setBounds(100,150,100,50);
        l4.setBounds(100,200,100,50);
        l5.setBounds(100,250,100,50);
        l6.setBounds(100,300,100,50);
        l7.setBounds(100,350,100,50);
        l8.setBounds(100,400,100,50);


        f1.setBounds(300,50,300,40);
        f2.setBounds(300,100,300,40);
        f3.setBounds(300,150,300,40);
        f4.setBounds(300,200,300,40);
        f5.setBounds(300,250,300,40);
        f6.setBounds(300,300,300,40);

        r1.setBounds(300,350,300,40);
        r2.setBounds(600,350,300,40);

        c1.setBounds(300,400,300,40);
        ;

        b1.setBounds(250,500,200,40);
        obj1.add(f1);
        obj1.add(f2);
        obj1.add(f3);
        obj1.add(f4);
        obj1.add(f5);
        obj1.add(f6);
        obj1.add(l1);
        obj1.add(l2);
        obj1.add(l3);
        obj1.add(l4);
        obj1.add(l5);
        obj1.add(l6);
        obj1.add(l7);
        obj1.add(r1);
        obj1.add(r2);
        obj1.add(l8);
        obj1.add(c1);

        obj1.add(b1);
        obj1.setLayout(null);
        obj1.setVisible(true);
    }
}