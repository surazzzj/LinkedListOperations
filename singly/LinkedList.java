public class LinkedList {

    Node head = null;

    // Insert at beginning
    public void insertAtBeginning(int item) {
        Node newNode = new Node(item);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    // Insert at last
    public void insertAtLast(int item) {
        Node newNode = new Node(item);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;

    }

    // Insert at specific position
    public void insertAtPosition(int item, int position) {

        // new node created to insert
        Node newNode = new Node(item);

        // to check invalid position
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }

        // check position == 0
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // move to before the specific position
        Node temp = head;
        int index = 0;
        while (temp.next != null) {
            if (index == position - 1)
                break;

            temp = temp.next;
            index++;

        }

        if (temp.next == null) {
            System.out.println("Position out of bound !");
            return;
        }

        // insert
        newNode.next = temp.next;
        temp.next = newNode;

    }

    // Print data
    public void printData() {
        if (head == null) {
            System.out.println("LinkedList is empty !");
            return;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.next == null)
                System.out.print(temp.data);
            else
                System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        // System.out.println();
    }

    // Delete from beginning
    public void deleteFirst() {
        if (head == null)
            System.out.println("List is empty!, no node to delete");
        head = head.next;
    }

    // Delete from last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!, no node to delete");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;

        temp.next = null;
    }

    // Delete from specific position
    public void deleteFromPosition(int position) {
        if (head == null) {
            System.out.println("List is empty!, no node to delete");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            System.out.println("Position is out of bound!");
            return;
        }

        temp.next = temp.next.next;

    }

}
