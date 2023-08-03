public class Euler28 implements Euler {
    int num = 1001;
    @Override
    public void execute() throws Exception {
        int sum = 1;
        int n = 1;
        for(int i = 2; i < num; i += 2){
            for(int j = 0; j < 4; j++)
                sum += (n+= i);
        }
        System.out.println(sum);
    }
    
}
