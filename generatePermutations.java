/*
Description

Given a collection of numbers, return all possible permutations.

NOTE:

No two entries in the permutation sequence should be the same.

For the purpose of this problem, assume that all the numbers in the collection are unique.

USING BUILT-IN LIBRARY FUNCTION TO PERMUTE WILL LEAD TO DISQUALIFICATION


Input
Input Format :

The first line of input contain an integer n - denoting the size of array

The next line contain n distinct integers, A[1],A[2]...A[N]

Constraints :

1<= n <=6




Output
Print the permutations of numbers in new line seperated by space, also make sure the permutations are printed in sorted order that is "1 2 3" must come before "2 3 1". Print without quotes. See sample test case for better understanding.


Sample Input 1 

3
1 2 3
Sample Output 1

1 2 3 
1 3 2 
2 1 3 
2 3 1 
3 1 2 
3 2 1
*/
import java.util.*;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        String a = "";
        for (int i = 0; i < n; i++) {
            a = a + arr[i];
        }
        permute(a, 0, n - 1);
    }
    private static void permute(String str, int l, int r) {
        if (l == r) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i) + " ");
            }
            System.out.println();
            return;
        }
        for (int i = l; i <= r; i++) {
            str = swap(str, i, l);
            permute(str, l + 1, r);
        }
    }
    public static String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
