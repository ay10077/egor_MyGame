import java.util.Scanner;
import java.sql.Timestamp;
//
public class Character {
	String name;
	int age;
	Timestamp date_of_birth;
	String country;
	String city;
	Scanner in = new Scanner(System.in);
	public Character(String name, int age, Timestamp date_of_birth, String country, String city){
		this.name = name;
		this.age = age;
		this.date_of_birth = date_of_birth;
		this.country = country;
		this.city = city;
		
	}
	public String getName() {
		String name = in.nextLine();
		
		return name;
	}
	public int getAge() {
		return age;
	}
	public Timestamp getDate_of_birth() {
		return date_of_birth;
	}
	public String getCountry() {
		return country;
	}
	public String getCity() {
		return city;
	}
	
}
