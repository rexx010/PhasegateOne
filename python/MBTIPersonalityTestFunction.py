
extrovertVsintrovert = [];
AE = 0;
BI = 0;
sensingVsintuitive = [];
AS = 0;
BN = 0;
thinkingVsfeeling = [];
AT = 0;
BF = 0;
judgingVsperceptive = [];
AJ = 0;
BP = 0;
result = "";


def extrovertORintrovert(choosed, number):
	if(number == 1):
		extrovertVsintrovert[0] = choosed;
	if(number == 5):
		extrovertVsintrovert[1] = choosed;
	if(number == 9):
		extrovertVsintrovert[2] = choosed;
	if(number == 13):
		extrovertVsintrovert[3] = choosed;
	if(number == 17):
		extrovertVsintrovert[4] = choosed;

	return extrovertVsintrovert;



def extrovertORintrovertCounter(answer):
	if(answer === "A"):
		AE++;
	if(answer === "B"):
		BI++;


def sensingORintuitive(choosed, number):
	if(number == 2):
		sensingVsintuitive[0] = choosed;
	if(number == 6):
		sensingVsintuitive[1] = choosed;
	if(number == 10):
		sensingVsintuitive[2] = choosed;
	if(number == 14):
		sensingVsintuitive[3] = choosed;
	if(number == 18):
		sensingVsintuitive[4] = choosed;

	return sensingVsintuitive;



def sensingORintuitiveCounter(answer):
	if(answer === "A"):
		AS++;
	if(answer === "B"):
		BN++;



def thinkingORfeeling(choosed, number):
	if(number == 3):
		thinkingVsfeeling[0] = choosed;
	if(number == 7):
		thinkingVsfeeling[1] = choosed;
	if(number == 11):
		thinkingVsfeeling[2] = choosed;
	if(number == 15):
		thinkingVsfeeling[3] = choosed;
	if(number == 19):
		thinkingVsfeeling[4] = choosed;

	return thinkingVsfeeling;



def thinkingORfeelingCounter(answer):
	if(answer === "A"):
		AT++;
	if(answer === "B"):
		BF++;



def judgingORperceptive(choosed, number):
	if(number == 4):
		judgingVsperceptive[0] = choosed;
	if(number == 8):
		judgingVsperceptive[1] = choosed;
	if(number == 12):
		judgingVsperceptive[2] = choosed;
	if(number == 16):
		judgingVsperceptive[3] = choosed;
	if(number == 20):
		judgingVsperceptive[4] = choosed;

	return judgingVsperceptive;



def judgingORperceptiveCounter(answer):
	if(answer === "A"):
		AJ++;
	if(answer === "B"):
		BP++;


def extrovertORletrovertAnswer():
	for counter in extrovertVsintrovert:
		print(extrovertVsintrovert[counter]);

	print("Numbers of A selected: "+AE);
	print("Numbers of B selected: "+BI);
	print();



def sensingORintuitiveAnswer():
	for counter in sensingVsintuitive:
		print(sensingVsintuitive[counter]);

	print("Numbers of A selected: "+AS);
	print("Numbers of B selected: "+BN);
	print();



def thinkingORfeelingAnswer():
	for counter in thinkingVsfeeling:
		print(thinkingVsfeeling[counter]);

	print("Numbers of A selected: "+AT);
	print("Numbers of B selected: "+BF);
	print();



def judgingORperceptiveAnswer():
	for counter in judgingVsperceptive:
		print(judgingVsperceptive[counter]);

	print("Numbers of A selected: "+AJ);
	print("Numbers of B selected: "+BP);
	print();


def overallResult():
	if(AE > BI):
		result += "E";
	else:
		result += "I";


	if(AS > BN):
		result += "S";
	else:
		result += "N";


	if(AT > BF):
		result += "T";
	else:
		result += "F";


	if(AJ > BP):
		result += "J";
	else:
		result += "P";

	return result;


//public static void overallResultType(){

