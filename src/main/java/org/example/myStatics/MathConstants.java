package org.example.myStatics;

public class MathConstants {
    final double PI = 3.14159;
    final double E = 2.71828;

    public static double calculateCircleArea(double r) {
        return 3.14 * (r * r);
    }

    public static double calculateCircumference(double r) {
        return 2 * 3.14 * r;
    }

}
