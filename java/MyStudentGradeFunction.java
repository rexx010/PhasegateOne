import java.util.Arrays;

public class MyStudentGradeFunction{

static int student = 0;
static int subject = 0;
static int[][] studentAndSubject;
static String[] studentName;
static int[] total;
static double[] average;
static int[] position;

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


public static String[] studentNameInit(){
studentName = new String[student];
return studentName;
}

public static int[] totalTable(){
total = new int[student];
return total;
}

public static double[] averageTable(){
average = new double[student];
return average;
}

public static String[] studentNameInitialized(){
for(int count = 0; count < studentName.length; count++){
String num = Integer.toString(count+1);
studentName[count] = "student "+num;
}
return studentName;
}


public static int[] totalTableSum(){
for(int count = 0; count < total.length; count++){
total[count] = studentAndSubject[count][0] + studentAndSubject[count][1] + studentAndSubject[count][2];
}
return total;
}

public static double[] averageTableSum(){
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

}