import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {
    static List<int[]> list = new ArrayList<>();

    public static void main(String[] args) {
        pascalTriangle(5);
    }

/*   row number = number of items in that row
     [1]
     [1,1]
     [1,2,1]
     [1,3,3,1]

     for n = 1
        arr -> [1]
     for n = 2
        arr -> [1], [1,1]
     for n > 2 (3, 4, 5....)

 */

    static List<int[]> pascalTriangle(int numOfRows) {

        if (numOfRows == 1) {
            list.add(new int[]{1});
        } else if (numOfRows == 2) {
            list.add(new int[]{1});
            list.add(new int[]{1, 1});
        } else {
            pascalTriangle(numOfRows - 1);

            int[] arr = new int[numOfRows];
            int prevEntry = list.size() - 1;
            int[] a = list.get(prevEntry);
            arr[0] = 1;
            arr[numOfRows - 1] = 1;

            for (int i = 1; i <= numOfRows - 2; i++) {
                arr[i] = a[i - 1] + a[i];
            }
            list.add(arr);
        }

        return list;
    }

    static void printArray(int[] arr) {
        for (int i: arr) {
            System.out.print(i + ",");
        }
    }



}
