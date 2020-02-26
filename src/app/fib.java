package app;

import java.io.*;

/**
 * fib
 */
public class fib {

    public static int output[];

    public static void main(String[] args) throws IOException {
        int num;
        String str;
        BufferedReader bufferedReader;
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("費氏級數");
        System.out.print("請輸入一個數:");
        str = bufferedReader.readLine();
        num = Integer.parseInt(str);
        output = new int[num + 1];
        if (num < 0) {
            System.out.println("請輸入大於0的數字");
        } else {
            System.out.println("Fibonacci(" + num + ")=" + Fibonacci(num));
        }
    }

    public static int Fibonacci(int n) {
        int result;
        result = output[n];
        if (result == 0) {
            if (n == 0) {
                output[n] = 0;
                return 0;
            }
            else if (n == 1) {
                output[n] = 1;
                return 1;
            }
            else {
                output[n] = Fibonacci(n - 2) + Fibonacci(n - 1);
                return output[n];
            }
        } 
        return result;
    }
}
