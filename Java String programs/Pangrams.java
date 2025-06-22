import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        s1=s1.toLowerCase().replaceAll(" ","");
        String pan="";
        for(char c='a';c<='z';c++){
            if(s1.indexOf(c)!=-1){
                pan=pan+c;
            }
        }
        if(pan.length()==26){
            System.out.print("Pangram");
        }
        else{
            System.out.print("Not Pangram");
        }
    }
}
