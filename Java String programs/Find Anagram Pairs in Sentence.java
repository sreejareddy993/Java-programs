import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String w[]=s.split(" ");
        int f=0;
        for(int i=0;i<w.length;i++){
            for(int j=i+1;j<w.length;j++){
                String s1=w[i];
                String s2=w[j];
                if(s1.length()==s2.length()){
                    char ch1[]=s1.toLowerCase().toCharArray();
                    char ch2[]=s2.toLowerCase().toCharArray();
                    Arrays.sort(ch1);
                    Arrays.sort(ch2);
                    if(Arrays.equals(ch1,ch2)){
                        f++;
                        System.out.println(s1+" "+":"+" "+s2);
                    }
                }
            }
        }
        if(f==0){
            System.out.print("No Anagrams Found");
        }
    }
}
