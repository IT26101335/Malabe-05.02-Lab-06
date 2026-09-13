import java.util.Scanner;
 public class IT26102214lab6q4{//part c
  public static void main(String[]args){
	int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,sum =0;
   Scanner input = new Scanner(System.in);
   System.out.print("please enter the 10 numbers");
   System.out.print( "Enter the number 1:");
   num1 = input.nextInt();
   sum= sum+ num1;
   
   System.out.print("enter the number  2:");
   num2= input.nextInt();
   sum += num2;
   
   System.out.print("Enter the number 3:");
   num3 = input.nextInt();
   sum += num3;
   
   System.out.print("Enter the number 4:");
   num4=input.nextInt();
   sum += num4;
   
   System.out.print("enter the number 5:");
   num5= input.nextInt();
   sum += num5;
   
    System.out.print("enter the number 6:");
   num6= input.nextInt();
   sum += num6;
   
    System.out.print("enter the number 7:");
   num7= input.nextInt();
   sum += num7;
   
    System.out.print("enter the number 8:");
   num8= input.nextInt();
   sum += num8;
   
    System.out.print("enter the number 9:");
   num9= input.nextInt();
   sum += num9;
   
    System.out.print("enter the number 10:");
   num10= input.nextInt();
   sum += num10;
   
   
   System.out.println("the numbers you entered are ;");
   System.out.print(num1 + " ");
   System.out.print(num2 + " ");
   System.out.print(num3 + " ");
   System.out.print(num4 + " ");
   System.out.print(num5 + " ");
   System.out.print(num6 + " ");
   System.out.print(num7 + " ");
   System.out.print(num8 + " ");
   System.out.print(num9 + " ");
   System.out.println(num10 + " ");
   
   System.out.println("sum of the nummbers: " + sum);
   System.out.println("Avg of the numbers :" + sum/10);
  }
 }