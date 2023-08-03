import java.math.BigInteger;

public class Euler25 implements Euler {

    @Override
    public void execute() throws Exception {
        BigInteger[] fib = new BigInteger[2];
        fib[0] = BigInteger.ONE;
        fib[1] = BigInteger.ONE;
        int i = 2;
        while(fib[i&1].toString().length() < 1000){
            i++;
            fib[i & 1] = fib[0].add(fib[1]);
        }
        System.out.println(i);
        System.out.println(fib[0].toString());
        System.out.println(fib[0].toString().length());
        System.out.println(fib[1].toString());
        System.out.println(fib[1].toString().length());

    }
    
}
