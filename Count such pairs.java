/*Description

You are given an array A of N integers along with a target integer. Your task is to find out the number of pairs of integers present in the array whose sum is equal to the target value.


Input
Input Format :

First line contains 2 integers: N and the target respectively.

Second line contains N integers which are the elements of the array.

Constraints :

N<100


Output
Print one number which is number of such pairs.


Sample Input 1 

5 9
3 0 6 2 7
Sample Output 1

2*/
 public static void countSuchPairs(int n,int target, int[] arr){
    //write your code here
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        for (int j = i + 1; j < arr.length; j++)
        if ((arr[i] + arr[j]) == target)
                    count++;
        System.out.print(count);}
    
