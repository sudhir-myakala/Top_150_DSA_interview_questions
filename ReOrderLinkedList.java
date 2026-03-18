public class ReOrderLinkedList{
    public static void main(String [] args){
        /*
        step 1: first find the middle element for that we should use the slow and fast approach

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        }

        step 2: split and reverse second half 

        ListNode second=slow.next;
        slow.next=null;
        ListNode prev=null;

        while(slow!=null){
        ListNode nextNode=second.next;
        second.next=prev;
        prev=second;
        second=nextNode;

        }

        step 3: Merge two halves

        ListNode left=head;
        ListNode right=prev;

        while(right!=null){
        ListNode nextL=left.next;
        ListNode nextR=right.next;

        left.next=right;
        right.next=nextL;

        left=nextL;
        right=nextR
        }
        
        */
    }
}