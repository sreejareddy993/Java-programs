import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        String s=String.valueOf(n);
        int sum=0;
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            if(digit==2||digit==3||digit==5||digit==7){
                sum+=digit;
            }
        }
        System.out.print(sum);
    }
}
