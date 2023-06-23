import java.util.Comparator;

public class DateAndTimeComparator implements Comparator<infmail> {
    @Override
    public int compare(infmail o1, infmail o2) {
        return o1.getDateandtime().compareTo(o2.getDateandtime());
    }
}
