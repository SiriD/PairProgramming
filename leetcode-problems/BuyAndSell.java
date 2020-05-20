class BuyAndSell {

    public static void main(String[] args) {
        int[] arr1  = {7,1,5,3,6,4};
        System.out.println(buyAndSellOnepPass(arr1));

        int[] arr2 = {7,6,4,3,1};
        System.out.println(buyAndSellOnepPass(arr2));

    }

//    Brute force:
//    static int buyAndSell(List<Integer> integerList) {
//
//        int maxProfit = 0;
//        for(int i = 0; i < integerList.size(); i++) {
//            for(int j = i + 1; j < integerList.size(); j++) {
//                if((integerList.get(j) - integerList.get(i)) > maxProfit) {
//                    maxProfit = integerList.get(j) - integerList.get(i);
//                }
//            }
//        }
//
//        return maxProfit;
//    }

//  One pass solution
    static int buyAndSellOnepPass(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}
