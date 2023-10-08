public class delete {
    public static int[] deleteAtIndex(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            return arr; 
        }
        int n = arr.length;
        int[] newArray = new int[n - 1];
        for (int i = 0, j = 0; i < n; i++) {
            if (i != index) {
                newArray[j++] = arr[i];
            }
        }
        return newArray;
    }
    
}
