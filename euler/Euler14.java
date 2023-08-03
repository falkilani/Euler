
public class Euler14 implements Euler  {
    
    final int num = 1_000_001;
    public void execute() throws Exception{
        int idx = 1;
        int[] dp = new int[num];
        dp[1] = 1;
        for(int i = 2; i < num; i++){
            findChain(dp, i);
            if(dp[i] > dp[idx]) idx = i; 
        }

        System.out.println("number is " + idx + "\n length is " + dp[idx]);
    }

    private int findChain(int[] dp, long n)throws Exception{
        if(n < 0) throw new Exception("OutOfBounds");
        if(n >= num) return 1 + (n%2 == 0 ? findChain(dp, n/2) : findChain(dp, 3 * n + 1));
        if(dp[(int)n] == 0)
            dp[(int)n] = 1 + (n%2 == 0 ? findChain(dp, n/2) : findChain(dp, 3 * n + 1));
        return dp[(int)n];
    }
}
