from datetime import date, timedelta

def begin(year, month, day):
	start_date = date(year, month, day)
	return print(f"Your cycle starts on {start_date}");



def flowDate(year, month, day):
	start_date = date(year, month, day)
	stop_date = start_date + timedelta(days=5);
	return print(f"your flow starts on{start_date}, it ends on {stop_date}");


def finish(year, month, day, cycle):
	start_date = date(year, month, day)
	end_date = start_date + timedelta(days=cycle);
	return print(f"Your cycle ends on the {end_date}");

def ovulation(year, month, day, cycle):
	starting_date = date(year, month, day)
	ending_date = starting_date + timedelta(days=cycle);
	ovuStart_date = ending_date - timedelta(days=16);
	ovuEnd_date = ending_date - timedelta(days=12);
	return print(f"your ovulation starts on {ovuStart_date} it ends on {ovuEnd_date}");


def fertileLength(year, month, day, cycle):
	started_date = date(year, month, day)
	ended_date = started_date + timedelta(days=cycle);
	ferileStart_date = ended_date - timedelta(days=21);
	ferileEnd_date = ended_date - timedelta(days=12);
	return print(f"your fertility starts on the {ferileStart_date} it ends on the {ferileEnd_date}");


def safeperiod(year, month, day, cycle):
	started_date = date(year, month, day)
	ended_date = started_date + timedelta(days=cycle);
	ferileStart_date = ended_date - timedelta(days=21);
	ferileEnd_date = ended_date - timedelta(days=12);
	return print(f"All days are safe to have fun excluding days within {ferileStart_date} and {ferileEnd_date}");
