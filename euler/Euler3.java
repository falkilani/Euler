
public class Euler3 implements Euler{
    private static long factored= 600851475143L;
    public void execute(){
        long solution = 2L;
        long iterator = 2L;
        while(factored != 1L){
            if(factored % iterator == 0 && isPrime(iterator)){
                if(iterator > solution) {
                    solution = iterator;
                }
                factored /= iterator;
                iterator = 2L;
            }
            else {
                iterator++;
            }
        }
        
        System.out.println(solution);

    }

    public boolean isPrime(long candidate){
        if(candidate < 2L){
            return false;
        }
        if(candidate == 2L || candidate == 3L || candidate == 5L || candidate == 7L){
            return true;
        } else if(candidate == 4L || candidate == 6L || candidate == 8L){
            return false;
        }
        for(long i = 2; (double) i < Math.sqrt((double) candidate); i++) {
            if(candidate % i == 0){
                return false;
            }
        }
        return true;
    }
}
