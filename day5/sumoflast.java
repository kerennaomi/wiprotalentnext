import java.util.Scanner;

public class sumoflast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int m= input.nextInt();
        System.out.println(Math.abs(n%10)+Math.abs(m%10));
    }
}

