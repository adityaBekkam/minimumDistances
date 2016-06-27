import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int minDis[] = new int[n] ;
        int i,j,min=-1 ;
        for( i=0 ; i<n ; i++ ){
            minDis[i] = n+1 ;
            for( j=i+1 ; j<n ; j++ ){
                if( A[i]==A[j] && j!=i ){
                    if( Math.abs(i-j)<minDis[i] ){
                        minDis[i] = Math.abs(i-j) ;
                    }
                }
            }
            if( minDis[i]!=n+1 && min==-1 ){
                min = minDis[i] ;
            }
            if( minDis[i]<min ){
                min = minDis[i] ;
            }
        }
        System.out.println( min ) ;
    }
}
