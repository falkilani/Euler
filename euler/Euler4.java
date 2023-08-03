public class Euler4 implements Euler{ //find largest palindrome made from product of two 3-digit numbers;
    public void execute(){
        int max = 0;
        int n;
        for(int i = 999; i > 900; i--){
            if(i % 10 == 0) continue;
            for(int j = i; j > 900; j--){
                if(j % 10 == 0) continue;
                n = i * j;
                if(palindrome(n) && n > max) max = n;
            }
        }
        System.out.println(max);
    }
    private boolean palindrome(int n){
        String num = Integer.toString(n);
        int low = 0;
        int high = num.length() - 1;
        while(low < high){
            if(num.charAt(low++) != num.charAt(high--)) return false;
        }
        return true;
    }
    
}
