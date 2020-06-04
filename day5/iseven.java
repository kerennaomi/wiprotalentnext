import java.io.*;
import java.util.Scanner;

public class iseven
{
    static int even(int n){
        if (Math.abs(n%2)==0){
            return 2;
        }
        else
            return 1;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        System.out.println(even(n));
    }
}