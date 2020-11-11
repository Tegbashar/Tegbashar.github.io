package com.greenfoxacademy;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sum=0;
        int pieces=5;
        for (int i=0;i<pieces;i++){
            System.out.println("Add meg a számot?");
            Scanner scanner = new Scanner(System.in);
            String userInput1 = scanner.nextLine();
            sum +=Integer.parseInt(userInput1);
        }
        System.out.println("Összegük: "+sum);
        int atlag=sum/pieces;
        System.out.println("átlaguk: " + atlag);



    }
}