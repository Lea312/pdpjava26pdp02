package de.techfak.Part02_16_FromWhereToWhere;

import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int b = Integer.valueOf(scanner.nextLine());
        while(b<=a){
            System.out.println(b);
            b = b+1;
        }

    }
}
