/*
Description

You are given 2 arrays of N integers. Your task is to write a program that finds the one integer which is common in both arrays.

Note: There is always one integer common in both arrays.


Input
Input Format

First line of input contains N

Second line contains N space separated integers making the first array

Third line contains N space separated integers making the second array



Constraints

N<1000


Output
Output Format

Output that one integer which is common in both arrays


Sample Input 1 

3
4 5 7
9 2 5
Sample Output 1

5*/
public static void intersectionOfArray(int n,int[] arr1,int[] arr2){
    //write your code here
    for(int i = 0; i<arr1.length; i++ ) {
     for(int j = 0; j<arr2.length; j++) {
     if(arr1[i]==arr2[j]) {
    System.out.println(arr2[j]);}}}}
