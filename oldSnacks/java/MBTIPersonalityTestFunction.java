import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class MBTIPersonalityTestFunction{

static String[] extrovertVsintrovert = new String[5];
static int AE = 0;
static int BI = 0;
static String[] sensingVsintuitive = new String[5];
static int AS = 0;
static int BN = 0;
static String[] thinkingVsfeeling = new String[5];
static int AT = 0;
static int BF = 0;
static String[] judgingVsperceptive = new String[5];
static int AJ = 0;
static int BP = 0;
static String result = "";


public static String[] extrovertORintrovert(String choosed, int number){
if(number == 1) extrovertVsintrovert[0] = choosed;
if(number == 5) extrovertVsintrovert[1] = choosed;
if(number == 9) extrovertVsintrovert[2] = choosed;
if(number == 13) extrovertVsintrovert[3] = choosed;
if(number == 17) extrovertVsintrovert[4] = choosed;

return extrovertVsintrovert;
}


public static void extrovertORintrovertCounter(String answer){
if(answer.equals("A")) AE++;
if(answer.equals("B")) BI++;
}

public static String[] sensingORintuitive(String choosed, int number){
if(number == 2) sensingVsintuitive[0] = choosed;
if(number == 6) sensingVsintuitive[1] = choosed;
if(number == 10) sensingVsintuitive[2] = choosed;
if(number == 14) sensingVsintuitive[3] = choosed;
if(number == 18) sensingVsintuitive[4] = choosed;

return sensingVsintuitive;
}


public static void sensingORintuitiveCounter(String answer){
if(answer.equals("A")) AS++;
if(answer.equals("B")) BN++;
}


public static String[] thinkingORfeeling(String choosed, int number){
if(number == 3) thinkingVsfeeling[0] = choosed;
if(number == 7) thinkingVsfeeling[1] = choosed;
if(number == 11) thinkingVsfeeling[2] = choosed;
if(number == 15) thinkingVsfeeling[3] = choosed;
if(number == 19) thinkingVsfeeling[4] = choosed;

return thinkingVsfeeling;
}


public static void thinkingORfeelingCounter(String answer){
if(answer.equals("A")) AT++;
if(answer.equals("B")) BF++;
}


public static String[] judgingORperceptive(String choosed, int number){
if(number == 4) judgingVsperceptive[0] = choosed;
if(number == 8) judgingVsperceptive[1] = choosed;
if(number == 12) judgingVsperceptive[2] = choosed;
if(number == 16) judgingVsperceptive[3] = choosed;
if(number == 20) judgingVsperceptive[4] = choosed;

return judgingVsperceptive;
}


public static void judgingORperceptiveCounter(String answer){
if(answer.equals("A")) AJ++;
if(answer.equals("B")) BP++;
}

public static void extrovertORintrovertAnswer(){
for(int counter = 0; counter < extrovertVsintrovert.length; counter++){
System.out.println(extrovertVsintrovert[counter]);
}
System.out.println("Numbers of A selected: "+AE);
System.out.println("Numbers of B selected: "+BI);
System.out.println();
}


public static void sensingORintuitiveAnswer(){
for(int counter = 0; counter < sensingVsintuitive.length; counter++){
System.out.println(sensingVsintuitive[counter]);
}
System.out.println("Numbers of A selected: "+AS);
System.out.println("Numbers of B selected: "+BN);
System.out.println();
}


public static void thinkingORfeelingAnswer(){
for(int counter = 0; counter < thinkingVsfeeling.length; counter++){
System.out.println(thinkingVsfeeling[counter]);
}
System.out.println("Numbers of A selected: "+AT);
System.out.println("Numbers of B selected: "+BF);
System.out.println();
}


public static void judgingORperceptiveAnswer(){
for(int counter = 0; counter < judgingVsperceptive.length; counter++){
System.out.println(judgingVsperceptive[counter]);
}
System.out.println("Numbers of A selected: "+AJ);
System.out.println("Numbers of B selected: "+BP);
System.out.println();
}

public static String overallResult(){
if(AE > BI){
result += "E";
}else{
result += "I";
}

if(AS > BN){
result += "S";
}else{
result += "N";
}

if(AT > BF){
result += "T";
}else{
result += "F";
}

if(AJ > BP){
result += "J";
}else{
result += "P";
}
return result;
}

//public static void overallResultType(){


}