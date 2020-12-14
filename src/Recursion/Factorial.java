package Recursion;

public class Factorial {

    public static int myFactorial(int n) {
        if (n <= 1) {
            return 1;
        } else
            return n * myFactorial(n - 1);

    }


    public static void main(String[] args) {
        System.out.println(myFactorial(6));
        System.out.println(Fibonacci.myFibonacci(4));

    }
}