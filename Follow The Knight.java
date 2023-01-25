/*Description

You are very good at playing chess since childhood and you knew the rules very much. You have a  10 X 10 chessboard and you want to explore all the possible squares on the board that the knight can be at in exactly N moves.It is placed at (i,j) coordinate initially. For a 10X10 chessboard (1,1) will be the top left corner and (10,10) will be the bottom right corner.

You can refer the following diagram, the knight can move to any of the squares marked as X in 1 move.

Image


Input
Input Format

Input will consist of three space seperated integers i,j and N

Constraints

N < 10


Output
Print a single integer denoting the number of blocks on the chessboard that the knight can be at in exactly N moves.


Sample Input 1 

3 3 1
Sample Output 1

8
*/
import java.io.*;
import java.lang.*;
import java.util.*;
 public class Main{
    static int [][] board = new int[10][10];
    public static void TheKnight (int [][] board, int x, int y, int n){
        if(x < 0 || x > 9 || y < 0 || y > 9) return ;
        if ( n==0 ){
            board [x][y] = 1;
            return ;
        }
         TheKnight (board , x-1, y+2, n-1);
         TheKnight (board , x-1, y-2, n-1); 
         TheKnight (board , x+1, y+2, n-1);
         TheKnight (board , x+1, y-2, n-1);
         TheKnight (board , x+2, y+1, n-1);
         TheKnight (board , x+2, y-1, n-1);
         TheKnight (board , x-2, y+1, n-1);
         TheKnight (board , x-2, y-1, n-1);
   }
   public static int count(){
       int count = 0;
       for ( int i = 0; i < 10; i++){
          for ( int j = 0; j < 10; j++) if (board[i][j] == 1) count++;}
          return count;
       }
       public static void main ( String [] args){
           Scanner sc = new Scanner(System.in);
           int x = sc.nextInt()-1;
           int y = sc.nextInt()-1;
           int n = sc.nextInt();
            TheKnight ( board ,x,y,n);
           System.out.println(count());
       }
   }
