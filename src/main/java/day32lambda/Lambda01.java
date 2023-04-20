package day32lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

        printSortedUpperUnique(names);
        System.out.println();
        printUpperUniqueSortWithLength(names);
        System.out.println();
        printUpperUniqueSortWithLastChar(names);

    }

    //1)Print the list elements on the console in natural order, with upper cases, and un-repeatedly
    public static void printSortedUpperUnique(List<String> names) {
        names.stream().distinct().sorted().map(t -> t.toUpperCase()).forEach(t -> System.out.print(t + " "));
    }

    //2)Print the list elements on the console by ordering them according to their lengths, with upper cases, and un-repeatedly
    public static void printUpperUniqueSortWithLength(List<String> names) {
        names.stream().distinct().map(t -> t.toUpperCase()).sorted(Comparator.comparing(t -> t.length())).forEach(t -> System.out.print(t + " "));
    }

    //3)Print the list elements on the console by ordering them according to their last characters, with upper cases, and un-repeatedly
    public static void printUpperUniqueSortWithLastChar(List<String> names) {
        names.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                forEach(t -> System.out.print(t + " "));
    }


    //4)Create a method to sort the elements according to their lengths then according to their first character
//TOM JIM ALEX ALEX MARY MICHAEL ALEXANDER ==> JIM TOM ALEX ALEX MARY MICHAEL ALEXANDER




    }
