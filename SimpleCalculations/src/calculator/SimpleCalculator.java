package calculator;

import java.util.Scanner;

public class SimpleCalculator {
	
	private static String command;
	private static int num1;
	private static int num2;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		command=sc.next();
		
		while(!commandIsInt(command)) {
			System.out.println("Please enter a valid number");
			command=sc.next();
		}
		
		num1=Integer.parseInt(command);
	
		System.out.println("Enter the second number");
		command=sc.next();
		
		while(!commandIsInt(command)) {
			System.out.println("Please enter a valid number");
			command=sc.next();
		}
		
		num2=Integer.parseInt(command);
		
		System.out.println("Enter an operator");
		System.out.println("valid operators are +, *, - or /");
		
		command=sc.next();
		
		calculation(num1,num2,command);
		
		
		
	}
	
		
	public static int calculation(int num1, int num2, String command){
		
		if (command.equals("+")){
			System.out.println(num1 + "+"+ num2 + "=" + (num1+num2));
			return num1+num2;
		}else if(command.equals("-")) {
			System.out.println(num1 + "-"+ num2 + "=" + (num1-num2));
			return num1-num2;
		}else if(command.equals("/")) {
			System.out.println(num1 + "/"+ num2 + "=" + (num1/num2));
			return num1/num2;
		}else if (command.equals("*")) {
			System.out.println(num1 + "*"+ num2 + "=" + (num1*num2));
			return num1*num2;
		}else {
			System.out.println("Operator is not valid!");
			return 0;
		}
	}
	
	
	
	
	private static boolean commandIsInt(String command) {
		
		try {
			Integer.parseInt(command);
			return true; 
		}catch (Exception e){
			return false;
		}
		
	}

}
