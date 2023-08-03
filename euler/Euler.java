import java.util.ArrayList;
import java.util.List;

public interface Euler {
    public void execute() throws Exception;
    public static void main(String[] args){
        Euler solution = new Euler32();
        try {
            solution.execute();
        } catch(Exception e) {
            System.out.println(e.toString());
        }finally {

        }
    }

    default List<Integer> generatePrimes(int n){
        boolean[] sieve = new boolean[n];
        List<Integer> primes = new ArrayList<>();

        for(int i = 2; i < n; i++){
            if(!sieve[i]){
                primes.add(i);
                for(int j = i; j < n; j+= i)
                    sieve[j] = true;
            }
        }
        return primes;
    }
}
