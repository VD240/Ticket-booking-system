
import java.util.Scanner;
public class TicketBookingSystem {
	static boolean[]seats=new boolean[50];
	public static void viewSeats() {
		System.out.println("\n-----viewseats----");
		for(int i=0;i<seats.length;i++) {
			if(seats[i]) {
				System.out.println("seats"+(i+1)+":Booked");
			}else {
				System.out.println("seats"+(i+1)+":Available");
			}
		}
	}
			public static void bookSeats(int seatNumber) {
				if(seatNumber<1||seatNumber>50) {
					System.out.print("Invalid Seat Number");
					return;
				}
				if(seats[seatNumber-1]) {
					System.out.print("seat already booked");
				}else{ (seats[seatNumber-1])=true;
				System.out.println("Seats "+seatNumber+" BookedSuccessfully.");
				}
			}
				public static void cancelSeats(int seatNumber) {
					if(seatNumber<1||seatNumber>50) {
						System.out.print("Invalid Seat Number");
						return;
					}
						
					if(seats[seatNumber-1]) {
						System.out.print("seat is not booked");
					}else{(seats[seatNumber-1])=false;
					System.out.print("Booking cancel for seat"+seatNumber);
					}
				}
				public  static void main(String args[]) {
					Scanner sc=new Scanner(System.in);
					System.out.print("How many seats you want to book?:");
					int count=sc.nextInt();
					sc.nextLine();
					System.out.print("Enter passenger name:");
					String name=sc.nextLine();
				System.out.print("Enter Passenger age:");
				int n=sc.nextInt();
				while(true) {
					System.out.println("\n========Ticket booking System======");
					System.out.println("1.view seats");
					System.out.println("2.Book seats");
				System.out.println("3.cancel seats");
				System.out.println("4.Exit");
				System.out.print("Enter Choice:");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					viewSeats();
					break;
				case 2:
					System.out.println("Enter seat Number for booking(1-50):");
					for (int i=0;i<count;i++) {
					System.out.print("Enter seat number: ");
				    int bookSeats=sc.nextInt();
				    bookSeats(bookSeats);
					}
		            break;
					
				case 3:	
					System.out.print("Enter seat Number for cancel(1-50):");
					int cancelSeats=sc.nextInt();
					cancelSeats(cancelSeats);
		            break;
				case 4:
					System.out.print("Thankyou for using ticket booking system");
					sc.close();
					System.exit(0);
					break;
				default:
				System.out.print("Invalid choice");
				}
				}
}
}
					
							
				



    

