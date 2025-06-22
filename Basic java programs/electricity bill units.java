import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
int units=in.nextInt();
int total=0;
if(units<=100){
total=units*6;
}
if(units>100 && units<=200){
total=100*6+(units-100)*8;
}
if(units>200 && units<=300){
total=100*6+100*8+(units-200)*10;
}
if(units>300 && units<=400){
total=100*6+100*8+100*10+(units-300)*12;
}
if(units>400){
total=100*6+100*8+100*10+100*12+(units-400)*14;
}
System.out.println(total);
}
}
