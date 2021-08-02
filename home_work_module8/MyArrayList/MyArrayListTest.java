package home_work_module8.MyArrayList;

import java.util.Arrays;

public class MyArrayListTest {
    public static void main(String[] args) {

        MyArrayList<String> test = new MyArrayList<>();

        for (int i = 0; i < 5; i++) {
        test.add("String " + i);
        }

        for (int i = 0; i < test.size(); i++) {
        System.out.println("Adding a string to an array: " + test.get(i));
        }

        System.out.println("The array outputs the value 1 : " + test.get(1));

        System.out.println("Array size : " + test.size());

        System.out.println("Remove by index : 0 and 2");
        test.remove(0);
        test.remove(2);

        System.out.println("Array size after deletion : " + test.size());
        for (int i = 0; i < test.size(); i++) {
        System.out.println("Lines in array after deletion" + test.get(i));
        }

        test.clear();
        System.out.println("The Array size now consist of " + test.size() + " elements");
    }

}