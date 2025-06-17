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
	if(year > 9999 || year < 1){
	System.out.println("Year can't be more than 4 digits");
	System.out.println();
	}else{
	int month = input.nextInt();
	if(month > 12 || month < 1){
	System.out.println("Months can't be more than 12");
	System.out.println();
	}else{
	int day = input.nextInt();
	if(day > 31 || day < 1){
	System.out.println("Days can't be more than 30 or 31, or less than 1");
	System.out.println();
	}else{
	System.out.println();

	System.out.println("How many days is your cycle?: ");
	int cycle = input.nextInt();
	if(cycle < 21 || cycle > 35){
	System.out.println("Cycle can't be more less than 21 or more than 35 days");
	System.out.println();
	}else{
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
}
}
}
}
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