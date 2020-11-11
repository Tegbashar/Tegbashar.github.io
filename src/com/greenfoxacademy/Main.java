package com.greenfoxacademy;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Mi a kedvenc számod?");
        Scanner scanner = new Scanner(System.in);
        String userInput1 = scanner.nextLine();
        System.out.println("Gondoltam, hogy a " + userInput1 + " kedvenc számod!");
    }
}
