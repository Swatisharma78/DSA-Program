/*Description

Given an array A having N positive integers. Count the number of non-empty subsets of array A such that each subset has at least K odd numbers.


Input
First line: Single integer denoting the value of T - the number of test cases.

For each test case:

First line: Two single space-separated integers denoting the values of N and K.

Next line: N single space-separated integers denoting the elements of array A.

Constraints:

1 <= T <= 100

1 <= N, K <= 15

1 <= A[ i ] <= 100


Output
For each test case, print in a new line, a single integer denoting the required count of subsets.


Sample Input 1 

2
4 2
4 3 2 1
2 1
2 3
Sample Output 1

4
2
Hint

Given test cases:

Test case 1:

N = 4, K = 2, A: [ 4, 3, 2, 1 ].
Subsets which has at least two odd numbers are:
{ 4,3,2,1 }, { 3, 2, 1 }, { 3, 1 },{4, 3, 1}.
Test case 2:

N = 2, A: [ 2, 3 ].
Subsetswhich has at least one odd number are:
{3}, {2, 3}.*/
function runProgram(inp){
   inp=inp.trim().split("\n");
   let t=+inp[0],j=1;
   for(let i=0;i<t;i++){
       let [n,k]=inp[j++].split(" ").map(Number);
       let ele=inp[j++].split(" ").map(Number);
       bucket=[],count=0;
       solv(n,k,ele,0);
       console.log(count);
   }
}
let bucket=[],count=0;
function solv(n,k,ele,ind){
    if(bucket.length>=k){
        let c=0;
        for(let i=0;i<bucket.length;i++){
            if(bucket[i]%2!=0) c++;
        }
        if(c>=k) count++;
    }
    
    if(ind==n) return;
    
    for(let i=ind;i<n;i++){
        bucket.push(ele[i]);
        solv(n,k,ele,i+1);
        bucket.pop();
    }
}

  if (process.env.USERNAME === "") {
      runProgram(``);
  } else {
    process.stdin.resume();
    process.stdin.setEncoding("ascii");
    let read = "";
    process.stdin.on("data", function (input) {
      read += input;
    });
    process.stdin.on("end", function () {
      read = read.replace(/\n$/, "");
      read = read.replace(/\n$/, "");
      runProgram(read);
    });
    process.on("SIGINT", function () {
      read = read.replace(/\n$/, "");
      runProgram(read);
      process.exit(0) ;
    });
  }
// var ans = 0;
// function kEvenSub(K, arr, curr, newArr) {
//     if (newArr.length > 0) {
//         var count = 0;
//         for (var j = 0; j < newArr.length; j++) {
//             if (newArr[j] % 2!== 0) {
//                 count++;
//             }
//         }
//         if (count >= K) {
//             ans++;
//         }
//     }
//     if (curr == arr.length) {
//         return;
//     }
//     for (var i = curr; i < arr.length; i++) {
//         newArr.push(arr[i]);
//         kEvenSub(K, arr, i + 1, newArr);
//         newArr.pop();
//     }
// }
// function runProgram(input) {
//   var input = input.trim().split("\n");
//   var testCases = +input[0];
//   var line = 1;
//   for(var i = 0; i < testCases; i++){
//       var curr = 0;
//       var newArr = [];
//       ans = 0;
//         var arr1 = input[line].trim().split(" ").map(Number);
//         line++;
//       var arr = input[line].trim().split(" ").map(Number);
//       line++;
//       var K = +arr1[1];
//       kEvenSub(K,arr,curr,newArr);
//       console.log(ans);
//      }
