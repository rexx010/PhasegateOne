import CheckOutAppFunction
import math

product_list = []
sumed = []
vated = 17.50;
billSum = 0;
payment = 0;
balance = 0;

message = """
WELCOME TO SEMICOLON STORE:
===========================

press 1 to enter the purchase details.
press 2 to display customers invoice.
press 3 to print receipt.
press 0 to close app.
""";

while True:
	print(message);
	userChoice = input();
	print();
	match(userChoice):
		case '1':
			print("Enter each product detials in the user's cart...\n================================================")
			print()
			product = '';
			pieces = 0;
			prices = 0;
			decision = "yes";

			print("What is the customer's name?");
			customerName = input();
			
			decision = 'yes';
			while True:
				print("What did the user buy?");
				product = input();

				print("How many pieces?");
				pieces = int(input());

				print("How much per unit?");
				prices = float(input());

				product_list = CheckOutAppFunction.addItem(product, pieces, prices);
				CheckOutAppFunction.calculation(pieces, prices);

				print("Add more items?");
				decision = input();

				if decision == 'no':
					break

			print("What is your name?");
			cashierName = input();

			print("How much discount will he/she get?");
			discount = int(input());
			discountSummed = CheckOutAppFunction.discountCalculation(discount);

			CheckOutAppFunction.named(customerName, cashierName);

		case '2':
			itemList = CheckOutAppFunction.addMore();
			print(f"\t {itemList} ");
			print();
			
			sumed = CheckOutAppFunction.addMoreTotal();
			num = sum(sumed)
			print(f"\t\t\t\t\tSub Total: {num}");

			#discountSummed = CheckOutAppFunction.discounts();
			print(f"\t\t\t\t\tDiscount: {discountSummed}");
			vated = (vated / 100) * num;
			print(f"\t\t\t\t\tVAT @ 17.50%: {vated}");
			print("=================================================================================================");
			billSum = billSum + num;
			billSum = billSum - discountSummed + vated;
			print(f"\t\t\t\t\tBill Total: {billSum}");
			print("=================================================================================================");
			print(f"THIS IS NOT AN RECEIPT KINDLY PAY {billSum}");
			print("=================================================================================================");
			print();
			print();
			print();
			print("How much did the customer give you?");
			payment = int(input());


		case '3':
			itemList = CheckOutAppFunction.addMore();
			print(f"\t {itemList} ");
			print();

			sumed = CheckOutAppFunction.addMoreTotal();
			num = sum(sumed)
			print(f"\t\t\t\t\tSub Total: {num}");
	
			#discountSummed = CheckOutAppFunction.discounts();
			print(f"\t\t\t\t\tDiscount: {discountSummed}");
			print(f"\t\t\t\t\tVAT @ 17.50%: {vated}");
			print("=================================================================================================");
			print(f"\t\t\t\t\tBill Total: {billSum}");

			print(f"\t\t\t\t\tAmount Paid {payment}");
			balance = billSum - payment;
			balance = abs(balance);
			print(f"\t\t\t\t\tBalance: {balance}");
			print("=================================================================================================");
			print("THANKS YOU FOR YOUR PATRONAGE");
			print("=================================================================================================");
			print();
			print();
			print();


		case '0':
			False;
			print("GoodBye");
			break
		case '_':
			print("Invalid input");

