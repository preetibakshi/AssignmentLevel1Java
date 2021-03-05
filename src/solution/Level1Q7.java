package solution;

import java.util.Scanner;

public class Level1Q7 {
    public static void main(String[] args) {
        int a;
        double b;
        double sum;
        System.out.println("Enter two no a as integer no and b as float");
        Scanner scanner=new Scanner(System.in);
        a= scanner.nextInt();
        b= scanner.nextDouble();
        sum=a+b;
        System.out.println("sum of int and float"+sum);

    }
}
