import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String rs=s.replaceAll(" ","");
        int len=rs.length()-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                System.out.print(" ");
            }
            else{
                System.out.print(rs.charAt(len));
                len--;
            }
        }
    }
}
