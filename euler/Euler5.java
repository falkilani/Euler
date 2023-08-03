public class Euler5 implements Euler{
    public void execute(){
        int n = 20;
        long[] inputs = new long[n - 1];
        for(int i = 0; i < n - 1; i++) inputs[i] = i + 2;
        System.out.println(lcm(inputs));
    }
    private long lcm(long[] inputs){
        if(inputs == null || inputs.length == 0) return 0;
        long lcm = inputs[0];
        for(int i = 1; i < inputs.length; i++){
            lcm = lcm / gcf(lcm, inputs[i]) * inputs[i] ;
        }
        return lcm;
    }
    private long gcf (long a, long b){
        if(b == 0) return a;
        return gcf(b, a % b);
    }
    
}

