public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CustomLinkedList(){
        this.size=0;
    }
    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
        
    }

    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;
    }

    public void deleteFirst(){
        int value=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        System.out.println("the value of the delete first node is "+ value);
    }

    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public void deleteLast(){
        if(size<=1){
             deleteFirst();
             return;
        }
        Node secondLast=get(size-1);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        System.out.println(val);

    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+ " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }

}
