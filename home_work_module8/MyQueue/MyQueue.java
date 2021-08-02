package home_work_module8.MyQueue;

public class MyQueue<T> {
    private static int[] queueArray;
    private static int maxSize;
    private static int frontElement;
    private static int rearElement;

    public MyQueue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        rearElement = 0;
        frontElement = 0;
    }

    static void add(int data) {
        if (maxSize == rearElement) {
            System.out.println("The Queue if  full now");
        } else {
            queueArray[rearElement] = data;
            System.out.println(data + " was added to Queue!");
            rearElement++;
        }
    }

    static void remove() {
        if (frontElement == rearElement) {
            System.out.println("The Queue is empty");
        } else {
            for (int i = 0; i < rearElement - 1; i++) {
                queueArray[i] = queueArray[i + 1];
            }
            if (rearElement < maxSize)
                queueArray[rearElement] = 0;
            rearElement--;
            System.out.println("Removing of element was complete!");
        }
    }

    static void removeIndex(int index) {
        if (frontElement == rearElement) {
            System.out.println("The Queue is empty");
        }
        if (index > maxSize) {
            System.out.println("There is no this index in the Queue!");
        } else {
            System.out.printf("\nThe element under this %d index was deleted!\n", index);
            for (int i = 0, k = 0; i < queueArray.length; i++) {
                if (i != index) {
                    queueArray[k++] = queueArray[i];
                }
            }
            if (rearElement < maxSize) {
                queueArray[rearElement] = 0;
                rearElement--;
            }
        }
    }

    public void peek() {
        if (frontElement == rearElement) {
            System.out.println("The Queue is empty");
        }
        System.out.printf("\nFor now the front element is %d.\n", queueArray[frontElement]);
    }

    public void poll() {
        if (frontElement == rearElement) {
            System.out.println("The Queue is empty");
        }
        int temp = queueArray[frontElement];
        System.out.printf("\nFor now the front element is %d, and let's delete it! \n", temp);
        for (int i = 0; i < rearElement; i++) {
            queueArray[i] = queueArray[i + 1];
        }
        if (rearElement < maxSize) {
            queueArray[rearElement] = 0;
            rearElement--;
        }
    }

    public void clear() {
        while (frontElement != rearElement) {
            for (int i = 0; i < rearElement - 1; i++) {
                queueArray[i] = queueArray[i + 1];
            }
            if (rearElement < maxSize) {
                queueArray[rearElement] = 0;
                rearElement--;
            }
        }
        System.out.println("The queue was clear!!!");
    }

    public void size() {
        int counter = 0;
        if (frontElement == rearElement) {
            System.out.println("The Queue is empty");
        }
        for (int i = 0; i < rearElement; i++) {
            if (queueArray[i] != 0) {
                counter++;
                System.out.printf("%d <-- ", queueArray[i]);
            }
        }
        System.out.println("\nTotal size of queue is : " + counter + " elements");
    }
}


