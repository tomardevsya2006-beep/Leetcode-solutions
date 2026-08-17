/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
    //   Map<ListNode,Integer> hm=new HashMap<>();
    //   ListNode temp=head;
    //   if(head==null){
    //     return false;
    //   }
    //   if(temp.next==null || temp.next.next==null ){
    //     return false;
    //   }
    //   while(temp!=null){
    //     if(hm.containsKey(temp)){
    //         return true;
    //     }
    //     hm.put(temp,1);
    //   }
    //   return false;

    ListNode slow=head;
    ListNode fast=head;
    while( fast!=null && fast.next!=null ){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            return true;
        }
    }
    return false;
    }
}