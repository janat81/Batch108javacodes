package day22inheritancepolymorphism;

public class Animal {
    public String name = "Animal";

    public void eat(){
        System.out.println("Animals eat..");
    }

    public Animal create(){
        return new Animal();
    }

    public Integer add(){
        return 12;
    }
    public final int divide(){
        return 34;

    }
    private boolean isRetired(){
        return true;
    }
    public static int counter(){
        return 5;
    }
}
