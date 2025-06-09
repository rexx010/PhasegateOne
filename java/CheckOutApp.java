import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class CheckOutApp{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

//ArrayList<String> names = new ArrayList<>();
ArrayList<ArrayList<String>> productList = new ArrayList<>();
//ArrayList<Integer> price = new ArrayList<>();

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

	ArrayList<String> names = CheckOutAppFunction.named(customerName, cashierName);


	System.out.println(names);
	System.out.println(productList);


	break;

case 2:
	ArrayList<ArrayList<String>> itemList = CheckOutAppFunction.addMore();
	System.out.println(itemList);
	double [] sumed = CheckOutAppFunction.addMoreTotal();
	System.out.println(Arrays.toString(sumed));
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