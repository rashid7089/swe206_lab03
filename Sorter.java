import java.util.ArrayList;

public class Sorter {
    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<>();
        myList.add(4);
        myList.add(8);
        myList.add(5);
        myList.add(1);
        myList.add(4);
        System.out.println("orginal List");
        System.out.println(myList);
        System.out.println("insertionSort:");
         insertionSort(myList);
        System.out.println(myList);
        System.out.println("selectionsort:");
        selectionSort(myList);
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