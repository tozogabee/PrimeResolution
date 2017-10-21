package Main;

import java.util.InputMismatchException;

import Operation.NumberInput;
import Operation.PrimeResolving;

public class Main {
	
	public static void main(String[] args)
	{
		NumberInput input=new NumberInput();
		long number=input.inputLong();
		PrimeResolving primeResolving=new PrimeResolving(number);
		primeResolving.primeFactor();
		//primeResolving.checkPrimes(number);
		
		
	}

}
