public class RemoveNNodeFromEnd {
    public static void main(String [] args){
        /*

        if(head.next==null) return null;
        ListNode temp=head;
        int c=0;

        while(temp!=null){
            temp=temp.next;
            c++;
        }

        if(c==n){
        return head.next;
        }

        temp=head;
        while(temp!=null && temp.next!=null){
        if(c-1 == n){
        temp.next=temp.next.temp;
        }
        else{
            temp=temp.next;
        }
            c--;
        }

        return head;

        the above is not a optimized approach you can go with fast and slow pointer approach


        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode s=dummy;
        ListNode f=dummy;

        for(int i=0;i<n;i++){
        f=f.next;
        }

        while(f.next!=null){
        s=s.next;
        f=f.next;
        }

        s.next=s.next.next;

        return dummy.next;
        */
    }
}
