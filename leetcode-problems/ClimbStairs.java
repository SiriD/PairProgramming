class ClimbStairs {

  public static void main(String[] args) {
    System.out.println(climbStairsWays(5));
  }

  static int climbStairsWays(int n) {
    if (n <= 1) {
      return n;
    }

    return climbStairsWays(n - 1) + climbStairsWays(n - 2);
  }
}
