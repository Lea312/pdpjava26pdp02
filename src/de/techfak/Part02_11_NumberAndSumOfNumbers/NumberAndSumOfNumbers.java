package de.techfak.Part02_11_NumberAndSumOfNumbers;

import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int b = 0;
        while(true){
            System.out.println("Give a number:");
            int a = Integer.valueOf(scanner.nextLine());
            if(a==0){
                break;
            } else{
                i++;
                b = b + a;
            }
        }
    }
}
