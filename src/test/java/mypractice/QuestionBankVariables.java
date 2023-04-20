package mypractice;

import java.util.Scanner;

public class QuestionBankVariables {
    public static void main(String[] args) {

        //Create double variables for the prices of any 3 items.
        // Print the sum of the prices on the console with a label.

        double shirtPrice = 12.99;
        double hatPrice = 23.99;
        double shoesPrice = 15.99;
        System.out.println("Total Price: " + (shirtPrice+hatPrice+shoesPrice));

        //Create a float variable, a long variable, and an integer variable for any 3 items.
        // Print the multiplication of the values on the console with a label.

        float x = 15.99F;
        long y = 13L;
        int z = 12;
        System.out.println("Multiplication: " + x*y*z);

        //Type a code to find simple interest.
        //Note: Simple interest formula = principal * rate * numberOfYear / 100

        int principal = 10000, rate = 6, numberOfYear = 3;
        int simpleInterest = principal*rate*numberOfYear/100;
        System.out.println("The simple interest is " + simpleInterest);

        //Create a String and two Long variables.
        //Print the sum and the multiplication of the long variables with the String on the console.

        String s = "The result is";
        Long a = 123L;
        Long b = 9123456782l;
        System.out.println(s+(a+b));
        System.out.println(s+a*b);

        //Create two boolean variables whose values are different and print
        // their values in the same line with a space between two consecutive values.

        boolean k = true;
        boolean m = false;
        System.out.println(k+ ""+m);

        //Create 3 float variables for the price of a book, notebook, and laptop.
        // Print the total price of 2 books, 4 notebooks and 3 laptops on the console.

        float book=12.99F, noteBook = 23.45F, laptop = 34.12F;
        float totalPrice = 2*book+4*noteBook+3*laptop;
        System.out.println("The total price is " + totalPrice);

        //Type a code to swap two integers.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers to swap");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        System.out.println("Before swapping " +n1+ "-" +n2);

        //1.Way: Use 3rd variable
        double temp = n1;
        n1=n2;
        n2=temp;
        System.out.println("After swapping "+n1+"-"+n2);

        //2.Way: Do not use 3rd variable
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("After swapping :" + n1+ "-" +n2);




















    }
}
