const input = require("prompt-sync");
const prompt = input();

 



productList = [];
namesused = [];
itemTotal = [];
let discountSum = 0;
let vatSum = 0;
let vatAmount = 17.50;
let totalBill = 0;

const named = function (customerName,  cashierName){
namesused.push(customerName);
namesused.push(cashierName);
return namesused;
}

const addItem = function(item, pieces, price ){
productss = productBox(item, pieces, price);
productList.push(productss);
return productList;
}


const productBox = function(item, pieces, price){
products = [];
products.push(item);
products.push(pieces);
products.push(price);

let total = pieces * price;

products.push(total);

return products;
}

const calculation = function(pieces, price ){
let num = pieces * price;
itemTotal.push(num);
return itemTotal;
}

/*const total = function(pieces, price ){
let addTo = [];
let sum = pieces * price;
addTo[0] = addTo[0] + sum;
return addTo;
}*/

const discountCalculation = function(discount){
discountSum = discount / 100;
let sum = 0;
for(let count = 0; count < itemTotal.length; count++){
sum += itemTotal[count];
}
discountSum = discountSum * sum;
return discountSum;
}

const vatCalculation = function(){
vatSum = vatAmount / 100;
vatSum = vatSum * itemTotal[0];
return vatSum;
}

const billCalculation = function(){
totalBill = totalBill + itemTotal[0];
return totalBill;
}

const addMore = function(){

console.log("SEMICOLON STORES \nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 03293828343\nDATE: 18-DEC-22 8:48:11 pm");
console.log("Cashier: " + namesused[1]);
console.log("Customer Name: " + namesused[0]);
console.log("=======================================================================================================");
console.log("\t\t\tITEM\tQUANTITY\tPRICE\tTOTAL(NGN)");
console.log("--------------------------------------------------------------------------------------------------------");
console.log();
return productList;


}

const addMoreTotal = function(){
console.log("--------------------------------------------------------------------------------------------------------");
return itemTotal;
}

const discounts = function(){
return discountSum;
}








productList = []

let vated = 17.50;
let billSum = 0;
let payment = 0;
let balance = 0;

message = "WELCOME TO SEMICOLON STORE:\n===========================\n\nPress 1 to enter the purchase details.\nPress 2 to display customers invoice.\npress 3 to prlet receipt.\npress 0 to close app.";

let hold = true;
while(hold){
console.log(message);
let userChoice = prompt();
console.log();
switch(userChoice){
case '1':
	let output = "Enter each product detials in the user's cart...\n================================================";
	console.log(output);
	console.log();
	
	let product = null;
	let pieces = 0;
	let prices = 0;
	let decision = "yes";

	console.log("What is the customer's name?");
	let customerName = prompt();

	do{
	console.log("What did the user buy?");
	//console.log("rice\nbeans\ngarri\ntomato");
	product = prompt();

	console.log("How many pieces?");
	pieces = Number(prompt());

	console.log("How much per unit?");
	prices = Number(prompt());

	productList = addItem(product, pieces, prices);
	calculation(pieces, prices);

	console.log("Add more items?");
	decision = prompt();

	}while(decision === "yes");

	console.log("What is your name?");
	let cashierName = prompt();

	console.log("How much discount will he/she get?");
	let discount = prompt();
	discountCalculation(discount);
	named(customerName, cashierName);

	break;

case '2':
	itemList = addMore();
	console.log("\t"+"  "+itemList+"  ");
	console.log();

	let sumed = addMoreTotal();
	let total = 0;
	for(let count = 0; count < sumed.length; count++){
	total += sumed[count];
	}
	console.log("\t\t\t\t\tSub Total: "+total);
	
	let discountSummed = discounts();
	console.log("\t\t\t\t\tDiscount: "+discountSummed);
	vated = (vated / 100) * total;
	console.log("\t\t\t\t\tVAT @ 17.50%: "+vated);
	console.log("=================================================================================================");
	billSum = billSum + total;
	billSum = billSum - discountSummed + vated;
	console.log("\t\t\t\t\tBill Total: "+billSum);
	console.log("=================================================================================================");
	console.log("THIS IS NOT AN RECEIPT KINDLY PAY "+billSum);
	console.log("=================================================================================================");
	console.log();
	console.log();
	console.log();
	console.log("How much did the customer give you?");
	payment = Number(prompt());
	break;

case '3':
	itemList = addMore();
	console.log("\t"+"  "+itemList+"  ");
	console.log();

	let addition = addMoreTotal();
	let total2 = 0;
	for(let count = 0; count < addition.length; count++){
	total2 += addition[count];
	}
	console.log("\t\t\t\t\tSub Total: "+total2);

	let discountSummed1 = discounts();
	console.log("\t\t\t\t\tDiscount: "+discountSummed1);
	console.log("\t\t\t\t\tVAT @ 17.50%: "+vated);
	console.log("=================================================================================================");
	console.log("\t\t\t\t\tBill Total: "+billSum);
	console.log("\t\t\t\t\tAmount Paid "+payment);
	balance = billSum - payment;
	balance = Math.abs(balance);
	console.log("\t\t\t\t\tBalance "+balance);
	console.log("=================================================================================================");
	console.log("THANKS YOU FOR YOUR PATRONAGE");
	console.log("=================================================================================================");
	console.log();
	console.log();
	console.log();
	break;

case '0':
	hold = false;
	console.log("GoodBye");
	break;
default:
	console.log("Invalid prompt");


}


}







