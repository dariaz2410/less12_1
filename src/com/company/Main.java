package com.company;

public class Main {

    public static void main(String[] args) {
        TimeSpan o1 = new TimeSpan(2, 30);
        System.out.println(o1);

        TimeSpan Add = new TimeSpan(2, 40);
        Add.add(o1);
        System.out.println(Add);

        TimeSpan Sub = new TimeSpan(2, 50);
        Sub.sub(o1);
        System.out.println(Sub);

        o1.mult(8);
        System.out.println(o1);
    }
}
