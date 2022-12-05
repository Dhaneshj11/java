package oops;
import java.util.*;
public class OrderingSystem {

	public static Scanner scanner = new Scanner(System.in);
	public static String again;
	public static int choose,quantity=1;
	public static double total=0,pay;
	public static int choice;

	public static void menu() {
		System.out.println("\t\t\t\t Welcome To FastFood Center");
		System.out.println("\t\t\t\t+========================+");
		System.out.println("\t\t\t\t   FastFood Menu     ");
		System.out.println("\t\t\t\t  1.Pizza               ");
		System.out.println("\t\t\t\t  a.Chicken Pizza   	Rs..180.00         ");
		System.out.println("\t\t\t\t  b.Veg Pizza       	Rs..100.00        ");
		System.out.println("\t\t\t\t  c.Jain Pizza      	Rs..130.00        ");
		System.out.println("");
		System.out.println("\t\t\t\t  2.Burger     ");
		System.out.println("\t\t\t\t  a.Chicken Burger  	Rs..120.00         ");
		System.out.println("\t\t\t\t  b.Veg Burger      	Rs..80.00        ");
		System.out.println("\t\t\t\t  c.Jain Burger     	Rs..90.00        ");
		System.out.println("");
		System.out.println("\t\t\t\t  3.Sandwich  ");
		System.out.println("\t\t\t\t  a.Chicken Sandwich    Rs..150.00         ");
		System.out.println("\t\t\t\t  b.Veg Sandwich        Rs..110.00        ");
		System.out.println("\t\t\t\t  c.Jain Sandwich       Rs..100.00        ");
		System.out.println("\t\t\t\t  4.Cancel              ");
		System.out.println("\t\t\t\t+========================+");
	}

