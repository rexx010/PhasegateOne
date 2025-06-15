import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class PhonebookFunction{

static ArrayList<ArrayList<String>> phonebookList = new ArrayList<>();

public static ArrayList<ArrayList<String>> addContact(String firstName, String lastName, String PhoneNumber){
ArrayList<String> contact = new ArrayList<>();
contact.add(firstName);
contact.add(lastName);
contact.add(PhoneNumber);
phonebookList.add(contact);
return phonebookList;
}


public static void viewContact(){
for(ArrayList<String>contacts : phonebookList){
for(String contact : contacts){
System.out.print(contact+" ");
}
System.out.println();
}
}




}