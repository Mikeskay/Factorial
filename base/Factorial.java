package factorial.base;

public class Factorial{

    public Factorial(){
    }
    
    public static void calFactorial(int num){

        int fact = 1;

        for (int i = 1; i <= num; ++i ){

           fact = fact * i;

        }

        System.out.println(fact);


    }  

}
