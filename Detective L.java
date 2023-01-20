/*Description

L is a famous detective in the anime series Death Note and is known for solving puzzles and riddles for investigation.

There is a security breach in Tokyo Police and they want L's help.He is given the security matrix of dimension [nxm] by the police.

L decodes that his rival Light has breached the security matrix and has followed a specific way of accessing the matrix. Below is the image of its traversal. Surprisingly, the traversal is in the L shape.

l.png

He is busy with some other clients and he knows you who can code this traversal and print the traversal in the single line.

Can you print the traversal?


Input
The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.

The first line of each test case contains two integers n and m (1 ≤ n,m ≤ 100) — The dimensions of the matrix A.

The next n lines of each test case contain m integers (1 ≤ Aij ≤ 1000) - The input matrix A.


Output
For each test case, print the answer: The traversal required.


Sample Input 1 

2
3 3
1 2 3
4 5 6
7 8 9
4 3
1 2 3
4 5 6
7 8 9
10 11 12
Sample Output 1

1 4 7 8 9 2 5 6 3 
1 4 7 10 11 12 2 5 8 9 3 6 */
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        for(int n = 0; n<t; n++){
            int row=sc.nextInt();
            int col=sc.nextInt();
            int arr[][]=new int[row][col];
            for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            arr[i][j]=sc.nextInt();}}
            int mr=0;
            int mc=0;
            int mxr=arr.length-1;
            int mxc=arr[0].length-1;
            int tl=row*col;
            int count=0;
            while(count<tl){
            for(int i=mr,j=mc;i<=mxr;i++){
            System.out.print(arr[i][j]+" ");
            count++;}
            mc++;
            for(int i=mxr,j=mc;j<=mxc;j++){
            System.out.print(arr[i][j]+" ");
            count++;
                 }
             mxr--;
             }
            System.out.println();
        }
    }
}
