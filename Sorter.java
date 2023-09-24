import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<>(List.of(new Integer[]{4,8,5,1,4}));

        System.out.print("Original List: ");
        System.out.println(myList);

        System.out.print("Insertion Sort: ");
        sort(myList);
        System.out.println(myList);

        System.out.print("Selection Sort: ");
        selectionSort(myList);
        System.out.println(myList);
        System.out.println("sort(array) that calls insertion sort:");
        sort(myList);
        System.out.println(myList);

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


    public static void selectionSort(ArrayList<Integer> arr){

        for(int i=0 ; i<arr.size()-1; i++){

            int min=arr.get(i);
            int indexOfmin=i;

            for(int j=i+1 ; j<arr.size();j++){

                if(arr.get(j)<min){
                    min=arr.get(j);
                    indexOfmin=j;
                }
            }
            int temp = arr.get(i);
            arr.set(i, min);
            arr.set(indexOfmin, temp);

        }
    }

    }

    public static void sort(ArrayList<Integer> list){
        insertionSort(list);
    }
}