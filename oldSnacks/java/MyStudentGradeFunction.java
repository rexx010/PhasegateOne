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
total = new int[num];
for(int count = 0; count < total.length; count++){
total[count] = studentAndSubject[count][0] + studentAndSubject[count][1] + studentAndSubject[count][2];
}
return total;
}

public static double[] averageTable(int num){
average = new double[num];
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
double average = (double)totalSub / counter;

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


public static void conclusion(){

int firstline = studentAndSubject.length;
int secondline = studentAndSubject[0].length;

int[] highestPasses = new int[secondline];
int[] highestFails = new int[secondline];
int subjectPasses = 0;
int subjectfails = 0;

for(int counter = 0; counter < secondline; counter++){

for(int count = 0; count < firstline; count++){
if(studentAndSubject[count][counter] > 49)subjectPasses++;
if(studentAndSubject[count][counter ] < 50)subjectfails++;
}
for(int count = 0; count < highestPasses.length; count++){
highestPasses[count] = subjectPasses;
highestFails[count] = subjectfails;
}
}
int easiest = 0;
int counteasiest = 0;
int hardest = 1000;
int counthardest = 0;

for(int imTired = 0; imTired < highestPasses.length; imTired++){
if(highestPasses[imTired] > easiest){
easiest = highestPasses[imTired];
counteasiest = imTired;
}

if(highestFails[imTired] < hardest){
hardest = highestFails[imTired];
counthardest = imTired;
}
}

System.out.println("The easiest subject is subject "+counteasiest+" with "+easiest+" passes");
System.out.println("The hardest subject is subject "+counthardest+" with "+hardest+" hardest");
int overall = 0;
int postion = 0;
int sub = 0;

int overallLoser = 1000;
int postionLoser = 0;
int subLoser = 0;

for(int countH = 0; countH < studentAndSubject.length; countH++){
for(int countHI = 0; countHI < studentAndSubject[countH].length; countHI++){
if(studentAndSubject[countH][countHI] > overall){
overall = studentAndSubject[countH][countHI];
postion = countH+1;
sub = countHI+1;
}

if(studentAndSubject[countH][countHI] < overallLoser){
overallLoser = studentAndSubject[countH][countHI];
postionLoser = countH+1;
subLoser = countHI+1;
}

}
}
System.out.println("The overall highest score is scored by student "+postion+" in subject "+sub+" scoring "+overall);
System.out.println("The overall highest score is scored by student "+postionLoser+" in subject "+subLoser+" scoring "+overallLoser);

System.out.println();
System.out.println();
System.out.println("CLASS SUMMARY");
System.out.println("=====================================================================================");
int best = 0;
int bestpos = 0;
int worst = 1000;
int worstpos = 0;
for(int count = 0; count < total.length; count++){
if(total[count] > best){
best = total[count];
bestpos = count+1;
}
if(total[count] < worst){
worst = total[count];
worstpos = count+1;
}
}
System.out.println("Best Graduating Student is: Student "+bestpos+" scoring "+best);
System.out.println("=====================================================================================");
System.out.println();
System.out.println();
System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
System.out.println("Worst Graduating Student is: Student "+worstpos+" scoring "+worst);
System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
System.out.println();
System.out.println();
System.out.println("=====================================================================================");
int classTotal = 0;
double classAverage = 0.0;

for(int counter = 0; counter < total.length; counter++){
classTotal += total[counter]; 
}
classAverage = (double)classTotal / student;

System.out.println("Class total score is: "+classTotal);
System.out.println("Class average score is: "+classAverage);

System.out.println("=====================================================================================");
System.out.println();
System.out.println();
}



}