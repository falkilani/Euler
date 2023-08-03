import java.math.BigInteger;

public class Euler16 implements Euler {

    final int power = 1000;
    public void execute(){

        long val = 1;
        val <<= 62;
        BigInteger res = BigInteger.valueOf(val);

        for(int i = 63; i <= power; i++)
            res = res.multiply(BigInteger.valueOf(2));

        long sum = 0;

        for(char c : res.toString().toCharArray())
            sum += c-'0';

        System.out.println(sum);
        System.out.println(res.toString());
    }
}
