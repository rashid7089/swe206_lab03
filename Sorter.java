import java.util.ArrayList;

public class Sorter {
    public static void main(String[] args) {

    }
    public static void insertionSort(ArrayList<Integer> arr) {
        for(int i = 1; i < arr.size(); i++) {
            int value = arr.get(i);
            int j;
            for(j = i; j > 0 && value < arr.get(j - 1); j--)
                arr.set(j, arr.get(j - 1));
            arr.set(j, value);
        }
    }
}