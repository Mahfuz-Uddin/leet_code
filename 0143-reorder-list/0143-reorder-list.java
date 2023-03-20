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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode middleNode = getMiddleOfList(slow, fast);
        ListNode startOfSecondHalf = reverseList(middleNode);

        while(slow != null && startOfSecondHalf !=null){
            ListNode temp = slow.next;
            slow.next= startOfSecondHalf;
            slow = temp;
            temp=startOfSecondHalf.next;
            startOfSecondHalf.next= slow;
            startOfSecondHalf = temp;
        }
        if(slow !=null){
            slow.next = null;
        }

        
    }

    ListNode reverseList (ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode tempNext= head;
        while(curr!=null){
            tempNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNext;
        }
        return prev;

    }
    
    ListNode getMiddleOfList(ListNode slow, ListNode fast){
        while( fast!=null&& fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow; 
    }
}