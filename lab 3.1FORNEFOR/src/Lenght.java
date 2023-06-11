import java.util.Comparator;

public class Lenght implements Comparator<String>
{
    private String abc;

    public Lenght(String abc)
    {
        this.abc = abc;
    }
    public int koll = 0;
    @Override
    public int compare(String o1,String o2){
        koll++;
        return o1.length()-o2.length();
    }


}