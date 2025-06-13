
let extrovertVsletrovert = [];
let AE = 0;
let BI = 0;
let sensingVsletuitive = [];
let AS = 0;
let BN = 0;
let thinkingVsfeeling = [];
let AT = 0;
let BF = 0;
let judgingVsperceptive = [];
let AJ = 0;
let BP = 0;
let result = "";


const extrovertORletrovert = function (choosed, number){
if(number == 1) extrovertVsletrovert[0] = choosed;
if(number == 5) extrovertVsletrovert[1] = choosed;
if(number == 9) extrovertVsletrovert[2] = choosed;
if(number == 13) extrovertVsletrovert[3] = choosed;
if(number == 17) extrovertVsletrovert[4] = choosed;

return extrovertVsletrovert;
}


const extrovertORletrovertCounter = function (answer){
if(answer === "A") AE++;
if(answer === "B") BI++;
}

const sensingORletuitive = function (choosed, number){
if(number == 2) sensingVsletuitive[0] = choosed;
if(number == 6) sensingVsletuitive[1] = choosed;
if(number == 10) sensingVsletuitive[2] = choosed;
if(number == 14) sensingVsletuitive[3] = choosed;
if(number == 18) sensingVsletuitive[4] = choosed;

return sensingVsletuitive;
}


const sensingORletuitiveCounter = function(answer){
if(answer === "A") AS++;
if(answer === "B") BN++;
}


const thinkingORfeeling = function (choosed, number){
if(number == 3) thinkingVsfeeling[0] = choosed;
if(number == 7) thinkingVsfeeling[1] = choosed;
if(number == 11) thinkingVsfeeling[2] = choosed;
if(number == 15) thinkingVsfeeling[3] = choosed;
if(number == 19) thinkingVsfeeling[4] = choosed;

return thinkingVsfeeling;
}


const thinkingORfeelingCounter = function (answer){
if(answer === "A") AT++;
if(answer === "B") BF++;
}


const judgingORperceptive = function (choosed, number){
if(number == 4) judgingVsperceptive[0] = choosed;
if(number == 8) judgingVsperceptive[1] = choosed;
if(number == 12) judgingVsperceptive[2] = choosed;
if(number == 16) judgingVsperceptive[3] = choosed;
if(number == 20) judgingVsperceptive[4] = choosed;

return judgingVsperceptive;
}


const judgingORperceptiveCounter = function (answer){
if(answer === "A") AJ++;
if(answer === "B") BP++;
}

const extrovertORletrovertAnswer = function (){
for(let counter = 0; counter < extrovertVsletrovert.length; counter++){
console.logln(extrovertVsletrovert[counter]);
}
console.logln("Numbers of A selected: "+AE);
console.logln("Numbers of B selected: "+BI);
console.logln();
}


const sensingORletuitiveAnswer = function (){
for(let counter = 0; counter < sensingVsletuitive.length; counter++){
console.logln(sensingVsletuitive[counter]);
}
console.logln("Numbers of A selected: "+AS);
console.logln("Numbers of B selected: "+BN);
console.logln();
}


const thinkingORfeelingAnswer = function (){
for(let counter = 0; counter < thinkingVsfeeling.length; counter++){
console.logln(thinkingVsfeeling[counter]);
}
console.logln("Numbers of A selected: "+AT);
console.logln("Numbers of B selected: "+BF);
console.logln();
}


const judgingORperceptiveAnswer = function(){
for(let counter = 0; counter < judgingVsperceptive.length; counter++){
console.logln(judgingVsperceptive[counter]);
}
console.logln("Numbers of A selected: "+AJ);
console.logln("Numbers of B selected: "+BP);
console.logln();
}

