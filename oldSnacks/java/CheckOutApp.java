import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class CheckOutApp{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

//ArrayList<String> names = new ArrayList<>();
ArrayList<ArrayList<String>> productList = new ArrayList<>();
//ArrayList<Integer> price = new ArrayList<>();
double vated = 17.50;
double billSum = 0;
double payment = 0;
double balance = 0;

String message = """
WELCOME TO SEMICOLON STORE:
===========================

Press 1 to enter the purchase details.
Press 2 to display customers invoice.
press 3 to print receipt.
press 0 to close app.
""";

boolean hold = true;
while(hold){
System.out.println(message);
int userChoice = input.nextInt();
System.out.println();
switch(userChoice){
case 1:
	String output = """
Enter each product detials in the user's cart...
================================================""";
	System.out.println(output);
	System.out.println();
	
	String product = null;
	int pieces = 0;
	double prices = 0;
	String decision = "yes";

	System.out.println("What is the customer's name?");
	String customerName = input.next();

	do{
	System.out.println("What did the user buy?");
	//System.out.println("rice\nbeans\ngarri\ntomato");
	product = input.next();

	System.out.println("How many pieces?");
	pieces = input.nextInt();

	System.out.println("How much per unit?");
	prices = input.nextDouble();

	productList = CheckOutAppFunction.addItem(product, pieces, prices);
	CheckOutAppFunction.calculation(pieces, prices);

	System.out.println("Add more items?");
	decision = input.next();

	}while(decision.equals("yes"));

	System.out.println("What is your name?");
	String cashierName = input.next();

	System.out.println("How much discount will he/she get?");
	int discount = input.nextInt();
	CheckOutAppFunction.discountCalculation(discount);

	ArrayList<String> names = CheckOutAppFunction.named(customerName, cashierName);


	break;

case 2:
	ArrayList<ArrayList<String>> itemList = CheckOutAppFunction.addMore();

	for(ArrayList<String> items : itemList){
	for(String item : items){
	System.out.print("\t"+"  "+item+"  ");
	}
	System.out.println();
	}

	double [] sumed = CheckOutAppFunction.addMoreTotal();
	for(double sum : sumed){
	System.out.println("\t\t\t\t\tSub Total: "+sum);
	}
	double discountSummed = CheckOutAppFunction.discounts();
	System.out.println("\t\t\t\t\tDiscount: "+discountSummed);
	vated = (vated / 100) * sumed[0];
	System.out.println("\t\t\t\t\tVAT @ 17.50%: "+vated);
	System.out.println("=================================================================================================");
	billSum = billSum + sumed[0];
	billSum = billSum - discountSummed + vated;
	System.out.println("\t\t\t\t\tBill Total: "+billSum);
	System.out.println("=================================================================================================");
	System.out.println("THIS IS NOT AN RECEIPT KINDLY PAY "+billSum);
	System.out.println("=================================================================================================");
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println("How much did the customer give you?");
	payment = input.nextDouble();
	break;

case 3:
	itemList = CheckOutAppFunction.addMore();

	for(ArrayList<String> items : itemList){
	for(String item : items){
	System.out.print("\t"+"  "+item+"  ");
	}
	System.out.println();
	}

	sumed = CheckOutAppFunction.addMoreTotal();
	for(double sum : sumed){
	System.out.println("\t\t\t\t\tSub Total: "+sum);
	}
	discountSummed = CheckOutAppFunction.discounts();
	System.out.println("\t\t\t\t\tDiscount: "+discountSummed);
	System.out.println("\t\t\t\t\tVAT @ 17.50%: "+vated);
	System.out.println("=================================================================================================");
	System.out.println("\t\t\t\t\tBill Total: "+billSum);
	System.out.println("\t\t\t\t\tAmount Paid "+payment);
	balance = billSum - payment;
	balance = Math.abs(balance);
	System.out.println("\t\t\t\t\tBalance "+balance);
	System.out.println("=================================================================================================");
	System.out.println("THANKS YOU FOR YOUR PATRONAGE");
	System.out.println("=================================================================================================");
	System.out.println();
	System.out.println();
	System.out.println();
	break;

case 0:
	hold = false;
	System.out.print("GoodBye");
	break;
default:
	System.out.print("Invalid input");


}


}
}

}