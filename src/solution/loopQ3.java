package solution;

import java.util.Scanner;

public class loopQ3 {
    public static void main(String[] args) {
        System.out.println("Enter a no");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a,c;
        c=0;
        int oldno;
        oldno=n;

        do{
            a=n%10;
            n=n/10;
            c=c+(a*a*a);

        }
        while(n>0);

            if(oldno==c)
                System.out.println("armstrong no");
            else
                System.out.println(" not armstrong no");


    }
}
