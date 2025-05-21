public class ArraySorter {
    public static void selectionSort(int[] arr){
        for(int i = 0 ; i < arr.length - 1 ; i++){
            int indexOfNextSmallest = getIndexOfSmallest(i,arr);
            swap(i,indexOfNextSmallest,arr);
        }
    }

    public static int getIndexOfSmallest(int start, int[] a){
        int min = a[start];
        int indexOfMin = start;
        for(int i = start + 1; i < a.length ; i++){
            if(a[i]<min){
                min = a[i];
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }

    public static void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
