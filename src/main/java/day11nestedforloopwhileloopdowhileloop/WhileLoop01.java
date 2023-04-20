package day11nestedforloopwhileloopdowhileloop;

public class WhileLoop01 {
    public static void main(String[] args) {

        //ex1: Type code to print integers from 4 to 7 on the console

        //1.way : use for-loop

        for (int i = 4; i < 8; i++) {

            System.out.println(i + " ");
        }

        //2.way: use while-loop
        int i = 4;

        while (i < 8) {

            System.out.println(i + " ");

            i++;

        }

        System.out.println();

        //ex2: Type code to print add integers from 12 to 67 in the same line with a space between them

        int k = 12;
        while (k < 68) {
            if (k % 2 != 0) {
                System.out.println(k + " ");
            }
            k++; //don't forget increment part in while-loop
        }

        //ex3:Type code to find the sum of integers from 12 to 67
        int m = 12;

        int sum = 0;

        while (m < 68) {

            sum = sum + m;

            m++;

        }
        System.out.println(sum);


    }
}
