/*
Description

You are given an arrayarrofNintegers.

You need to printOdd, if thesum of all odd numberspresent in the array is greater thansum of all the even numberspresent in the array, or else printEven.


Input
Input Format :

First line contains N which is the number of elements present in the array.

Second line contains N space separated integers which are the elements of array.



Constraints :

1 <= N <= 100

1 <= arr[i] <= 100


Output
Print either "Odd" or "Even" depending upon the condition mentioned above.


Sample Input 1 

4
1 2 3 4
Sample Output 1

Even
Hint

Output Explanation :

Odd numbers present are 1 and 3, whose sum is 4

Even numbers present in array are 2 and 4, whose sum is 6

Since 6>4, Even is the required output.

*/
 public static void battleOfOddAndEven(int n, int arr[]){
    //write your code here
    int odd=0; 
      int even=0; 
   for(int i=0; i<n;i++){ 
     if(arr[i]%2==0){ 
        even+=arr[i]; 
      }else if(arr[i]%2!=0){ 
           odd+=arr[i];}} 
          if(even<odd){ 
         System.out.println("Odd"); 
             }else{ 
           System.out.println("Even"); 
         }
      }
