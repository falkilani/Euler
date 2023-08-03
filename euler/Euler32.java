import java.util.HashSet;
import java.util.Set;

public class Euler32 implements Euler{
    int n = 10;
    public void execute() throws Exception {
        
    }
    
    private boolean valid(int a, boolean[] digits){
        while(a > 0) {
            if(digits[a%10]) return false;
            digits[a%10] = true;
            a/=10;
        }
        return !digits[0];
    }
    private boolean valid(int a, int b){
        boolean[] digits = new boolean[n];

        if(!valid(a, digits)) return false;
        if(!valid(b, digits)) return false;
        if(!valid(a*b, digits)) return false;


        if(digits[0]) return false;
        for(int i = 1; i < n; i++)
            if(!digits[i]) return false;

        return true;
    }
}
