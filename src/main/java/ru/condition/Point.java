package ru.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = x2 - x1;
        double rsl2 = y2 - y1;
        double rsl3 = Math.pow(rsl, 2);
        double rsl4 = Math.pow(rsl2, 2);
        double rsl5 = rsl3 + rsl4;
        double rsl6 = Math.sqrt(rsl5);
        return rsl6;
    }

    public static void main(String[] args) {
        double result = Point.distance(6, 8, 2, 3);
        System.out.println("result (4, 7) to (2, 3) " + result);
    }

}
