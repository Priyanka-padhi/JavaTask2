package Airlines;
import Exception.SeatUnavailableException;
public class SpiceJet extends Flight implements FlightBooking{
    public SpiceJet(String flight_no,int TotalSeat_no ) {

        super(flight_no, TotalSeat_no);
        //super.setTotalSeat_no(60);

    }

    @Override
    public void flightBook(String flight_no, int[] AvailableSeats) throws SeatUnavailableException {

    }
    @Override
    public void flightBook(Integer book) {
        try {
            super.flightBook(book);
            System.out.println("Your Seat " +book+ " is Booked Successfully!!");
            System.out.println("THANK YOU FOR TRAVELLING WITH SPICEJET ");
        } catch (SeatUnavailableException e) {
            System.out.println("Sorry!! This Seat is not available");
        }
    }
}
