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

    	//The number of test cases
    	final int N = s.nextInt();

    	//some variables to store input
    	int tmp1, tmp2;


    	for(int i = 0 ; i< N; i++){
    		//read in test cases
    		tmp1 = s.nextInt();
    		tmp2 = s.nextInt();

    		//solve and print result
    		int solution = solveProblem(tmp1,tmp2);
    		System.out.print(solution);
    	}


    }

    /*
    *This method will solve the problem and return the solution
    */
    static int solveProblem(int a, int b){
    	//do something 
    	return 0;
    } 
}