import java.util.LinkedList;

public class Euler10 implements Euler{
    public void execute(){
        int n = 2000000;
        LinkedList<Integer> primes = new LinkedList<Integer>();
        int i = 2;
        boolean notPrime;
        while(i < n){
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
        long sum = 0;
        for(Integer prime : primes) sum += prime.intValue();
        System.out.println(sum);
    }
}
