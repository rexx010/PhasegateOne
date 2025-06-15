import MentrualAppFunction
message = """
Welcome to Phasegate Menstrual cycle calculator...

press any of the following to perform an action

1: to check calculate the date of your menstrual cycle.
0: to exit the app.
""";

condition = True;
while(condition):
	print(message);
	userChoise = input()
	match(userChoise):
		case '1':
			print("Welcome to your calculater \n Enter your start date in this order(year, month, day): ");
			year = int(input());
			month = int(input());
			day = int(input());
			

			print("How many days is your cycle?: ");
			cycle = int(input());


			status = MentrualAppFunction.begin(year, month, day);
			end = MentrualAppFunction.finish(year, month, day, cycle);
			flow = MentrualAppFunction.flowDate(year, month, day);
			ovu = MentrualAppFunction.ovulation(year, month, day, cycle);
			fertile = MentrualAppFunction.fertileLength(year, month, day, cycle);
			safety = MentrualAppFunction.safeperiod(year, month, day, cycle);


			print(status);


			print(end);


			print(flow);


			print(ovu);
			

			print(fertile);


			print(safety);

		case '0':
			condition = False;
		case _:
			print("invalid input... Try again");








