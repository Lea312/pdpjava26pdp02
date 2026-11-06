package de.techfak.Part02_12_AverageOfNumbers;

import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int b = 0;
        int a = 0;
        while(true){
            System.out.println("Give a number: ");
            a = Integer.valueOf(scanner.nextLine());
            if(a==0){
                break;
            }else if(a>0){
                i++;
                b = b+a;
            }
        }
        double avg = Double.valueOf(b)/Double.valueOf(i);
        System.out.println("Average of the numbers: " + avg);
    }
}
