package org.example.exceptionsAndGenerics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

;

public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>();

        box.setT("Test");
        System.out.println(box.getT());

        printArray(new String[]{"1", "2", "3"});

        Pair<String, Integer> pair = new Pair<>();

        pair.setT("Joe");
        pair.setE(22);

        System.out.println(pair.getT());
        System.out.println(pair.getE());
    }

    public static void readFile() {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("qwerty.txt"));
        } catch (IOException e) {
            System.out.println("ФАЙЛ НЕ НАЙДЕН");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
    }

    public static double divideNums(double x, double y) {
        if (y == 0) throw new ArithmeticException();
        return x / y;
    }

    public static void checkAges(int age) throws Exception {
        if ((age <= 0) && (age > 150)) throw new Exception();

        System.out.println("Возраст ок");
    }

    public static void checkEmail(String email) throws RuntimeException {
        if (!(email.endsWith("@mail.com"))) throw new RuntimeException();

        System.out.println("Почта ок");
    }

    public static <T> void printArray(T[] arr) {
        for (T el : arr) {
            System.out.println(el);
        }
    }
}
