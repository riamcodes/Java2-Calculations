//NAME: Ria Mukherji
//SMU ID: 48877496
//LAB: Lab 2 fall 2022
//INSTRUCTOR: Dixit,Paarul Howard,Ken

import java.util.Scanner;

public class CheckOut
{
 public static void main(String[]args)
 {
  //Scanner name
  Scanner scan = new Scanner(System.in);

  //Prompt user price
  System.out.print("Enter price: ");

  //Read user price
  double price = scan.nextDouble();
  
  //Prompt user quantity
  System.out.print("Enter quantity: "); 
 
  //Read user quantity
  int quantity = scan.nextInt();

  //Prompt user tax
  System.out.print("Enter sales tax %: ");
 
  //Read user sales tax
  double tax = scan.nextDouble()/100; 

  //Calculate and print final statements with formatting
  double subtotal = price * quantity;
  double finalTax = tax * subtotal;
  double total = finalTax + subtotal;

  System.out.printf("%-10s %2s %7.2f\n", "Subtotal:", "$", subtotal);
  System.out.printf("%-10s %2s %7.2f\n", "Sales tax:", "$", finalTax);
  System.out.printf("%-10s %2s %7.2f\n", "Total:", "$", total);


 }// end main

}// end CheckOut
