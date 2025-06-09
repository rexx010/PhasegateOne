import java.util.ArrayList;
import java.util.Arrays;

public class CheckOutAppFunction{

static ArrayList<ArrayList<String>> productList = new ArrayList<>();
static ArrayList<String> namesused = new ArrayList<>();
static int[] itemTotal = new int[1];

public static ArrayList<String> named(String customerName,  String cashierName){
ArrayList<String> nameuser = new ArrayList<>();
namesused.add(customerName);
namesused.add(cashierName);
return namesused;
}

public static ArrayList<ArrayList<String>> addItem(String item, int pieces, int price ){
ArrayList<String> productss = productBox(item, pieces, price);
productList.add(productss);
return productList;
}


public static ArrayList<String> productBox(String item, int pieces, int price){
ArrayList<String> products = new ArrayList<>();
products.add(item);
products.add(Integer.toString(pieces));
products.add(Integer.toString(price));

int total = pieces * price;

products.add(Integer.toString(total));

return products;
}

public static int[] calculation(int pieces, int price ){
int[] added = total(pieces, price);
itemTotal[0] = itemTotal[0] + added[0];
return itemTotal;
}

public static int  []total(int pieces, int price ){
int[] addTo = new int[1];
int sum = pieces * price;
addTo[0] = addTo[0] + sum;
return addTo;
}



public static ArrayList<ArrayList<String>> addMore(){

System.out.println("SEMICOLON STORES \nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\nTEL: 03293828343\nDATE: 18-DEC-22 8:48:11 pm");
System.out.println("Cashier: "+namesused.get(1));
System.out.println("Customer Name: "+namesused.get(0));
System.out.println("=======================================================================================================");

System.out.println();
return productList;


}

public static int[] addMoreTotal(){

return itemTotal;
}








}