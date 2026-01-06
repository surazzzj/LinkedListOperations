import java.util.Scanner;

public class Main {

    public static void printMenu() {
        System.out.println("********MENU********");
        System.out.println("ENTER 1 TO INSERT");
        System.out.println("ENTER 2 TO DELETE");
        System.out.println("ENTER 3 TO SEARCH");
        System.out.println("ENTER 4 TO DISPLAY");
          System.out.println("ENTER 5 TO EXIT");
        System.out.println("Enter your choice?");
        System.out.println("********************");
    }

    public static void printInsertMenu() {
        System.out.println("Press 1 to insert from HEAD");
        System.out.println("Press 2 to insert from TAIL");
        System.out.println("Press 3 to insert at specific Position");
    }

    public static void printDeleteMenu() {
        System.out.println("Press 1 to delete from HEAD");
        System.out.println("Press 2 to delete from TAIL");
        System.out.println("Press 3 to delete from specific Position");
    }

    public static void main(String[] args) {
        // LinkedList linkedList = new LinkedList();
        // linkedList.insertAtBeginning(12);
        // linkedList.insertAtLast(13);
        // linkedList.insertAtLast(908);
        // linkedList.insertAtLast(1232);
        // linkedList.insertAtPosition(10, 2);
        // linkedList.insertAtBeginning(111);
        // linkedList.insertAtBeginning(23);
        // linkedList.insertAtBeginning(45);
        // linkedList.insertAtLast(33);
        // linkedList.insertAtLast(43);
        // linkedList.printData();

        System.out.println("*************** Welcome to LinkedList App *************");
        // data structure implement

        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {

                printMenu();
                // read the choice
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> {
                        // insert op
                        insertLinkedList(linkedList);
                        // int insertChoice = scanner.nextInt();
                    }

                    case 2 -> // delete op
                        deleteFromLinkedList(linkedList);

                    case 3 -> {
                        // search op
                        System.out.println("Enter the data you want to search ?");
                        int data = scanner.nextInt();
                        boolean result = linkedList.searchData(data);
                        if (result) {
                            System.out.println("Yes, data is present in list");
                        } else {
                            System.out.println("Data is not present in list");
                        }
                    }

                    case 4 -> // exit
                        System.out.println("Thank you for using App..");

                    default -> System.out.println("Invalid Choice !");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void insertLinkedList(LinkedList linkedList) {

        printInsertMenu();

        System.out.println("Enter choice ?");
        Scanner scanner = new Scanner(System.in);
        int insertChoice = scanner.nextInt();
        switch (insertChoice) {
            case 1 ->                 {
                    System.out.println("Enter your data:");
                    int data = scanner.nextInt();
                    linkedList.insertAtBeginning(data);
                    System.out.println("Success...!");
                }
            case 2 ->                 {
                    System.out.println("Enter your data:");
                    int data = scanner.nextInt();
                    linkedList.insertAtEnd(data);
                    System.out.println("Success...!");
                }
            case 3 ->                 {
                    System.out.println("Enter position:");
                    int position = scanner.nextInt();
                    System.out.println("Enter data:");
                    int data = scanner.nextInt();
                    linkedList.insertAtPosition(data, position);
                    System.out.println("Success...!");
                }
            default -> System.out.println("Invalid Choice...!");
        }

    }

    private static void deleteFromLinkedList(LinkedList linkedList) {
        printDeleteMenu();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter delete choice ?");
        int deleteChoice = scanner.nextInt();
        switch (deleteChoice) {
            case 1 -> {
                linkedList.deleteFirst();
                System.out.println("Deleted...!");
            }
            case 2 -> {
                linkedList.deleteLast();
                System.out.println("Deleted...!");
            }
            case 3 -> {
                System.out.println("Enter the position:");
                int position = scanner.nextInt();
                linkedList.deleteFromPosition(position);
                System.out.println("Deleted...!");
            }
            default -> System.out.println("Invalid Delete Choice");
        }
    }
}