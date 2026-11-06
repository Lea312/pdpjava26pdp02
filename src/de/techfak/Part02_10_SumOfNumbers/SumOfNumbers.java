package de.techfak.Part02_10_SumOfNumbers;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // mein code hier
        int i = 0;
        int a = 0;
        while(true){
            System.out.println("Give a number:");
            a = Integer.valueOf(scanner.nextLine());
            if(a == 0){
                break;
            } else {
                i = i + a;
            }
        }
        System.out.println("Sum of the numbers: " + i);
    }

}
