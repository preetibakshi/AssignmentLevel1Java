package solution;

import java.sql.SQLOutput;
import java.util.Scanner;

//a Java program to print an int, a double and a char on screen.
public class Level1Q1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter integer value");
        int i=scanner.nextInt();
        System.out.println("Enter float value");
        System.out.println("Entered float value:"+i);
        double d=scanner.nextDouble();
        System.out.println(":"+d);
        System.out.println("Enter a character");
        char c=scanner.next().charAt(0);
        System.out.println("print integer:"+c);

    }
}
