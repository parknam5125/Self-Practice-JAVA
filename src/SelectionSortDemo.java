public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] b = {7,5,11,2,16,4,18,14,12,30};
        
        display(b, "Befroe");
        ArraySorter.selectionSort(b);
        display(b, "After");
    }

    public static void display(int[] arr, String s){
        System.err.println("Array values " + s + " sorting");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
