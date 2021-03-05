package solution;

import java.util.Scanner;

public class LoopQ2 {
    public static void main(String[] args) {
        int sum=0,r,s=0,n;

        System.out.println("enter a no:");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        do{
            r=n%10;
            s=s+r;
            n=n/10;

        }
        while(n>0);

        System.out.println(" all digit sum:"+s);



    }
}
