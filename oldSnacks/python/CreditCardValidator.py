import CreditCardValidatorFunction;


print("Enter the length of your digits: ");
num1 = int(input());
if(num1 < 13 or num1 > 16):
	print("Invalid length of number or invalid input");
else:

	atm = [];

	print("Enter each digit on your card: ");
	for numbers in range(0, num1):
		num = int(input(f"Enter the digits on your card accordingly {numbers + 1}: "));
		if(num < 0 or num > 9):
			print("Invalid length of number or invalid input... digits should be between 0 - 9.");
			break;
		else:

			atm.append(num);

			print();
			print();

			CreditCardValidatorFunction.validate(atm);




