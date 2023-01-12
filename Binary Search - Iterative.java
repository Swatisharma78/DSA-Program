/*
Description

Given n distinct numbers, implement iterative binary search to check the presence of target number k.

In case k is present among those n numbers, print 1

Else print -1


Input
Input Format :

First line of input contains n and k separated by a space

Next line contains n space separated integers

Constraints :

n<1000




Output
In case k is present among those n numbers, print 1

Else print -1


Sample Input 1 

5 0
2 -2 0 3 4
Sample Output 1

1
*/
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(iterativeWay(n, k, arr));
    }
    static int iterativeWay(int n, int k, int[] arr) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low / 2);
            if (arr[mid] == k) return 1;
            else if (arr[mid] < k) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
