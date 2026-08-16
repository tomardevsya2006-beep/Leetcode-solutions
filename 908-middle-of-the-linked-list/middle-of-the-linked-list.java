/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
    int l=Length(head);
    int mid=l/2;
    int current=0;
    ListNode temp=head;
     while(current!=mid){
        
        temp=temp.next;
        current++;
     }  
     return temp;
    }
    private static int Length(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
       return count;
       
    }
}