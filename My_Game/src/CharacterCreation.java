import java.sql.Date;
import java.sql.Timestamp;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
public class CharacterCreation {
//random
	//
	public static String ccRandom(){
		Scanner in = new Scanner(System.in);
		
		boolean custom;
		String test = "test";
		String decision = in.nextLine();
		Calendar date = Calendar.getInstance();
	    date.setTime(new Date(0));
	    Format f = new SimpleDateFormat("dd-MMMM-yyyy");
	    System.out.println(f.format(date.getTime()));
	    date.add(Calendar.YEAR,1);
	    System.out.println(f.format(date.getTime()));
		
	    
		if(decision == "random"){
			custom = false;
		}
		
		if(custom = true){
			System.out.println("Enter your characters name:");
			String name = in.nextLine();
			
			System.out.println("Enter the era you would like to play in:");
			System.out.println("[Modern]");
			
			
			System.out.println("Enter your charcters country of birth:");
			System.out.println("Enter your characters city of birth in their country:");
			
			
		}
			
		
		if(custom = false){
		
		//Character name = new Character(null, 0, Timestamp, null, null);
		}
		return test;
		
	}
	
	
}
