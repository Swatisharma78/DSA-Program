/*
Description

Complete the function of push and pop and top for a stack, queue object names are Q1 and Q2.

Expected Time complexity is O(N) for push and O(1) for pop and top.


Input
This is a function complete problem. You just have to complete the function. The input format given below is just for your understanding.

The first line of the input contains Q, the number of queries to be executed.

Each query X is of type X = 0, X = 1 or X = 2.

Query X = 0 indicates, an element Y to be pushed into the stack.

Query X = 2 indicates, an element to be popped off the stack.

Query X = 1 indicates, an element to be peeked from the stack.


Output
For each query of type X = 1, print the value at the front of the queue.


Sample Input 1 

6
0 1
0 2
0 3
1 
2
1
Sample Output 1

3
2
*/
// import java.util.LinkedList;
// import java.util.Queue;
// class Solution{ 
//     Queue<Integer> queue1 = new LinkedList<>();
//     Queue<Integer> queue2 = new LinkedList<>();
//     public void push(int data){
//          queue2.add(data);
//         while (!queue1.isEmpty()) queue2.add(queue1.poll());
//         while (!queue2.isEmpty()) queue1.add(queue2.poll());
//     }
//     public void pop(){
//         if (!queue1.isEmpty()) queue1.poll();
//         else ;
//     }
//     public int top(){
//         if (!queue1.isEmpty()) return queue1.peek();
//         else return -1;
//     }
// }
class Solution{ 
    Queue<Integer> queue = new LinkedList<>();
    public void push(int data){
         queue.add(data);
        for ( int i=0; i<queue.size()-1;i++){
            queue.add(queue.poll());
        }
    }
    public void pop(){
        queue.poll();
    }
    public int top(){
         return queue.peek();
    }
}
