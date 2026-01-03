public class Main{
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtBeginning(12);
        linkedList.insertAtLast(13);
        linkedList.insertAtLast(908);
        linkedList.insertAtLast(1232);
        linkedList.insertAtPosition(10, 2);
        linkedList.insertAtBeginning(111);
        linkedList.insertAtBeginning(23);
        linkedList.insertAtBeginning(45);
        linkedList.insertAtLast(33);
        linkedList.insertAtLast(43);
        linkedList.printData();
    }
}