import java.util.Scanner;
import java.time.LocalDate;

public class MentrualApp{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

String message = """
Welcome to Phasegate Menstrual cycle calculator...

press any of the following to perform an action

1: to check calculate the date of your menstrual cycle.
0: to exit the app.
""";

boolean condition = true;
while(condition){
System.out.print(message);
int userChoise = input.nextInt();
switch(userChoise){
case 1:
	System.out.println("Welcome to your calculater \n Enter your start date in this order(year, month, day): ");
	int year = input.nextInt();
	int month = input.nextInt();
	int day = input.nextInt();
	System.out.println();

	System.out.println("How many days is your cycle?: ");
	int cycle = input.nextInt();
	System.out.println();


	String status = MentrualAppFunction.begin(year, month, day);
	String end = MentrualAppFunction.finish(year, month, day, cycle);
	String flow = MentrualAppFunction.flowDate(year, month, day);
	String ovu = MentrualAppFunction.ovulation(year, month, day, cycle);
	String fertile = MentrualAppFunction.fertileLength(year, month, day, cycle);
	String safety = MentrualAppFunction.safeperiod(year, month, day, cycle);
	System.out.println();

	System.out.println(status);
	System.out.println();

	System.out.println(end);
	System.out.println();

	System.out.println(flow);
	System.out.println();


	System.out.println(ovu);
	System.out.println();

	System.out.println(fertile);
	System.out.println();

	System.out.println(safety);
	System.out.println(); 
	break;

case 0:
	condition = false;
	break;
default:
	System.out.println("invalid input... Try again");
	break;

}






}

}
}