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
ArrayList<String> checking = new ArrayList
for(int count = 0; count < phonebookList.size(); count++){
if(phonebookList.get(count).get(0).equals(phone)){
ArrayList<String> checking = phonebookList(count);
}
}
return checking;
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












}