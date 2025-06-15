from datetime import date, timedelta

def begin(year, month, day):
	if(year > 9999):
		return "Year can't have more than 5 digits for years"

	elif(month > 12):
		return "Months can't have more than 12"

	elif(day > 30 or day > 31):
		return "Days can't have more than 30 or 31"

	elif(year < 1000 or month < 1 or day < 1):
		return "Invalid input";
	else:
		start_date = date(year, month, day)
		return "Your cycle starts on ", start_date;



def flowDate(year, month, day):
	if(year > 9999):
		return "Year can't have more than 5 digits for years";

	elif(month > 12):
		return "Months can't have more than 12";

	elif(day > 30 or day > 31):
		return "Days can't have more than 30 or 31"

	elif(year < 1000 or month < 1 or day < 1):
		return "Invalid input"
	else:
		start_date = date(year, month, day)
		stop_date = start_date + timedelta(days=5);
		return "your flow starts on ",start_date," it ends on ",stop_date;


def finish(year, month, day, cycle):
	if(year > 9999):
		return "Year can't have more than 5 digits for years"

	elif(month > 12):
		return "Months can't have more than 12"

	elif(day > 30 or day > 31):
		return "Days can't have more than 30 or 31"

	elif(year < 1000 or month < 1 or day < 1):
		return "Invalid input"
	else:
		start_date = date(year, month, day)
		end_date = start_date + timedelta(days=cycle);
		return "Your cycle ends on the ",end_date;

def ovulation(year, month, day, cycle):
	if(year > 9999):
		return "Year can't have more than 5 digits for years";

	elif(month > 12):
		return "Months can't have more than 12";

	elif(day > 30 or day > 31):
		return "Days can't have more than 30 or 31";

	elif(year < 1000 or month < 1 or day < 1):
		return "Invalid input";
	else:
		starting_date = date(year, month, day)
		ending_date = starting_date + timedelta(days=cycle);
		ovuStart_date = ending_date - timedelta(days=16);
		ovuEnd_date = ending_date - timedelta(days=12);
		return "your ovulation starts on ",ovuStart_date," it ends on ",ovuEnd_date;


def fertileLength(year, month, day, cycle):
	if(year > 9999):
		return "Year can't have more than 5 digits for years";

	elif(month > 12):
		return "Months can't have more than 12";

	elif(day > 30 or day > 31):
		return "Days can't have more than 30 or 31";

	elif(year < 1000 or month < 1 or day < 1):
		return "Invalid input";
	else:
		started_date = date(year, month, day)
		ended_date = started_date + timedelta(days=cycle);
		ferileStart_date = ended_date - timedelta(days=21);
		ferileEnd_date = ended_date - timedelta(days=12);
		return "your fertility starts on the ",ferileStart_date," it ends on the ",ferileEnd_date;


def safeperiod(year, month, day, cycle):
	if(year > 9999):
		return "Year can't have more than 5 digits for years";

	elif(month > 12):
		return "Months can't have more than 12";

	elif(day > 30 or day > 31):
		return "Days can't have more than 30 or 31";

	elif(year < 1000 or month < 1 or day < 1):
		return "Invalid input";
	else:
		started_date = date(year, month, day)
		ended_date = started_date + timedelta(days=cycle);
		ferileStart_date = ended_date - timedelta(days=21);
		ferileEnd_date = ended_date - timedelta(days=12);
		return "All days are safe to have fun excluding days within ",ferileStart_date," and ",ferileEnd_date;
