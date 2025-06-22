import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s=String.valueOf(n);
        int max=0;
        int min=9;
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            if(digit>max){
                max=digit;
            }
            if(digit<min){
                min=digit;
            }
        }
         int res=max-min;
        System.out.print(res);
    }
}
