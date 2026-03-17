
public class UsingCustomLinkedList  {
    public static void main(String[] args){
        CustomLinkedList list=new CustomLinkedList();
        list.insertFirst(54);
         list.insertFirst(45);
         list.insertLast(3);
          list.display();
         list.deleteFirst();
        list.display();
    }
}
