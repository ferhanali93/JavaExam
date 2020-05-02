package api;


import java.util.Scanner;

public class SystemAPI {
    public static void main(String[] args) {
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age: ");
        age = sc.nextInt();
        System.out.println("My age is: " + age);
        if (age > 18){
            System.out.println("access granted");
        }
        else if (age < 18 ){
            System.out.println("access denied");
        }
    }

}
