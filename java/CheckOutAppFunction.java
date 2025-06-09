import java.util.ArrayList;
import java.util.Arrays;

public class CheckOutAppFunction{

static ArrayList<ArrayList<String>> productList = new ArrayList<>();
static ArrayList<String> namesused = new ArrayList<>();
static double[] itemTotal = new double[1];
static double discountSum = 0;
static double vatSum = 0;
static double vatAmount = 17.50;
static double totalBill = 0;

public static ArrayList<String> named(String customerName,  String cashierName){
ArrayList<String> nameuser = new ArrayList<>();
namesused.add(customerName);
namesused.add(cashierName);
return namesused;
}

public static ArrayList<ArrayList<String>> addItem(String item, int pieces, double price ){
ArrayList<String> productss = productBox(item, pieces, price);
productList.add(productss);
return productList;
}


public static ArrayList<String> productBox(String item, int pieces, double price){
ArrayList<String> products = new ArrayList<>();
products.add(item);
products.add(Integer.toString(pieces));
products.add(Double.toString(price));

double total = pieces * price;

products.add(Double.toString(total));

return products;
}

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
}







}