import java.util.Scanner;
 public class IT26102214lab6q1{
  public static void main (String[] args){
	  double number, square,squareroot;
	  Scanner input = new Scanner(System.in);
	  System.out.print("enter the number= ");
	  number =  input.nextDouble();
	  if(number <= 0){
		  System.out.print("the number must greater thn zero");
	  }
	  else{
           square = number * number;
		   squareroot = Math.sqrt(number);
		   System.out.println("the square of"+ number +"is: " + square);
		   System.out.println("the square of" + number + "is : "+ squareroot);
	  }
  }
 }
		  