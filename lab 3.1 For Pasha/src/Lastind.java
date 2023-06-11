import java.util.Comparator;

public class Lastind implements Comparator<String>
{

    private String s;

    public Lastind(String s)
    {
        this.s = s;
    }

    public int kol = 0;
    @Override
    public int compare(String o1, String o2)
    {
        kol++;
        return o2.indexOf(s) - o1.indexOf(s);
    }
}
