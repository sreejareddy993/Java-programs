import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String s=in.nextLine();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'|| ch>='A' && ch<='Z'){
                res.append(Character.toLowerCase(ch));
            }
        }
        String res1=res.toString();
        String reversed=new StringBuilder(res1).reverse().toString();
        if(res1.equals(reversed)){
            System.out.print("true");
        }
    }
}
