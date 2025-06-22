import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        s1=s1.replaceAll(" ","");
        s2=s2.replaceAll(" ","");
        if(s1.length()==s2.length()){
            //s1=s1.toLowerCase();
            //s2=s2.toLowerCase();
            char ch1[]=s1.toLowerCase().toCharArray();
            char ch2[]=s2.toLowerCase().toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2)){
                System.out.print("Anagrams");
            }
            else{
                System.out.print("Not Anagrams");
            }
        }
        else{
             System.out.print("Not Anagrams");
        }
    }
}
