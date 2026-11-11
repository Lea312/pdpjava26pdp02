package de.techfak.Part02_19_Factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int a = Integer.valueOf(scanner.nextLine());
        int b = 1;
        if (a==0){ a=1;}
        else {
            int i = 1;
            while (i <= a) {
                b = b * i;
            }
        }
        System.out.println("Factorial: " + b);
    }
}
