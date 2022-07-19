package Airlines;
import Exception.SeatUnavailableException;
public class SpiceJet extends Flight implements FlightBooking{
    public SpiceJet(String flight_no,int TotalSeat_no ) {
        super(flight_no, TotalSeat_no);
    }

    @Override
    public void flightBook(Integer book) {
        try {
            super.flightBook(book);
            System.out.println("Thread " + Thread.currentThread().getName() + " has booked seat number " + book);
            System.out.println("THANK YOU FOR TRAVELLING WITH SPICEJET!! ");
        } catch (SeatUnavailableException e ) {
            System.out.println( "Seat " + book + " is not available for thread " + Thread.currentThread()
                    .getName());
        }
    }
}
