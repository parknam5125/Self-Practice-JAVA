public class Final_7_SelectionSort {
    public static void main(String[] args) {
        int[] b = {7, 5, 11, 2, 16, 4, 18, 14, 12, 30};
        display(b);
        SelectionSort(b);
        display(b);
    }

    public static void display(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void SelectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                Swap(arr, i, minIndex);
            }
        }
    }

    public static void Swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
