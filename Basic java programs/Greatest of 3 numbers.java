import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int lar2=(a>b)?a:b;
        int lar3=(lar2>c)?lar2:c;
        System.out.print(lar3);
    }
}
