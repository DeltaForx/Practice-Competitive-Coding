import java.io.*;
import java.util.*;

public class Solution {
    
    public static void rotateByOne(int arr[])
    {
        int temp = arr[0];
        for(int i=1;i<arr.length;i++)
            arr[i-1] = arr[i];
        arr[arr.length-1] = temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++)
            array[i] = scan.nextInt();
        for(int i=0;i<k;i++)
            rotateByOne(array);
        for(int i=0;i<n;i++)
            System.out.print(array[i]+" ");
    }
}
