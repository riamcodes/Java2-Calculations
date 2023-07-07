//NAME: Ria Mukherji
//SMU ID: 48877496
//LAB: Lab 2 fall 2022
//INSTRUCTOR: Dixit,Paarul Howard,Ken

import java.util.Scanner;

public class Contract 
{
  public static void main(String[]args)
  {

   //Scanner name
   Scanner scan = new Scanner(System.in);
   
   //Prompt and store user rate
   System.out.print("Enter contract hourly rate: ");
   double hourlyRate = scan.nextDouble();
 
   //Prompt and store health insurance cost
    System.out.print("Enter cost of health insurance/month: ");
    double insuranceMonthly = scan.nextDouble();

   //Prompt and store total holidays
     System.out.print("Enter total holidays per year: ");
    int holidays = scan.nextInt();

   //Prompt and store vacation days
    System.out.print("Enter total vacation days per year: ");
    int vacation = scan.nextInt();
 
   //Constants and variable calculation
   int workDaysWeek = 5;
   int hoursPerDay = 8;
   int weeksPerYear = 52;
   int monthsPerYear = 12;
   double incomeTaxRate = 0.22;
   double employmentTaxRate = 0.15;
 
   
   
   double grossIncome = workDaysWeek * hoursPerDay * weeksPerYear * hourlyRate;
   double totalIncomeTax = incomeTaxRate * grossIncome;
   double totalEmploymentTax = employmentTaxRate * grossIncome;
   double unpaidHolidays = holidays * hoursPerDay * hourlyRate;
   double unpaidVacation = vacation * hoursPerDay * hourlyRate;
   double insuranceYearly = insuranceMonthly * monthsPerYear;
   double netIncome = grossIncome - totalIncomeTax - totalEmploymentTax - unpaidHolidays - unpaidVacation - insuranceYearly;

   //Calculate and format output
   System.out.printf("%30s %1s %,10.2f\n","Gross contract income", "$", grossIncome);
   System.out.printf("%30s %1s %,10.2f\n","Income tax (22%)", "$", totalIncomeTax);
   System.out.printf("%30s %1s %,10.2f\n","Self employment tax (15%)", "$", totalEmploymentTax);
   System.out.printf("%30s %1s %,10.2f\n","Unpaid holidays", "$", unpaidHolidays);
   System.out.printf("%30s %1s %,10.2f\n","Unpaid vacation", "$", unpaidVacation);
   System.out.printf("%30s %1s %,10.2f\n","Annual health insurance", "$", insuranceYearly);
   System.out.printf("%30s %1s %,10.2f\n","Net contract income", "$", netIncome);


  }// end main
}// end contract
