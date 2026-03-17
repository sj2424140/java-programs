import java.util.Scanner;

public class LargestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("Largest = " + max);
        sc.close(); 
        }
    }
}