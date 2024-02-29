import java.util.Scanner;
public class ComputeAverage
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.print("Enter 3 Number: ");
double a= input.nextDouble();
double b= input.nextDouble();
double c= input.nextDouble();
double Average= (a+b+c)/3;
System.out.print("The Average of 3 number is = "+Average);
}
}
