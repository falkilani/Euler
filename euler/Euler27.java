import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Euler27 implements Euler {
    int a_max = 1000;
    int b_max = 1001;
    @Override
    public void execute() throws Exception {
        List<Integer> primeList = generatePrimes(b_max);
        Set<Integer> primeSet = new HashSet<>(generatePrimes(b_max * b_max + a_max * b_max + b_max));
        int max_n = 0;
        int max_a = 0;
        int max_b = 0;

        for(int a = 0; a < a_max; a++){
            for(int b : primeList){
                int ns = numNs(a, b, primeSet);
                if(ns > max_n) {
                    max_a = a; max_b = b; max_n = ns;
                }
                ns = numNs(-a, b, primeSet);
                if(ns > max_n) {
                    max_a = -a; max_b = b; max_n = ns;
                }
                ns = numNs(a, -b, primeSet);
                if(ns > max_n) {
                    max_a = a; max_b = -b; max_n = ns;
                }
                ns = numNs(-a, -b, primeSet);
                if(ns > max_n) {
                    max_a = -a; max_b = -b; max_n = ns;
                }
            }
        }
        System.out.println("Max ns = " + max_n +"\n a = " + max_a + " \t b = " + max_b + "\n product = " + max_a * max_b );
    }

    private int numNs(int a, int b, Set<Integer> primeSet){
        int n = 0;
        while(primeSet.contains(n * n + a * n + b)) n++;
        return n;
    }
    
}
