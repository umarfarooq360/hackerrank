/*https://www.hackerrank.com/challenges/extra-long-factorials
*
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static BigInteger factorial(int n){
        BigInteger product=BigInteger.ONE;
        for(int i=2; i<=n; i++){
            product= product.multiply(BigInteger.valueOf(i));
        }
        return product;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        System.out.println(factorial(sc.nextInt()));
    }
}