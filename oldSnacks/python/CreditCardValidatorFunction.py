def validate(atm):

	if(atm[0] < 3 or atm[0] > 6):
		print("Credit Card Type: Invalid Card");
		print("Credit Card Number: ", *atm);
		print("Credit Card Digit Length: ", len(atm));
		print("Credit Card Validity: Invalid");
		print();
		print();

	elif(atm[0] == 4):
		print("Credit Card Type: Visa card");

		secondDigits = 0;
		oddPlace = 0;

		for num in range(0, len(atm), 2):
			checker = atm[num] * 2;
			mod = 0;
			div = 0;
			if checker > 9:
				mod = checker % 10;
				div = checker // 10;
				secondDigits += mod + div;
			else:
				secondDigits += checker;
		
		for num in range(1, len(atm), 2):
			oddPlace += atm[num];

		total = secondDigits + oddPlace;

		if(total % 10 == 0):
			print("Credit Card Number: ", *atm);
			print("Credit Card Digits: ", len(atm));
			print("Credit Card Validity Status: Valid");
			print();
			print();
		else:
			print("Credit Card Number: ", *atm);
			print("Credit Card Digits: ", len(atm));
			print("Credit Card Validity Status: Invalid");
			print();
			print();
	

	elif(atm[0] == 5):
		print("Credit Card Type: Master card");

		secondDigits = 0;
		oddPlace = 0;

		for num in range(0, len(atm), 2):
			checker = atm[num] * 2;
			mod = 0;
			div = 0;
			if checker > 9:
				mod = checker % 10;
				div = checker // 10;
				secondDigits += mod + div;
			else:
				secondDigits += checker;
		
		for num in range(1, len(atm), 2):
			oddPlace += atm[num];
	
		total = secondDigits + oddPlace;
		if(total % 10 == 0):
			print("Credit Card Number: ", *atm);
			print("Credit Card Digits: ", len(atm));
			print("Credit Card Validity Status: Valid");
			print();
			print();
		else:
			print("Credit Card Number: ", *atm);
			print("Credit Card Digits: ", len(atm));
			print("Credit Card Validity Status: Invalid");
			print();
			print();
	


	elif(atm[0] == 6):
		print("Credit Card Type: Discover card");

		secondDigits = 0;
		oddPlace = 0;

		for num in range(0, len(atm), 2):
			checker = atm[num] * 2;
			mod = 0;
			div = 0;
			if checker > 9:
				mod = checker % 10;
				div = checker // 10;
				secondDigits += mod + div;
			else:
				secondDigits += checker;
		
		for num in range(1, len(atm), 2):
			oddPlace += atm[num];
	
		total = secondDigits + oddPlace;
		if(total % 10 == 0):
			print("Credit Card Number: ", *atm);
			print("Credit Card Digits: ", len(atm));
			print("Credit Card Validity Status: Valid");
			print();
			print();
		else:
			print("Credit Card Number: ", *atm);
			print("Credit Card Digits: ", len(atm));
			print("Credit Card Validity Status: Invalid");
			print();
			print();
	


	elif(atm[0] == 3 and atm[1] == 7):
		print("Credit Card Type: American Express card");

		secondDigits = 0;
		oddPlace = 0;

		for num in range(0, len(atm), 2):
			checker = atm[num] * 2;
			mod = 0;
			div = 0;
			if checker > 9:
				mod = checker % 10;
				div = checker // 10;
				secondDigits += mod + div;
			else:
				secondDigits += checker;
		
		for num in range(1, len(atm), 2):
			oddPlace += atm[num];
	
		total = secondDigits + oddPlace;
		if(total % 10 == 0):
			print("Credit Card Number: ", *atm);
			print("Credit Card Digits: ", len(atm));
			print("Credit Card Validity Status: Valid");
			print();
			print();
		else:
			print("Credit Card Number: ", *atm);
			print("Credit Card Digits: ", len(atm));
			print("Credit Card Validity Status: Invalid");
			print();
			print();
			print();
	