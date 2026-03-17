import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = a;
        int temp = b;

        while (temp != 0) {
            int t = temp;
            temp = gcd % temp;
            gcd = t;
        }

        int lcm = (a * b) / gcd;
        System.out.println("LCM = " + lcm);
        sc.close(); 
    }
    }
}
