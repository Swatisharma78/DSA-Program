/*Description

Given n distinct numbers, implement a recursive binary search to check the presence of target number k.

In case k is present among those n numbers, print 1

Else print -1


Input
Input Format :

First line of input contains n and k separated by a space

Next line contains n space separated integers

Constraints:

n<1000


Output
In casekis present among those n numbers, print 1

Else print -1


Sample Input 1 

5 0
2 -2 0 3 4
Sample Output 1

1
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int output = binarySearch(arr, 0, n - 1, k);
        if (output != -1){
            System.out.println(1);
        }else {
            System.out.println(-1);
        }
    }
    private static int binarySearch(int[] arr, int low, int high, int k) {
        if (high >= low) {
            int midPoint = low + (high - low) / 2;
            if (arr[midPoint] == k) {
                return midPoint;
            } else if (arr[midPoint] < k) {
                return binarySearch(arr, midPoint + 1, high, k);
            } else {
                return binarySearch(arr, low, midPoint - 1, k);
            }
        }
        return -1;
    }
}
