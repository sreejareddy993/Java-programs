import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
int y=ob.nextInt();
String ans=(y%4==0 && y%100!=0)?"Yes":((y%400==0)?"Yes":"No");
System.out.print(ans);
}
}
