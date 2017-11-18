package Operation;

import java.util.*;

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
        this.primeFactors1=this.primeFactor1.primeFactor();
        this.primeFactors2=this.primeFactor2.primeFactor();
        this.sorting();
    }

    public long getNumber1() {
        return number1;
    }

    public long getNumber2() {
        return number2;
    }

    public PrimeResolving getPrimeFactor1() {
        return primeFactor1;
    }

    public PrimeResolving getPrimeFactor2() {
        return primeFactor2;
    }

    public List<Long> getPrimeFactors1() {
        return primeFactors1;
    }

    public List<Long> getPrimeFactors2() {
        return primeFactors2;
    }

    public long greatestCommonDiv()
    {
        List<Long>gcd=new ArrayList<>();
        long result=0;
        Map<Integer,Long> firstPrimes;
        Map<Integer,Long> secondPrimes;
        return result;
    }

    private Map<Integer,Long> mapList()
    {
        Map<Integer,Long> list=new TreeMap<>();


        return list;
    }

    public void sorting()
    {
        Collections.sort(this.primeFactors1);
        Collections.sort(this.primeFactors2);
    }

    public void listPrimes()
    {
        listing(this.primeFactors1,"-----First primeresolution------");
        listing(this.primeFactors2,"-----Second primeresolution-----");
    }

    private void listing(List<Long> list,String msg)
    {
        int index=1;
        System.out.println(msg);
        for(long act : list)
        {
            if(index<list.size())
            {
                System.out.print(act+",");
            }
            else
            {
                System.out.println(act);
            }
            ++index;
        }
    }

}
