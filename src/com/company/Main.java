package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner Num = new Scanner(System.in);
        int i = 0;

        while (i < 3) {
            System.out.println("Enter an integer:");
            int num = Num.nextInt();

            if (num % 2 == 0) {
                System.out.println("The integer " + num + " is even.");
            } else {
                System.out.println("The integer " + num + " is odd.");
            }

            System.out.println("");
            i++;
        }
    }
}
