import java.util.*;
import java.io.*;

public class Euler67 implements Euler {

    final int rows = 100;
    
    final String path = "./p067_triangle.txt";
    public void execute() throws Exception {
        int[][] nums= new int[rows][];
        for(int i = 0; i < rows; i++)
            nums[i] = new int[i+1];
            
        Scanner fp = new Scanner(new File(path));

        for(int i = 0; i < rows; i++)
            for(int j = 0; j <= i; j++){
                nums[i][j] = fp.nextInt();
            }
            
        for(int i = rows - 2;i>= 0; i--){
            for(int j = 0; j <= i; j++){
                nums[i][j] += Math.max(nums[i+1][j], nums[i+1][j+1]);
            }
        }

        System.out.println(nums[0][0]);
        

    }
    
}
