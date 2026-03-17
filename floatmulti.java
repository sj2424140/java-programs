import java.util.Scanner;

public class floatmulti {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);{

        System.out.print("Enter first number:");
        float num1= sc.nextFloat(); 

        System.out.print("Enter second  number:");
        float num2=sc.nextFloat();

        float result= num1*num2;
        System.out.println("Multiplication="+ result);
        sc.close();
        }

    }

}
