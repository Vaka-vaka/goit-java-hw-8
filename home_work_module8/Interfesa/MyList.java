package home_work_module8.Interfesa;

public interface MyList<T> extends Iterable<T>{

    void add(T t);
    void remove(int index);
    T get(int index);
    int size();
    void clear();
}
