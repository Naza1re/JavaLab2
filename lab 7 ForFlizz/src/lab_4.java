import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class lab_4 extends JFrame implements ActionListener
{
    JFrame frame = new JFrame("JFRAME WINDOW");
    private final JRadioButton count = new JRadioButton("Количество вхождений", true);
    private final JRadioButton lastind = new JRadioButton("Последний индекс");
    private final JTextField orig = new JTextField();
    private final JTextField item = new JTextField();
    private final JTextField res = new JTextField();
    private final ButtonGroup sort_type = new ButtonGroup();

    lab_4() {

        frame.setBounds(100, 100, 500, 400);
        frame.setVisible(true);
        frame.setLayout(null);

        JLabel str = new JLabel("Ваша строка");
        str.setBounds(10, 60, 120, 20);
        JLabel item_l = new JLabel("индекс для сорт");
        item_l.setBounds(5, 100, 120, 20);
        JLabel sorted = new JLabel("Сортировка");
        sorted.setBounds(10, 140, 120, 20);

        frame.add(str);
        frame.add(item_l);
        frame.add(sorted);


        orig.setBounds(120, 60, 350, 30);
        item.setBounds(120, 100, 350, 30);
        res.setBounds(120, 140, 350, 30);
        frame.add(orig);
        frame.add(item);
        frame.add(res);

        count.setBounds(10, 10, 200, 20);
        lastind.setBounds(10, 30, 200, 20);
        frame.add(count);
        frame.add(lastind);

        Button sort = new Button("Сортировать");
        sort.setBounds(200, 200, 100, 50);
        sort.addActionListener(this);
        frame.add(sort);

        sort_type.add(count);
        sort_type.add(lastind);


    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (sort_type.isSelected(count.getModel()))
        {
            String[] arr = orig.getText().split(" ");
            String abc = item.getText();
            Count c1 = new Count(abc);
            Arrays.sort(arr,c1);
            res.setText(Arrays.toString(arr));
        }
        if (sort_type.isSelected(lastind.getModel()))
        {
            String[] arr = orig.getText().split(" ");
            String abc = item.getText();
            Lastind c1 = new Lastind(abc);
            Arrays.sort(arr,c1);
            res.setText(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        new lab_4();
    }
}