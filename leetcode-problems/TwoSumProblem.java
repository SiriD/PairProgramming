// Given nums = [2, 7, 11, 15], target = 9,

// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].
import java.util.*;

class TwoSumProblem {
  public static void main(String[] args) {
    List<Integer> someList = new ArrayList<>();
    someList.add(7);
    someList.add(8);
    someList.add(2);
    someList.add(11);
    someList.add(1);
    someList.add(13);
    List<Integer> arr = getIndexes(someList, 9);
    for (int i : arr) {
      System.out.println(i);
    }
  }

  static List<Integer> getIndexes(List<Integer> arr, Integer target) {
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < arr.size(); i++) {
      int temp = target - arr.get(i);
      if(arr.contains(temp)) {
        result.add(arr.indexOf(arr.get(i)));
        result.add(arr.indexOf(temp));
      }
    }

    return result;
  }
}
