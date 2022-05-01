package com.sprayhappiness.calc;

import java.util.Scanner;

public class Calculator {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double num1 = 9;
		double  num2 = 3;
		double ans;
char op;
Scanner  numinput = new Scanner(System.in);
System.out.println("Please enter num1");

num1 = numinput.nextInt();
System.out.println("Please enter num2");
num2 = numinput.nextInt();
System.out.println("Please Enter Opertation to perform + , -, x,/,%");
op = numinput.next().charAt(0);

switch(op) {

case '+':
{
	ans = num1 + num2 ;
	
	System.out.println("addition : " + ans); 
break;
	}

case '-':
{
ans = num1 - num2 ;
	System.out.println("Substraction : " + ans); 
break;
	}

case 'x':
{
ans = num1 * num2 ;
	System.out.println("Multiplication : " + ans); 
break;
	}

case '/':
{
	ans = num1 / num2 ;
	System.out.println("Division : " + ans); 
break;
}
case '%' :
{ans = num1%num2;
System.out.println("Mod of div :" +ans);
break;
	}
default :
	System.out.println("Enter valid numbers");

}
numinput.close();

}
	

}
