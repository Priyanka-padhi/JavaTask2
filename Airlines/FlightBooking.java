package Airlines;
import Exception.SeatUnavailableException;
interface FlightBooking {
    public void flightBook(Integer book) throws SeatUnavailableException;

    void flightBook(String flight_no, int[] AvailableSeats) throws SeatUnavailableException;
}
