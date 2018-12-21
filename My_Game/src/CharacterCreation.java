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
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		
		boolean custom;
		String test = "test";
		System.out.println("Type random to make your own character.");
		String decision = in.nextLine();
		Calendar date = Calendar.getInstance();
	    date.setTime(new Date(0));
	    Format f = new SimpleDateFormat("dd-MMMM-yyyy");
	    
	    
		if(decision == "random"){
			custom = false;
		}
		
		if(custom = true){
			System.out.println("What year is the character born?");
			int year = in.nextInt();
			System.out.println("What month is your character born?");
			int month = in.nextInt(); 
			System.out.println("What day is your character born?");
			int day = in.nextInt();
			
			date.add(Calendar.YEAR,( year - 1970));
			date.add(Calendar.MONTH,(month - 1));
			date.add(Calendar.DAY_OF_MONTH,(day));


			String date1 = f.format(date.getTime());
			
			
			System.out.println("");
			System.out.println(date1);
			
			System.out.println("Enter your characters name:");
			String name = in.nextLine();
			System.out.println(name);
			
			System.out.println("Enter your charcters country of birth:");
			String country = in.nextLine();
			System.out.println(country);
			System.out.println("Enter your characters city of birth in their country:");
			String city = in.nextLine();
			System.out.println(city);
			
			
			
		}
			
		
		if(custom = false){
			date.add(Calendar.YEAR,(int) (Math.random() * 45) + 1);
			date.add(Calendar.MONTH,(int) (Math.random() * 12) + 1);
			date.add(Calendar.DAY_OF_MONTH,(int) (Math.random() * 30) + 1);

		//Character name = new Character(null, 0, Timestamp, null, null);
		}
		return test;
		
	}
	
	
}
