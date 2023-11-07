import java.util.ArrayList;
import java.util.List;

public class _7038OOP19 {
    private List<Flight> flights;
    private List<Hotel> hotels;
    private List<Booking> bookings;

    public _7038OOP19() {
        flights = new ArrayList<>();
        hotels = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public Flight searchFlight(String origin, String destination) {
        for (Flight flight : flights) {
            if (flight.getOrigin().equals(origin) && flight.getDestination().equals(destination)) {
                return flight;
            }
        }
        return null;
    }

    public Hotel searchHotel(String location) {
        for (Hotel hotel : hotels) {
            if (hotel.getLocation().equals(location)) {
                return hotel;
            }
        }
        return null;
    }

    public Booking bookFlight(Flight flight) {
        if (flight == null) {
            return null;
        }
        Booking booking = new Booking(flight);
        bookings.add(booking);
        return booking;
    }

    public Booking bookHotel(Hotel hotel) {
        if (hotel == null) {
            return null;
        }
        Booking booking = new Booking(hotel);
        bookings.add(booking);
        return booking;
    }

    public boolean cancelBooking(Booking booking) {
        return bookings.remove(booking);
    }
}

class Flight {
    private String origin;
    private String destination;

    public Flight(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }
}

class Hotel {
    private String location;

    public Hotel(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}

class Booking {
    private Object bookedItem;

    public Booking(Object bookedItem) {
        this.bookedItem = bookedItem;
    }

    public Object getBookedItem() {
        return bookedItem;
    }
}


class book {

    public static void main(String[] args) {
        Flight flight = new Flight("New York", "Los Angeles");
        Booking bookFlight = new Booking(flight);
        System.out.println(((Flight) bookFlight.getBookedItem()).getOrigin());  // New York
        Hotel hotel = new Hotel("Paris");
        Booking bookHotel = new Booking(hotel);
        System.out.println(((Hotel) bookHotel.getBookedItem()).getLocation());   // Paris
        }

    }
