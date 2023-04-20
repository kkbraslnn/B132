package day01datatypesvariables;

public class DataTypes02 {
    //What is "Data"?
//Data is used, is stored, is processed in Java
//What are the "Data Types" in Java?
//There are 2 main "Data Types" in Java: 1)primitive data types
    // ii)Non-primitive data types
//What are the "primitive data types"?
//i)"primitive data types" were created by Java, developers cannot create "primitive data types" //ii)There are 8 "primitive data types":
    // 1)byte 2 short 3)int 4)long 5)float 6) double 7)char 8)boolean

    //1)byte: "byte" is for "whole numbers". "byte" is from -128 to 127.
    // We have 256 different values in "byte" primitive data type
//Let's create a byte variable and assign a value to it //"byte stdAge" code i)creates reserved area in memory
    // ii)Names it by using the name you gave iii)Puts zero (default value) in the reserved area.
//"=" is NOT "equal sign", it is "assignment operator"
//"assignment operator" takes the value from the right puts it into the reserved ared on the left
    //";" is used to end any "Java Sentence"(Statement)
    byte stdAge = 127;
    //2)short: "short" is for whole numbers.
//"short" is from -32K sth to +32K sth
    short populationInAnApartment = 546;
    //3)int: "int" stands for "Integer" and it is for whole numbers."int" is from -2 billion sth to +2 billion sth
    int populationInACity = 650000;
    //4)long: "long" is for whole numbers
    // Even you make data type "long", Java insists on using "int" to save memory.
    //To insist on Java to make data type "long", put "L" or "l" at the end of the value.
    //If the value is in "int range" no need to put "L" or "" to the end of the value but if the value is NOT in "int range" you have to put "L" or "l" to the end of the value
    long population0fTheWorld = 7200000000L;
    //6) double: "double" is for decimal values "doubles" can have up to 16 digits inn decimal part, it is so sensitive
    double weight0fACell = 0.000000023045;
    //5)float: "float" is for decimal values. "float" has up to 7 seven digits in decimal part
    //  All decimal values are in "double" as default in Java.
    // Even you type "float" as data type, Java will accept it as "double", to insist on Java, it is float put "futor "f" to the end of the value.
    float shirtPrice = 12.99F;
    //7)char: "char" is for "single characters"
    //        A, ?, !, s, 3 etc.
    //The value of "char data type" must be between the "single quotes"
    char initial = 'S';
    char punctuationMark = '!';
    //8)boolean: It is for "true" or "false" answers.
    boolean isRetired = true;
    boolean isOld = false;

}
