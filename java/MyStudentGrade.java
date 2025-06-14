import java.util.Scanner;
import java.util.Arrays;

public class MyStudentGrade{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("How many Student do you have sir/ma?");
int studentNumber = input.nextInt();

System.out.println("How many subject do they offer?");
int subjectNumber = input.nextInt();

System.out.println("saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
System.out.println("Saved successfully");
System.out.println();

int[][] scoreTable = new int[studentNumber][subjectNumber];


for(int count = 0; count < scoreTable.length; count++){
for(int counter = 0; counter < scoreTable[count].length; counter++){

System.out.println("Entering score for student "+(count+1));
System.out.println("Entering score for subject "+(counter+1));

while(true){
scoreTable[count][counter] = input.nextInt();
if(scoreTable[count][counter] > -1 && scoreTable[count][counter] < 101){
break;
}else{
System.out.print("Invalid Score... Try Again: ");
}
}

System.out.println("saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
System.out.println("Saved successfully");
System.out.println();
}
}





}
}