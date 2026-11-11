package de.techfak.Part02_19_Factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int eingabe = Integer.valueOf(scanner.nextLine());
        int ausgabe = 0;
        if(eingabe == 0){
            ausgabe = 1;
        } else{
            for(int i = 0; i<eingabe ; i++){
                ausgabe = ausgabe * i;
            }
        }
        System.out.println("Factorial: " + ausgabe);
    }
}
