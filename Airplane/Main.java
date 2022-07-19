package Airplane;
import Airlines.*;


public class Main {
    public static void main(String args[]) {

        AirIndia ap1 = new AirIndia("125A",20);
       SpiceJet ap2 = new SpiceJet("5412B",30);

        Thread thread1 = new Thread(() -> {
            ap1.flightBook(5);

          //  ap2.flightBook(8);
        });

        Thread thread2 = new Thread(() -> {
            ap1.flightBook(5);
            ap1.Cancel_ticket(5);
           // ap2.flightBook(8);
        });
        Thread thread3 = new Thread(() -> {
            ap1.flightBook(5);
           // ap2.flightBook(8);
        });

        thread1.setName("A");
        thread2.setName("B");
        thread3.setName("C");

        thread2.start();
        thread1.start();
        thread3.start();
    }
}
