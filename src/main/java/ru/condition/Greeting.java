package ru.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java";
        System.out.println(idea);

        idea = idea + " But I am a newbie.";
        int year = 2025;
        idea = idea + year;
        System.out.println(idea);

        int a = 3;
        int b = 8;
        System.out.println(++a);
        System.out.println(a);
        a = a + 1;
        System.out.println(a);
    }
}
