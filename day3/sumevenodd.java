import java.util.*;

public class sumevenodd {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2= input.nextInt();
        if ( (num1 + num2) % 2 == 0 )
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
