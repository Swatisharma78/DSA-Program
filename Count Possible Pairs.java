/*Description

You are given a system of equations:

x^2 + y = n

y^2 + x = m

You have to count, how many there are pairs of integers (x, y) (0 ≤ x, y) which satisfy the system.


Input
Input Format :

A single line contains two integers n, m

Constraints :

1 ≤ n, m ≤ 1000


Output
On a single line print the count


Sample Input 1 

9 3
Sample Output 1

1*/
public static void countPossiblePairs(int N, int M){
    //write your code here
    int ans = 0;
    for ( int i = 0; i<=N; i++){
     for ( int j = 0; j<=N; j++){
     if ((int)Math.pow(i,2) + j == N && (int)Math.pow(j,2) + i == M){
          ans++;}}}
    System.out.println(ans);}
