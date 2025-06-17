const input = require("prompt-sync");
const prompt = input();



const begin = function(year, month, day){
const start = new Date(year, month, day);
return start;
}

const flowDate = function(year, month, day){
const start = new Date(year, month, day);
const stop = new Date(start);
stop.setDate(stop.getDate()+5)

return "your flow starts on the "+start+"\n it ends on the "+stop;
}

const finish = function(year, month, day, cycle){
const start = new Date(year, month, day);
const end = new Date(start);
end.setDate(end.getDate() + cycle);
return end;
}

const ovulation = function(year, month, day, cycle){
const starting = new Date(year, month, day);
const ending = new Date(starting);
ending.setDate(ending.getDate() + cycle);

const ovuStart = new Date(ending);
ovuStart.setDate(ovuStart.getDate() + 16);

const ovuEnd = new Date(ending);
ovuEnd.setDate(ovuEnd.getDate() + 12);
return "your ovulation starts on the "+ovuStart+"\n it ends on the "+ovuEnd;
}

const fertileLength = function(year, month, day, cycle){
const starting = new Date(year, month, day);
const ending = new Date(starting);
ending.setDate(ending.getDate() + cycle);

const ferileStart = new Date(ending);
ferileStart.setDate(ferileStart.getDate() - 21);

const ferileEnd = new Date(ending);
ferileEnd.setDate(ferileEnd.getDate() - 12);
return "your fertility starts on the "+ferileStart+"\n it ends on the "+ferileEnd;
}

const safeperiod = function(year, month, day, cycle){
const starting = new Date(year, month, day);
const ending = new Date(starting);
ending.setDate(ending.getDate() + cycle);

const ferileStart = new Date(ending);
ferileStart.setDate(ferileStart.getDate() - 21);

const ferileEnd = new Date(ending);
ferileEnd.setDate(ferileEnd.getDate() - 12);
return "All days are safe to have fun excluding days within "+ferileStart+" and "+ferileEnd;
}





















let message = 'Welcome to Phasegate Menstrual cycle calculator...\npress any of the following to perform an action\n1: to check calculate the date of your menstrual cycle.\n0: to exit the app.';

let condition = true;
while(condition){
console.log(message);
let userChoise = prompt();
switch(userChoise){
case '1':
	console.log("Welcome to your calculater \n Enter your start date in this order(year, month, day): ");
	let year = Number(prompt());
	if(year > 9999 || year < 1){
	console.log("Year can't be more than 4 digits");
	console.log();
	}else{
	let month = Number(prompt());
	if(month > 12 || month < 1){
	console.log("Months can't be more than 12");
	console.log();
	}else{
	let day = Number(prompt());
	if(day > 30 || day > 31 || day < 1){
	console.log("Days can't be more than 30 or 31, or less than 1");
	console.log();
	}else{
	console.log();

	console.log("How many days is your cycle?: ");
	let cycle = Number(prompt());
	console.log();


	const status = begin(year, month, day);
	const end = finish(year, month, day, cycle);
	let flow = flowDate(year, month, day);
	let ovu = ovulation(year, month, day, cycle);
	let fertile = fertileLength(year, month, day, cycle);
	let safety = safeperiod(year, month, day, cycle);
	console.log();

	console.log("Your cycle starts on the "+status);
	if(cycle < 21 || cycle > 35){
	console.log("Cycle can't be more less than 21 or more than 35 days");
	console.log();
	}else{
	console.log();

	console.log("and your cycle ends on the "+end);
	console.log();

	console.log(flow);
	console.log();


	console.log(ovu);
	console.log();

	console.log(fertile);
	console.log();

	console.log(safety);
	console.log(); 
}
}
}
}
	break;
	
case '0':
	condition = false;
	break;
default:
	console.log("invalid prompt... Try again");
	break;

}






}
