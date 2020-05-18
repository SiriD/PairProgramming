class ClimbingStairs {
    public int climbStairs(int n) {
        //Dyanamic Programming solution
        //1. Base case - if n = 0 or 1, return 1
        if(n == 0 || n == 1){
            return 1;
        }
        //2. Bottom-up approach -> iterate from 1 to n and add solution for n-1 and n-2 to get solution for n
        //initialize array M of size n+1(ex:7th elem in array is at idx 6)
        int[] M = new int[n+1];
        //store 1 in the 0th and 1st indices of array(to account for base case)
        M[0] = 1;
        M[1] = 1;
        for(int j = 2; j <= n; j++){
            M[j] = M[j-1] + M[j-2];
        }
        return M[n];
    }
}