/*Description

You are given n numbers and you have to answer q queries. In each query, you will be provided with a number k and you have to find the first number which is greater than k.

For instance, if there are 7 numbers 9,5,8,1,2,3,4 and k is 6, then there are 2 numbers greater than 6 => 8 and 9, but the first element greater than it is 8. So, print 8.

In case there is no number greater than k in the array, print -1


Input
Input Format

The first line of input contains n

Next line contains n space separated integers

After that, you are given q

In the next q lines, you are provided k in each line

Constraints

1 <= n <= 1000000

1 <= values in array, k <= 10000000

1 <= q <= 10


Output
Output q numbers based on problem statement given above


Sample Input 1 

10
13 89 81 66 81 63 71 76 73 81
2
65
15
Sample Output 1

66
63*/
import java.io.*;
import java.lang.*;
import java.util.*; 
class Main{ 
    public static int solve (int[] arr, int k){ 
        int ans = Integer.MAX_VALUE; 
        for (int i = 0; i < arr.length; i++){ 
            if (arr[i] > k){ 
            ans = Math.min(arr[i], ans); 
                }
            } 
        if (ans == Integer.MAX_VALUE) return -1; 
        return ans; 
      } 
    public static void main (String[] args){ 
        Scanner s = new Scanner(System.in); 
        int n = s.nextInt(); 
        int[] arr = new int [n]; 
        for (int i = 0; i < arr.length; i++) arr[i] = s.nextInt(); 
        int q = s.nextInt(); 
        while (q--!=0){ 
            int k = s.nextInt(); 
            System.out.println(solve(arr, k)); 
        } 
    }
}
// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int[] arr = new int[num];
//         ArrayList<Integer> array = new ArrayList<Integer>();
//         for(int i=0;i<num;i++){
//             arr[i] = sc.nextInt();
//         }
//         int tc = sc.nextInt();
//         for(int j=0;j<tc;j++){
//             int k = sc.nextInt();
//             Arrays.sort(arr);
//             int ans = -1;
//             for(int i=0;i<num;i++){
//                 if(arr[i]>k){
//                    ans = arr[i];
//                    break;
//                 }
//             }
//             System.out.println(ans);
//         }
//     }
// }
