package models;
import java.util.*;
import java.util.ArrayList;

public class Room{
	private String roomtype;
	private int RoomId;// 7 for deluxe 3 for premium 1 for standard
	private final ArrayList<Booking> bookings = new ArrayList<Booking>();
	
	public Room(String rType,int RoomId){
		this.roomtype=rType;
		this.RoomId=RoomId;
		bookings.add(new Booking(RoomId,rType,"01 11 2016","05 11 2016"));
	}
	
	
	public int getRoomId() {
		return RoomId;
	}


	public void setRoomId(int roomId) {
		RoomId = roomId;
	}


	public String getRoomtype() {
		return roomtype;
	}
	
	public String getReservations(){
                return bookings.toString();
        }

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public boolean isAvailableBetween(String start, String end) {
            for (Booking b  : bookings) {
                if(b.getStartTime().equals(start)||b.getEndTime().equals(end)){
                //if (b.getStartTime().before(end) && start.before(b.getEndTime())) // use before () from Date class to check the date; tests if this date is before the specified date
                    return false;
                }
            }
            return true;
        }
	public void addBooking(Booking booking) {
        // Todo: Check for availability?
        bookings.add(booking);
    }
	
}