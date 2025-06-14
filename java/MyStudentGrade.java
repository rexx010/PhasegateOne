import java.util.Scanner;
import java.util.Arrays;

public class MyStudentGrade{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int studentNumber = 0;
int subjectNumber = 0;

System.out.println("How many Student do you have sir/ma?");
while(true){
studentNumber = input.nextInt();
if(studentNumber > 0){
break;
}else{
System.out.println("Invalid input... Try again");
}
}
MyStudentGradeFunction.students(studentNumber);



System.out.println("How many subject do they offer?");
while(true){
subjectNumber = input.nextInt();
if(subjectNumber > 0){
break;
}else{
System.out.println("Invalid input... Try again");
}
}
MyStudentGradeFunction.subjects(subjectNumber);
MyStudentGradeFunction.gradeTable(studentNumber, subjectNumber);


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

MyStudentGradeFunction.gradeTableInitialized(scoreTable);
MyStudentGradeFunction.studentNameInit(studentNumber);
MyStudentGradeFunction.totalTable(studentNumber);
MyStudentGradeFunction.averageTable(studentNumber);
MyStudentGradeFunction.subOneScores(studentNumber);
MyStudentGradeFunction.subTwoScores(studentNumber);
MyStudentGradeFunction.subThreeScores(studentNumber);


System.out.println("====================================================================================");
System.out.println("STUDENT\t\tSUB1\tSUB2\tSUB3\tTOT\tAVE\tPOS");
System.out.println("====================================================================================");

String [] nameResult = MyStudentGradeFunction.studentName();
int [][] subResult = MyStudentGradeFunction.gradeTableInitializedReturned();
int [] totalResult = MyStudentGradeFunction.total();
double [] averageResult = MyStudentGradeFunction.average();


for(int counter = 0; counter < subResult.length; counter++){

System.out.print(nameResult[counter]+"\t");

for(int count = 0; count < subResult[counter].length; count++){
//int subjectResult = subResult[counter][count];
System.out.print(subResult[counter][count]+"\t");
}

int result = totalResult[counter];
System.out.print(result+"\t");

double resultave = averageResult[counter];
System.out.printf("%.2f\t",resultave);

System.out.println();
}
System.out.println("====================================================================================");
System.out.println("====================================================================================");


System.out.println();
System.out.println();
System.out.println("SUBJECT SUMMARY");
System.out.println();

MyStudentGradeFunction.subjectOne();
System.out.println();
MyStudentGradeFunction.subjectTwo();
System.out.println();
MyStudentGradeFunction.subjectThree();



/*String [] nameResult = MyStudentGradeFunction.studentName();
for(int count = 0; count < nameResult.length; count++){
System.out.println(nameResult[count]);
}

int [][] subResult = MyStudentGradeFunction.gradeTableInitializedReturned();
for(int count = 0; count < subResult.length; count++){
System.out.println(Arrays.toString(subResult[count]));
}




int [] totalResult = MyStudentGradeFunction.total();
for(int count = 0; count < totalResult.length; count++){
int result = totalResult[count];
System.out.println(result);
}


double [] averageResult = MyStudentGradeFunction.average();
for(int count = 0; count < averageResult.length; count++){
double result = averageResult[count];
System.out.println(result);
}*/




}
}