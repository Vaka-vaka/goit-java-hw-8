package home_work_module8.MyHashMap;

public class MyHashMapTest {
    public static void main(String[] args) {

        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();

        System.out.println(myHashMap);
        myHashMap.put(3, "Test 0");
        System.out.println(myHashMap);
        myHashMap.put(2, "Test 1");
        System.out.println(myHashMap);
        myHashMap.put(1, "Test 2");

        myHashMap.remove(3);
        System.out.println(myHashMap);

        for (int i = 0; i < 8; i++) {
            myHashMap.put(i, "Status" + i);
        }

        System.out.println(myHashMap);
        System.out.println(myHashMap.size());
        System.out.println("Lets's get by key \"1\"" + myHashMap.get(1));
        System.out.println(myHashMap.size());
        System.out.println("Lets's get by key \"5\"" + myHashMap.get(5));
        System.out.println(myHashMap.size());
        System.out.println("Lets's get by key \"7\"" + myHashMap.get(7));
        System.out.println(myHashMap.size());
        System.out.println(myHashMap);

        myHashMap.clear();
        System.out.println(myHashMap);



    }
}
