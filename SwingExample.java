// GUI Calculator for two digits
import java.awt.event.*;
import javax.swing.*;
public class SwingExample extends JFrame{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;

    public SwingExample(){}
    public SwingExample(String s){
        super(s);                   //calling parent class constructor with string arguement
                                    // by default it calls no arguments constructor
    }

   public void setComponents(){
    l1=new JLabel("Addition of two numbers");
    l2=new JLabel("First number");
    l3=new JLabel("Second number");
    l4=new JLabel("");
    t1=new JTextField();
    t2=new JTextField();
    b1=new JButton("Add");
    setLayout(null); // by default the "flowLayout" is set to remove that we pass null
    l1.setBounds(50,50,150,20);
    l2.setBounds(50,80,100,20);
    t1.setBounds(150,80,100,20);
    l3.setBounds(50,130,100,20);
    t2.setBounds(150,130,100,20);
    b1.setBounds(80,180,100,20);
    l4.setBounds(50,240,200,20);
    b1.addActionListener(new EHandler());
    add(l1);
    add(l2);
    add(l3);
    add(l4);
    add(t1);
    add(t2);
    add(b1);

        }

        class EHandler implements ActionListener{
            public void actionPerformed(ActionEvent e){
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int s=a+b;
                l4.setText("Result is "+s);
            } 
        }
    public static void main(String[] args){
        SwingExample jf= new SwingExample ("Swing Example");
        jf.setComponents();
        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}