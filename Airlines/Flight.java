package Airlines;
import Exception.SeatUnavailableException;
import java.util.ArrayList;
public abstract class Flight {
    public String flight_no;
   public int TotalSeat_no;
    public ArrayList<Integer> BookSeats = new ArrayList<Integer>();
    public ArrayList<Integer> AvailableSeats = new ArrayList<Integer>();


    public Flight(String flight_no, int TotalSeat_no) {
        this.flight_no = flight_no;
        this.TotalSeat_no = TotalSeat_no;
        for (Integer i = 1; i <= TotalSeat_no; i++) {
            this.AvailableSeats.add(i);
        }
       // System.out.println(AvailableSeats);
    }

    public synchronized void flightBook(Integer book) throws SeatUnavailableException{
        try {
            Thread.sleep((long) (Math.random() * 5000));
        } catch (Exception e) {
            System.out.println(e);
        }

        boolean flag = true;
        for (int element : this.AvailableSeats) {
            if (element == book) {
                BookSeats.add(book);
                System.out.println(BookSeats);
                AvailableSeats.set(element-1,0);
                System.out.println(AvailableSeats);
                flag=false;
                break;
            }

        }
        try{
            if(flag == true){

               throw new SeatUnavailableException("Sorry!! This Seat is not available");
            }
        } catch (SeatUnavailableException e) {
            e.getMessage();
            throw new SeatUnavailableException("Sorry!! This Seat is not available");
        }

    }
    public void Cancel_ticket(Integer book) throws SeatUnavailableException{

        boolean flag = true;
        for (int element : this.BookSeats) {
            if (element == book) {
                BookSeats.remove(book);
                System.out.println(BookSeats);
                AvailableSeats.set(element-1,book);
                System.out.println(AvailableSeats);
                flag=false;
                break;
            }
        }
        try{
            if(flag == true){

                throw new SeatUnavailableException("Yeahh!! This Seat is available");
            }
        } catch (SeatUnavailableException e) {
            e.getMessage();
            throw new SeatUnavailableException("Yeahh!! This Seat is available");
        }
    }

    }




