

public class CreditCardValidator{


print("Enter the length of your digits: ");
num1 = input();
if(num1 < 13 or num1 > 16):
	print("Invalid length of number or invalid input");
else:

	atm = [];

	print("Enter each digit on your card: ");
	for numbers in range(0, num1):
		num1 = input(f"Enter the digits on your card accordingly {number + 1}");
		atm.append(num1);

	println();
	println(atm);

#CreditCardValidatorFunction.validate(num1, atm);




