package api;

import java.util.ArrayList;

public class DeepDiveArrayList {

    public static void main(String[] args) {
        int a[] = new int[3];//static array
        //dynamic array--arraylist

        ArrayList ar = new ArrayList();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        System.out.println(ar.size());
        ar.add(40);
        ar.add(50);
        ar.add(12.33);
        ar.add("Test");
        ar.add('a');
        ar.add(true);
        ar.add(false);
        System.out.println(ar.size());
        System.out.println(ar.get(4));

        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
    }
}