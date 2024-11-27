import java.util.Scanner;

public class IT24104258Lab5Q3 {
	public static void main (String[]args){
		
		Scanner input = new Scanner(System.in);
		
		int start_date,end_date,reserved_days,room_charge,discount_rate,total_amount;
		
		System.out.print ("Enter start date (1-31) : ");
		start_date = input.nextInt();
		
		System.out.print("Enter ending date (1-31) : ");
		end_date = input.nextInt();
		
		if ((start_date<1) || (start_date>31)){
			System.out.print("Error : Days must be between 1 and 31");
			
		}
		
		else if ((end_date<1) || (end_date>31)){
			System.out.print("Error : Days must be between 1 and 31");
			
		}
		
		else if (start_date>=end_date){
			System.out.print("Error : Start date must be less than End Date");
			
		}

		
		
		// calculations
		
		reserved_days = end_date - start_date;
		
		if (reserved_days <= 3){
			discount_rate = 0;
		}
		else if (reserved_days<=4){
			discount_rate = 10;
		}
		else {
			discount_rate = 20;
		}
		
		room_charge = 48000;
		total_amount = reserved_days*room_charge*(1-discount_rate/100);

		System.out.println("Room charges Per day 48000.0/=");
		System.out.println("No of days reserved : " + reserved_days);
		System.out.println("Total Amount to be paide : " + total_amount);
	
	
	
	
	
	
	}
}
