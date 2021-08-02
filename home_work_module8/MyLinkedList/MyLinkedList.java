package home_work_module8.MyLinkedList;

import home_work_module8.Interfesa.MyList;

import java.util.Iterator;
import java.util.Objects;

public class MyLinkedList<T> implements MyList<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;

    public static<T> MyList<T> of(T... t){
        MyLinkedList<T> myLinkedList = new MyLinkedList<>();
        for (T e: t) {
            myLinkedList.add(e);
        }
        return myLinkedList;
    }

    @Override
    public void add(T t) {
        Node<T> newNode = new Node<>(t);
        if(size == 0){
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        Objects.checkIndex(index, size);
        T removedElevent;
        if(index == 0){
            removedElevent = first.t;
            first = first.next;
            if(first == null){
                last = null;
            }
        }else {
            Node<T> prev = getNodeByIndex(index - 1);
            removedElevent = prev.next.t;
            prev.next = prev.next.next;
        if (index == size - 1){
            last = prev;
        }
    }
            size--;
    }

    private Node<T> getNodeByIndex(int index) {
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        return getNodeByIndex(index).t;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        first = last = null;
        size = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
