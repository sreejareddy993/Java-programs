import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        String s1s1=s1+s1;
        System.out.print(s1s1.contains(s2));
    }
}
