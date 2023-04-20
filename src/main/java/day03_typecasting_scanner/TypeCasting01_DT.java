package day03_typecasting_scanner;

public class TypeCasting01_DT {
    public static void main(String[] args) {
        /*
There are types of data type in Java
1)Primitive Data Types ==> byte < short < int < long < float < double ==>numaric primitive data types
boolean==> true or false
char ==> for a single data
2)Non-Primitive data types==> String ]> used for multiple different characters storage
String str = "Tom Hanks 123)?";

****************

What are the differences between "Primitive Data Types" and "Non-Primitive Data Types"?
1)Primitive data types have just values but Non-Primitive Data Types have values and methods
2) Primitive Data Types are created by Java, we cannot create a primitive data type
But we can create Non-Primitive data types whenever we need
3) "Primitive data types uses lower cases in naming convention and Non-Primitive ones uses Upper case naming convention
4) Usage of memory for primitive data types changes from data type to data type.
But non-primitive data types use same amount of memory in heap memory.

     There are 2 types of memory in Java.
     1)Stack Memory=> 1)Primitive Data 2)References(addresses) of Non-Primitive Data are stored

     2)Heap==>Stores Non-Primitive Data types/values
         */
        int a = 23 ,i = 12;
        String str = "Tom";
        System.out.println(a+i+str);

        System.out.println(str+ (a +i));

    //    byte < short < int < long < float < double
        //Type Casting

        /*

       1) AutoWidening
        java can put small data types into large data types automatically
        When you put small data type object into a large data type object,
        you are widening the small data type

         */
        int m= 14;

        double d = m;


    /*
    2)Explicitly Narrowing
     Java does not put large data types into small data types automatically.Java thinks this is risky.

    */
        long numberLong= 345678906;

        short numberShort = (short) numberLong;

        int n= 20;
        byte b= (byte) n;


    }
}
