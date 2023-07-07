//NAME: Ria Mukherji
//SMU ID: 48877496
//LAB: Lab 2 fall 2022
//INSTRUCTOR: Dixit,Paarul Howard,Ken

import java.util.Scanner;

public class PlanetaryAge
{
 public static void main(String[] args)
   {
 
    //Scanner name
    Scanner scan = new Scanner(System.in);
  
   //ask user for age
   System.out.print("What is your current age? ");

   //read users age and store as int
   int age = scan.nextInt();

   // constants
    double mercuryConstant = 0.24;
    double venusConstant = .62;
    double earthConstant = 1.0;
    double marsConstant = 1.88;
    double jupiterConstant = 11.80;
    double saturnConstant = 29.40;
    double uranusConstant = 84.00;
    double neptuneConstant = 164.00;
    double plutoConstant = 248.60;
   

   //calculated age variables 
    double mercuryAge = age/mercuryConstant;
    double venusAge = age/venusConstant;
    double earthAge = age/earthConstant;
    double marsAge = age/marsConstant;
    double jupiterAge = age/jupiterConstant;
    double saturnAge = age/saturnConstant;
    double uranusAge = age/uranusConstant;
    double neptuneAge = age/neptuneConstant;
    double plutoAge = age/plutoConstant;


    //print all formatted statements

   System.out.printf("%10s %10s %10s\n", "Year", "Sun Orbit Years", "Age on Earth");

   System.out.printf("%10s %15.2f %12.2f\n", "Mercury", 
mercuryConstant, mercuryAge);

   System.out.printf("%10s %15.2f %12.2f\n", "Venus", venusConstant, venusAge);

   System.out.printf("%10s %15.2f %12.2f\n", "Earth", earthConstant, earthAge);

System.out.printf("%10s %15.2f %12.2f\n", "Mars", marsConstant, marsAge);

System.out.printf("%10s %15.2f %12.2f\n", "Jupiter", jupiterConstant, jupiterAge);

System.out.printf("%10s %15.2f %12.2f\n", "Saturn", saturnConstant, saturnAge);

System.out.printf("%10s %15.2f %12.2f\n", "Uranus", uranusConstant, uranusAge);

System.out.printf("%10s %15.2f %12.2f\n", "Neptune", neptuneConstant, neptuneAge);
  
System.out.printf("%10s %15.2f %12.2f\n","Pluto", plutoConstant, plutoAge);

   

   }//end main
}//end PlanetaryAge
