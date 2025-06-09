productList = []
namesused = []
itemTotal = []
itemTotal2 = []
total_list = []
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
	num1 = pieces * price;
	itemTotal.append(num1);
	return itemTotal;


'''def total(pieces, price):
	sum = pieces * price;
	total_list.append(sum)
	return total_list;'''


def discountCalculation(discount):
	discountSum = discount / 100;
	cal = sum(itemTotal)
	discountSum = discountSum * cal;
	return discountSum;


def vatCalculation():
	vatSum = vatAmount / 100;
	cal2 = sum(itemTotal)
	vatSum = vatSum * cal2;
	return vatSum;


def billCalculation():
	cal3 = sum(itemTotal)
	totalBill = totalBill + cal3;
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
