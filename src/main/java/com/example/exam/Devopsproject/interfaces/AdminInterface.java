package interfaces;

import javax.ws.rs.WebApplicationException;

public interface AdminInterface {

    public WashingAssistantsDTO createAssistant(String jsonBoat);

    public CarDTO editCar(String carId, CarDTO carDTO);

    public BookingDTO editBooking(String bookingId, BookingDTO bookingDTO);

    public BookingDTO deleteBooking(Integer id) throws WebApplicationException;
}
