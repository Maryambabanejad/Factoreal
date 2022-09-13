package Package;

import java.util.Scanner;

public class FactorialClass {
    public static void main(String[] args) {
        Scanner reader =new Scanner(System.in);
        System.out.print("EnterNumber :");
       long n = reader.nextInt();
       //-------------------------------------
      long m=1;
        for (long i = n; i>0 ; i--) {
            m*=i;
        }
        System.out.println("your number Factorial is :"+m);
    }

}