const overallResult = function (){
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


















const input = require("prompt-sync");
const prompt = input();


let questionsToAsk = [
["A. expend energy, enjoy groups", "B. conserve energy, enjoy one-on-one"],
["A. leterpret literally", "B. look for meaning and possibilities"],
["A. logical, thinking, questioning", "B. empathetic, feeling, accommodating"],
["A. organized, orderly", "B. flexible, adaptable"],
["A. more outgoing, think out loud", "B. more reserved, think to yourself"],
["A. practical, realistic, experiential", "B. imaginative, innovative, theoretical"],
["A. candid, straigth forward, frank", "B. tactful, kind, encouraging"],
["A. plan, schedule", "B. unplanned, sponteneous"],
["A. seek many task, public activities, leteracting with others", "B. seek private, solitary activities with quiet to concentrate"],
["A. standard, usual, conventional", "B. different, novel, unique"],
["A. firm, tend to criticize, hold the line", "B. gentle, tend to appreciate, conciliate"],
["A. regulated, structured", "B. easy-going, live and let live"],
["A. external, communicative, express yourself", "B. leternal, reticent, keep to yourself"],
["A. focus on here-and-now", "B. look to the future, global perspective, big picture"],
["A. tough-minded, just", "B. tender-hearted, merciful"],
["A. preparation, plan ahead", "B. go with the flow, adapt as you go"],
["A. active, initiate", "B. reflective, delibrate"],
["A. facts, things, what is", "B. ideas, dreams, what could be, philosophical"],
["A. matter of fact, issue-oriented", "B. sensitive, people-oriented, compassionate"],
["A. control, govern", "B. latitude, freedom"],
];

console.log("What is your name?");
userName = prompt();
console.log();

for(count = 0; count < questionsToAsk.length; count++){

if(count == 0 || count == 4 || count == 8 || count == 12 || count == 16){
console.log(questionsToAsk[count][0] +" "+ questionsToAsk[count][1]);
userAnswer = "";

while(userAnswer !== "A" || userAnswer !== "B"){
userAnswer = prompt();
userAnswer = userAnswer.toUpperCase();
if(userAnswer === "A" || userAnswer == "B"){
break;
}else{
console.log("Invalid choice... Try again");
}
}

if(userAnswer === "A"){
extrovertORletrovert(questionsToAsk[count][0], count+1);
}else if(userAnswer === "B"){
extrovertORletrovert(questionsToAsk[count][1], count+1);
}
extrovertORletrovertCounter(userAnswer);
}


if(count == 1 || count == 5 || count == 9 || count == 13 || count == 17){
console.log(questionsToAsk[count][0] +" "+ questionsToAsk[count][1]);
userAnswer = "";

while(userAnswer !== "A" || userAnswer !== "B"){
userAnswer = prompt();
userAnswer = userAnswer.toUpperCase();
if(userAnswer === "A" || userAnswer === "B"){
break;
}else{
console.log("Invalid choice... Try again");
}
}

if(userAnswer === "A"){
sensingORletuitive(questionsToAsk[count][0], count+1);
}else if(userAnswer === "B"){
sensingORletuitive(questionsToAsk[count][1], count+1);
}
sensingORletuitiveCounter(userAnswer);
}


if(count == 2 || count == 6 || count == 10 || count == 14 || count == 18){
console.log(questionsToAsk[count][0] +" "+ questionsToAsk[count][1]);
userAnswer = "";

while(userAnswer !== "A" || userAnswer !== "B"){
userAnswer = prompt();
userAnswer = userAnswer.toUpperCase();
if(userAnswer === "A" || userAnswer === "B"){
break;
}else{
console.log("Invalid choice... Try again");
}
}

if(userAnswer === "A"){
thinkingORfeeling(questionsToAsk[count][0], count+1);
}else if(userAnswer === "B"){
thinkingORfeeling(questionsToAsk[count][1], count+1);
}
thinkingORfeelingCounter(userAnswer);
}



if(count == 3 || count == 7 || count == 11 || count == 15 || count == 19){
console.log(questionsToAsk[count][0] +" "+ questionsToAsk[count][1]);
userAnswer = "";

while(userAnswer !== "A" || !userAnswer !== "B"){
userAnswer = prompt();
userAnswer = userAnswer.toUpperCase();
if(userAnswer === "A" || userAnswer === "B"){
break;
}else{
console.log("Invalid choice... Try again");
}
}

if(userAnswer === "A"){
judgingORperceptive(questionsToAsk[count][0], count+1);
}else if(userAnswer === "B"){
judgingORperceptive(questionsToAsk[count][1], count+1);
}
judgingORperceptiveCounter(userAnswer);
}


}


console.log();
console.log();
console.log("Hello "+userName+" you selected:");
extrovertORletrovertAnswer();
sensingORletuitiveAnswer();
thinkingORfeelingAnswer();
judgingORperceptiveAnswer();
console.log();

result = overallResult();
console.log();
if(result === "letJ"){
console.log(result+" \n\nletJ (Architect) is a personality type with the letroverted, letuitive, Thinking, and Judging traits. These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do. Their inner world is often a private, complex one.");
}
else if(result === "letP"){
console.log(result+" \n\nletP (Logician) is a personality type with the letroverted, letuitive, Thinking, and Prospecting traits. These flexible thinkers enjoy taking an unconventional approach to many aspects of life. They often seek out unlikely paths, mixing willingness to experiment with personal creativity.");
}
else if(result === "ENTJ"){
console.log(result+" \n\n\nENTJ (Commander) is a personality type with the Extraverted, letuitive, Thinking, and Judging traits. They are decisive people who love momentum and accomplishment. They gather information to construct their creative visions but rarely hesitate for long before acting on them.");
}
else if(result === "ENTP"){
console.log(result+" \n\nENTP (Debater) is a personality type with the Extraverted, letuitive, Thinking, and Prospecting traits. They tend to be bold and creative, deconstructing and rebuilding ideas with great mental agility. They pursue their goals vigorously despite any resistance they might encounter."); 
}
else if(result === "INFJ"){
console.log(result+" \n\nINFJ (Advocate) is a personality type with the letroverted, letuitive, Feeling, and Judging traits. They tend to approach life with deep thoughtfulness and imagination. Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things.");
}
else if(result === "INFP"){
console.log(result+" \n\nINFP (Mediator) is a personality type with the letroverted, letuitive, Feeling, and Prospecting traits. These rare personality types tend to be quiet, open-minded, and imaginative, and they apply a caring and creative approach to everything they do.");
}
else if(result === "ENFJ"){
console.log(result+" \n\nENFJ (Protagonist) is a personality type with the Extraverted, letuitive, Feeling, and Judging traits. These warm, forthright types love helping others, and they tend to have strong ideas and values. They back their perspective with the creative energy to achieve their goals.");
}
else if(result === "ENFP"){
console.log(result+" \n\nENFP (Campaigner) is a personality type with the Extraverted, letuitive, Feeling, and Prospecting traits. These people tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others. Their vibrant energy can flow in many directions.");
}
else if(result === "ISTJ"){
console.log(result+" \n\nISTJ (Logistician) is a personality type with the letroverted, Observant, Thinking, and Judging traits. These people tend to be reserved yet willful, with a rational outlook on life. They compose their actions carefully and carry them out with methodical purpose.");
}
else if(result === "ISFJ"){
console.log(result+" \n\nISFJ (Defender) is a personality type with the letroverted, Observant, Feeling, and Judging traits. These people tend to be warm and unassuming in their own steady way. They’re efficient and responsible, giving careful attention to practical details in their daily lives.");
}
else if(result === "ESTJ"){
console.log(result+" \n\nESTJ (Executive) is a personality type with the Extraverted, Observant, Thinking, and Judging traits. They possess great fortitude, emphatically following their own sensible judgment. They often serve as a stabilizing force among others, able to offer solid direction amid adversity.");
}
else if(result === "ESFJ"){
console.log(result+" \n\nESFJ (Consul) is a personality type with the Extraverted, Observant, Feeling, and Judging traits. They are attentive and people-focused, and they enjoy taking part in their social community. Their achievements are guided by decisive values, and they willingly offer guidance to others.");
}
else if(result === "ISTP"){
console.log(result+" \n\nISTP (Virtuoso) is a personality type with the letroverted, Observant, Thinking, and Prospecting traits. They tend to have an individualistic mindset, pursuing goals without needing much external connection. They engage in life with inquisitiveness and personal skill, varying their approach as needed.");
}
else if(result === "ISFP"){
console.log(result+" \n\nISFP (Adventurer) is a personality type with the letroverted, Observant, Feeling, and Prospecting traits. They tend to have open minds, approaching life, new experiences, and people with grounded warmth. Their ability to stay in the moment helps them uncover exciting potentials.");
}
else if(result === "ESTP"){
console.log(result+" \n\nESTP (Entrepreneur) is a personality type with the Extraverted, Observant, Thinking, and Prospecting traits. They tend to be energetic and action-oriented, deftly navigating whatever is in front of them. They love uncovering life’s opportunities, whether socializing with others or in more personal pursuits.");
}
else if(result === "ESFP"){
console.log(result+" \n\nESFP (Entertainer) is a personality type with the Extraverted, Observant, Feeling, and Prospecting traits. These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown. They can be very social, often encouraging others leto shared activities.");
}
console.log();




