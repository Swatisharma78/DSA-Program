/*
Description

You have a circular dining table and N angry people.You need to place them on the table.Each person has a anger value.

You can place them in any order on the circular table.Once you place them you need to calculate the Danger value of your arrangement.

The danger value of the arrangement is the maximum difference of anger values of all the adjacent seated persons.You need to keep this danger value as low as possible.


Input
Input Format

The first line contains N.

The second line contains the anger values of N persons.

Constraints

3<=N<=1000

1<=Hunger Value<=1000




Output
Output format

Print the minimum possible danger value.


Sample Input 1 

4
5 10 6 8
Sample Output 1

4
Hint

The optimal arrangement is :

5

/             \

6                  8

\           /

10

The adjacent pair values are 1 for(6-5),3 for(8-5),4 for(10-6),2 for(10-8).Since danger value is the maximum value so it's 4.*/
import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static int solve(int[] a){
        Arrays.sort(a);
        int max = Integer.MIN_VALUE;
        int cur_left = a[0];
        int cur_right = a[0];
        for (int i = 0; i<a.length; i++){
            if(i%2 == 0){
                int temp = Math.abs(a[i] - cur_left);
                cur_left = a[i];
                max = Math.max(max,temp);
            }else{
                int temp = Math.abs(a[i] - cur_right);
                cur_right = a[i];
                max = Math.max(max,temp);
                }
            }
            return max;
        }
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] a = new int [n];
            for(int i = 0; i<a.length; i++) a[i] = sc.nextInt();
            System.out.println(solve(a));
            }
        }
