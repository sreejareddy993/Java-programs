import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String s=in.nextLine();
        int[] freq=new int[26];
        int maxfreq=0;
        char res=s.charAt(0);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int index=ch-'a';
            freq[index]++;
            if(freq[index]>maxfreq){
                maxfreq=freq[index];
                res=ch;
            }
        }
        System.out.print(res);
    }
}
