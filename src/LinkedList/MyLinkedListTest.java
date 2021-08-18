package LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList= new MyLinkedList<Integer>(1);
        linkedList.add(1,1);
        linkedList.add(2,2);
        linkedList.add(1,3);
        linkedList.add(2,4);
        System.out.println(linkedList.size());




    }
}
