import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        int[][] arr = null;
        arr = takeCSV();

        int minIndexI = 0, minIndexJ = 0;
        int min = arr[0][0];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i][j] < min) {
                    min = arr[i][j];
                    minIndexI = i;
                    minIndexJ = j;
                }
            }
        }

        int maxIndexI = 0 , maxIndexJ = 0;
        int max = arr[0][0];
        for(int i = minIndexI+1; i < arr.length; i++) {
            for(int j = minIndexJ+1; j < arr.length; j++) {
                if(arr[i][j] >= max) {
                    max = arr[i][j];
                    maxIndexI = i;
                    maxIndexJ = j;
                }
            }
        }
        System.out.println("Минимальный элемент " + min + "\t" +"["+ minIndexI+"]" +"["+ minIndexJ+"]");
        System.out.println("Максимальный элемент " + max + "\t" +"["+ maxIndexI +"]" +"["+ maxIndexJ+"]");

    }

    public static int[][] takeCSV() {
        String line;
        int[][] array = null;

        try (BufferedReader br = new BufferedReader(new FileReader("array.csv"))) {
            int n = 0;
            while ((line = br.readLine()) != null) {
                String[] arrayLineString = line.split(";");

                for(int i = 0; i < arrayLineString.length; i++) {
                    if(array == null) {
                        array = new int[arrayLineString.length][arrayLineString.length];
                    }
                    array[n][i] = Integer.parseInt(arrayLineString[i]);
                }
                n++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;
    }

    public static int searchmax(int[][] arr){
        int maxIndexI = 0, maxIndexJ = 0;
        int max = arr[0][0];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i][j] >= max) {
                    max = arr[i][j];
                    maxIndexI = i;
                    maxIndexJ = j;
                }
            }
        }
        return max;


    }


}
