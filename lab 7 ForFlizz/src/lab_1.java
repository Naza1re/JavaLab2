import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class lab_1 extends JFrame implements ActionListener {

    JFrame frame = new JFrame("Лабораторная 7");

    JLabel label1 = new JLabel("A");
    JLabel label2 = new JLabel("B");
    JLabel label3 = new JLabel("C");
    JButton button = new JButton("Посчитать");
    JTextField A = new JTextField();
    JTextField B = new JTextField();
    JTextField C = new JTextField();
    JTextField result = new JTextField();




    lab_1(){
        frame.setBounds(300,300,400,300);
        frame.setLayout(null);
        frame.setVisible(true);
        A.setBounds(40,20,60,40);
        frame.add(A);
        B.setBounds(150,20,60,40);
        frame.add(B);
        C.setBounds(270,20,60,40);
        frame.add(C);

        label1.setBounds(10,30,30,20);
        frame.add(label1);
        label2.setBounds(120,30,30,20);
        frame.add(label2);
        label3.setBounds(240,30,30,20);
        frame.add(label3);

        result.setBounds(150,100,100,30);
        frame.add(result);

        button.setBounds(150,170,100,30);
        frame.add(button);
        button.addActionListener(this);
    }



    public static double resultof(double a,double b,double c){


        return (Math.pow(b-c,2)/3)+a;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        double a = Double.parseDouble(A.getText());
        double b = Double.parseDouble(B.getText());
        double c = Double.parseDouble(C.getText());

        result.setText(Double.toString(resultof(a,b,c)));
    }

    public static void main(String[] args) {
        new lab_1();
    }
}
