import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num=in.nextInt();
        String s=String.valueOf(num);
        int sum=0;
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            if(digit%2==0){
                digit=digit+1;
            }
            else{
                digit=digit-1;
            }
            sum+=digit;
        }
        System.out.print(sum);
    }
}
