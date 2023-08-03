import java.util.HashSet;
import java.util.Set;

class Euler21 implements Euler {
    int max = 10_000;
    
    Set<Integer> primes = new HashSet<Integer>(generatePrimes(max));

    public void execute(){
        int[] divSums = new int[max];
        for(int i = 2; i < max; i++){
            divSums[i] = sumDivs(i);
        }

        int sumAmicable = 0;
        for(int i = 2; i < max; i++){
            if(divSums[i] != i && divSums[i] < max && i == divSums[divSums[i]])
                sumAmicable+=i;
        }
        System.out.println(sumAmicable);
    }

    private int sumDivs(int n){
        int sum = 1;
        if(primes.contains(n)) return sum;

        for(int i = 2; i < n; i++)
            if(n % i == 0) sum += i;

        return sum;
    }
    
}