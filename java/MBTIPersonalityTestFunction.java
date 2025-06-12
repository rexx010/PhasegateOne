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


public static String[] extrovertORintrovert(String choosed, int number){
if(number == 1) extrovertVsintrovert[0] = choosed;
if(number == 5) extrovertVsintrovert[1] = choosed;
if(number == 9) extrovertVsintrovert[2] = choosed;
if(number == 13) extrovertVsintrovert[3] = choosed;
if(number == 17) extrovertVsintrovert[4] = choosed;
}


public static int extrovertORintrovertCounter(String answer){
if(answer == A) AE++;
if(answer == A) BI++;
}

public static String[] sensingORintuitive(String choosed, int number){
if(number == 2) sensingVsintuitive[0] = choosed;
if(number == 6) sensingVsintuitive[1] = choosed;
if(number == 10) sensingVsintuitive[2] = choosed;
if(number == 14) sensingVsintuitive[3] = choosed;
if(number == 18) sensingVsintuitive[4] = choosed;
}


public static int sensingORintuitiveCounter(String answer){
if(answer == A) AS++;
if(answer == A) BN++;
}


public static String[] thinkingORfeeling(String choosed, String answer, int number){
if(number == 3) thinkingVsfeeling[0] = choosed;
if(number == 7) thinkingVsfeeling[1] = choosed;
if(number == 11) thinkingVsfeeling[2] = choosed;
if(number == 15) thinkingVsfeeling[3] = choosed;
if(number == 19) thinkingVsfeeling[4] = choosed;
}


public static String[] judgingORperceptive(String choosed, String answer, int number){
if(number == 4) judgingVsperceptive[0] = choosed;
if(number == 8) judgingVsperceptive[1] = choosed;
if(number == 12) judgingVsperceptive[2] = choosed;
if(number == 16) judgingVsperceptive[3] = choosed;
if(number == 20) judgingVsperceptive[4] = choosed;
}


}