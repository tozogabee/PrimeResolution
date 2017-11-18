package Main;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

import Operation.DivisorMultiple;
import Operation.NumberInput;
import Operation.PrimeResolving;

public class Main {
	
	public static void main(String[] args)
	{
		System.out.println("Please give me number greater than 0,if the input is 0,the program will exit\n");
		long number1=0;
		long number2=0;
		String again="";
		DivisorMultiple divisorMultiple=null;
        NumberInput input=new NumberInput();
		//do {
			do {
				number1 = input.inputLong("Please the 1st number - ");
			}while(number1 < 1);
			do {
				number2=input.inputLong("Please the 2nd number - ");
			}while(number2 < 1);
			divisorMultiple=new DivisorMultiple(number1,number2);
			divisorMultiple.listPrimes();
		//}while(number1!=0 || number2!=0);
	}



}
