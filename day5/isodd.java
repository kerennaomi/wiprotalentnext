import java.io.*;
import java.util.Scanner;

public class isodd
{
    static int odd(int n){
        if (Math.abs(n%2)!=0){
            return 2;
        }
        else
            return 1;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        System.out.println(odd(n));
    }
}