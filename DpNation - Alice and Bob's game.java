/*
Description

Alice and Bob take turns playing a cool mathematical game. Alice moves first.

Initially, there is a numberNon the chalkboard.  On each player's turn, that player makes amoveconsisting of:

Choosing anyxwith0 < x < NandN % x == 0.
Replacing the numberNon the chalkboard withN - x.
If player cannot make a move, they lose the game.

return true or false depending on whether alice wins or loses.


Input
1<=T<=10

1<=N<=1000


Output
output true or false depending on alice's win.


Sample Input 1 

2
3
2
Sample Output 1

false
true*/
import java.util.*;
class Main {
    public static int help (int n , int[] dp){ 
        if (n==1){
            return 0; 
        } 
        if (dp[n]!=-1 ){ 
            return dp[n]; 
        }
        for(int i=1; i<n; i++){
         if (n%i==0){ 
            int otherGuy=help(n-i,dp); 
            if (otherGuy == 0){ 
                dp[n]=1;
                return 1; 
            } 
        } 
    }
     dp[n]=0;
     return 0; 
  } 
public static void main(String [] args){ 
    Scanner sc = new Scanner(System.in); 
    int t = sc.nextInt(); 
    while (t--!= 0){
        int n = sc.nextInt();
        if (n%2 == 1){ 
            System.out.println("false"); 
        }else{
            System.out.println("true");
          }
       }
    }
  }

//  import java.util.*;
//   class Main{  
//  public static void main(String [] args){ 
//      Scanner s = new Scanner(System.in); 
//      int tc = s.nextInt(); 
//      while (tc -->0){ 
//     int n = s.nextInt(); 
//     if ( n % 2 == 0){ 
//     System.out.println(true); 
//     }else{
//     System.out.println (false); 
//          }
//       }
//   }
//  }
