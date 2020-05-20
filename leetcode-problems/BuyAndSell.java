import java.util.ArrayList;
import java.util.List;

class BuyAndSell {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(7);
        list1.add(6);
        list1.add(4);
        list1.add(3);
        list1.add(1);
        System.out.println(buyAndSell(list1));

        List<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(1);
        list2.add(5);
        list2.add(3);
        list2.add(6);
        list2.add(4);
        System.out.println(buyAndSell(list2));

    }

    static int buyAndSell(List<Integer> integerList) {
        // arr = [7,1,5,3,6,4]
        // profits[]
        // for (0 < i < arr.length)
        //      for (1 < j < arr.length)
        //          if(arr[i] < arr[j])
        //              profits{arr[j] - arr[i]}
        // get the max of profits
        int maxProfit = 0;
        for(int i = 0; i < integerList.size(); i++) {
            for(int j = i + 1; j < integerList.size(); j++) {
                if((integerList.get(j) - integerList.get(i)) > maxProfit) {
                    maxProfit = integerList.get(j) - integerList.get(i);
                }
            }
        }

        return maxProfit;
    }

}
