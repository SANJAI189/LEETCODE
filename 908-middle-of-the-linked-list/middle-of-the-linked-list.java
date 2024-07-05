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

 //Thawfeek logic 
class Solution {
    public ListNode middleNode(ListNode head) {
        //count the number of elements in the linked list
        // Divide the count by 2 and traverse the mid node that much time.

        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        count = count/2;
        ListNode mid = head;
        for(int i=0;i<count;i++){
            mid = mid.next;
        }
        return mid;
    }
}