import java.util.Comparator;

public class Firstind implements Comparator<String>
{

    private String s;

    public Firstind(String s)
    {
        this.s = s;
    }

    public int kol = 0;
    @Override
    public int compare(String o1, String o2)
    {
        kol++;
        return o1.indexOf(s) - o2.indexOf(s);
    }
}

