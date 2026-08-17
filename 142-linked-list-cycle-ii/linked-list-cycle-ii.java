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
    public ListNode detectCycle(ListNode head) {
     Set<ListNode> hm=new HashSet<>();
    
     ListNode temp=head;
     while(temp!=null){
        
       
        if(hm.contains(temp)){
            return temp;
        }
        hm.add(temp);
       
        temp=temp.next;
        

     }  
     return null; 
    }
}