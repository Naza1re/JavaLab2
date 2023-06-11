import java.awt.*;
import javax.swing.*;

class Picture extends Canvas {

    @Override
    public void paint(Graphics g) {

        g.setColor(Color.WHITE);
        g.drawRect(0,0,400,400);
        g.fillRect(0,0,400,400);

        g.setColor(Color.blue);

        g.drawOval(50,50,200,200);
        g.fillOval(50,50,200,200);
        g.setColor(Color.WHITE);
        g.drawRect(150,110,20,140);
        g.fillRect(150,110,20,140);
        g.drawRect(150,110,20,140);
        g.fillRect(150,110,20,140);
        g.drawRect(130,150,60,20);
        g.fillRect(130,150,60,20);
        g.drawRect(160,100,45,20);
        g.fillRect(160,100,45,20);
        g.drawOval(150,100,20,20);
        g.fillOval(150,100,20,20);
        g.drawOval(20,20,40,50);
        g.setColor(Color.red);



    }
}

class Form extends JFrame {
    public Form() {
        super("Рисунок");
        setBounds(100, 50, 400, 400);
        add(new Picture());
        setVisible(true);
    }
}

public class Main {
    public static void main(String[] args) {
        new Form();
    }
}