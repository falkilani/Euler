import java.util.*;
public class Euler23 implements Euler {
    int max = 28123;
    public void execute(){
        List<Integer> abundants = generateAbundants(max);
        boolean[] valid = new boolean[max];
        for(int i = 0; i < abundants.size(); i++){
            for(int j = i; j < abundants.size(); j++)
                if(abundants.get(i) + abundants.get(j) < max) 
                    valid[abundants.get(i) + abundants.get(j)] = true;
        }
        long sum = 0;
        for(int i = 1; i < max; i++)
            if(!valid[i]) sum += i;
        
        System.out.println(sum);
    }

    private List<Integer> generateAbundants(int n){
        List<Integer> abundants = new ArrayList<>();
        for(int i = 12; i < n; i++){
            if(sumDivs(i) > i) abundants.add(i);
        }

        return abundants;
    }
    private int sumDivs(int n){
        int sum = 1;
        for(int i = 2; i < n; i++)
            if(n % i == 0) sum += i;

        return sum;
    }
}
