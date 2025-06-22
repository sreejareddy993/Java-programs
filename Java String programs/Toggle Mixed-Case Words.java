import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int l=0,u=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                l++;
            }
            else if(ch>='A' && ch<='Z'){
                u++;
            }
        }
        if(l==0||u==0){
            System.out.print("We Can't toggle");
        }
        else{
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c>='a' && c<='z'){
                    String s1=c+"";
                    System.out.print(s1.toUpperCase());
                }
                else if (c>='A' && c<='Z'){
                    String s2=c+"";
                    System.out.print(s2.toLowerCase());
                }
                else{
                    System.out.print(c);
                }
            }
        }
    }
}
