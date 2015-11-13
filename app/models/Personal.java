package models;
import java.util.ArrayList;

public class Personal{
	private ArrayList <Person> personList=new ArrayList<Person>();
	private static Personal Pmanager = new Personal();
	
	public static Personal getInstance(){
                return Pmanager;
        }

	public Personal(){
		personList.add(new Person("Peter","passwort123"));
		personList.add(new Person("Steffi","123passwort"));
		personList.add(new Person("Hans","sicher123"));
	}
	public boolean getPersonIdentity(String n,String p){
		for(int i=0;i<personList.size();i++){
			if(personList.get(i).getPasswort()==p && personList.get(i).getName().equals(n)){
				return true;
			}
		}
		return false;
	}
}