const input = require("prompt-sync");
const prompt = input();


 phonebookList = []
checking = [];
const addContact = function(firstName, lastName, PhoneNumber){
if(PhoneNumber.length !== 11 && PhoneNumber.charAt(0) !== '0' &&  PhoneNumber.charAt(2) !== '0'){
console.log("invalid length or invalid number... Try again");
}else if(PhoneNumber.charAt(1) !== '7' && PhoneNumber.charAt(1) !== '8' && PhoneNumber.charAt(1) !== '9'){
console.log("Error, second number should be 7, 8, or 9... Try again");
}else{
contact = [];
contact.push(firstName);
contact.push(lastName);
contact.push(PhoneNumber);
phonebookList.push(contact);
}
return phonebookList;
}


const viewContact = function(){
for(let count = 0; count < phonebookList.length; count++){
for(let counter = 0; counter < phonebookList[count].length; counter++){
console.log(phonebookList[count][counter]);
}

}
console.log();
}

const removeContact = function(name){
for(let count = 0; count < phonebookList.length; count++){
//ArrayList<String> checking = phonebookList.get(count);
if(phonebookList[count][0] === name){
phonebookList.splice(count, 1);
}
}

}


const searchByPhone = function(phone){
if(PhoneNumber.length !== 11 && PhoneNumber.charAt(0) !== '0' &&  PhoneNumber.charAt(2) !== '0'){
console.log("invalid length or invalid number... Try again");
}else if(PhoneNumber.charAt(1) !== '7' && PhoneNumber.charAt(1) !== '8' && PhoneNumber.charAt(1) !== '9'){
console.log("Error, second number should be 7, 8, or 9... Try again");
}else{
for(let count = 0; count < phonebookList.length; count++){
if(phonebookList[count][2] === phone){
checking = phonebookList[count];
}
}
}
return checking;
}


const searchByfirstname = function(firstname){
checking = [];
for(let count = 0; count < phonebookList.length; count++){
if(phonebookList[count][0] === firstname){
checking = phonebookList[count];
}
}
return checking;
}


const searchBysecondname = function(secondName){
checking = [];
for(let count = 0; count < phonebookList.length; count++){
if(phonebookList[count][1] === secondName){
checking = phonebookList[count];
}
}
return checking;
}


const EditContact = function(firstN){
checking = [];
for(let count = 0; count < phonebookList.length; count++){
if(phonebookList[count][0] === firstN){
console.log("Enter new first name");
let first = prompt();
console.log("Enter new second name");
let second = prompt();
console.log("Enter new phone number");
let phone = prompt();

checking.push(first);
checking.push(second);
checking.push(phone);

phonebookList[count] = checking;
}
}
}














console.log("What is your name?");
let userName = prompt();
console.log();

let message = "press 1 to Add contact.\npress 2 to View contact.\npress 3 to Remove contact.\npress 4 to Find contact by phone number.\npress 5 to Find contact by first name.\npress 6 to Find contact by last name.\npress 7 to Edit contact.\npress 0 to Exist Phonebook.";
let myCondition = true;
while(myCondition){
console.log("Welcome to your phonebook app MR. "+userName);
console.log(message);
console.log();
let userChoice = prompt();
switch(userChoice){
case "1":
	console.log("To add contact...");
	console.log("Enter the first name...");
	let firstName = prompt();
	console.log("Enter the second name...");
	let secondtName = prompt();
	console.log("Enter the phone number...");
	let phoneNumber = prompt();
	console.log();
	console.log("Contact saved...");
	console.log(firstName+" "+secondtName+" : "+phoneNumber);
	console.log();
	addContact(firstName, secondtName, phoneNumber);
	break;
case "2":
	viewContact();
	console.log();
	break;
case "3":
	console.log("Search contact by name");
	let contactName = prompt();
	removeContact(contactName);
	console.log("Contact deleted...");
	console.log();
	break;
case "4":
	console.log("Search contact by phoneNumber");
	let contactPhone = prompt();
	console.log();
	checking = [];
	checking = searchByPhone(contactPhone);
	for(let count = 0; count < checking.length; count++){
	console.log(checking[count]+" ");
	}
	console.log();
	break;
case "5":
	console.log("Search contact by first name");
	let contactFirstName = prompt();
	console.log();
	checking = [];
	checking = searchByfirstname(contactFirstName);
	for(let count = 0; count < checking.length; count++){
	console.log(checking[count]+" ");
	}
	console.log();
	break;
case "6":
	console.log("Search contact by first name");
	let contactSecondName = prompt();
	console.log();
	checking = [];
	checking = searchBysecondname(contactSecondName);
	for(let count = 0; count < checking.length; count++){
	console.log(checking[count]+" ");
	}
	console.log();
	break;
case "7":
	console.log("Enter the contact's first name to edit the contact info");
	let firstN = prompt();
	console.log();
	EditContact(firstN);
	console.log("Contact edited");
	console.log();
	break;
case "0":
	myCondition = false;
	console.log("Goodbye...");
	break;
default:
	console.log("Invalid input... Try again");
	break;


}

















}



