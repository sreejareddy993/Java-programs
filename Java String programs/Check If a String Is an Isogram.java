import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        s=s.toLowerCase().replaceAll(" ","");
        int f=0;//to check duplicates
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.indexOf(ch)!=s.lastIndexOf(ch)){
                f++;
                break;
            }
        }
        if(f==0){
            System.out.print("Isogram");
        }
        else{
            System.out.print("Not Isogram");
        }
    }
}
