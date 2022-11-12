package day23_practice_session;

public class Q04_Bird extends Q04_Animal {

    public void tweet(){

        System.out.println("Birds tweet...");


    }

    @Override
    public void weight() {
        System.out.println("Birds are very light animals");
    }
}
