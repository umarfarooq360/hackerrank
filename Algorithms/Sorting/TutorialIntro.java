import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	//Scanner to read from STDIN
    	Scanner s = new Scanner(System.in);

    	//some variables to store input
    	int v, n;

        while(s.hasNext()){
    		//read in test cases
    		v = s.nextInt();
    		n = s.nextInt();
            int i = 0;
            int solution = 0;
            while(i<n){
                if(v == s.nextInt()){solution=i;}
                i++;
            }
            
    		//solve and print result
    		
    		System.out.print(solution);
    	}


    }

}