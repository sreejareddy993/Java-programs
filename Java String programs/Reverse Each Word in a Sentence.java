import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String w[]=s.split(" ");
        for(int i=0;i<w.length;i++){
            for(int j=w[i].length()-1;j>=0;j--){
                System.out.print(w[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
