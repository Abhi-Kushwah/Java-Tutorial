package input;

import java.util.Scanner;

public class Inputs {
	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("enter the first number :");
    int a=scan.nextInt();
    System.out.print("enter the second number :");
    int b=scan.nextInt();
    if(a%2==0 && b%2==0) {
    	System.out.println(" is even");
    }
    else {
    	System.out.println("both is not even");
    }
	}

}
