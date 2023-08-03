public class Euler30 implements Euler {

    int power = 5;
    public void execute() throws Exception {
        int num = 9;
        int dig =pow(9, power);
        int max =dig;
        while(num < max){
            num *= 10;
            num += 9;
            max += dig;
        }
        int ans = 0;
        for(int i = 2; i < max; i++){
            int n = i;
            int sum = 0;
            while(n > 0){
                int d = n % 10;
                sum += pow(d,power);
                n /= 10;
            }
            if(sum == i) ans +=i;
        }
        System.out.println(ans);
        
    }

    private int pow (int a, int b){
        int sum = 1;
        for(int i = 0; i < b; i++)
            sum *= a;

        return sum;
    }
    
}
