package Airlines;
import Exception.SeatUnavailableException;
interface FlightBooking {
    public void flightBook(Integer book) throws SeatUnavailableException;
    public void Cancel_ticket(Integer book) throws SeatUnavailableException;
}
