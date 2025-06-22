import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String num=in.next();
        int r=in.nextInt();
        int len=num.length();
        r = r % len;
        if(r==0){
            System.out.print(num);
        }
        else{
            String rotate=num.substring(len-r)+num.substring(0,len-r);
            System.out.print(rotate);
        }
    }
}
