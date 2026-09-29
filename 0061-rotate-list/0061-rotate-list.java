class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0 || head.next == null) return head;

        int size = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            size++;
        }

        k = k % size;
        if (k == 0) return head;

        ListNode newTail = head;
        for (int i = 0; i < size - k - 1; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;

        newTail.next = null;
        tail.next = head;

        return newHead;
    }
}
