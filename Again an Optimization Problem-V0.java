/*Description

You are a thief carrying a single bag with limited capacity S. The museum you stole had N artefact that you could steal. Unfortunately, you might not be able to steal all the artefact because of your limited bag capacity.

You have to pick the artefact in order to maximize the total value of the artefacts you stole.


Input
Input Format

On the first line you are given T as the test cases available (1 <= T <= 10).

The next T test cases will be started with two integer S and N. N lines follow with two integers on each line describing each artefact available at the museum. The first number is the weight of the artefact and the next is the value of the artefact.

Constraints

1 <= S <= 20

1 <= N <= 15


Output
You should output a single integer on one line: the total maximum value from the best choice of artefacts you stole.


Sample Input 1 

1
4 5
1 8
2 4
3 0
2 5
2 3
Sample Output 1

13
Hint

Sample 1 Explanation :

The artefact with value 8 and 5 should be picked, summing up the value to the maximum of 13.*/
import java.io.*; 
 import java.lang.*; 
 import java.util.*;
class Main{
   static int max = 0; 
 public static void solve(int[][] a, int k, int current_weight, int current_value, int pos){ 
           if (current_weight <= k) max = Math.max(current_value,max);
        else{
            return; 
            }
        if (pos == a.length){ 
            return ;
            }
        solve(a, k,current_weight+a[pos][0], current_value+a[pos][1],pos+1); 
        solve(a, k,current_weight,current_value, pos+1); 
        } 
        public static void main(String[] args){ 
            Scanner s = new Scanner(System.in); 
            int t = s.nextInt ();
            while(t--!=0){ 
                int k = s.nextInt ();
                int n = s.nextInt ();
                int[][] a = new int[n][2];
                for (int i=0;i<n;i++){
                    a[i][0] = s.nextInt(); 
                    a[i][1] = s.nextInt (); 
                }
            solve(a, k,0,0,0);
            System.out.println(max);
            max = 0;
            }
        }
   }
