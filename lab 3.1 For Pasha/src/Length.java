import java.util.Comparator;

public class Length implements Comparator<String>
{

    private String s;

    public Length(String s)
    {
        this.s = s;
    }
    public int kol = 0;


    @Override
    public int compare(String o1, String o2) {
        kol++;
        return o1.length()-o2.length();

    }
}
