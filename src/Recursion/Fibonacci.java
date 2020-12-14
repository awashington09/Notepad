package Recursion;

public class Fibonacci {

    public static int myFibonacci(int n){
        if (n == 0 || n == 1){
            return n;
        }
        else return myFibonacci(n-1) + myFibonacci(n-2);
    }
}
