package de.techfak.Part02_33_StarSign;

public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }

    }

    public static void printSquare(int size) {
        // second part of the exercise
        for(int i= 0; i<size;i++) {
            for (int b = 0; b < size; b++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        for(int i= 1; i<=height;i++) {
            for (int b = 1; b <= width; b++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        for(int i= 1; i<=size; i++){
            for(int a = 0; a<=i;a++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
