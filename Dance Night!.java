/*
Description

Masai School will be hosting its Prom Night on 29th Feb.There would be M boys and N girls at the prom tonight. Each boy wants a girl who is strictly shorter than him. A girl can dance with only one boy and vice-versa.

Given the heights of all the boys and girls comment whether it is possible for all boys to get a girl.


Input
The first line contains T denoting the number of test cases.

Each test case contains three lines.

The first line contains M and N.

The second line contains M integers each denoting the height of boy.

The third contains N integers each denoting the height of girl.

Constraints

1<=T<=10

1<=N, M<=10000

1<=Height<=200


Output
Print YES if it is possible for each boy to get a girl else print NO.


Sample Input 1 

1
4 5
2 5 6 8
3 8 5 1 7
Sample Output 1

YES*/
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t!=0) {
      int lenBoys = sc.nextInt();
      int lenGirls = sc.nextInt();
      int[] boys = new int[lenBoys];
      int[] girls = new int[lenGirls];
      for(int i=0; i<lenBoys; i++) {
        boys[i] = sc.nextInt();
      }
      for(int i=0; i<lenGirls; i++) {
        girls[i] = sc.nextInt();
      }
      if(lenBoys > lenGirls) {
        System.out.println("NO");
      } else {
        Arrays.sort(boys);
        Arrays.sort(girls);
        boolean possible = true;
        for(int i=0; i<lenBoys && possible; i++) {
          if(boys[i]<=girls[i]) {
            possible = false;
          }
        }
        System.out.println(possible?"YES":"NO");
      }
      t--;
    }
  }
}
// import java.io.*;
// import java.lang.*;
// import java.util.*;
 
//  class Main{
//      public static boolean check(int [] girls , int [] boys){
//          int i = 0;
//          int j = 0;
//          if (boys.length > girls.length) return false;
//          while( i<boys.length && j < girls.length) {
//              if (boys[i] <= girls[j]) return false;
//              i++;
//              j++;
//          }
//          return true;
//      }
//  public static void main (String [] args){
//      Scanner sc = new Scanner(System.in);
//      int t = sc.nextInt();
//      while(t-- != 0){
//          int n = sc.nextInt();
//          int m = sc.nextInt();
//          int[] boys = new int[n];
//          int[] girls = new int[m];
//          for( int i= 0; i < n; i++) boys[i] = sc.nextInt();
//          for( int i= 0; i < m; i++) girls[i] = sc.nextInt();
//          Arrays.sort(boys);
//          Arrays.sort(girls);
//          if(check(girls,boys)) System.out.println("YES");
//          else {
//              System.out.println("NO");
//           }
//        } 
//      }
//   }
