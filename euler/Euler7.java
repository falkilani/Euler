import java.util.LinkedList;

public class Euler7 implements Euler {
    @Override
    public void execute() {
        int n = 10001;
        LinkedList<Integer> primes = new LinkedList<Integer>();
        int i = 2;
        boolean notPrime;
        while(primes.size() < n){
            notPrime = false;
            for(Integer prime : primes){
                
                if(prime.intValue() > (int) Math.sqrt(i)) break;
                if(i % prime.intValue() == 0){
                    notPrime = true;
                    break;
                }
            }
            if(!notPrime) primes.add(i);
            i++;
        }
        
        System.out.println(primes.getLast());
    }

}
