/*
Description

You live in a building of N floors numbered from 1 to N. You also have K identical eggs.You are trying to find a floor F such that if we drop an egg from a floor higher than F then the egg will break. Any egg dropped from or below floor F will not break.If you try dropping some eggs from some floor and the egg breaks then you can’t use those eggs further. So for each step, you need to take an unbroken egg and drop it from any floor x where (1 <= x <= N).

Here you don’t need to find the critical floor F but you have to decide floors from which eggs should be dropped so that the total number of trials are minimized.


Input
The first line contains T denoting the number of test cases.

The next T lines contain two positive integers N and K denoting the total number of floors and the number of eggs you have.

Constraints

1 <= T <= 10^5

1 <= N, K <= 200


Output
For each test case, you should print the minimum number of trials to break all eggs.


Sample Input 1 

1
2 1
Sample Output 1

2
Sample Input 2 

2
6 2
14 3
Sample Output 2

3
4
Hint

Explanation for Sample 1

If you drop the egg the from floor 1. Then either it breaks or it didn’t break.

If it breaks, we know with certainty that F = 0 else, we drop the egg from floor 2. If it breaks, we know with certainty that F = 1.

If it didn't break, then we know with certainty F = 2.

*/
import java.util.*; 
  public class Main{ 
      static long [][]dp; 
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in); 
          dp = new long[201][201]; 
          for (int i = 0; i<dp.length; i++) Arrays.fill(dp[i], -1);
          int t = sc.nextInt(); 
          while (t-->0){
            int n = sc.nextInt(); // egg 
            int k = sc.nextInt(); // floor
            System.out.println(f(n,k)); 
          } 
      }
      private static long f(int n, int k){ 
          if (n <=1 || k == 1) return n; 
          if (dp[n][k] != -1) return dp[n][k]; 
          long ans = Integer.MAX_VALUE;
          for (int floor = 1; floor <= n; ++floor){ // choose a floor first 
          long o1 = 1 + f(floor-1,k-1); // egg break 
          long o2 = 1 + f(n-floor, k); // not break 
          ans = Math.min(ans,Math.max(o1,o2)); 
          } 
          return dp[n][k]=ans;
      }
  }
