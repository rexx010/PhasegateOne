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
			if(year > 9999 or year < 1):
				print("Year can't be more than 4 digits");
				print();
			else:
				month = int(input());
				if(month > 12 or month < 1):
					print("Months can't be more than 12");
					print();
				else:
					day = int(input());
					if(day > 31 or day < 1):
						print("Days can't be more than 30 or 31, or less than 1");
						print();
					else:

						print("How many days is your cycle?: ");
						cycle = int(input());
						if(cycle < 21 or cycle > 35):
							print("Cycle can't be more less than 21 or more than 35 days");
							print();
						else:
							status = MentrualAppFunction.begin(year, month, day);
							end = MentrualAppFunction.finish(year, month, day, cycle);
							flow = MentrualAppFunction.flowDate(year, month, day);
							ovu = MentrualAppFunction.ovulation(year, month, day, cycle);
							fertile = MentrualAppFunction.fertileLength(year, month, day, cycle);
							safety = MentrualAppFunction.safeperiod(year, month, day, cycle);


		case '0':
			condition = False;
		case _:
			print("invalid input... Try again");








