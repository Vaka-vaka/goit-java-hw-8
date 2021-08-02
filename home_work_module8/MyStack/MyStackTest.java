package home_work_module8.MyStack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push("Test 0");
        myStack.push("Test 1");
        myStack.push("Test 2");
        myStack.push("Test 3");
        myStack.push("Test 4");
        myStack.push("Test 5");
        myStack.push("Test 6");
        myStack.push("Test 7");
        myStack.push("Test 8");

        System.out.println(myStack);
        System.out.println(myStack.size());

        myStack.remove(0);
        System.out.println(myStack);
        System.out.println(myStack.size());

        myStack.peek();

        myStack.pop();

        myStack.clear();
        System.out.println(myStack.size());

        for (int i = 0; i < 5; i++) {
            myStack.push("Test " + i);
        }

        System.out.println(myStack);





    }
}
