package mypractice;

public class QuestionBankTypeCasting {
    public static void main(String[] args) {

        //Create a short variable and convert it to an int variable.
        short age = 12;
        int newAge = age;

        //Create a long variable and convert it to an int variable.
        long age1 = 12L;
        int newAge1 = (int) age;

        //Create a double variable and convert it to a float variable.
        double price = 2.34;
        float newPrice = (float) price;

        //Create a double variable and convert it to a short variable,
        // then print the value of the short variable on the console.
        //Be careful about the output,it will not be a decimal value.
        double price1 = 1.2;
        short newPrice1 = (short) price1;
        System.out.println(newPrice1);

        //Create a byte variable and convert it to a double variable,
        // then print the value of the double variable on the console.
        //Be careful about the output, it will be a decimal number.
        byte age2 = 23;
        double newAge2 = age2;
        System.out.println(newAge2);


    }
}
