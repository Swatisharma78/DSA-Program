/*Description

Now that you have learnt about geometric progression in Masai School pre-course, we hope you remember about the sum of a geometric series:

Assume, you are given

S = 1 + (1/r) + (1/r^2) + (1/r^3) +... (1/r^n)

You will be given two integers n and r

Your task is to calculate the sum S by writing a recursive function

Using iterative approach or formula to calculate the sum can lead to disqualification directly


Input
Input Format

First line of input contains space separated numbers n and r respectively

Constraints

n <= 1000

r <= 10


Output
Output till 4 places after the decimal. For instance, 12.1345 is a valid answer but 12.43138 is not. 12.0000 is also a valid answer


Sample Input 1 

1 1
Sample Output 1

2.0000
Sample Input 2 

3 5
Sample Output 2

1.2480*/
// function runProgram(input) {
//     var [n, r] = input.split(" ").map(Number);
//     console.log(rec(n, r, 0).toFixed(4));
// }
// function rec(n, r, i) {
//     if (i > n) {
//         return 0;
//     } 
//     else {
//         return Math.pow(1 / r, i) + rec(n, r, i + 1);
//     }
// }

// if (process.env.USER === "Talib") {
//     runProgram(``);
// } else {
//     process.stdin.resume();
//     process.stdin.setEncoding("ascii");
//     let read = "";
//     process.stdin.on("data", function (input) {
//         read += input;
//     });
//     process.stdin.on("end", function () {
//         read = read.replace(/\n$/, "");
//         read = read.replace(/\n$/, "");
//         runProgram(read);
//     });
//     process.on("SIGINT", function () {
//         read = read.replace(/\n$/, "");
//         runProgram(read);
//         process.exit(0);
//     });
// }
import java.util.*;
class Main{
    public static double solve ( double n , double r){
        if ( r== 0){
            return 1 ;
        }
        return ( 1/Math.pow(n,r)) + solve (n,r-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        double n = sc.nextInt();
        double r= sc.nextInt();
        double ans = solve(r,n);
        System.out.printf("%.4f", ans);
    }
}

