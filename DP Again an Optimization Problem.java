/*Description

You are a thief carrying a single bag with limited capacity S. The museum you stole had N artifact that you could steal. Unfortunately you might not be able to steal all the artifact because of your limited bag capacity.

You have to cherry pick the artifact in order to maximize the total value (<= 2000000) of the artifacts you stole.


Input
Input Format

On the first line you are given T as the test cases available (1 <= T <= 20).

The next T testcases will started with two integer S and N. N lines follow with two integers on each line describing each artifact available at the museum. The first number is the weight of the artifact and the next is the value of the artifact.

Constraints

1 <= S <= 2000

1 <= N <= 2000


Output
Output Format

You should output a single integer on one line : the total maximum value from the best choice of artifacts you stole.


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

The artifact with value 8 and 5 should be picked, summing up the value to the maximum of 13.*/
import java.util.*;
public class Main{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); 
    for (int i=1;i<=t;i++){ 
        int s = sc.nextInt (); 
        int n = sc.nextInt (); 
        int weight[]=new int[n]; 
        int price[]=new int[n]; 
        for (int j=0;j<n;j++){ 
        int w = sc.nextInt ();
        int p=sc.nextInt();
        weight[j]=w; 
        price[j]=p; 
        }
        int dp[][] = new int[n][s+1]; 
        int max = recursive(price,weight,0,s,dp);
        System.out.println(max); 
      }
  }
     public static int recursive(int price[],int weight[], int idx, int s,int dp[][]){ 
             if(idx==price.length || s==0) {
                 return 0;
             }
                 int inc=0,ex=0; 
                 if(dp[idx][s]!=0) 
                 return dp[idx][s]; 
                 if(s - weight[idx]>=0) 
                 inc=price[idx]+recursive(price, weight,idx+1,s-weight[idx], dp);
                 ex=recursive(price,weight, idx+1,s, dp); 
                 return dp[idx][s] = Math.max(inc,ex); 
             }
        }
