package home_work_module8.MyArrayList;

import home_work_module8.Interfesa.MyList;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {

    private T[] values;

    public MyArrayList() {
        values = (T[]) new Object[0];
    }

    @Override
    public void add(T t) {
       try {
           T[] temp = values;
           values = (T[]) new Object[temp.length + 1];
           System.arraycopy(temp, 0, values,0,temp.length);
           values[values.length - 1] = t;
       } catch (ClassCastException ex){
           ex.printStackTrace();
       }
    }

    @Override
    public void remove(int index) {
       try {
           T[] temp = values;
           values = (T[]) new Object[temp.length + 1];
           System.arraycopy(temp,0,values,0,index);
           int amountElemAfterIndex = temp.length - index - 1;
           System.arraycopy(
                   temp,index + 1, //src
                   values, index,        //target
                   amountElemAfterIndex); //amount
       }catch (ClassCastException e){
           e.printStackTrace();
       }
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        int counter = 0;
        for (Object element : values) {
            if (element != null) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public void clear() {
        Arrays.fill(values, null);
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(values);
    }
}
