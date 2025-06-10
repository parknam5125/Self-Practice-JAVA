//import java.util.Arrays;
public class Final_8_InsertionSort {
    public static void main(String[] args) {
        int[] b = {7, 5, 11, 2, 16, 4, 18, 14, 12, 30};
        display(b);
        InsertionSort(b);
        //Array.sort(b);
        display(b);
    }
    public static void display(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void InsertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
