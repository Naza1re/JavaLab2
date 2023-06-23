package lab4;

import java.util.Comparator;

public class StrComparator1 implements Comparator<String> {
    private long counter = 0;

    public long getCounter() {
        return counter;
    }
    String substr1,substr2;
    StrComparator1(String substr1,String substr2){
        this.substr1 = substr1;
        this.substr2 = substr2;
    }
    public String Partstr(String Str){
        counter++;

        int IndexFrom = Str.indexOf(substr1);
        int IndexTo = Str.lastIndexOf(substr2);
        String SubString = Str.substring(IndexFrom,IndexTo);
        return SubString;
    }
    @Override
    public int compare(String s1,String s2){

        return Partstr(s1).compareTo(Partstr(s2));
    }
}