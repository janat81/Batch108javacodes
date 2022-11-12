package day20accessmodifiersinheritance;

public class RunnerClass {

    public static void main(String[] args) {

        Student std1 = new Student();
        System.out.println(std1.stdName); //Tom Hanks

        Student std2 = new Student();
        System.out.println(std2.stdGpa); //3.83


     // If you want to access data inside the class
     // without using any object, the data must be static
        System.out.println(Student.Address); //Miami, FL USA

    }

}
