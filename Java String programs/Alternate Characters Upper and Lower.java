import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String s=in.nextLine();
        StringBuilder res=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch==' '){
                res.append(' ');
            }
            else {
                if(count%2==0){
                    res.append(Character.toUpperCase(ch));
                }
                else{
                    res.append(Character.toLowerCase(ch));
                }
                count++;
            }
        }
        System.out.print(res.toString());
    }
}
