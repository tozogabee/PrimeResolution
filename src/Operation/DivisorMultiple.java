package Operation;

import java.util.List;

public class DivisorMultiple {

    long number1;
    long number2;
    PrimeResolving primeFactor1;
    PrimeResolving primeFactor2;
    List<Long>primeFactors1;
    List<Long>primeFactors2;

    public DivisorMultiple(long number1, long number2) {
        this.number1 = number1;
        this.number2 = number2;
        this.primeFactor1=new PrimeResolving(this.number1);
        this.primeFactor2=new PrimeResolving(this.number2);
        primeFactors1=this.primeFactor1.primeFactor();
        primeFactors2=this.primeFactor2.primeFactor();
    }
}
