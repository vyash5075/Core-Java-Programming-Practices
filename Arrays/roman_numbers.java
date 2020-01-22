import java.util.*;
class roman_numbers
{
public static void printrom(int num){

String r[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
int a[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
int i=12;
while(num!=0)
{
int div=num/a[i];
num=num%a[i];
while(div!=0)
{
System.out.print(r[i]);
div--;
}
i--;
}

}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printrom(n);
}
}