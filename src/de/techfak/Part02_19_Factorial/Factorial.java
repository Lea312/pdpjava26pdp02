package de.techfak.Part02_19_Factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int eingabe = Integer.valueOf(scanner.nextLine());
        if(eingabe == 0){
            eingabe = 1;
        } else {
            for(int i = 0; i<eingabe ; i++){
                eingabe = eingabe * i;
            }
        }
        System.out.println("Factorial: " + eingabe);
    }
}
