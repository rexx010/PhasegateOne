import java.util.Arrays;
public class CreditCardValidatorFunction{

public static void validate(int num1, int[] atm){


if(atm[0] < 3 || atm[0] > 6){
System.out.println();
System.out.println("Credit Card Type: Invalid Card");
System.out.print("Credit Card Number: ");
for(int number = 0; number < atm.length; number++){
System.out.print(atm[number]);
}
System.out.println();
System.out.println("Credit Card Digit Length: "+atm.length);
System.out.println("Credit Card Validity: Invalid");
System.out.println();
System.out.println();

}else if(atm[0] == 4){
	System.out.println("Credit Card Type: Visa card");

	int secondDigits = 0;
	int oddPlace = 0;

	for(int count = 0; count < atm.length; count += 2){
		int checker = atm[count] * 2;
		int mod = 0;
		int div = 0;
		if(checker > 9){
			mod = checker % 10;
			div = checker / 10;
			secondDigits += mod + div;
		}else{
			secondDigits += checker;
		}
	}

	for(int counter = 1; counter < atm.length; counter += 2){
		oddPlace += atm[counter];
	}
	int total = secondDigits + oddPlace;

	if(total % 10 == 0){
		System.out.print("Credit Card Number: ");
		for(int number = 0; number < atm.length; number++){
		System.out.print(atm[number]);
		}
	System.out.println();
	System.out.println("Credit Card Digits: "+num1);
	System.out.println("Credit Card Validity Status: Valid");

	}else{
		System.out.print("Credit Card Number: ");
		for(int number = 0; number < atm.length; number++){
		System.out.print(atm[number]);
		}
	System.out.println();
	System.out.println("Credit Card Digits: "+num1);
	System.out.println("Credit Card Validity Status: Invalid");
System.out.println();
System.out.println();
	}

}else if(atm[0] == 5){
System.out.println("Credit Card Type: Master card");

	int secondDigits = 0;
	int oddPlace = 0;

	for(int count = 0; count < atm.length; count += 2){
		int checker = atm[count] * 2;
		int mod = 0;
		int div = 0;
		if(checker > 9){
			mod = checker % 10;
			div = checker / 10;
			secondDigits += mod + div;
		}else{
			secondDigits += checker;
		}
	}

	for(int counter = 1; counter < atm.length; counter += 2){
		oddPlace += atm[counter];
	}
	int total = secondDigits + oddPlace;

	if(total % 10 == 0){
		System.out.print("Credit Card Number: ");
		for(int number = 0; number < atm.length; number++){
		System.out.print(atm[number]);
		}
	System.out.println();
	System.out.println("Credit Card Digits: "+num1);
	System.out.println("Credit Card Validity Status: Valid");

	}else{
		System.out.print("Credit Card Number: ");
		for(int number = 0; number < atm.length; number++){
		System.out.print(atm[number]);
		}
	System.out.println();
	System.out.println("Credit Card Digits: "+num1);
	System.out.println("Credit Card Validity Status: Invalid");
System.out.println();
System.out.println();
	}


}else if(atm[0] == 6){
System.out.println("Credit Card Type: Discover card");

	int secondDigits = 0;
	int oddPlace = 0;

	for(int count = 0; count < atm.length; count += 2){
		int checker = atm[count] * 2;
		int mod = 0;
		int div = 0;
		if(checker > 9){
			mod = checker % 10;
			div = checker / 10;
			secondDigits += mod + div;
		}else{
			secondDigits += checker;
		}
	}

	for(int counter = 1; counter < atm.length; counter += 2){
		oddPlace += atm[counter];
	}
	int total = secondDigits + oddPlace;

	if(total % 10 == 0){
		System.out.print("Credit Card Number: ");
		for(int number = 0; number < atm.length; number++){
		System.out.print(atm[number]);
		}
	System.out.println();
	System.out.println("Credit Card Digits: "+num1);
	System.out.println("Credit Card Validity Status: Valid");

	}else{
		System.out.print("Credit Card Number: ");
		for(int number = 0; number < atm.length; number++){
		System.out.print(atm[number]);
		}
	System.out.println();
	System.out.println("Credit Card Digits: "+num1);
	System.out.println("Credit Card Validity Status: Invalid");
System.out.println();
System.out.println();
	}


}else if(atm[0] == 3 && atm[1] == 7){
System.out.println("Credit Card Type: American Express card");

	int secondDigits = 0;
	int oddPlace = 0;

	for(int count = 0; count < atm.length; count += 2){
		int checker = atm[count] * 2;
		int mod = 0;
		int div = 0;
		if(checker > 9){
			mod = checker % 10;
			div = checker / 10;
			secondDigits += mod + div;
		}else{
			secondDigits += checker;
		}
	}

	for(int counter = 1; counter < atm.length; counter += 2){
		oddPlace += atm[counter];
	}
	int total = secondDigits + oddPlace;

	if(total % 10 == 0){
		System.out.print("Credit Card Number: ");
		for(int number = 0; number < atm.length; number++){
		System.out.print(atm[number]);
		}
	System.out.println();
	System.out.println("Credit Card Digits: "+num1);
	System.out.println("Credit Card Validity Status: Valid");

	}else{
		System.out.print("Credit Card Number: ");
		for(int number = 0; number < atm.length; number++){
		System.out.print(atm[number]);
		}
	System.out.println();
	System.out.println("Credit Card Digits: "+num1);
	System.out.println("Credit Card Validity Status: Invalid");
System.out.println();
System.out.println();
	}



}

}


}