//NAME: Ria Mukherji
//SMU ID: 48877496
//LAB: Lab 2 fall 2022
//INSTRUCTOR: Dixit,Paarul Howard,Ken

import java.util.Scanner;

public class Salary
{
  public static void main(String[]args)
  {
   //Scanner name
   Scanner scan = new Scanner(System.in);
   
   //Prompt and store user salary
   System.out.print("Enter annual salary: ");
   int salary = scan.nextInt();

   //Prompt and store income tax
   System.out.print("Enter income tax rate: ");
   double incomeTax = scan.nextDouble() / 100;

  //Calculate and format final print statements
  double incomeTaxTotal = incomeTax * salary;
  double fica = 0.075;
  double ficaTotal = fica * salary;
  double netIncome = salary - incomeTaxTotal - ficaTotal;


System.out.printf("%14s %,9.2f\n", "Income tax $", incomeTaxTotal);
System.out.printf("%14s %,9.2f\n", "FICA (7.5%) $", ficaTotal);
System.out.printf("%14s %,9.2f\n", "Net income $", netIncome);

   
  
  

  }// end main
} //end class
