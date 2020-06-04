import java.util.Scanner;

public class positivenegative {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if ( num>0 )
            System.out.println("Positive");
        else if (num==0)
            System.out.println("Zero");
        else
            System.out.println("Negative");
    }
}
