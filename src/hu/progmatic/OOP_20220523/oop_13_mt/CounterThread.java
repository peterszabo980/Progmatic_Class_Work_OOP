package hu.progmatic.OOP_20220523.oop_13_mt;

public class CounterThread extends Thread{
    private final String name;

    public CounterThread(String name) {
        this.name = name;
    }


    // "main" metódus
    /*@Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(name + " - " + i;
            Thread.sleep(1000); // időnként megfelelő megoldás
        }
    }*/
}
