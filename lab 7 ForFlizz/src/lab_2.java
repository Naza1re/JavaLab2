import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab_2 extends JFrame implements ActionListener {

    JFrame frame = new JFrame("Лабораторная 7");

    JLabel label1 = new JLabel("X");
    JLabel label2 = new JLabel("H");
    JLabel label3 = new JLabel("Значения");
    JTextField x = new JTextField();
    JTextField h = new JTextField();
    JTextField result = new JTextField();
    JTextField result1 = new JTextField();
    JButton button = new JButton("Посчитать");


        lab_2(){
        frame.setBounds(300,300,400,300);
        frame.setLayout(null);
        frame.setVisible(true);
        label1.setBounds(30,20,50,50);
        frame.add(label1);
        label2.setBounds(190,20,50,50);
        frame.add(label2);
        x.setBounds(70,30,100,40);
        frame.add(x);
        h.setBounds(220,30,100,40);
        frame.add(h);
        result.setBounds(70,120,100,40);
        frame.add(result);
        result1.setBounds(220,120,100,40);
        frame.add(result1);
        label3.setBounds(170,70,100,40);
        frame.add(label3);


    }

    public static double arctan(double x) {
        return Math.atan(x);
    }


    public static double Sum(double x, double h) {
        int i = 0;
        double res = 0;
        double sum = 0;
        do {
            res = Math.pow(-1,i)* Math.pow(x, 2*i+1)  / (2*i+1);
            sum += res;
            i++;
        }
        while (Math.abs(res) >= h);
        return sum;
    }





    @Override
    public void actionPerformed(ActionEvent e) {
            double a = Double.parseDouble(x.getText());
            double b = Double.parseDouble(h.getText());
            result.setText(Double.toString(Sum(a,b)));
            result1.setText(Double.toString(arctan(a)));


    }

    public static void main(String[] args) {
        new lab_2();
    }
}
