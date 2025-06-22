import java.io.*;
import java.util.*;
import java.lang.Math;
public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
long n=in.nextLong();
long digits=(long)Math.log10(n)+1;
System.out.print(digits);
}
}
