package de.techfak.Part02_09_NumberOfNegativeNumbers;

import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int a;
        while(true){
            System.out.println("Give a number:");
            a = Integer.valueOf(scanner.nextLine());
            if(a == 0){
                break;
            }else if(a<0) {
                i++;
            }
        }

        System.out.println("Number of negative numbers: " + i);
    }
}
