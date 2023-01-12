/*Description

As you already know,Betty and Archie are best friends and since Archie's birthday is in one week, Betty wants to buy a present for him. But since Betty has no money, she went to the ATM to withdraw some amount. The ATM has N different type of coins and there is an unlimited amount of each type of coin in the ATM. Betty wants to minimize the  number of coins she withdraws and also make sure that the sum of coins is exactly equal to the price of the present she want to buy.


Input
Input Format

The first line contains the number of types of coins N and the price of the present P

The second line contains N numbers denoting the value of each coin

Constraints

1<=N<=100

1<=P<=10^6

1<=coin[i]<=10^6


Output
Print the minimum number of coins that betty can withdraw from the ATM , such that the sum of values of coins is equal to the price. If it is not possible, print -1.


Sample Input 1 

3 11
1 5 7
Sample Output 1

3
Hint

An optimal solution would be (1+5+5) which requires of 3 coins*/
// import java.util.*;
// class Main{
//     static int BettyBuys(int coins[],int k){
//         int dp[] = new int[k + 1];
//         Arrays.fill(dp,Integer.MAX_VALUE);
//         dp[0] = 0;
//         for (int i = 0; i < coins.length; i++) {
//         for (int j = coins[i]; j < dp.length; j++) {
//         if (dp[j - coins[i]] != Integer.MAX_VALUE) {
//         dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
//                 }
//             }
//         }
//     return dp[dp.length - 1] == Integer.MAX_VALUE ? -1 : dp[dp.length - 1];
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int length=sc.nextInt();
//         int k=sc.nextInt();
//         int coins[]=new int[length];
//         for(int i=0;i<length;i++){
//          coins[i]=sc.nextInt();
//         }
//         System.out.print(BettyBuys(coins,k));
//     }
// }
import java.util.*;
class Main{
      // m is size of coins array 
      // ( number of different coins ) 
     static int minCoins (int coins[], int m, int V){
     // table [ i ] will be storing 
     // the minimum number of coins // required for all value fron 1 to 5
     // table [V] will have result 
     int table [] = new int [V + 1];
    // Base case ( If given value V is 0 ) 
       table [0] = 0;
    // Initialize all table values as Infinite 
    for (int i = 1; i <= V; i++) table[i] = Integer.MAX_VALUE;
    // Compute minimum coins required for all 
    // values from 1 to V 
    for ( int i = 1; i <= V ; i++){ 
    // Go through all coins smaller than i
    for ( int j = 0; j < m; j++) 
    if (coins [j] <= i){ 
        int sub_res = table[i - coins[j]]; 
        if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table [i]) table [i] = sub_res + 1;
       }
    }
    if (table[V] == Integer.MAX_VALUE) 
    return -1; 
    return table[V];
         } 
    // Driver program 
    public static void main(String[] args){ 
        int n, p; 
    Scanner sc = new Scanner(System.in ); 
    n = sc.nextInt(); 
    p = sc.nextInt();
    int[] coins = new int [n]; 
    for ( int i = 0; i < n; i++) coins[i] = sc.nextInt(); 
    System.out.println(minCoins(coins, n, p)); 
        
    }
}
