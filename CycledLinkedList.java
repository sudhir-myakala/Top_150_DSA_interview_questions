public class  CycledLinkedList{
    public static void main(String [] args){
        /*
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;

        if(slow== fast) return true;
        }

        return false;
        */


        /* rules to follow while using this algorithm (slow and fast approach ) 

        This algorithm called  Floyd’s Cycle Detection Algorithm (Tortoise & Hare).

         Rule 1: Compare nodes, not values
         example:
         slow == fast   // correct
        slow.val == fast.val  // wrong  

         Rule 2: Always protect fast pointer ( not void the null pointer exceptions)
        example :
        while (fast != null && fast.next != null)

        Rule 3: Understand WHY it works
         ** fast pointer move fast, so they met inside te cycle 

        */
    }
}