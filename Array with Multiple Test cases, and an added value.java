/*
Description

You are givenTtest cases, each test case contains an arrayA, and a valueK

Print the values of the array, by adding the valueKto each element in the array

You have to do this for all the test cases


Input
The first line of the input containsT, the number of test cases

The first line of each test case containsNandK, as explained in the problem statement

The next line containsNspace separated integers, denoting the elements of the array


Output
For each test case, print the elements of the array after updating as explained in the problem statement

Sample Input 1 

2
3 2
1 2 3
3 1
1 2 3
Sample Output 1

3 4 5
2 3 4*/
import java.util.*;  
class Main {
public static void main( String[] args ){
    Scanner scn= new Scanner(System.in);
    int w = scn.nextInt();
    while(w>0){
    int n = scn.nextInt();
    int k = scn.nextInt();
    int []arr = new int[n];
  for (int i = 0; i<n; i++){
    arr[i] = scn.nextInt();
    System.out.print(arr[i]+k+" ");}
      System.out.println();
      w = w-1;
     }  
   } 
}
