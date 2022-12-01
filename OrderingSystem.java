package oops;
import java.util.*;
public class OrderingSystem {
	
	public static Scanner input = new Scanner(System.in);
	public static String again;
	public static int choose,quantity=1;
	public static double total=0,pay;
	
	
	public static void menu() {
		System.out.println("\t\t\t\t Welcome To FastFood Center");
		System.out.println("\t\t\t\t+========================+");
		System.out.println("\t\t\t\t   FastFood Menu     ");
		System.out.println("\t\t\t\t  1.Pizza      Rs..45.00");
		System.out.println("\t\t\t\t  2.Burger     Rs..40.00");
		System.out.println("\t\t\t\t  3.Sandwich   Rs..35.00");
		System.out.println("\t\t\t\t  4.Cancel              ");
		System.out.println("\t\t\t\t+========================+");
	}
	
	public static void order() {
		System.out.println("Press 1 for Pizza, Press 2 for Burger, Press 3 for Sandwich and Press 4 for Cancel");
		System.out.println("Press you want to buy? :");
		choose = input.nextInt();
		
		//conditions
		if(choose==1) {
			System.out.println("You choose Pizza");
			System.out.print("How many pizza you want to buy: ");
			quantity=input.nextInt();
			total = total + (quantity*45);
			
			System.out.println("You want to buy again? ");
			System.out.println("Press Y for Yes and N for No : ");
		
			again = input.next();
			if(again.equalsIgnoreCase("Y")) {
				order();
			}
			
			else if(again.equalsIgnoreCase("N")){
				System.out.println("Enter a payment: ");
				pay = input.nextDouble();
				if(pay <= total) 
				{
					System.out.println("The Total Amount to be paid is "+total +" and you pay "+pay);
					
					
				}
				
				
				
				else {
					
					
					System.out.println("Total price is "+total);
					total = pay-total;
					System.out.println("The Change is "+total);
				}
				
			}
				
			else {
				System.out.println("Enter valid input");
				
				System.out.println("Press Y for Yes and N for No : ");
				again=input.next();
				if(again.equalsIgnoreCase("Y")) {
					order();
				}
				
				else if(again.equalsIgnoreCase("N")){
					System.out.println("Enter a payment: ");
					pay = input.nextDouble();
					if(pay <= total) {
						System.out.println("The Total Amount to be paid is "+total +" and you pay "+pay);
					}
					else {
						System.out.println("Total price is "+total);
						total = pay-total;
						System.out.println("The Change is "+total);
					}
					
				}
				
				
			}
			
			
		}
		else if(choose==2){
			System.out.println("You choose Burger");
			System.out.print("How many Burger you want to buy: ");
			quantity=input.nextInt();
			total = total + (quantity*40);
			
			System.out.println("You want to buy again? ");
			System.out.println("Press Y for Yes and N for No : ");
		
			again = input.next();
			if(again.equalsIgnoreCase("Y")) {
				order();
			}
			
			else if(again.equalsIgnoreCase("N")){
				System.out.println("Enter a payment: ");
				pay = input.nextDouble();
				if(pay <= total) {
					System.out.println("The Total Amount to be paid is "+total +" and you pay "+pay);
				}
				else {
					System.out.println("Total price is "+total);
					total = pay-total;
					System.out.println("The Change is "+total);
				}
				
			}
				
			else {
				System.out.println("Enter valid input");
				
				System.out.println("Press Y for Yes and N for No : ");
				again=input.next();
				if(again.equalsIgnoreCase("Y")) {
					order();
				}
				
				else if(again.equalsIgnoreCase("N")){
					System.out.println("Enter a payment: ");
					pay = input.nextDouble();
					if(pay <= total) {
						System.out.println("The Total Amount to be paid is "+total +" and you pay "+pay);
					}
					else {
						System.out.println("Total price is "+total);
						total = pay-total;
						System.out.println("The Change is "+total);
					}
					
				}
				
				
			}
			
			
		}
		else if(choose==3) {
			System.out.println("You choose Sandwich");
			System.out.print("How many Sandwich you want to buy: ");
			quantity=input.nextInt();
			total = total + (quantity*35);
			
			System.out.println("You want to buy again? ");
			System.out.println("Press Y for Yes and N for No : ");
		
			again = input.next();
			if(again.equalsIgnoreCase("Y")) {
				order();
			}
			
			else if(again.equalsIgnoreCase("N")){
				System.out.println("Enter a payment: ");
				pay = input.nextDouble();
				if(pay <= total) {
					System.out.println("The Total Amount to be paid is "+total +" and you pay "+pay);
				}
				else {
					System.out.println("Total price is "+total);
					total = pay-total;
					System.out.println("The Change is "+total);
				}
				
			}
				
			else {
				System.out.println("Enter valid input");
			
				System.out.println("Press Y for Yes and N for No : ");
				again=input.next();
				if(again.equalsIgnoreCase("Y")) {
					order();
				}
				
				else if(again.equalsIgnoreCase("N")){
					System.out.println("Enter a payment: ");
					pay = input.nextDouble();
					if(pay <= total) 
					{
						System.out.println("The Total Amount to be paid is "+total +" and you pay "+pay);
					
						System.out.println("dfdskfk");
						
					}
				}
					
				
					else 
					{
						System.out.println("Total price is "+total);
						total = pay-total;
						System.out.println("The Change is "+total);
					}
					
				
				
				
			}
			
			
		}
		else if(choose==4) {
			
			System.out.println("You cancel the order...");
			System.exit(0);
		}
		else {
			System.out.println("Choose 1 to 4 only! ");
			order();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		order();

	}

}
