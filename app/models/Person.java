package models;

public class Person{
	private String Name;
	private String Passwort;
	
	public Person(String name,String Passwort){
		this.Name=name;
		this.Passwort=Passwort;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPasswort() {
		return Passwort;
	}
	public void setPasswort(String passwort) {
		Passwort = passwort;
	}
	
	
}