package mypractice;

public class StringManipulations {

}


        //Note: Just a single digit is a data, all digits are a group of data
        //      To tell Java sth about a group of data we use "Regular Expressions"(Regex)

        /*
                What is the Regex?
                    1)All digits ==> [0-9]
                    2)All lower cases ==> [a-z]
                    3)All upper cases ==> [A-Z]
                    4)All letters ==> [a-zA-Z]
                    5)All letters and digits ==> [a-zA-Z0-9]
                    6)All vowels ==> [aeiouAEIOU]
                    7)All punctuation marks ==> \\p{Punct}

                    8)All characters "different from"(^) digits ==> [^0-9]
                    9)All characters "different from"(^) lower cases ==> [^a-z]
                    10)All characters "different from"(^) letters ==> [^a-zA-Z]
                    11)All characters "different from"(^) vowels ==> [^aeiouAEIOU]
         */


        //toUpperCase() method converts all characters to upper cases
        //trim() method removes the "spaces" characters from the beginning and from the end
        //              doesn't touch spaces in the middle
        //length() method gives you the number of characters in a String

             /*

        valueOf():String i  integer a cevirir.
        indexOf():Girilen ilk harfin ilk indexini verir.
        lastIndexOf():Girilen harfin sondan baslayarak kacinci indexte oldugunu verir.
        replace()-replaceAll():kelimeleri degistirir.
        charAt():String deki bir harfin indexini verir index yazarsak indexteki harfi verir.
        equals()-equalIgnoreCase(): equals esit mi diye kontrol eder ama sayisal ve char degerleri
                                     kontrol etmek icin == kullanilir.
        toLowerCase-toUpperCase():Buyuk ve kucuk harfe cevirmek icin kullanilir.
        split():Bir Stringi verilen indexten 2 ye boler
        isEmpty(): bos mu diye kontrol eder
        trim(): string deki bastaki ve sondaki boslugu siler
        isBlank():bosluk var mi diye kontrol eder
        length()-10: karakter sayar
        substring(): ilk index yazilarak 2. indexe kadar 2. index dahil degil
        endsWith():sondaki harf ve karakteri icerip icermedigini kontrol eder
        startsWith():bastaki harf ve karakteri icerip icermedigini kontrol eder
        concat():Stringleri birlestirir
        contains():icerip icermedigini kontrol eder

            */


