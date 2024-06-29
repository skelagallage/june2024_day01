package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        String a = "apple";
        String b = "apple";
        System.out.println(a == b);

        String c = new String("orange");
        String d = new String("orange");
        System.out.println(c == d);
    }
}