public class insertEnd {
    public static int[] insertAtEnd(int[] arr, int element) {
        int n = arr.length;
        int[] newArray = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newArray[i] = arr[i];
        }
        newArray[n] = element;
        return newArray;
    }    
    
}
