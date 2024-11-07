package calculator_app;

import java.awt.*;
import javax.swing.*;

class Calculator_elements_layout extends JFrame{

    public static int FRAME_SIZE_X=400,FRAME_SIZE_Y=600;

    JTextField input_field;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b00,b_point;
    JButton btn_plus,btn_minus,btn_multiply,btn_divide,btn_mod;
    JButton btn_clr,btn_correct;


    Calculator_elements_layout(){}
    Calculator_elements_layout(String Title){
        super(Title);
    setSize(FRAME_SIZE_X,FRAME_SIZE_Y);
    setVisible(true);
    setComponents();
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void setComponents(){                //function implements the size and postion of the buttons on th frame
        int NUMBER_BUTTON_SIZE_X=60;            // to set the size of numeric keys
        int NUMBER_BUTTON_SIZE_Y=60;
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
        b00=new JButton("00");
        b_point=new JButton(".");

        btn_plus=new JButton("+");
        btn_minus=new JButton("-");
        btn_multiply=new JButton("*");
        btn_divide=new JButton("/");
        btn_clr=new JButton("clear");
        btn_correct=new JButton("correct");

    


        b_point.setBounds(125,500,NUMBER_BUTTON_SIZE_X,NUMBER_BUTTON_SIZE_Y);
        b00.setBounds(65,500,NUMBER_BUTTON_SIZE_X,NUMBER_BUTTON_SIZE_Y);
        b0.setBounds(5,500,NUMBER_BUTTON_SIZE_X,NUMBER_BUTTON_SIZE_Y);
        b9.setBounds(125,440,NUMBER_BUTTON_SIZE_X,NUMBER_BUTTON_SIZE_Y);
        b8.setBounds(65,440,NUMBER_BUTTON_SIZE_X,NUMBER_BUTTON_SIZE_Y);
        b7.setBounds(5,440,NUMBER_BUTTON_SIZE_X,NUMBER_BUTTON_SIZE_Y);
        b6.setBounds(125,380,NUMBER_BUTTON_SIZE_X,NUMBER_BUTTON_SIZE_Y);
        b5.setBounds(65,380,NUMBER_BUTTON_SIZE_X,NUMBER_BUTTON_SIZE_Y);
        b4.setBounds(5,380,NUMBER_BUTTON_SIZE_X,NUMBER_BUTTON_SIZE_Y);
        b3.setBounds(125,320,NUMBER_BUTTON_SIZE_X,NUMBER_BUTTON_SIZE_Y);
        b2.setBounds(65,320,NUMBER_BUTTON_SIZE_X,NUMBER_BUTTON_SIZE_Y); 
        b1.setBounds(5,320,NUMBER_BUTTON_SIZE_X,NUMBER_BUTTON_SIZE_Y);

        btn_plus.setBounds(185,440,60,120);
        btn_minus.setBounds(185,380,60,60);
        btn_multiply.setBounds(185,320,60,60);
        btn_clr.setBounds(230,440,60,60);
        btn_correct.setBounds(230,380,60,60);
        btn_divide.setBounds(230,320,60,60);



        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(b00);
        add(b_point);

        add(btn_plus);
        add(btn_minus);
        add(btn_multiply);
        add(btn_clr);
        add(btn_correct);
        add(btn_divide);
        
       
       

    }



// public static void main(String []args){
//     Calculator_elements_layout obj= new Calculator_elements_layout("Calculator");
    
// }
}