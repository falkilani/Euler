public class Euler6 implements Euler {
    @Override
    public void execute() {
        int n = 100;
        int sumSq = 0;
        for(int i = 1; i <= n; i++) sumSq += i * i;
        int sqSum = (n + 1) * n / 2;
        sqSum *= sqSum;
        System.out.println(sqSum - sumSq);
    }
}
