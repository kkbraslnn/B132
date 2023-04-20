package kurs.konuanlatimi.A25_StaticKeyword;

public class StaticKeyword {

    public static void main(String[] args) {

            /*
   1) class icinde method larin disinda olusturan variablelara "instance variable" denir
   2)  class in icinde method larin disinda olusturulan static variablelara "class variable denir
      Instance variable lar gibi class variable lar icin de default degerlar vardir
   3) static variable lara ulasmak icin object olusturmyaya gerek yoktur(obj ile de cagrilir ama tercih edilmez),
    class ismi kullanilarak ulasilabilir
   instance variable lara ulasabilmek icin object olusturmak zorundayiz

   mesela:

   public class Student; ( class tanimlayalim)

   public static String stdName = "Tom Henks";  ( static)

   ( memory de stdName isminde bir alan ayirdik, alana "Tom Henks" degerini verdik.
     bu veri her herden ulasilabilen (public) static bir variable dir.

     public int age=13;    ( non-static)




     public class studentRunner;  ( baska bir class acmis olalim)

     bu class da iken, student class da yer alan variablari kullanmak istiyorum.
     nasil cagiriyoruz?

     Student.stdName ( class isimini yazip nokta koyunca static valuelar gorunecek onlari cagiriyoruz.)



     non-static value ya ulasmak icin method olusturuyoruz.

     Student std1 = new Student ();  (burda Student class in dan bir object olusturduk)
      non-staticler buraya yerlestirilir
     std1.age    ( methodun ismini (std1) yazip nokta koyunca, Student class in da ki
     Non-static value gorunur, onu cagiririz)

 burada dikkat edilecek husus; static den bir tane olusturuyoruz, ama non static'i obj creating yaptigimizdan
  her object in farkli degri oluyor.farkli ismi)
static de yapilan her update, butun obj ler tarafindan gorulur...her bir obj de olan update sadece o obj gorulur,
diger obj ler etkilenmez.


   4) Static variable tum object ler icin ortak elamandir
   5) static class memberlar uzerinde yapilan tum degisiklikler tum objectleri etkiler
   6) static memberlar Class'lara, non- static memberlar classlara monte edilir

   instance variable= object variable
   static variable= class variable

     */

          /*
    1- "static"class members (variables and methods) are common for all objects created from the class
    2- when you do any update on "static" class members, all object will see the uodates on it.
    3- if you want every object informed about every update on a class member make it static
     */

        // How to create "static" variable
        // To make a variable "static", keywoed between "access modifier"and "data type"




    }
}
