const input = require("prompt-sync");
const prompt = input();


const validate = function(atm){


if(atm[0] < 3 || atm[0] > 6){
console.log();
console.log("Credit Card Type: Invalid Card");

let GodSaveMe = " ";
for(let number = 0; number < atm.length; number++){
GodSaveMe += atm[number];
}
console.log("Credit Card Number: "+GodSaveMe);
console.log("Credit Card Digit Length: "+atm.length);
console.log("Credit Card Validity: Invalid");
console.log();
console.log();

}else if(atm[0] == 4){
	console.log("Credit Card Type: Visa card");

	let secondDigits = 0;
	let oddPlace = 0;

	for(let count = 0; count < atm.length; count += 2){
		let checker = atm[count] * 2;
		let mod = 0;
		let div = 0;
		if(checker > 9){
			mod = checker % 10;
			div = checker / 10;
			secondDigits += Math.floor(mod + div);
		}else{
			secondDigits += checker;
		}
	}

	for(let counter = 1; counter < atm.length; counter += 2){
		oddPlace += atm[counter];
	}
	let total = secondDigits + oddPlace;
	if(total % 10 == 0){
		let GodSaveMe = " "; 
		for(let number = 0; number < atm.length; number++){
		GodSaveMe += atm[number];
		}
	console.log("Credit Card Number: "+GodSaveMe);
	console.log("Credit Card Digits: "+num1);
	console.log("Credit Card Validity Status: Valid");
console.log();
console.log();
	}else{
		let GodSaveMe = " "; 
		for(let number = 0; number < atm.length; number++){
		GodSaveMe += atm[number];
		}
	console.log("Credit Card Number: "+GodSaveMe);
	console.log("Credit Card Digits: "+num1);
	console.log("Credit Card Validity Status: Invalid");
console.log();
console.log();
	}

}else if(atm[0] == 5){
console.log("Credit Card Type: Master card");

	let secondDigits = 0;
	let oddPlace = 0;

	for(let count = 0; count < atm.length; count += 2){
		let checker = atm[count] * 2;
		let mod = 0;
		let div = 0;
		if(checker > 9){
			mod = checker % 10;
			div = checker / 10;
			secondDigits += Math.floor(mod + div);
		}else{
			secondDigits += checker;
		}
	}

	for(let counter = 1; counter < atm.length; counter += 2){
		oddPlace += atm[counter];
	}
	let total = secondDigits + oddPlace;

	if(total % 10 == 0){
		let GodSaveMe = " "; 
		for(let number = 0; number < atm.length; number++){
		GodSaveMe += atm[number];
		}
	console.log("Credit Card Number: "+GodSaveMe);
	console.log("Credit Card Digits: "+num1);
	console.log("Credit Card Validity Status: Valid");
console.log();
console.log();
	}else{
		let GodSaveMe = " "; 
		for(let number = 0; number < atm.length; number++){
		GodSaveMe += atm[number];
		}
	console.log("Credit Card Number: "+GodSaveMe);
	console.log("Credit Card Digits: "+num1);
	console.log("Credit Card Validity Status: Invalid");
console.log();
console.log();
	}


}else if(atm[0] == 6){
console.log("Credit Card Type: Discover card");

	let secondDigits = 0;
	let oddPlace = 0;

	for(let count = 0; count < atm.length; count += 2){
		let checker = atm[count] * 2;
		let mod = 0;
		let div = 0;
		if(checker > 9){
			mod = checker % 10;
			div = checker / 10;
			secondDigits += Math.floor(mod + div);
		}else{
			secondDigits += checker;
		}
	}

	for(let counter = 1; counter < atm.length; counter += 2){
		oddPlace += atm[counter];
	}
	let total = secondDigits + oddPlace;

	if(total % 10 == 0){
		let GodSaveMe = " "; 
		for(let number = 0; number < atm.length; number++){
		GodSaveMe += atm[number];
		}
	console.log("Credit Card Number: "+GodSaveMe);
	console.log("Credit Card Digits: "+num1);
	console.log("Credit Card Validity Status: Valid");
console.log();
console.log();
	}else{
		let GodSaveMe = " "; 
		for(let number = 0; number < atm.length; number++){
		GodSaveMe += atm[number];
		}
	console.log("Credit Card Number: "+GodSaveMe);
	console.log("Credit Card Digits: "+num1);
	console.log("Credit Card Validity Status: Invalid");
console.log();
console.log();
	}


}else if(atm[0] == 3 && atm[1] == 7){
console.log("Credit Card Type: American Express card");

	let secondDigits = 0;
	let oddPlace = 0;

	for(let count = 0; count < atm.length; count += 2){
		let checker = atm[count] * 2;
		let mod = 0;
		let div = 0;
		if(checker > 9){
			mod = checker % 10;
			div = checker / 10;
			secondDigits += Math.floor(mod + div);
		}else{
			secondDigits += checker;
		}
	}

	for(let counter = 1; counter < atm.length; counter += 2){
		oddPlace += atm[counter];
	}
	let total = secondDigits + oddPlace;

	if(total % 10 == 0){
		let GodSaveMe = " "; 
		for(let number = 0; number < atm.length; number++){
		GodSaveMe += atm[number];
		}
	console.log("Credit Card Number: "+GodSaveMe);
	console.log("Credit Card Digits: "+num1);
	console.log("Credit Card Validity Status: Valid");
console.log();
console.log();
	}else{
		let GodSaveMe = " "; 
		for(let number = 0; number < atm.length; number++){
		GodSaveMe += atm[number];
		}
	console.log("Credit Card Number: "+GodSaveMe);
	console.log("Credit Card Digits: "+num1);
	console.log("Credit Card Validity Status: Invalid");
console.log();
console.log();
	}



}

}





















console.log("Enter the length of your card digits: ");
let num1 = prompt();
if(num1 < 13 || num1 > 16){
console.log("Invalid length of number or invalid input");
}else{


let atm = [];

console.log("Validate your Credit Card");
for(let counter = 0; counter < num1; counter++){
let num = Number(prompt("Enter the digits on your credit card accordingly "+(counter + 1)+": "));
if(num < 0 || num > 9){
console.log("Invalid length of number or invalid input... digits should be between 0 - 9");
break;
}else{
atm.push(num)
}
}
console.log();
console.log();

validate(atm);

}

