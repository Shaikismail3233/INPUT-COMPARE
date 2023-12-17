package INPUT;

import java.util.Scanner;

public class Jinput{
	
		 

		  public static void main(String[] args) {
		    
		int i=1;
		while(i<5) {
			System.out.println("Enter the userid")  ;
			  Scanner myObj = new Scanner(System.in);
			 String x= myObj.nextLine();
		    System.out.println("The user name is" + x);
		    
		
		System.out.println("Enter the password");
		Scanner myObj1 = new Scanner(System.in);
		String y= myObj.nextLine();
		
		if ( x.equals(y) ){
			System.out.println("you are allowed");
		}
		else
		{
				System.out.println("please retry");
		}
		i=i+1;
		
	
}}


}