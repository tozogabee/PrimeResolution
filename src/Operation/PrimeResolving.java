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
				System.out.println("prime divisor- "+i);
				primes.add(i);
			}
		}	
		return primes;			
	}

	private List<Long> primeSetOptimized(long number)
	{
		List<Long> primeSet=new ArrayList<>();
		long div=2;

		while(div<this.number) {
				if (isPrime(div)) {
					primeSet.add(div);
				}
				++div;
			}

		return primeSet;
	}
	
	public List<Long> primeFactor()
	{
		List<Long> divisors=new ArrayList<>();
		while (this.number>1)
		{
			for(long i=2;i<=this.number;++i)
			{
				if(isPrime(i))
				{
					if(this.number%i==0)
					{
						divisors.add(i);
						System.out.format("%9d|%d\n",this.number,i);
						this.number/=i;
					}
				}
			}
			if(this.number==1)
			{
				System.out.format("%9d|\n",this.number);
			}
		}
		return divisors;
	}




	


}
