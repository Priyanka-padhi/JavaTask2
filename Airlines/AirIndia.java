package Airlines;
import Exception.SeatUnavailableException;
public class AirIndia extends Flight implements FlightBooking {

    public AirIndia(String flight_no,int TotalSeat_no ) {
        super(flight_no, TotalSeat_no);
    }
@Override
    public void flightBook(Integer book) {
        try {
            super.flightBook(book);
            System.out.println(
                    "Thread " + Thread.currentThread().getName() + " has booked seat number " + book);
            System.out.println("THANK YOU FOR TRAVELLING WITH AIRINDIA!! ");
        } catch (SeatUnavailableException e ) {
           System.out.println( "Seat " + book + " is not available for thread " + Thread.currentThread()
                   .getName());
        }
    }
@Override
    public void Cancel_ticket(Integer book) {
        try {
            super.Cancel_ticket(book);
            System.out.println(
                    "Thread " + Thread.currentThread().getName() + " has canceled seat number " + book);
            System.out.println("THANK YOU FOR Connecting WITH AIRINDIA!! ");
        } catch (SeatUnavailableException e ) {
            System.out.println( "Seat " + book + " is  available for thread " + Thread.currentThread()
                    .getName());
        }
    }
}


