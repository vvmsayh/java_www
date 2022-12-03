
public class Main {
public static void main(String[] args){
boolean b = true;
for(int i=1; i<1000; i++){
    if (i==1){
System.out.println("Число 1 - простоe число.");}
if(i==2){
System.out.println("Число 2 - простое число.");
}
else
{
for(int j=2; j<i; j++)
{
if(i%j==0)
{b=false;}
}
if(b=false)
System.out.println("Число "+i+" - непростое число");
else
System.out.println("Число "+i+" - простое число");               
}                     
}
}
}