public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        // Write your code here
        if (position == 0) {
            SinglyLinkedListNode tmphead = llist;
            llist = llist.next;
            tmphead = null;
            return llist;
        }

        SinglyLinkedListNode head = llist;
        int count = 1;
        while (count < position) {
            llist = llist.next;
            count++;
        }

        SinglyLinkedListNode tmp = llist.next;
        llist.next = tmp.next;
        tmp = null;
        return head;
}