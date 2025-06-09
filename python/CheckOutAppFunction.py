productList = []
namesused = []
itemTotal = []
discountSum = 0;
vatSum = 0;
vatAmount = 17.50;
totalBill = 0;

def named(customerName, cashierName):
	nameuser = []
	namesused.append(customerName);
	namesused.append(cashierName);
	return namesused;


def addItem(item, pieces, price):
	productss = productBox(item, pieces, price);
	productList.append(productss);
	return productList;



def productBox(item, pieces, price):
	products = []
	products.append(item);
	products.append(pieces);
	products.append(price);

	total = pieces * price;

	products.append(total);

	return products;


def calculation(pieces, price):
	added = total(pieces, price);
	itemTotal[0] = itemTotal[0] + added[0];
	return itemTotal;


def total(pieces, price):
	addTo = []
	sum = pieces * price;
	addTo[0] = addTo[0] + sum;
	return addTo;


def discountCalculation(discount):
	discountSum = discount / 100;
	discountSum = discountSum * itemTotal[0];
	return discountSum;


def vatCalculation():
	vatSum = vatAmount / 100;
	vatSum = vatSum * itemTotal[0];
	return vatSum;


def billCalculation():
	totalBill = totalBill + itemTotal[0];
	return totalBill;


def addMore():
	print("SEMICOLON STORES \nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 03293828343\nDATE: 18-DEC-22 8:48:11 pm");
	print(f"Cashier: {namesused[1]}");
	print(f"Customer Name: {namesused[0]}");
	print("=======================================================================================================");
	print("\t\t\tITEM\tQUANTITY\tPRICE\tTOTAL(NGN)");
	print("--------------------------------------------------------------------------------------------------------");
	print();
	return productList;




def addMoreTotal():
	print("--------------------------------------------------------------------------------------------------------");
	return itemTotal;


def discounts():
	return discountSum;
