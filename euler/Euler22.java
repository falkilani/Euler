import java.io.*;
import java.util.*;
public class Euler22 implements Euler {
    String path = "./p022_names.txt";
    public void execute() throws Exception{

        Scanner fp = new Scanner(new File(path));
        
        String nameStr = fp.nextLine();
        fp.close();
        String[] names = nameStr.split("\",\"");
        names[0] = names[0].substring(1, names[0].length());
        names[names.length-1] = names[names.length-1].substring(0, names[names.length-1].length()-1);
        
        Arrays.sort(names);
        long scoreSum = 0;
        for(int i = 0; i < names.length; i++)
            scoreSum += (i+1) * score(names[i]);
        
        System.out.println(scoreSum);

    }

    private int score (String word){
        int s = 0;
        for(char c : word.toCharArray())
            s += c-'A' + 1;
        
        return s;
    }
}
