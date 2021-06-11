package pack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome!");
		System.out.println();
		System.out.println("Do you want to Sign up or Sign in ?");
		System.out.println("1- Sign up");
		System.out.println("2- Sign in");
		System.out.println();
		
		int choice1 ;
		choice1 = sc.nextInt() ;
		System.out.println();
		
		String Email , Password ;
		if (choice1 == 1)
		{
			String name , MobileNum ;
			System.out.println("Enter your name :");
			name = sc.next() ;
			System.out.println();
			
			System.out.println("Enter your mobile number: ");
			MobileNum = sc.next() ;
			System.out.println();
			
			System.out.println("Enter your email: ");
			Email = sc.next();
			System.out.println();
			
			System.out.println("Enter password: ");
			Password = sc.next() ;
			System.out.println();
			
			SignUp SU1 = new SignUp();
			SU1.setName(name);
			SU1.setMobileNumber(MobileNum);
			SU1.setEMail(Email);
			SU1.setPassword(Password);
			//System.out.println();
		}
		else if (choice1 == 2)
		{
			
			System.out.println("Enter your email: ");
			Email = sc.next();
			System.out.println();
			
			System.out.println("Enter password: ");
			Password = sc.next() ;
			System.out.println();
			
			SignIn SN1 = new SignIn ();
			SN1.setEMail(Email);
			SN1.setPassword(Password);
			//System.out.println();
		}
		
		 System.out.println("Are you player or playground owner ? ");
		 System.out.println("1- Player");
		 System.out.println("2- Playground owner");
		 System.out.println();
		 
		 int choice2 ;
		 choice2 = sc.nextInt() ;
		 System.out.println();
		 
		 String location ;
		 float size ;
		 float price ;
		 float freeSlots ;
		 String response ;
		 String PlaygroundName ;
		 String teamName ;
		 int teamMemberNum ;
		 
		 /**
		  * player
		  */
		 if (choice2 ==1 )
		 {
			 System.out.println("Which do you want to do ? ");
			 System.out.println("1- Open profile page");
			 System.out.println("2- Book playground" );
			 System.out.println("3- Cancel booking");
			 System.out.println("4- Join team");
			 System.out.println("5- Show my all resrvations");
			 System.out.println();
			 
			 int choice3 ;
			 choice3 = sc.nextInt() ;
			 System.out.println();
			 
			 /**
			  * Open profile page
			  */
			 if (choice3 == 1) {
				 ProfilePage pp1 = new ProfilePage();
				 System.out.println("Your name:" + pp1.getName());
				 System.out.println("Your mobile number: " + pp1.getMobileNumber()) ;
				 System.out.println("Your email: "+ pp1.getEmail()) ;
				 System.out.println();
				 
			 }
			 
			 /**
			  * Book playground
			  */
			 else if (choice3 == 2) {          //I want to create an array for all bookings here   
				 BookingPlayground Bp1 = new BookingPlayground();
				 System.out.println("Location :" + Bp1.getLocation());  
				 System.out.println("size = " + Bp1.getSize());
				 System.out.println("Price = " + Bp1.getPrice());
				 System.out.println("free sloats : " + Bp1.getFreeSloats());
				 System.out.println();
				 
				 
				 String sloat ;
				 float money ;
				
				 //will create an array 
				 System.out.println("Choose location :");
				 location = sc.next();
				 System.out.println();
				 
				 System.out.println("Choose a playground :");
				 PlaygroundName = sc.next() ;
				 System.out.println();
				 
				 System.out.println("Choose a sloat :");
				 sloat = sc.next() ;
				 System.out.println();
				 
				 System.out.println("Enter a Team name :");
				 teamName = sc.next() ;
				 System.out.println();
				 
				 System.out.println("Enter a number of a team members :");
				 teamMemberNum = sc.nextInt();
				 System.out.println();
				 
				 System.out.println("Pay money :");
				 money = sc.nextFloat() ;
				 System.out.println();
				 
				 Bp1.setLocation(location);
				 Bp1.SetPlaygroundName(PlaygroundName);
				 Bp1.setsloat(sloat);
				 Bp1.setTeamName(teamName);
				 Bp1.setTeamMemberNum(teamMemberNum);
				 Bp1.payMoney(money);
				 
				 response = sc.next() ;
				 Bp1.setResponse(response);
				 System.out.println("response : " + Bp1.getResponse());
				 System.out.println();
				 
			 }
			 
			 /**
			  * Cancel booking
			  */
			 else if (choice3 == 3) {
				 CancelingBooking CB1 = new CancelingBooking();
				 System.out.println("Your all requests" + CB1.getMyRequest());
				 
				 System.out.println("Choose a playground to be canceled :");
				 PlaygroundName = sc.next() ;
				 System.out.println();
				 CB1.SetPlaygroundName(PlaygroundName);
				 
				 response = sc.next() ;
				 CB1.setResponse(response);
				 System.out.println("response : " + CB1.getResponse());
				 System.out.println();
			 }
			 
			 /**
			  * Join team
			  */
			 else if (choice3 == 4) {
				 JoinTeam JT1 = new JoinTeam();
				 System.out.println("Team Names : " + JT1.getTeamName() ); //will use an array
				 System.out.println("A number of team members :" + JT1.getTeamMemberNum());
				 
				 System.out.println("Choose a team you want to join:");
				 teamName = sc.next(); //will use an array
				 System.out.println();
				 JT1.setTeamName(teamName);
				 
				 response = sc.next() ;
				 JT1.setResponse(response);
				 System.out.println("response : " + JT1.getResponse());
				 System.out.println();
			 }
			 
			 /**
			  * Show my all reservations
			  */
			 else if (choice3 == 5) { //(will use an array)
				 Reservations r1 = new Reservations ();
				 System.out.println("Your all reservation : " + r1.getPlaygroundName() );
				 System.out.println();
			 }
			 else {
					System.out.println("Please, choose an option"); 
				 }
			 
		 }
		 
			 /**
			  * playground owner 
			  */
		 else if (choice2 == 2) {
			 System.out.println("Which do you want to do ? ");
			 System.out.println("1- Open profile page");
			 System.out.println("2- Regeist a new playground" );
			 System.out.println("3- Resieve all requests");
			 System.out.println("4- Show my all booked playgrounds");
			 System.out.println();
			 
			 int choice4 ;
			 choice4 = sc.nextInt() ;
			 System.out.println();
			 
			 /**
			  * Open Profile page 
			  */
			 if (choice4 == 1) { 
				 ProfilePage pp2 = new ProfilePage();
				 System.out.println("Your name:" + pp2.getName());
				 System.out.println("Your mobile number: " + pp2.getMobileNumber()) ;
				 System.out.println("Your email: "+ pp2.getEmail()) ;
				 System.out.println();
			 }
			 
			 /**
			  * Regesit a new playground  
			  */
			 else if (choice4 == 2) {         //I want to create an array for all bookings here
				 RegestringNewPlayground RNP1 = new RegestringNewPlayground();
				 
				 String message;
				 String choosen ;
				
				 //will create an array 
				 System.out.println("Enter a location :");
				 location = sc.next();
				 System.out.println();
				 
				 System.out.println("Enter Size :");
				 size = sc.nextFloat();
				 System.out.println();
				 
				 System.out.println("Enter price:");
				 price = sc.nextFloat();
				 System.out.println();
				 
				 System.out.println("Enter free sloats :");
				 freeSlots = sc.nextFloat();
				 System.out.println();
				 
				 RNP1.setLocation(location);
				 RNP1.setSize(size);
				 RNP1.setPrice(price);
				 RNP1.setFreeSlots(freeSlots);
				 
				 message = sc.next();
				 RNP1.setMessage(message);
				 RNP1.getMessage();
				 choosen = sc.next();
				 System.out.println();
				 
				 response = sc.next() ;
				 RNP1.setResonse(response);
				 System.out.println("response : " + RNP1.getResponse());
				 System.out.println();
			 }
			 
			 /**
			  * Receivi all requests
			  */
			 else if (choice4 == 3) {
				 RecevingRequests RR1 = new RecevingRequests ();
				 System.out.println("Do you want Playground's names or Team's names");
				 System.out.println("1- Playground's names");
				 System.out.println("2- Team's names");
				 System.out.println();
				 
				 int choice5 ;
				 choice5 = sc.nextInt();
				 System.out.println();
				 
				 if (choice5 == 1) {
				 System.out.println("Playground's name :" + RR1.getPlaygroundName()); 
				 response = sc.next() ;
				 RR1.setResonse(response);
				 System.out.println("response : " + RR1.getResponse());
				 System.out.println();
				 }
				 
				 else if (choice5 == 2) {
				 System.out.println("Team's name" + RR1.getTeamName());
				 response = sc.next() ;
				 RR1.setResonse(response);
				 System.out.println("response : " + RR1.getResponse());
				 System.out.println();
				 }
			 }
			 
			 /**
			  * Show my all booked playgrounds
			  */
			 else if (choice4 == 4) {
				 Reservations r2 = new Reservations ();
				 System.out.println("Your all reservation : " + r2.getLocation());
				 System.out.println();
			 }
			 else {
				 System.out.println("Please, choose an option");
			 }
		 }
		 
	}

	}

