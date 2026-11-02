package de.techfak.Part02_03_AbsoluteValue;

import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.nextLine());
        if(a<0){
            a=a*(-1);
        }
        System.out.println(a);
    }
}
