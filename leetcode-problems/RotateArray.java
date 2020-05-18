class RotateArray {
    public static void main(String[] args) {
        int[] testArr = {4, 7, 5, 8};
        rotateThisArray(testArr, 2);
    }

    static void rotateThisArray(int[] someArray, int step) {
        step = step % someArray.length;
        reverse(someArray, 0, someArray.length - 1);
        reverse(someArray, 0, step - 1);
        reverse(someArray, step, someArray.length - 1);

        for(int i : someArray) {
            System.out.println(i);
        }
    }

    static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
