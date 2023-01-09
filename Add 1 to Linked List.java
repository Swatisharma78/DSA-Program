/*Description

A number is given represented in the form of a linked list. Add one to it.


Input
This is a function complete problem. You don't have to take the input just complete the function given.

The sample test case is given only for your understanding.


Output
Return head of linked list which is the new number after incrementing one.


Sample Input 1 

4
2 3 1 3
Sample Output 1

2314
*/
class Solution{
  public Node addOneToLinkedList(Node head){ 
      // Reverse linked list 
      head = reverse (head) ; 
      // Add one from left to right of reversed 
      // list 
      head  = addOneUtil(head);
      //Reverse the nodified list
      return reverse(head); 
      } 
  static Node reverse(Node head){ 
      Node prev = null; 
      Node current = head; 
      Node next = null; 
      while (current != null){ 
        next = current.next; 
        current.next = prev; 
        prev = current; 
        current = next; 
      } 
      return prev; 
  }
     static Node addOneUtil (Node head){ 
    // res is head node of the resultant list 
    Node res = head; 
    Node temp = null, prev = null; 
    int carry = 1, sum; 
    while (head != null) // while both lists exist
    { 
    // Calculate value of next digit in resultant 
    // list. The next digit is sum of following 
    // things (1) Carry (11) Next digit of head list
    // (if there is a next digit) 
    sum = carry + head.data; 
    // update carry for next calculation 
    carry = (sum >= 10) ? 1 : 0; 
    // update sun if it is greater than 18 
    sum = sum % 10; 
    // Create a new node with sun as data 
    head.data = sum; 
    // Move head and second pointers to next nodes 
    temp = head; 
    head = head.next; 
      } 
    // if some carry is still there , add a new node to 
    // result list. 
    if (carry > 0) 
    temp.next = newNode(carry); 
    // return head of the resultant list 
    return res ; 
     } 
     static Node newNode(int data){
         
     Node new_node = new Node(data); 
     new_node.data = data; 
     new_node.next = null; 
     return new_node; 
        }
     }

// const LinkedListNode = class {
//     constructor(nodeData) {
//         this.data = nodeData;
//         this.next = null;
//     }
// };
// var addOneToLinkedList = function(head) {
//     let revHead = reverseLL(head);
//     let carry = 1;
//     let curr =revHead;
//     while(carry > 0 && curr!== null){
//         let currData = curr.data;
//         curr.data = (currData + carry)%10;
//         carry = parseInt((currData + carry)/10);
//         curr= curr.next;
//     }
//     let newHead = reverseLL(revHead);
//     if(carry > 0){
//         let newNode = new LinkedListNode(carry);
//         newNode.next = newHead;
//         newHead = newNode;
//     }
//     return newHead;
// };
// function reverseLL(head){
//     let curr = head;
//     let prev = null;
//     let next = null;
//     while(curr!==null){
//         next = curr.next;
//         curr.next = prev;
//         prev = curr;
//         curr = next;
//     }
//     head = prev;
//     return head;
// }
