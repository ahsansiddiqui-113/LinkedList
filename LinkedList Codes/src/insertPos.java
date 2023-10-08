public class insertPos {
    public static int[] insertElement(int[] arr, int element, int position) {
        int n = arr.length;
        int[] newArray = new int[n + 1];
        for (int i = 0, j = 0; i < n + 1; i++, j++) {
            if (i == position) {
                newArray[i] = element;
                i++;
            }
            if (j < n) {
                newArray[i] = arr[j];
            }
        }
        return newArray;
    }    
    
}
