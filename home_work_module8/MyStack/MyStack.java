package home_work_module8.MyStack;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Objects;

public class MyStack<T> {
    private T[] array;
    private static final int INPUT_SIZE = 10;
    private int size;

    public MyStack() {
        this.array = (T[]) new Object[INPUT_SIZE];
        this.size = 0;
    }

    public void increaseCapacity() {
        array = Arrays.copyOf(array, (size * 3 / 2 + 1));
    }

    public void push(Object value) {
        if (size == array.length) {
            increaseCapacity();
        }
        array[size] = (T) value;
        size++;
    }

    public T remove(int index) {
        Objects.checkIndex(index, size);
        T element = array[index];
        array[index] = null;
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return element;
    }

    public void clear() {
        Arrays.fill(array, null);
        size = 0;
        System.out.println("Stack was cleared!");
    }

    public int size() {
        return size;
    }

    public void peek() {
        if (size == 0) {
            throw new EmptyStackException();
        } else {
            T peek = array[size - 1];
            System.out.println("The first element of Stack is : " + peek);
        }
    }

    public void pop() {
        if (size == 0) {
            throw new EmptyStackException();
        } else {
            System.out.println("The first element of Stack is : " + array[size - 1]);
            remove(size - 1);
        }
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}
