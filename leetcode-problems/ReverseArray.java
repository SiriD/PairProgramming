class ReverseArray{
  public static void main(String[] args) {
    int[] testArr = {1, 2, 3, 6, 7, 10};
    reverseArray(testArr, 0, testArr.length - 1);
  }

  static void reverseArray(int[] arr, int start, int end) {
    while(start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

      start++;
      end--;
    }

    for (int i : arr) {
      System.out.println(i);
    }
  }
}
