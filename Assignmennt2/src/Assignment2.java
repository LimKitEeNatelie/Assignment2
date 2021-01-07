import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Welcome to Natelie's Boat Shop");
		System.out.print("Please enter your name: ");
		String name = in.next();
		
		System.out.print("Please enter your IC number: ");
		String ic = in.next();
		
		System.out.print("Please enter your phone number: ");
		String hp = in.next();
		
		System.out.println();
		
		System.out.println("Here's our list for out brand and type of boat:");
		System.out.println("1.MasterCraft Canoe = RM1000"+ "\n"+ "2.Bayliner Canoe = RM900" + "\n" + "3.MasterCraft Sailboat = RM62000" +"\n" +"4.Bayliner Sailboat = RM60000");
		System.out.print("Please enter the number to purchase (1 = MasterCraft Canoe etc): ");
		int number = in.nextInt();
		System.out.print("Please enter the amount you want to purchase (maximum 2): ");
		int amount = in.nextInt();
		
		System.out.println();
		int number2=0;
		number2=number;
		do {
			number2++;
		} while (number2<=4);
		System.out.println("Your number is " +number2);
		
		int amount2=0;
	    amount2=amount;
		while(amount2<=2) {
			System.out.println("Your amount is " + amount2);
			amount2++;
		}
		
		System.out.println();
		
	
		int totalprice =0;
		if (number == 1 && amount == 1) {
			totalprice = 1000;
			System.out.println("Confirmation: Your purchase is 1 MasterCraft Canoe" +"\n" + "Totalprice is RM1000");
		} else if (number == 1 && amount == 2) {
			totalprice = 2000;
			System.out.println("Confirmation: Your purchase is 2 MasterCraft Canoe" +"\n" + "Totalprice is RM2000");
		} else if (number == 2 && amount == 1) {
			totalprice = 900;
			System.out.println("Confirmation: Your purchase is 1 Bayliner Canoe" +"\n" + "Totalprice is RM900");
		} else if (number == 2 && amount == 2){
			totalprice = 1800;
			System.out.println("Confirmation: Your purchase is 2 Bayliner Canoe" +"\n" + "Totalprice is RM1800");
		} else if (number == 3 && amount == 1){
			totalprice = 62000;
			System.out.println("Confirmation: Your purchase is 1 MasterCraft Sailboat" +"\n" + "Totalprice is RM62000");
		} else if (number == 3 && amount == 2) {
			totalprice = 124000;
			System.out.println("Confirmation: Your purchase is 2 MasterCraft Sailboat" +"\n" + "Totalprice is RM124000");
		} else if (number == 4 && amount == 1) {
			totalprice = 60000;
			System.out.println("Confirmation: Your purchase is 1 Bayliner Sailboat" +"\n" + "Totalprice is RM60000");
		} else if (number == 4 && amount == 2) {
			totalprice = 120000;
			System.out.println("Confirmation: Your purchase is 2 Bayliner Sailboat" +"\n" + "Totalprice is RM120000");
		} else {
			System.out.println("Not valid");
		}
			
		System.out.println();
		
		System.out.println("Here's a good news for you! Due to our YEAR-END PROMOTION, You will be entitiled for 20% off for your purchase!");
		int discount = (totalprice*20)/100;
		int pricetobepaid = totalprice - discount;
		
		System.out.println("Total price: RM" +totalprice );
		System.out.println("Discount received: RM" +discount);
		System.out.println("Price to be paid: RM" +pricetobepaid);
		System.out.println("To express my greatest gratitude, I would like to say");
		for(int tq=1; tq<=3;tq++) {
			System.out.println("Thank you so much!");
		}
		System.out.println("Hope to see you soon again! Have a nice day :)");
		
		
		in.close();
		

	
	}

}
