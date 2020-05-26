public class maxProfit {
        public int maximumProfit(int[] prices) {
            //base case
            if(prices.length <= 1){
                return 0;
            }
            //base case
            if(prices.length == 2){
                if(prices[1] > prices[0]){
                    return prices[1] - prices[0];
                }else{
                    return 0;
                }
            }
            //Bottom-up solution
            //2-d matrix to store profits
            int len = prices.length;
            int[][] M = new int[len][len];
            //initialize 2-d array with (empty)default value(-1)
            for(int x = 0; x < len; x++){
                for(int y = 0; y < len; y++){
                    M[x][y] = -1;
                }
            }
            int max_profit = 0;
            for(int j = 0; j < len; j++){
                for(int k = j+1; k < len; k++){
                    int profit = prices[k] - prices[j];
                    //if there is any profit at all
                    if(profit > 0){
                        //if profit > max_profit
                        if(profit > max_profit){
                            max_profit = profit;
                        }
                    }else{
                        profit = 0;
                    }
                    //store profit in the array M
                    M[j][k] = profit;
                }
            }
            return max_profit;
        }
}