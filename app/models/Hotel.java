package models;
import java.util.ArrayList;

public class Hotel{
	private String hotelid;
	private String hotelname;
	private String location;
	private String Street;
	private ArrayList<Room>deluxeRoom=new ArrayList<Room>();
	private ArrayList<Room>standardRoom=new ArrayList<Room>();
	private ArrayList<Room>premiumRoom=new ArrayList<Room>();
	
	public Hotel(String id,String name, String loc,String street){
		this.hotelid=id;
		this.hotelname=name;
		this.location=loc;
		this.Street=street;
		addRoom("Standart");
		addRoom("Premium");
		addRoom("Deluxe");
	}
	
	public String getHotelid() {
		return hotelid;
	}

	public void setHotelid(String hotelid) {
		this.hotelid = hotelid;
	}

	public String getHotelname() {
		return hotelname;
	}

	public void setHotelname(String hotelname) {
            if(hotelname!=null){
		this.hotelname = hotelname;
            }
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
	 if(location!=null){
		this.location = location;
		}
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
            if(street!=null){
		this.Street = street;
		}
	}

	
	public void addRoom(String roomtyp){
		if(roomtyp.equals("Deluxe")){
			deluxeRoom.add(new Room(roomtyp,7));
		}
		else if(roomtyp.equals("Premium")){
			premiumRoom.add(new Room(roomtyp,3));
		}
		else if(roomtyp.equals("Standart")){
			standardRoom.add(new Room(roomtyp,1));
		}
	}
	
	public ArrayList<Room> get_all_Rooms(){
                ArrayList<Room> all=new ArrayList<Room>();
                for(int i=0;i<deluxeRoom.size();i++){
                    all.add(deluxeRoom.get(i));
                }
                for(int i=0;i<premiumRoom.size();i++){
                    all.add(premiumRoom.get(i));
                }
                for(int i=0;i<standardRoom.size();i++){
                    all.add(standardRoom.get(i));
                }
                return all;
        }
	public Room checkRoom(String roomtyp){
		int l;
		if(roomtyp.equals("Deluxe")){
			if((l=deluxeRoom.size())!=0){
				return deluxeRoom.get(l);
			}
		}
		if(roomtyp.equals("Premium")){
			if((l=premiumRoom.size())!=0){
				return premiumRoom.get(l);
			}
		}
		if(roomtyp.equals("Standart")){
			if((l=standardRoom.size())!=0){
				return standardRoom.get(l);
			}
		}
		return null;
	}
	

	
}

