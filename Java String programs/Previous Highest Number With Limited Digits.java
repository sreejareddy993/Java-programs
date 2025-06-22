import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        for(int i=Integer.parseInt(s1)-1;i>=0;i--){
            if(String.valueOf(i).contains(s2)){
            }
            else{
                System.out.print(i);
                break;
            }
        }
    }
}
