package day21inheritance;

public class CarRunner {

    public static void main(String[] args) {

        Civic c = new Civic();

        // super() is used to call constructor from parent class.
        // super() is in the first line of every constructor body.
        // super () is invisible as default, if you want you can type it explicitly.


      Civic d = new Civic(2021);
      //super() can be used with parameters like super(true), super("Hybrid"), super82021)
      // When a class has multiple constructors to select the constructor we need,we use
      // super() with parameters

        /*
            1) When you try to access a "variable" by using an object in inheritance, strat to look for the variav,ble in the class used in the "data type of the object"
            2) When you try to access a "method" by using an object in inheritance, start to look for the "object" in the class whose "constructor" was used.
            3) In the first line of every constructor there is invisible "super" to call default constructor from the parent class, if you want you type it
               explicitly.
            4) Data Type of  object can be selected from the class itself or from the parent of the class.
               Animal dog = new Dog();   OR   Animal dog = new Dog();     OR    Mammal dog = new Dog();    OR   Dog dog = new Dog();
            5) "Private" class members can not be inherited
              "default" class members can be inherited if the child class in the same package with the parent class.
              "protected" and "public" class members do not have restriction in inheritance.


         */
        Car e = new Car("Honda",10000);
          // output should be: Gas
          //                   5000
          //                   Honda - 10000

        /*
            1) this() is used to call constructor from the same class.
            2) this() must be in the first line in a constructor body.
            3) What is the difference between this() and super()?
               this() is used to call constructor from the same class
               super() is used to call constructor from the parent class.
         */



    }

}
