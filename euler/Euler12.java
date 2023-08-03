public class Euler12 implements Euler {
    int numDivisors = 500;
    public void execute(){
        int div = 1;
        int i = 0;
        while(div < numDivisors){
            i++;
            if(i%2 == 0) div = divisors(i/2) * divisors(i + 1);
            else div = divisors(i) * divisors((i + 1) / 2);  
        }
        System.out.println(i * (i+1) / 2);
    }
    public int divisors(int n){
        int div = 1;
        boolean[] sieve = new boolean[n+1];
        for(int p = 2; p <= n; p++){
            if(!sieve[p]){ 
                for (int j= p * 2; j < n; j += p)
                    sieve[j] = true;
                int count = 0;
                while(n%p == 0) {n /= p; count++;}
                if(count != 0) {
                    div *=count + 1;
                }
            }

        }
        return div;
        
    }
}
