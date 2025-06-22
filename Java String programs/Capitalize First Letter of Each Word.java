import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        String w[]=s.split(" ");
        for(int i=0;i<w.length;i++){
            String word=w[i];
            if(word.length()>0){
                char firstchar=Character.toUpperCase(word.charAt(0));
                String rest=word.substring(1);
                System.out.print(firstchar+rest);
            }
            if(i<word.length()-1){
                System.out.print(" ");
            } 
        }
    }
}
