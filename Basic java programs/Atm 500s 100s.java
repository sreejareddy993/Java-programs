import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
int amt=in.nextInt();
if(amt%100==0){
if(amt>20000){
System.out.println("Please enter a lesser denomination");
}
else{
if(amt<=500){
System.out.println(amt/100+" hundreds");
}
else{
int h=5,f=0;
f=(amt-500)/500;
h=h+((amt-500)%500)/100;
if(h>5){
h=h-5;
f=f+1;
}
System.out.println(f+":500s "+h+":100s");
}
}
}
else{
System.out.println("Please enter the amount in multiples of 100");
}
    }
}
