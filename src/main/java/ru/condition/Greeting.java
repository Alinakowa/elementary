package ru.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I ";
        idea = idea + "like ";
        idea += "Java! ";
        String idea1 = idea + "But I am a newbie.";
        int year = 2025;
        String separate = " ";
        String idea3 = idea1 + separate + year;
        System.out.println(idea3);
    }
}
