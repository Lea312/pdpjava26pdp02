package de.techfak.Part02_15_CountingToHundred;

import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.nextLine());
        while(a<=100){
            System.out.println(a);
            a = a + 1;
        }
    }
}
