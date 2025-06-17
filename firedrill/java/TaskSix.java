public class TaskSix{
public static void main(String[] args){

int multiple = 0;
int multiple1 = 0;
int multiple2= 0;
int multiple3 = 0;
int multiple4 = 0;

for(int counter = 4; counter < 10; counter += 4){
if(counter % 4 == 0){
multiple = counter;
multiple1 = counter;
multiple2 = counter;
multiple3 = counter;
multiple4 = counter; 

multiple = multiple * multiple;
multiple1 = multiple1 * multiple;
multiple2 = multiple2 * multiple1;
multiple3 = multiple3 * multiple2;
multiple4 = multiple4 * multiple3; 

System.out.print(multiple+" ");
System.out.print(multiple1+" ");
System.out.print(multiple2+" ");
System.out.print(multiple3+" ");
System.out.print(multiple4+" ");

}
}




}
}