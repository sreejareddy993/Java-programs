import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                String s1=ch+"";
                System.out.print(s1.toUpperCase());
            }
            else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                String s2=ch+"";
                System.out.print(s2.toLowerCase());
            }
            else{
                System.out.print(ch);
            }
        }
    }
}
