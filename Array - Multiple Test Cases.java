/*Description

Array with Multiple Test Cases


Input
The first line of the input containsT, the number of test cases

The first line of each test case containsN, the size of the array

The next line of the input containsNspace separated integers referring the elements of the array


Output
Print elements of each array on a single line, by adding 1 to each element, for each test case

Sample Input 1 

2
5
1 2 3 4 5
4
1 2 3 4
Sample Output 1

2 3 4 5 6
2 3 4 5*/
import java.util.*;  
class Main {
public static void main( String[] args ){
    Scanner scn= new Scanner(System.in);
    int w = scn.nextInt();
    while(w>0){
    int n = scn.nextInt();
    int []arr = new int[n];
    for (int i = 0; i<n; i++){
    arr[i] = scn.nextInt();
    System.out.print(arr[i]+1+" ");}
     System.out.println();
      w = w-1;
     } 
     
   } 
}
