import java.math.*;

public class Euler20 implements Euler {
    int n = 100;
    public void execute(){
        BigInteger fact = BigInteger.ONE;
        for(int i = n; i > 0; i--){
            int m = i;
            while(m%10 == 0) m /= 10;
            fact = fact.multiply(new BigInteger(new byte[]{(byte)m}));
        }

        int sumDigs = 0;
        for(char c : fact.toString().toCharArray())
            sumDigs += c - '0';
        
        System.out.println(sumDigs);
    }
}
