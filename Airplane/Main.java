package Airplane;
import Airlines.*;


public class Main {
    public static void main(String args[]){

        AirIndia ap1 = new AirIndia("125A",20);
       SpiceJet ap2 = new SpiceJet("5412B",30);
ap1.flightBook(5);
ap1.flightBook(5);
ap2.flightBook(8);
    }
}
