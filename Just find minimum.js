/*Description

You are given N which is the number of different types of operation you need to perform on a stack. There are 3 different types of operations:

PUSH V: Here V is an integer which you need to push in the stack

POP: Here POP out the top element from stack. (In case stack is empty print "EMPTY")

MIN: Print the minimum value present in the stack


Input
Input Format

First line contains N which is the number of operations you need to perform on stack

Next N line contains one of the 3 operations mentioned above

Constraints

N < 1000000

V < 100




Output
Output Format

The output consists of a line containing an integer with the smallest present value in the stack for queries of type "MIN" or "EMPTY" for "MIN" and "POP" operations when the stack is empty.


Sample Input 1 

11
PUSH 5
PUSH 7
PUSH 3
PUSH 8
PUSH 10
MIN
POP
POP
MIN
POP
MIN
Sample Output 1

3
3
5*/
function runProgram(input){
    var input_array = input.trim().split("\n")
    input_array.shift()
    var array = input_array.map((item) => item.split(" "))
    var stack = []
    var min_stack = []

    for(var i = 0; i < array.length; i++){
        if(array[i][0] == "PUSH"){
            stack.push(Number(array[i][1]))
            if(min_stack.length === 0){
                min_stack.push(Number(array[i][1]))
            }
            else if(min_stack[min_stack.length -1] > Number(array[i][1])){
                min_stack.push(Number(array[i][1]))
            }
            else{
                min_stack.push(min_stack[min_stack.length-1])
            }
        }
        else if(array[i][0] == "POP"){
            if(stack.length > 0){
                stack.pop()
                min_stack.pop()
            }
            else{
                console.log("EMPTY")
            }
            
        }
        else{
            if(min_stack.length > 0){
                console.log(min_stack[min_stack.length - 1])
            }
            else{
                console.log("EMPTY")
            }
        }
    }
}
process.stdin.resume();
process.stdin.setEncoding("ascii");
let read = "";
process.stdin.on("data", function (input) {
    read += input;
});
process.stdin.on("end", function () {
    read = read.replace(/\n$/,"")
   runProgram(read);
});
process.on("SIGINT", function () {
    read = read.replace(/\n$/,"")
    runProgram(read);
    process.exit(0);
});
