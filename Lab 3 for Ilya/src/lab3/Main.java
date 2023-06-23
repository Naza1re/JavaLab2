package lab3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main extends JFrame implements Job, ActionListener {

    private final JTextField enter = new JTextField();
    private final JTextField result = new JTextField();
    private final JLabel enterL = new JLabel("Исходная строка");
    private final JLabel resultL = new JLabel("Преобразованная строка");
    private final JButton process = new JButton("Обработать");

    @Override
    public StringBuilder perform(StringBuilder str3){
        int k =0;
        StringBuilder str =str3;
        int s= str.length();
        for (int i =0; i<s; i++){
            String str1 = "{";
            String str2 = "}";

            if (str.charAt(i)=='{' && str.charAt(i+1) == '}' ) {


                k=i+1;
                int f = Integer.toString(k).length();
                s+=f;

                str1 += k + str2;
                System.out.println(str1);
                str.replace(i, i + 2, str1);
            }
        }
        return str;
    }
    public void createWindow()
    {
        setVisible(true);
        setLayout(null);
        setTitle("Лаба 3(3)");
        setBounds(100, 100, 400,400);
        setSize(400,400);

        enter.setBounds(200,100,150,20);
        result.setBounds(200,150,150,20);
        add(enter);
        add(result);

        enterL.setBounds(50,100,100,20);
        resultL.setBounds(50,150, 250,20);
        add(enterL);
        add(resultL);

        process.setBounds(200,200,150,50);
        process.addActionListener(this);
        add(process);
    }

    public static void main(String[] args) {

        //  StringBuilder str = new StringBuilder("привет {} как {123} дела {}");
        new Main().createWindow();
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        result.setText(String.valueOf(perform(new StringBuilder(enter.getText()))));
    }
}