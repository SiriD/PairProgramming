class RotateArray {
    public static void main(String[] args) {
        int[] testArr = {4, 7, 5, 8, 10, 2, 6};
        int[] result = rotateThisArray(testArr, 3);

        for (int value : result) {
            System.out.println(value);
        }
    }

    static int[] rotateThisArray(int[] someArray, int step) {
        int[] result = new int[step];
        for (int i = 0; i < result.length; i++) {
            result[i] = someArray[someArray.length - step + i];
            someArray[someArray.length - step + i] = someArray[i];
            someArray[i] = result[i];
        }

        return someArray;
    }
}
