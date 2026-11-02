package de.techfak.Part02_04_ComparingNumbers;

import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.nextLine());
        int b = Integer.valueOf(scanner.nextLine());
        int erster;
        int zweiter;
        if(a>b){
            System.out.println(a + "is greater than " + b + ".");
        } else if(b>a){
            System.out.println(a + "is smaller than " + b + ".");
        } else if (a==b) {
            System.out.println(a + " is equal to " + b + ".");
        }
    }
}
