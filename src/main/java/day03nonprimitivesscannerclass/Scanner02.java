package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

      //ex1: Get shirtPrice and shoePrice from user and print the total price on the console

        Scanner input = new Scanner(System.in);

        System.out.println("Give me shirtPrice please...");
        double shirt = input.nextDouble();

        System.out.println("Give me shoesPrice please ...");
        double shoes  = input.nextDouble();

        System.out.println("Total price is " + (shirt + shoes));























    }
}
