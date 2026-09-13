import java.util.Scanner;
 public class IT26102214lab6q5{//part last part
  public static void main(String[]args){  
    Scanner input = new Scanner(System.in);
	int number;
	double meanofsquare,rms;
	
	double sumofsquare =0;
	int count = 0;
	
	System.out.println("Enter a positive integer(terminate input with -99)");
    while (true){
		System.out.println("Enter a number :");
		number = input.nextInt();
     	   
	if(number == -99){
		break;
	
	}
	else if (number> 0){
		sumofsquare +=Math.pow(number,2);
		count++;
	}
	else{
		System.out.print("Enter a positive number or -99 tp terminate");
	}
   }
   
   if (count >0){
	   meanofsquare= sumofsquare/count;
	   rms= Math.sqrt(meanofsquare);
	   System.out.println("the root mean square (rms) is :" + rms);
   }
   else{
	   System.out.println("no positive numbers were entered");
   }
  }
 }
		
		
	
  