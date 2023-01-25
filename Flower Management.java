/*
Description

You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer arrayflowerbedcontaining0's and1's, where0means empty and1means not empty, and an integern, find out if ifnnew flowers can be planted in theflowerbedwithout violating the no-adjacent-flowers rule.


Input
Input Format

The first line contains the number of testcases T

The first line of each testcase contains number of plots M, and the required number of flowers to be added N

The second line of each testcase contains the values of M plots : 0 or 1

Constraints

1<=T<=10

1<=M<=10^6

1<=N<=10^5


Output
Print "Yes" if it is possible to place N flowers else print "No"


Sample Input 1 

1
5 1
1 0 0 0 1
Sample Output 1

Yes
Hint

One flower can be placed at index 2.*/
import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
public static void main(String [] args){
    Scanner sc = new Scanner(System.in); 
    int t = sc.nextInt(); 
    while(t-- != 0){
        int p = sc.nextInt(); 
        int n = sc.nextInt();
        int [] pot = new int[p]; 
        for(int i = 0 ; i<p; i++) pot[i] = sc.nextInt(); 
        int count = 0; 
        for (int i = 0; i < pot.length; i++) { 
            if(i==0){ 
        if(pot[i] == 0 && pot[i+1]==0){
             pot[i] = 1;
             count++; 
          }
        
     } else if (i == p-1){ 
         if(pot[i] == 0 && pot[i-1] == 0){ 
             pot[i] = 1; 
             count++; 
        }
             }else{ 
                 if(i != p-1 && i!=0 && pot [i+1] == 0 && pot[i-1] == 0 && pot[i] == 0 ){
                 pot[i] = 1;
                 count++; 
                 }
             }
          }
                 if(count>= n) System.out.println("Yes");
                 else System.out.println("No");
      }
   }
}
