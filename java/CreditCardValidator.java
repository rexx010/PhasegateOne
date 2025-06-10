import java.util.Scanner;


public class CreditCardValidator{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the length of your digits: ");
int num1 = input.nextInt();
if(num1 < 13 || num1 > 16){
System.out.print("Invalid length of number or invalid input");
}else{

int[] atm = new int [num1];

System.out.print("Enter each digit on your card: ");
for(int counter = 0; counter < num1; counter++){
atm[counter] = input.nextInt();
}
System.out.println();
System.out.println();

CreditCardValidatorFunction.validate(num1, atm);
}

}

}

