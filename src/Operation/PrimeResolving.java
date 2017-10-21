package Operation;

import java.util.ArrayList;
import java.util.List;

public class PrimeResolving {
	
	long number;
	
	public PrimeResolving(long number) {
		this.number = number;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}
	
	private boolean isPrime(long number)
	{
		if(number<2)
		{
			return false;
		}
		else
		{
			for(int i=2;i<number;++i)
			{
				if(number%i==0)
				{
					return false;
				}
				
			}
			return true;
		}
		
		
	}
	
	private List<Long> primeSet(long number)
	{
		List<Long> primes=new ArrayList<>();
		for(long i=1;i<number;++i)
		{
			if(isPrime(i))
			{
				primes.add(i);
			}
		}	
		return primes;			
	}
	
	public void primeFactor() 
	{
		List<Long> primeSet = primeSet(number);
		while(this.number>1)
		{	
			long smallestPrimeNumber = smallestPrimeNumber(number, primeSet);
			System.out.format("%9d|%d\n", this.number,smallestPrimeNumber);
			this.number/=smallestPrimeNumber;
		}		
		if(this.number==1)
		{
			System.out.format("%9d|",this.number);
		}
	}
	
	private long smallestPrimeNumber(long number,List<Long>primeSet)
	{
		for(Long prime : primeSet)
		{
			if(number%prime==0)
			{
				return prime;
			}
		}
		throw new IllegalStateException("No prime factor found for the "+number);
	}
	
	public void checkPrimes(long number)
	{
		List<Long> primeset=primeSet(number);
		
		for(Long primes : primeset)
		{
			System.out.println(primes+",");
		}
	}

}
