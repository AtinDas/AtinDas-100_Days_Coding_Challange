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
       if (head == null || head.next == null) {
            return;
        }
        ListNode mid = findMid(head);
        ListNode head2 = reverse(mid.next);
        mid.next = null;
        merge(head, head2);
    }
    private ListNode merge(ListNode head1, ListNode head2) {
        ListNode fakeHead = new ListNode(-1);
        ListNode node = fakeHead;
        while (head1 != null && head2 != null) {
            node.next = head1;
            head1 = head1.next;
            node.next.next = head2;
            head2 = head2.next;
            node = node.next.next;
        }
        if (head1 != null) {
            node.next = head1;
        }
        if (head2 != null) {
            node.next = head2;
        }
        return fakeHead.next;
    }
    private ListNode reverse(ListNode head) {
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode node = head;
        ListNode next = null;
        while(node != null) {
            next = node.next;
            node.next = fakeHead.next;
            fakeHead.next = node;
            node = next;
        }
        head.next = null;
        return fakeHead.next;
    }
    private ListNode findMid(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow; 
    }
}