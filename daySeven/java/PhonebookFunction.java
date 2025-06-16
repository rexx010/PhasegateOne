import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class PhonebookFunction{

static Scanner input = new Scanner(System.in);

static ArrayList<ArrayList<String>> phonebookList = new ArrayList<>();
static ArrayList<String> checkingP = new ArrayList<>();

public static ArrayList<ArrayList<String>> addContact(String firstName, String lastName, String PhoneNumber){
if(PhoneNumber.length() != 11 && PhoneNumber.charAt(0) != '0' &&  PhoneNumber.charAt(2) != '0'){
System.out.print("invalid length or invalid number... Try again");
}else if(PhoneNumber.charAt(1) != '7' && PhoneNumber.charAt(1) != '8' && PhoneNumber.charAt(1) != '9'){
System.out.print("Error, second number should be 7, 8, or 9... Try again");
}else{
ArrayList<String> contact = new ArrayList<>();
contact.add(firstName);
contact.add(lastName);
contact.add(PhoneNumber);
phonebookList.add(contact);
System.out.println("Contact saved...");
}
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

public static void removeContact(String name){
for(int count = 0; count < phonebookList.size(); ){
//ArrayList<String> checking = phonebookList.get(count);
if(phonebookList.get(count).get(0).equalsIgnoreCase(name)){
phonebookList.remove(count);
}else{
count++;
}

}
}


public static ArrayList<String> searchByPhone(String phone){
if(phone.length() != 11 && phone.charAt(0) != '0' &&  phone.charAt(2) != '0'){
System.out.print("invalid length or invalid number... Try again");
}else if(phone.charAt(1) != '7' && phone.charAt(1) != '8' && phone.charAt(1) != '9'){
System.out.print("Error, second number should be 7, 8, or 9... Try again");
}else{
for(int count = 0; count < phonebookList.size(); count++){
if(phonebookList.get(count).get(2).equals(phone)){
checkingP = phonebookList.get(count);
}
}
}
return checkingP;
}


public static ArrayList<String> searchByfirstname(String firstname){
ArrayList<String> checking = new ArrayList<>();
for(int count = 0; count < phonebookList.size(); count++){
if(phonebookList.get(count).get(0).equals(firstname)){
checking = phonebookList.get(count);
}
}
return checking;
}


public static ArrayList<String> searchBysecondname(String secondName){
ArrayList<String> checking = new ArrayList<>();
for(int count = 0; count < phonebookList.size(); count++){
if(phonebookList.get(count).get(1).equals(secondName)){
checking = phonebookList.get(count);
}
}
return checking;
}


public static void EditContact(String firstN){
ArrayList<String> checking = new ArrayList<>();
for(int count = 0; count < phonebookList.size(); count++){
if(phonebookList.get(count).get(0).equals(firstN)){
System.out.println("Enter new first name");
String first = input.nextLine();
System.out.println("Enter new second name");
String second = input.nextLine();
System.out.println("Enter new phone number");
String phone = input.nextLine();

checking.add(first);
checking.add(second);
checking.add(phone);

phonebookList.set(count, checking);
}
}
}












}