/*Description

Delete the node at a given position in a linked list and return a reference to the head node. The head is at position 0. The list may be empty after you delete the node. In that case, return a null value.

Complete thedeleteNodefunction in the editor below.

deleteNodehas the following parameters:
-LinkedListNode pointer list:a reference to the head node in the list
-int position:the position of the node to remove


Input
The first line of input contains an integer n, the number of elements in the linked list.

Each of the next n linescontains an integer, the node data values in order.

The last line contains an integer,the position of the node to delete.

n <= 1000

list[i] <= 1000


Output
Print the updated Linked List


Sample Input 1 

8
20
6
2
19
7
4
15
9
3
Sample Output 1

20 6 2 7 4 15 9*/
/*
class Node{
  int data;
  Node next;
  
  public Node(int data,Node next){
    this.data = data;
    this.next = next;
  }
  public Node(int data){
    this.data = data;
    this.next = null;
  }
  public Node(){
    this.data = 0;
    this.next = null;
  }
}
*/
class Solution{
  public static Node deleteNode(Node a,int pos){
    if (pos == 0) return a.next;
    Node temp = a;
    while(pos-->1){
        temp = temp.next;
    }
    Node x = temp.next.next;
    temp.next = x;
    return a;
  }
}
// class Solution{
//   public static Node deleteNode(Node a,int pos){
//     //write your code here.
//     Node temp=a;
    
//     if(pos==0) { 
//       temp=temp.next;
//       return null;
//     }
    
//     int count=0;
//     while(temp!=null && count<pos-1){
//       temp=temp.next;
//       count++;
//     }
    
//     if(temp==null) return null;
//     if(temp.next==null) return null;
//     Node tail=temp.next.next;
//     temp.next=tail;
//     return a;
//   }
// }
