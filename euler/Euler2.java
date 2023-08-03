public class Euler2 implements Euler{
    private final long MAX_VALUE = 4000000;
    public void execute(){
        long fib1 = 1;
        long fib2= 2;
        long current = 0;
        long sum = 0;

        while(fib2 <= MAX_VALUE){
            sum += (fib2%2 == 0) ? fib2 : 0;
            current = fib2;
            fib2 += fib1;
            fib1 = current;
            
        }   
        System.out.println(sum);
        System.out.println("EvenFib " + fib2);
        System.out.println("OddFib " + fib1);
    }
    
}
