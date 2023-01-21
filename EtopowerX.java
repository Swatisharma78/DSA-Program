/*
Description

One famous series says

Image

Using the below explanation for n-th term of e^x, calculate the value of e^x given x and n. Do not calculate it directly using the formula and do not write any iterative code.

Image


Input
Input Format

First and the only line of code contains x and n respectively

Constraints

x <= 14

n <= 12


Output
Print the value to 4 places after the decimal. For example, 13.1310 is a valid answer but 13.131 is not. Also, 12 is not a valid answer but 12.0000 is a valid answer


Sample Input 1 

4 2
Sample Output 1

13.0000*/
import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
    public static long fact(long n){
        if(n==0||n==1) return 1;
        return (n*fact(n-1));}
        public static double find(long x,long r){
            if (r==0) return 1;
            double val = Math.pow(x,r);
            double ans = val/fact(r) + find(x,r-1);
            return ans;
        }
        public static void main(String [] args){
            Scanner s = new Scanner(System.in);
            long x = s.nextLong();
            long r = s.nextLong();
            DecimalFormat format = new DecimalFormat(".0000");
            format.setMaximumFractionDigits(4);
            double ans = find(x,r);
            System.out.println(format.format(ans));
        }
    }