	public static void order() {
		System.out.println("Press 1 for Pizza, Press 2 for Burger, Press 3 for Sandwich and Press 4 for Cancel");
		System.out.println("Press Number you want to buy? :");
		choose = scanner.nextInt();

		//conditions
		if(choose==1) {
			System.out.println("You choose Pizza");
			System.out.println("Which Pizza you want? ");
			System.out.println("Press 11 for Chicken Pizza, Press 12 for Veg Pizza, Press 13 for Jain Pizza ");
			System.out.println("Press code you want to buy? :");
			choice = scanner.nextInt();
			if(choice==11) {
				System.out.println("You choose Chicken Pizza ");
				System.out.println("How many Chicken pizza you want to buy: ");
				quantity=scanner.nextInt();
				total = total + (quantity*180);
				System.out.println("You want to buy again? ");
				System.out.println("Press Y for Yes and N for No : ");
				again = scanner.next();
			}

			else if(choice==12) {
				System.out.println("You choose Veg Pizza ");
				System.out.println("How many Veg pizza you want to buy: ");
				quantity=scanner.nextInt();
				total = total + (quantity*100);
				System.out.println("You want to buy again? ");
				System.out.println("Press Y for Yes and N for No : ");
				again = scanner.next();
			}

			else if(choice==13) {
				System.out.println("You choose Jain Pizza ");
				System.out.println("How many Jain pizza you want to buy: ");
				quantity=scanner.nextInt();
				total = total + (quantity*130);
				System.out.println("You want to buy again? ");
				System.out.println("Press Y for Yes and N for No : ");
				again = scanner.next();
			}
			else if(choice!=11 ||choice!=12 || choice!=13) {
				System.out.println("Invalid Code");
				order();
			}





			if(again.equalsIgnoreCase("Y")) {
				order();
			}

			else if(again.equalsIgnoreCase("N")){
				System.out.println("The total amount is "+total+" Rs");
				System.out.println("Enter a payment: ");
				pay = scanner.nextDouble();
				if(pay <= total) 
				{
					System.out.println("The Total Amount to be paid is "+total +" Rs"+ " and you pay "+pay+" Rs");
					total=0;
					System.out.println();
					order();
					System.out.println();

				}



				else {


					System.out.println("Total price is "+total+" Rs");
					total = pay-total;
					System.out.println("The Change is "+total+" Rs");
					System.out.println("Thank you! Visit Again..");
					System.exit(0);
				}

			}

			else {
				System.out.println("Enter Valid Input");

				System.out.println("Press Y for Yes and N for No : ");
				again=scanner.next();
				if(again.equalsIgnoreCase("Y")) {
					order();
				}

				else if(again.equalsIgnoreCase("N")){
					System.out.println("The total amount is "+total+" Rs");
					System.out.println("Enter a payment: ");
					pay = scanner.nextDouble();
					if(pay <= total) {
						System.out.println("The Total Amount to be paid is "+total +" Rs"+ " and you pay "+pay+" Rs");
						total=0;
						System.out.println();
						order();
					}
					else {
						System.out.println("Total price is "+total+" Rs");
						total = pay-total;
						System.out.println("The Change is "+total+" Rs");
						System.out.println("Thank you! Visit Again..");
						System.exit(0);
					}

				}

			}
		}


		//conditions Burger
		else if(choose==2) {
			System.out.println("You choose Burger");
			System.out.println("Which Pizza you want? ");
			System.out.println("Press 11 for Chicken Burger, Press 12 for Veg Burger, Press 13 for Jain Burger ");
			System.out.println("Press code you want to buy? :");
			choice = scanner.nextInt();
			if(choice==11) {
				System.out.println("You choose Chicken Burger ");
				System.out.println("How many Chicken Burger you want to buy: ");
				quantity=scanner.nextInt();
				total = total + (quantity*120);
				System.out.println("You want to buy again? ");
				System.out.println("Press Y for Yes and N for No : ");
				again = scanner.next();
			}

			else if(choice==12) {
				System.out.println("You choose Veg Burger ");
				System.out.println("How many Veg Burger you want to buy: ");
				quantity=scanner.nextInt();
				total = total + (quantity*80);
				System.out.println("You want to buy again? ");
				System.out.println("Press Y for Yes and N for No : ");
				again = scanner.next();
			}

			else if(choice==13) {
				System.out.println("You choose Jain Burger ");
				System.out.println("How many Jain Burger you want to buy: ");
				quantity=scanner.nextInt();
				total = total + (quantity*90);
				System.out.println("You want to buy again? ");
				System.out.println("Press Y for Yes and N for No : ");
				again = scanner.next();
			}
			else if(choice!=11 ||choice!=12 || choice!=13) {
				System.out.println("Invalid Code");
				order();
			}





			if(again.equalsIgnoreCase("Y")) {
				order();
			}

			else if(again.equalsIgnoreCase("N")){
				System.out.println("The total amount is "+total+" Rs");
				System.out.println("Enter a payment: ");
				pay = scanner.nextDouble();
				if(pay <= total) 
				{
					System.out.println("The Total Amount to be paid is "+total +" Rs"+ " and you pay "+pay+" Rs");
					total=0;
					System.out.println();
					order();
					System.out.println();

				}



				else {


					System.out.println("Total price is "+total+" Rs");
					total = pay-total;
					System.out.println("The Change is "+total+" Rs");
					System.out.println("Thank you! Visit Again..");
					System.exit(0);
				}

			}

			else {
				System.out.println("Enter Valid Input");

				System.out.println("Press Y for Yes and N for No : ");
				again=scanner.next();
				if(again.equalsIgnoreCase("Y")) {
					order();
				}

				else if(again.equalsIgnoreCase("N")){
					System.out.println("The total amount is "+total+" Rs");
					System.out.println("Enter a payment: ");
					pay = scanner.nextDouble();
					if(pay <= total) {
						System.out.println("The Total Amount to be paid is "+total +" Rs"+ " and you pay "+pay+" Rs");
						total=0;
						System.out.println();
						order();
					}
					else {
						System.out.println("Total price is "+total+" Rs");
						total = pay-total;
						System.out.println("The Change is "+total+" Rs");
						System.out.println("Thank you! Visit Again..");
						System.exit(0);
					}

				}

			}
		}

		// Sandwich
		else if(choose==3) {
			System.out.println("You choose Sandwich");
			System.out.println("Which Sandwich you want? ");
			System.out.println("Press 11 for Chicken Sandwich, Press 12 for Veg Sandwich, Press 13 for Jain Sandwich ");
			System.out.println("Press code you want to buy? :");
			choice = scanner.nextInt();
			if(choice==11) {
				System.out.println("You choose Chicken Sandwich ");
				System.out.println("How many Chicken Sandwich you want to buy: ");
				quantity=scanner.nextInt();
				total = total + (quantity*150);
				System.out.println("You want to buy again? ");
				System.out.println("Press Y for Yes and N for No : ");
				again = scanner.next();
			}

			else if(choice==12) {
				System.out.println("You choose Veg Sandwich ");
				System.out.println("How many Veg Sandwich you want to buy: ");
				quantity=scanner.nextInt();
				total = total + (quantity*110);
				System.out.println("You want to buy again? ");
				System.out.println("Press Y for Yes and N for No : ");
				again = scanner.next();
			}

			else if(choice==13) {
				System.out.println("You choose Jain Sandwich ");
				System.out.println("How many Jain Sandwich you want to buy: ");
				quantity=scanner.nextInt();
				total = total + (quantity*100);
				System.out.println("You want to buy again? ");
				System.out.println("Press Y for Yes and N for No : ");
				again = scanner.next();
			}
			else if(choice!=11 ||choice!=12 || choice!=13) {
				System.out.println("Invalid Code");
				order();
			}





			if(again.equalsIgnoreCase("Y")) {
				order();
			}

			else if(again.equalsIgnoreCase("N")){
				System.out.println("The total amount is "+total+" Rs");
				System.out.println("Enter a payment: ");
				pay = scanner.nextDouble();
				if(pay <= total) 
				{
					System.out.println("The Total Amount to be paid is "+total +" Rs"+ " and you pay "+pay+" Rs");
					total=0;
					System.out.println();
					order();
					System.out.println();

				}



				else {


					System.out.println("Total price is "+total+" Rs");
					total = pay-total;
					System.out.println("The Change is "+total+" Rs");
					System.out.println("Thank you! Visit Again..");
					System.exit(0);
				}

			}

			else {
				System.out.println("Enter Valid Input");

				System.out.println("Press Y for Yes and N for No : ");
				again=scanner.next();
				if(again.equalsIgnoreCase("Y")) {
					order();
				}

				else if(again.equalsIgnoreCase("N")){
					System.out.println("The total amount is "+total+" Rs");
					System.out.println("Enter a payment: ");
					pay = scanner.nextDouble();
					if(pay <= total) {
						System.out.println("The Total Amount to be paid is "+total +" Rs"+ " and you pay "+pay+" Rs");
						total=0;
						System.out.println();
						order();
					}
					else {
						System.out.println("Total price is "+total+" Rs");
						total = pay-total;
						System.out.println("The Change is "+total+" Rs");
						System.out.println("Thank you! Visit Again..");
						System.exit(0);
					}

				}

			}
		}



		else if(choose==4) {

			System.out.println("You cancel the order...");
			System.exit(0);
		}
		else {
			System.out.println("Choose 1 to 4 code only! ");
			order();
		}


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		order();

	}

}


