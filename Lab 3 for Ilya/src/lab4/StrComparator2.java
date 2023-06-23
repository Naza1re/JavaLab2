package lab4;

import java.util.Comparator;



public class StrComparator2 implements Comparator<String> {
    private long counter = 0;

    public long getCounter() {
        return counter;
    }
    @Override
    public int compare(String s1,String s2){
        counter++;

        return (int) (s1.chars().filter(Character::isLowerCase).count() - s2.chars().filter(Character::isLowerCase).count());

    }
}