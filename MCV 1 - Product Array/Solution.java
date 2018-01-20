import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        long k = scan.nextInt();
        long[] arr1 = new long[(int)n];
        long[] arr2 = new long[(int)n];
        for(int i=0;i<n;i++)
            arr1[(int)i] = scan.nextInt();
        for(int i=0;i<n;i++)
            arr2[(int)i] = scan.nextInt();
        long sum=0;
        for(long i=0;i<n;i++)
            sum = sum + (arr1[(int)i]*arr2[(int)i]);
        System.out.println(sum);
    }
}
