package home_work_module8.MyLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add("Test 0");
        myLinkedList.add("Test 1");
        myLinkedList.add("Test 2");
        myLinkedList.add(5);
        myLinkedList.add(10);
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println("Add to the list : " + myLinkedList.get(i));
        }
        System.out.println("Length of the list : " + myLinkedList.size());

        myLinkedList.remove(0);
        System.out.println("Length of the list missing Index 0 : " + myLinkedList.size());
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println("In the list : " + myLinkedList.get(i));
        }
        myLinkedList.clear();
        System.out.println("Length of the list : " + myLinkedList.size());


    }
}
