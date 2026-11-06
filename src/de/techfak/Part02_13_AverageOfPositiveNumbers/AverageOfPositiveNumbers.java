package de.techfak.Part02_13_AverageOfPositiveNumbers;

import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  i = 0;
        int a = 0;
        int b = 0;
        while(true){
            a = Integer.valueOf(scanner.nextLine());
            if(a==0) {
                break;
            } else if (a>0) {
                b = b + a;
                i++;
            }
        }
        if(b<=0){
            System.out.println("Cannot calculate the average");
        } else{
            double avg = Double.valueOf(b)/Double.valueOf(i);
            System.out.println(avg);
        }
    }
}
