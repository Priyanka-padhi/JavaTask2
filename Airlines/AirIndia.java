package Airlines;
import Exception.SeatUnavailableException;
public class AirIndia extends Flight implements FlightBooking {


    public AirIndia(String flight_no,int TotalSeat_no ) {
        super(flight_no, TotalSeat_no);
    }
    @Override
    public void flightBook(String flight_no, int[] AvailableSeats) throws SeatUnavailableException {

    }
@Override
    public void flightBook(Integer book) {
        try {
            super.flightBook(book);
            System.out.println("Your Seat " +book+ " is Booked Successfully!!");
            System.out.println("THANK YOU FOR TRAVELLING WITH AIRINDIA ");
        } catch (SeatUnavailableException e ) {
           System.out.println("Sorry!! This Seat is not available");
        }
    }


}


