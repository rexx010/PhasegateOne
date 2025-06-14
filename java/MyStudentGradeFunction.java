import java.util.Arrays;

public class MyStudentGradeFunction{

static int student = 0;
static int subject = 0;
static int[][] studentAndSbuject;

public static int students(int number){
student = number;
return student;
}

public static int subjects(int number){
subject = number;
return subject;
}

public static int[][] table(int num1, int num2){
studentAndSbuject = new int[num1][num2];
return studentAndSbuject;
}

public static int[][] table1(int[][] arraytable){
studentAndSbuject = arraytable;
return studentAndSbuject;
}

public static int[][] table2(){
return studentAndSbuject;


}





}