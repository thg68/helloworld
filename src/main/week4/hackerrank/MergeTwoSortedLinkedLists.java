
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2){
        SinglyLinkedListNode head=null;
        if(head1==null)head=head2;
        if(head2==null)head=head1;

        if(head1!=null&&head2!=null){
            if(head1.data<head2.data){
                head=head1;
                head.next=mergeLists(head1.next,head2);
            }
            else{
                head=head2;
                head.next=mergeLists(head1,head2.next);
            }
        }

        return head;
    }