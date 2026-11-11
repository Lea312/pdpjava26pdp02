package de.techfak.Part02_18_SumOfASequenceTheSequel;

import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int x = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int a = Integer.valueOf(scanner.nextLine());
        int b = 0;
        for(int i = x; i<=a; i++){
            b = b+i;
        }
        System.out.println("The sum is" + b);


    }
}
