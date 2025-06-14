import java.util.Arrays;

public class MyStudentGradeFunction{

static int student = 0;
static int subject = 0;
static int[][] studentAndSubject;
static String[] studentName;
static int[] total;
static double[] average;
static int[] position;
static int[] subOne;
static int[] subTwo;
static int[] subThree;


public static int students(int number){
student = number;
return student;
}

public static int subjects(int number){
subject = number;
return subject;
}

public static int[][] gradeTable(int num1, int num2){
studentAndSubject = new int[num1][num2];
return studentAndSubject;
}

public static int[][] gradeTableInitialized(int [][] arraytable){
studentAndSubject = arraytable;
return studentAndSubject;
}


public static String[] studentNameInit(int num){
studentName = new String[num];
for(int count = 0; count < studentName.length; count++){
studentName[count] = "student "+ (count+1);
}
return studentName;
}

public static int[] totalTable(int num){
total = new int[student];
for(int count = 0; count < total.length; count++){
total[count] = studentAndSubject[count][0] + studentAndSubject[count][1] + studentAndSubject[count][2];
}
return total;
}

public static double[] averageTable(int num){
average = new double[student];
for(int count = 0; count < average.length; count++){
average[count] = total[count] / subject;
}
return average;
}


public static int[][] gradeTableInitializedReturned(){
return studentAndSubject;
}

public static String[] studentName(){
return studentName;
}

public static int[] total(){
return total;
}

public static double[] average(){
return average;
}

public static int[] subOneScores(int number){
subOne = new int[number];
for(int count = 0; count < subOne.length; count++){
subOne[count] = studentAndSubject[count][0];
}
return subOne;
}

public static int[] subTwoScores(int number){
subTwo = new int[number];
for(int count = 0; count < subTwo.length; count++){
subTwo[count] = studentAndSubject[count][1];
}
return subTwo;
}

public static int[] subThreeScores(int number){
subThree = new int[number];
for(int count = 0; count < subThree.length; count++){
subThree[count] = studentAndSubject[count][2];
}
return subThree;
}







public static void subjectOne(){
System.out.println("Subject 1");

int highestScore = 0;
int studentWithHighestScore = 0;
int lowestScore = 1000;
int studentWithLowestScore = 0;
int totalSub = 0;
int passes = 0;
int fails = 0;
int counter = 0;

for(int count = 0; count < subOne.length; count++){

totalSub += subOne[count];
if(subOne[count] > highestScore){
highestScore = subOne[count];
studentWithHighestScore = count+1;
}
if(subOne[count] < lowestScore){
lowestScore = subOne[count];
studentWithLowestScore = count+1;
}
if(subOne[count] > 49) passes++;
if(subOne[count] < 50) fails++;
counter++;

}
double average = totalSub / counter;

System.out.println("Highest scoring student is : Student "+studentWithHighestScore +" scoring "+highestScore);
System.out.println("Lowest scoring student is : Student "+studentWithLowestScore +" scoring "+lowestScore);
System.out.println("Total Score is: "+totalSub);
System.out.printf("average Score is: %.2f%n",average);
System.out.println("Number of passes: "+passes);
System.out.println("Number of fails: "+fails);
}





public static void subjectTwo(){
System.out.println("Subject 2");

int highestScore = 0;
int studentWithHighestScore = 0;
int lowestScore = 1000;
int studentWithLowestScore = 0;
int totalSub = 0;
int passes = 0;
int fails = 0;
int counter = 0;

for(int count = 0; count < subTwo.length; count++){

totalSub += subTwo[count];
if(subTwo[count] > highestScore){
highestScore = subTwo[count];
studentWithHighestScore = count+1;
}
if(subTwo[count] < lowestScore){
lowestScore = subTwo[count];
studentWithLowestScore = count+1;
}
if(subTwo[count] > 49) passes++;
if(subTwo[count] < 50) fails++;
counter++;

}
double average = totalSub / counter;

System.out.println("Highest scoring student is : Student "+studentWithHighestScore +" scoring "+highestScore);
System.out.println("Lowest scoring student is : Student "+studentWithLowestScore +" scoring "+lowestScore);
System.out.println("Total Score is: "+totalSub);
System.out.printf("average Score is: %.2f%n",average);
System.out.println("Number of passes: "+passes);
System.out.println("Number of fails: "+fails);
}




public static void subjectThree(){
System.out.println("Subject 3");

int highestScore = 0;
int studentWithHighestScore = 0;
int lowestScore = 1000;
int studentWithLowestScore = 0;
int totalSub = 0;
int passes = 0;
int fails = 0;
int counter = 0;

for(int count = 0; count < subThree.length; count++){

totalSub += subThree[count];
if(subThree[count] > highestScore){
highestScore = subThree[count];
studentWithHighestScore = count+1;
}
if(subThree[count] < lowestScore){
lowestScore = subThree[count];
studentWithLowestScore = count+1;
}
if(subThree[count] > 49) passes++;
if(subThree[count] < 50) fails++;
counter++;

}
double average = totalSub / counter;

System.out.println("Highest scoring student is : Student "+studentWithHighestScore +" scoring "+highestScore);
System.out.println("Lowest scoring student is : Student "+studentWithLowestScore +" scoring "+lowestScore);
System.out.println("Total Score is: "+totalSub);
System.out.printf("average Score is: %.2f%n",average);
System.out.println("Number of passes: "+passes);
System.out.println("Number of fails: "+fails);
}


}