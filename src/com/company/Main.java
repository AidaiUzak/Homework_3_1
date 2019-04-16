package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Name";
        int age = 19;
        int temp = 25;
        if (age > 30 && age < 45) {
            if (temp > 30 || temp < -20) {
                System.out.println("You can't go out!");
            }
            else {
                System.out.println("You can visit your friend!");
            }
        }
        if (age < 20) {
            if (temp > 0 && temp < 28) {
                System.out.println("You can't go out!");
            }
            else {
                System.out.println("You can visit your friend!");
            }
        }
        if (age > 45) {
            if (temp > -10 && temp < 25) {
                System.out.println(name);
                System.out.println("You can't go out!");
            }
            else {
                System.out.println(name);
                System.out.println("You can visit your friend!");
            }
        }
    }
}