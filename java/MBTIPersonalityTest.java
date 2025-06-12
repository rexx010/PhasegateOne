import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class MBTIPersonalityTest{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

String[][] questionsToAsk = {
{"A. expend energy, enjoy groups", "B. conserve energy, enjoy one-on-one"},
{"A. interpret literally", "B. look for meaning and possibilities"},
{"A. logical, thinking, questioning", "B. empathetic, feeling, accommodating"},
{"A. organized, orderly", "B. flexible, adaptable"},
{"A. more outgoing, think out loud", "B. more reserved, think to yourself"},
{"A. practical, realistic, experiential", "B. imaginative, innovative, theoretical"},
{"A. candid, straigth forward, frank", "B. tactful, kind, encouraging"},
{"A. plan, schedule", "B. unplanned, sponteneous"},
{"A. seek many task, public activities, interacting with others", "B. seek private, solitary activities with quiet to concentrate"},
{"A. standard, usual, conventional", "B. different, novel, unique"},
{"A. firm, tend to criticize, hold the line", "B. gentle, tend to appreciate, conciliate"},
{"A. regulated, structured", "B. easy-going, live and let live"},
{"A. external, communicative, express yourself", "B. internal, reticent, keep to yourself"},
{"A. focus on here-and-now", "B. look to the future, global perspective, big picture"},
{"A. tough-minded, just", "B. tender-hearted, merciful"},
{"A. preparation, plan ahead", "B. go with the flow, adapt as you go"},
{"A. active, initiate", "B. reflective, delibrate"},
{"A. facts, things, what is", "B. ideas, dreams, what could be, philosophical"},
{"A. matter of fact, issue-oriented", "B. sensitive, people-oriented, compassionate"},
{"A. control, govern", "B. latitude, freedom"},
};

System.out.println("What is your name?");
String userName = input.nextLine();
System.out.println();

for(int count = 0; count < questionsToAsk.length; count++){

if(count == 0 || count == 4 || count == 8 || count == 12 || count == 16){
System.out.println(count +" "+ questionsToAsk[count][0] +" "+ questionsToAsk[count][1]);
String userAnswer = "";

while(!userAnswer.equals("A") || !userAnswer.equals("B")){
userAnswer = input.next();
userAnswer = userAnswer.toUpperCase();
if(userAnswer.equals("A") || userAnswer.equals("B")){
break;
}else{
System.out.print("Invalid choice... Try again");
}
}

if(userAnswer.equals("A")){
MBTIPersonalityTestFunction.extrovertORintrovert(questionsToAsk[count][0], count+1);
}else if(userAnswer.equals("B")){
MBTIPersonalityTestFunction.extrovertORintrovert(questionsToAsk[count][1], count+1);
}
MBTIPersonalityTestFunction.extrovertORintrovertCounter(userAnswer);
}


if(count == 1 || count == 5 || count == 9 || count == 13 || count == 17){
System.out.println(count +" "+ questionsToAsk[count][0] +" "+ questionsToAsk[count][1]);
String userAnswer = "";

while(!userAnswer.equals("A") || !userAnswer.equals("B")){
userAnswer = input.next();
userAnswer = userAnswer.toUpperCase();
if(userAnswer.equals("A") || userAnswer.equals("B")){
break;
}else{
System.out.print("Invalid choice... Try again");
}
}

if(userAnswer.equals("A")){
MBTIPersonalityTestFunction.sensingORintuitive(questionsToAsk[count][0], count+1);
}else if(userAnswer.equals("B")){
MBTIPersonalityTestFunction.sensingORintuitive(questionsToAsk[count][1], count+1);
}
MBTIPersonalityTestFunction.sensingORintuitiveCounter(userAnswer);
}


if(count == 2 || count == 6 || count == 10 || count == 14 || count == 18){
System.out.println(count +" "+ questionsToAsk[count][0] +" "+ questionsToAsk[count][1]);
String userAnswer = "";

while(!userAnswer.equals("A") || !userAnswer.equals("B")){
userAnswer = input.next();
userAnswer = userAnswer.toUpperCase();
if(userAnswer.equals("A") || userAnswer.equals("B")){
break;
}else{
System.out.print("Invalid choice... Try again");
}
}

if(userAnswer.equals("A")){
MBTIPersonalityTestFunction.thinkingORfeeling(questionsToAsk[count][0], count+1);
}else if(userAnswer.equals("B")){
MBTIPersonalityTestFunction.thinkingORfeeling(questionsToAsk[count][1], count+1);
}
MBTIPersonalityTestFunction.thinkingORfeelingCounter(userAnswer);
}



if(count == 3 || count == 7 || count == 11 || count == 15 || count == 19){
System.out.println(count +" "+ questionsToAsk[count][0] +" "+ questionsToAsk[count][1]);
String userAnswer = "";

while(!userAnswer.equals("A") || !userAnswer.equals("B")){
userAnswer = input.next();
userAnswer = userAnswer.toUpperCase();
if(userAnswer.equals("A") || userAnswer.equals("B")){
break;
}else{
System.out.print("Invalid choice... Try again");
}
}

if(userAnswer.equals("A")){
MBTIPersonalityTestFunction.judgingORperceptive(questionsToAsk[count][0], count+1);
}else if(userAnswer.equals("B")){
MBTIPersonalityTestFunction.judgingORperceptive(questionsToAsk[count][1], count+1);
}
MBTIPersonalityTestFunction.judgingORperceptiveCounter(userAnswer);
}


}
System.out.println();
System.out.println();
System.out.println("Hello "+userName+" you selected:");
MBTIPersonalityTestFunction.extrovertORintrovertAnswer();
MBTIPersonalityTestFunction.sensingORintuitiveAnswer();
MBTIPersonalityTestFunction.thinkingORfeelingAnswer();
MBTIPersonalityTestFunction.judgingORperceptiveAnswer();



}
}