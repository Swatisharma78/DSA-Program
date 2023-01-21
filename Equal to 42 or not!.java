/*
Description

You are given an array of N integers. You need to printYesif 42 is present in array, else printNo.


Input
Input Format :

First line contains number of integers N present in the array.

Second line contains  N  space separated integers.

Constraints :

1 <= N <= 100


Output
Output "Yes" or "No" based on condition mentioned above.


Sample Input 1 

5
3 7 0 9 8
Sample Output 1

No
Hint

We print No as 42 is not present in array.*/
public static void equalOrNot(int n,int[] arr){
    //write your code here
    
    boolean Present = false;
    for (int i = 0; i<n; i++){
       if (arr[i]==42){
       Present = true; 
       break;
       }
    }
    if(Present){
    System.out.println("Yes");
    }
    else{
     System.out.println("No");
      }
  }   
