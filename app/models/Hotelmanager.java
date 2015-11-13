package models;
import java.util.ArrayList;
import java.util.Iterator;


public class Hotelmanager{
	private ArrayList<Hotel>Mountain_Resorts=new ArrayList<Hotel>();
	private static Hotelmanager manager = new Hotelmanager();
	
    private Hotelmanager() {
        if(Mountain_Resorts.size()==0){
            Mountain_Resorts.add(new Hotel("60905","Divine","New York","Bigstreet 5"));
            Mountain_Resorts.add(new Hotel("85068","new Hilton","Innsbruck", "An der Laanstraße 35"));
            Mountain_Resorts.add(new Hotel("59658","Haverest", "Berlin","Mairstraße 3"));
            }
        }
    
    public static Hotelmanager getInstance() {
        return manager;
    }
	
	public ArrayList<Hotel> getHotelswithLocation(String location){
		ArrayList<Hotel> HotelsAtLocation=new ArrayList<Hotel>();
		for(Hotel h: Mountain_Resorts){
			if(h.getLocation().equals(location)){
				HotelsAtLocation.add(h);
			}
		}
		return HotelsAtLocation;
	}
	
        public ArrayList<Hotel> getHotelswithId(String id){
                if(id==null){
                    return Mountain_Resorts;
                }
                else{
                    ArrayList<Hotel> HotelwithId=new ArrayList<Hotel>();
                    for(Hotel h: Mountain_Resorts){
                            if(h.getHotelid().equals(id)){
                                    HotelwithId.add(h);
                            }
                    }
                    return HotelwithId;
                }
	}
	
	public Hotel getHotel(String id){
                for(Hotel h: Mountain_Resorts){
                    if(h.getHotelid().equals(id)){
                            return h;
			}
		}
		return null;
        }
    public void makeHotel(String id,String name,String loc,String str){ // überarbeiten
        Hotel h=new Hotel(id,name,loc,str);
        addHotel(h);
    }
		
    public void addHotel(Hotel hotel) {
        Mountain_Resorts.add(hotel);
    }
    
     public void removeHotel(String Hotid) {
       Iterator<Hotel> iter= Mountain_Resorts.listIterator();// iterator for modify lists
       while(iter.hasNext()){
            if(iter.next().getHotelid().equals(Hotid)){
                iter.remove();
                break;
            }
        }
    }

    public ArrayList<Hotel> getHotels() {
        return Mountain_Resorts;
    }
}