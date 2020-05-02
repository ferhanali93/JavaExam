package datastructure;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<String, String> students = new Hashtable<String, String>();
        students.put("Michael", "QA");
        students.put("Navid", "QA");
        students.put("Eashan", "QA");
        students.put("Kawsar", "QA");
        students.replace("Michael", "OG");
        System.out.println(students);
    }

}
