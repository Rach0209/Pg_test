package lv00;

import java.util.Scanner;

/*
*
* */
public class Test_113 {
    public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(String.valueOf(a)  + " + " + String.valueOf(b) + " = " + (a + b));
            System.out.printf("%d + %d = %d", a, b, a + b);
        }
    }
}
