import java.util.ArrayList;

public class CheckOutAppFunction{

static ArrayList<ArrayList<String>> productList = new ArrayList<>();

public static ArrayList<String> named(String customerName,  String cashierName){
ArrayList<String> nameuser = new ArrayList<>();
nameuser.add(customerName);
nameuser.add(cashierName);
return nameuser;
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



public static ArrayList<ArrayList<String>> addMore(){
return productList;


}










}