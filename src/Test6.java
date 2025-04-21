public class Test6 {
    public void bubble(int arr[]){//arr
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] > arr[j]) {//arr[i] < arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];//arr[j]=arr[i];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Test6 t = new Test6();
        int arr[] = {3,6,8,2,5,4,7,1};//arr
        t.bubble(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
