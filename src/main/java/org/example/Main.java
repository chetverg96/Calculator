package org.example;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(2, 2));
        System.out.println(calc.sub(100,10));
        System.out.println(calc.mult(10, 22));
        System.out.println(calc.div(10,2));
        System.out.println(calc.pow(2, 10));
    }
}