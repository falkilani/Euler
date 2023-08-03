import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class Euler29 implements Euler {
    int a_max = 100, b_max = 100;
    @Override
    public void execute() throws Exception {
        Set<BigInteger> set = new HashSet<>();
        for(int a = 2; a<= a_max; a++){
            for(int b = 2; b <= b_max; b++){
                set.add(BigInteger.valueOf(a).pow(b));
            }
        }


        System.out.println(set.size());
    }
    
}
