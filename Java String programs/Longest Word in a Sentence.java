import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String max="";
        String w[]=s.split(" ");
        for(int i=0;i<w.length;i++){
            if(w[i].length()>max.length()){
                max=w[i];
            }
        }
        System.out.print(max);
            
    }
}
