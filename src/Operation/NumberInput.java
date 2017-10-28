package Operation;

import Exceptions.NoNumberException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberInput {
	
	long number;
	private static Scanner scanner=new Scanner(System.in);

	public NumberInput(){
	}
	
	private long readLong() throws NoNumberException
	{
		//this.scanner=new Scanner(System.in);
		try
		{
			this.number=scanner.nextLong();
			return this.number;
		}
		catch(InputMismatchException e)
		{
			System.out.println("This is not an integer number");
			throw new NoNumberException();
		}

	}
	
	public long inputLong() {
		boolean invalidInput=false;
		long number=0;
		do {
			System.out.println("Please give me the integer value - ");
			try
			{
				number=this.readLong();
				invalidInput=false;
			}
			catch(NoNumberException e)
			{

				System.out.println("NoNumberException");
				invalidInput=true;
			}		
		}while(invalidInput);
		return number;
	}
	
	public void close()
	{
		this.scanner.close();
	}
}
