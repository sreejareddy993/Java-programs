import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        String s=String.valueOf(num);
        int freq[]=new int[10];
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            freq[digit]++;
        }
        int maxfreq=0;
        int rdigit=0;
        for(int i=0;i<10;i++){
            if(freq[i]>maxfreq){
                maxfreq=freq[i];
                rdigit=i;
            }
        }
        System.out.print(rdigit);
    }
}

