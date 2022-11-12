package day23_practice_session;

public class Q04_RunnerClassForCreatures {

    public static void main(String[] args) {


        Q04_Cat cat1 = new Q04_Cat();

        cat1.meow(); // Cats meow...
        cat1.drink(); // "Animals drink..."
        cat1.eat(); // "Cats eat meat"

        Q04_Bird bird = new Q04_Bird();
        bird.move();
        bird.weight();

    }

}
