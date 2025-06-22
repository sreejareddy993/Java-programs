import java.io.*;
   import java.util.*;
   public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        String s=String.valueOf(num);
        int p=in.nextInt();
        int sum=0;
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            int res=(int)Math.pow(digit,p);
            sum+=res;
        }
        System.out.print(sum);
    }
}
