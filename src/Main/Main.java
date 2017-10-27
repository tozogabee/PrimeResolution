package Main;

import java.util.InputMismatchException;

import Operation.NumberInput;
import Operation.PrimeResolving;

public class Main {
	
	public static void main(String[] args)
	{
		System.out.println("Please give me number greater than 0,if the input is 0,the program will exit\n");
		long number=0;
		do {

			NumberInput input=new NumberInput();
			number=input.inputLong();
			PrimeResolving primeResolving=new PrimeResolving(number);
			primeResolving.primeFactor();
		}while(number!=0);

	}

}
