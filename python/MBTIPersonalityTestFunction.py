
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
		extrovertVsintrovert.append(choosed);
	if(number == 5):
		extrovertVsintrovert.append(choosed);
	if(number == 9):
		extrovertVsintrovert.append(choosed);
	if(number == 13):
		extrovertVsintrovert.append(choosed);
	if(number == 17):
		extrovertVsintrovert.append(choosed);

	return extrovertVsintrovert;



def extrovertORintrovertCounter(answer):
	global AE
	global BI
	if(answer == "A"):
		AE = AE + 1;
	if(answer == "B"):
		BI = BI + 1;
	return AE, BI;

def sensingORintuitive(choosed, number):
	if(number == 2):
		sensingVsintuitive.append(choosed);
	if(number == 6):
		sensingVsintuitive.append(choosed);
	if(number == 10):
		sensingVsintuitive.append(choosed);
	if(number == 14):
		sensingVsintuitive.append(choosed);
	if(number == 18):
		sensingVsintuitive.append(choosed);

	return sensingVsintuitive;



def sensingORintuitiveCounter(answer):
	global AS
	global BN
	if(answer == "A"):
		AS = AS + 1;
	if(answer == "B"):
		BN = BN + 1;
	return AS, BN;



def thinkingORfeeling(choosed, number):
	if(number == 3):
		thinkingVsfeeling.append(choosed);
	if(number == 7):
		thinkingVsfeeling.append(choosed);
	if(number == 11):
		thinkingVsfeeling.append(choosed);
	if(number == 15):
		thinkingVsfeeling.append(choosed);
	if(number == 19):
		thinkingVsfeeling.append(choosed);

	return thinkingVsfeeling;



def thinkingORfeelingCounter(answer):
	global AT
	global BF
	if(answer == "A"):
		AT = AT + 1;
	if(answer == "B"):
		BF = BF + 1;
	return AT, BF;


def judgingORperceptive(choosed, number):
	if(number == 4):
		judgingVsperceptive.append(choosed);
	if(number == 8):
		judgingVsperceptive.append(choosed);
	if(number == 12):
		judgingVsperceptive.append(choosed);
	if(number == 16):
		judgingVsperceptive.append(choosed);
	if(number == 20):
		judgingVsperceptive.append(choosed);

	return judgingVsperceptive;



def judgingORperceptiveCounter(answer):
	global AJ
	global BP
	if(answer == "A"):
		AJ = AJ + 1;
	if(answer == "B"):
		BP = BP + 1;
	return AJ, BP;

def extrovertORletrovertAnswer():
	for counter in extrovertVsintrovert:
		print(counter);

	print(f"Numbers of A selected: {AE}");
	print(f"Numbers of B selected: {BI}");
	print();



def sensingORintuitiveAnswer():
	for counter in sensingVsintuitive:
		print(counter);

	print(f"Numbers of A selected: {AS}");
	print(f"Numbers of B selected: {BN}");
	print();



def thinkingORfeelingAnswer():
	for counter in thinkingVsfeeling:
		print(counter);

	print(f"Numbers of A selected: {AT}");
	print(f"Numbers of B selected: {BF}");
	print();



def judgingORperceptiveAnswer():
	for counter in judgingVsperceptive:
		print(counter);

	print(f"Numbers of A selected: {AJ}");
	print(f"Numbers of B selected: {BP}");
	print();


def overallResult():
	result = "";
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


#public static void overallResultType(){

