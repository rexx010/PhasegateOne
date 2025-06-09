
public class CheckOutAppFunction{

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


public static double[] calculation(int pieces, double price ){
double[] added = total(pieces, price);
itemTotal[0] = itemTotal[0] + added[0];
return itemTotal;
}

public static double  []total(int pieces, double price ){
double[] addTo = new double[1];
double sum = pieces * price;
addTo[0] = addTo[0] + sum;
return addTo;
}

public static double discountCalculation(double discount){
discountSum = (double)discount / 100;
discountSum = discountSum * itemTotal[0];
return discountSum;
}

public static double vatCalculation(){
vatSum = vatAmount / 100;
vatSum = vatSum * itemTotal[0];
return vatSum;
}

public static double billCalculation(){
totalBill = totalBill + itemTotal[0];
return totalBill;
}

public static ArrayList<ArrayList<String>> addMore(){

System.out.println("SEMICOLON STORES \nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 03293828343\nDATE: 18-DEC-22 8:48:11 pm");
System.out.println("Cashier: "+namesused.get(1));
System.out.println("Customer Name: "+namesused.get(0));
System.out.println("=======================================================================================================");
System.out.println("\t\t\tITEM\tQUANTITY\tPRICE\tTOTAL(NGN)");
System.out.println("--------------------------------------------------------------------------------------------------------");
System.out.println();
return productList;


}

public static double[] addMoreTotal(){
System.out.println("--------------------------------------------------------------------------------------------------------");
return itemTotal;
}

public static double discounts(){
return discountSum;
