const input = require("prompt-sync");
const prompt = input();





let atm = [];

console.log("Validate your Credit Card");
for(let counter = 0; counter < 16; counter++){
let num = prompt("Enter the digits on your credit card accordingly "+(counter + 1)+": ");
atm.push(num)
}
console.log();
console.log(atm);



