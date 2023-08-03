public class Euler15 implements Euler{
    static int m = 21;
    static int n = 21;
    public void execute(){
        long[][] dp = new long[m][n];

        for(int i = 0; i < m; i++)
            dp[i][n-1] = 1;
        
        for(int i = 0; i < n; i++)
            dp[m-1][i] = 1;
        
        for(int i = m-2; i >=0; i--){
            for(int j = n-2; j >= 0; j--){
                dp[i][j] = dp[i+1][j] + dp[i][j+1];
            }
        }

        System.out.println(dp[0][0]);
        
    }
}
