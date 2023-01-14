/*Description

You are competing with your neighbour. Both of you have an array of n numbers on which you are playing a game. The rules of the game is such that the player playing the move gets to choose one of the two numbers present at the ends. The player ending with larger sum wins the game.

You are making the first move. Make an optimal strategy such that you always win the game. Assume that your neighbour is also playing as per optimal strategy. The only difference is you get to play the first move.

For instance, suppose the numbers present in the array are 8,15,3,7 => You can choose either of 8 or 7. As per the optimal strategy, you choose 7, then your neighbour chooses 8, then you choose 15 and then your neighbour has only one choice of choosing 3. So, the winner(you) have a cumulative sum of 22 whereas the loser has a sum of 11 (3+8)

Print winner and loser total score respectively


Input
Input Format

First line of input contains n.

Second line of input contains n space separated integers.

Constraints

n <= 1000




Output
Print winner score and loser score separated by space


Sample Input 1 

4
8 15 3 7
Sample Output 1

22 11*/
import java.util.*;
public class Main{
public static int recur(int left, int right, int turn, int arr[], int dp[][][]) {
    if(left > right) { 
        return 0; 
        }
        if(left == right) {
            if(turn == 1) 
            return arr[left]; 
            return 0; 
            }
            if(dp[left][right][turn] != -1) 
            return dp[left][right][turn]; 
            if(turn == 1) {
                int takeLeft = arr[left] + recur(left + 1, right, 1 - turn, arr, dp); 
                int takeRight = arr[right] + recur(left, right - 1, 1 - turn, arr, dp); 
                return dp[left][right][turn]  = Math.max(takeLeft, takeRight); 
            }else{
            int takeLeft = recur(left + 1, right, 1 - turn, arr, dp); 
            int takeRight = recur(left, right - 1, 1 - turn, arr, dp); 
            return dp[left][right][turn] = Math.min(takeLeft, takeRight);
        }
    }
        public static void main( String args[]) { 
         Scanner sc = new Scanner(System.in); 
           int n  = sc.nextInt(); 
            int arr[] = new int[n]; 
             int sum = 0; 
           for (int i = 0; i < n; i++) { 
           arr[i] = sc.nextInt(); 
              sum += arr[i]; 
            } 
         int dp[][][] = new int[n][n][2]; 
         for (int i = 0; i < n; i++) { 
          for (int j = 0; j < n; j++) { 
           for (int k = 0; k < 2; k++) { 
            dp[i][j][k] = -1; 
         }
       } 
     }
        int find = recur (0, n - 1, 1, arr, dp); 
         System.out.println(find + " " + (sum - find));
           }
      }
