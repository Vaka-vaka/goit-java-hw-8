package home_work_module8.MyQueue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(10);

        MyQueue.add(22);
        MyQueue.add(25);
        MyQueue.add(556);
        MyQueue.add(5);

        myQueue.size();

        MyQueue.removeIndex(1);
        myQueue.size();

        MyQueue.remove();
        myQueue.size();

        myQueue.peek();
        myQueue.size();

        myQueue.poll();
        myQueue.size();

        myQueue.clear();
        myQueue.size();

    }
}
