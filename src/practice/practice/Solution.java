package practice.practice;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n -> ");
        n = sc.nextInt();
        System.out.println("Enter m -> ");
        m = sc.nextInt();
        int a[];
        a = new int[m];
        for (int index = 0; index < a.length; index++) {
            System.out.println("Enter A Array Elements -> ");
            a[index] = sc.nextInt();
        }
        int b[];
        b = new int[n];
        for (int index = 0; index < b.length; index++) {
            System.out.println("Enter B Array Elements -> ");
            b[index] = sc.nextInt();
        }
        System.out.println("Your Combined Array is -> ");
        int c[];
        c = new int[m + n];
        for (int index = 0; index < c.length; index++) {
            if (index < m)
                c[index] = a[index];
            else
                c[index] = b[index - m];
            System.out.println(c[index]);
        }
    }
}