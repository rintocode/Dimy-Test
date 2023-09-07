public class Soal1Staircase {
    
}
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here

    }

}

public class Solution {
    
    public static void drawStair(int size) {
        int level = size-1;
        for(int i = 0; i < size; i++) {
            StringBuilder s = new StringBuilder();
            for(int k = 0; k < level; k++) {
                s.append(" ");
            }
            for(int k = 0; k < size - level; k ++){
                s.append("#");
            }
            level -= 1;
            System.out.println(s.toString());
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        Solution sol = new Solution();
        
        int size = in.nextInt();
        sol.drawStair(size);
    }
}