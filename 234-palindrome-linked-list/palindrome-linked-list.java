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
    public boolean isPalindrome(ListNode head) {
        List<Integer> li = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            li.add(temp.val);
            temp = temp.next;
        }
        int i =0 ,j = li.size()-1;
        while(i<j){
            if(li.get(i)==li.get(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}