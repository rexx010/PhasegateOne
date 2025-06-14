import java.util.Arrays;

public class MyStudentGradeFunction{

static int student = 0;
static int subject = 0;
static int[][] studentAndSubject;
static String[] studentName;
static int[] total;
static int[] average;
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

public static int[][] gradeTableInitialized(int[][] arraytable){
studentAndSubject = arraytable;
return studentAndSubject;
}

public static String[] studentNameInitialized(){
studentName = new String[student];

for(int count = 0; count < studentName.length; count++){
String num = Integer.toString(count+1);
studentName[count] = "student "+num;
}
return studentName;
}

public static int[] totalGrades(){
total = new int[student];
for(int count = 0; count < total.length; count++){
total[count] = studentAndSubject[count][0] + studentAndSubject[count][1] + studentAndSubject[count][2];
}
return total;
}


public static int[][] gradeTableInitializedReturned(){
return studentAndSubject;
}





}