package mypractice;

public class QuestionBankStringManipulations {
    public static void main(String[] args) {
        //Create a String variable for city names which have just a single word .
        //Print the city name with the initial is in uppercase and
        // all the other characters are in lower cases on the console.
        /*
        ex: mIAMI should be printed as Miami
            miami should be printed as Miami
            MIAMI should be printed as Miami
            mIaMi should be printed as Miami   etc.
         */
        
        String cityName="mIAMI";
        String updatedCityName = cityName.trim().toLowerCase();
        updatedCityName=updatedCityName.substring(0,1).toUpperCase()
                +updatedCityName.substring(1);
        System.out.println(updatedCityName);

        //Create 3 String variables for people's names.
        //Print the sum of the number of characters in all the 3 names except space characters.
        //ex:If the names are Ali Can , Merve Star, Mark Tom you should see 22 on the console.

        String name1 = "Ali Can";
        String name2 = "Aliye Canan";
        String name3 = "Aliyev Can Cananov";
        Integer c1 = name1.replaceAll("\\s","").length();
        Integer c2 = name2.replaceAll("\\s","").length();
        Integer c3 = name3.replaceAll("\\s","").length();
        System.out.println("Total number of characters different from space:" + (c1+c2+c3));

        //Create a String variable,print the total number of alphabetical and numeric characters in the String on the console.
        //ex:If the String is "Miami 33018!!!" you need to print 10 on the console.

        String s= " Miami 33018!!! ";
        Integer numOfChars = s.replaceAll("\\s","").replaceAll("A-Za-z0-9","").length();
        System.out.println("Total num of alphabetical and numeric characters chars:"+numOfChars);

        //


















    }
}
