import java.util.Scanner;
public class greater {
    public static void main(String[] args) {
        int a, b, max;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        max = (a>b)?a:b;
        System.out.println(max);

    }
}
