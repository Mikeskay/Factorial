package factorial.test;

import java.util.Scanner;
import factorial.base.Factorial;

public class FactorialTest {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number and I'll give you it's factorial: "); 
        int num = reader.nextInt();

        Factorial test = new Factorial();
        test.calFactorial(num);


    }

}
