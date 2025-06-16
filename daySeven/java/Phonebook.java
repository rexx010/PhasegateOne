import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Phonebook{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("What is your name?");
String userName = input.nextLine();
System.out.println();

String message = """
press 1 to Add contact.
press 2 to View contact.
press 3 to Remove contact.
press 4 to Find contact by phone number.
press 5 to Find contact by first name.
press 6 to Find contact by last name.
press 7 to Edit contact.
press 0 to Exist Phonebook.
""";
boolean myCondition = true;
while(myCondition){
System.out.println("Welcome to your phonebook app MR. "+userName);
System.out.println(message);
System.out.println();
String userChoice = input.nextLine();
switch(userChoice){
case "1":
	System.out.println("To add contact...");
	System.out.println("Enter the first name...");
	String firstName = input.nextLine();
	System.out.println("Enter the second name...");
	String secondtName = input.nextLine();
	System.out.println("Enter the phone number...");
	String phoneNumber = input.nextLine();
	System.out.println();
	System.out.println(firstName+" "+secondtName+" : "+phoneNumber);
	System.out.println();
	PhonebookFunction.addContact(firstName, secondtName, phoneNumber);
	break;
case "2":
	PhonebookFunction.viewContact();
	System.out.println();
	break;
case "3":
	System.out.println("Search contact by name");
	String contactName = input.nextLine();
	PhonebookFunction.removeContact(contactName);
	System.out.println("Contact deleted...");
	System.out.println();
	break;
case "4":
	System.out.println("Search contact by phoneNumber");
	String contactPhone = input.nextLine();
	System.out.println();
	ArrayList<String> checking = new ArrayList<>();
	checking = PhonebookFunction.searchByPhone(contactPhone);
	for(String details : checking){
	System.out.print(details+" ");
	}
	System.out.println();
	break;
case "5":
	System.out.println("Search contact by first name");
	String contactFirstName = input.nextLine();
	System.out.println();
	checking = new ArrayList<>();
	checking = PhonebookFunction.searchByfirstname(contactFirstName);
	for(String details : checking){
	System.out.print(details+" ");
	}
	System.out.println();
	break;
case "6":
	System.out.println("Search contact by first name");
	String contactSecondName = input.nextLine();
	System.out.println();
	checking = new ArrayList<>();
	checking = PhonebookFunction.searchBysecondname(contactSecondName);
	for(String details : checking){
	System.out.print(details+" ");
	}
	System.out.println();
	break;
case "7":
	System.out.println("Enter the contact's first name to edit the contact info");
	String firstN = input.nextLine();
	System.out.println();
	PhonebookFunction.EditContact(firstN);
	System.out.println("Contact edited");
	System.out.println();
	break;
case "0":
	myCondition = false;
	System.out.println("Goodbye...");
	break;
default:
	System.out.println("Invalid input... Try again");
	break;


}

















}



}
}