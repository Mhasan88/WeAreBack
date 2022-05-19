package javaTest;

import java.sql.SQLOutput;

public class ReversString {

    public static void main(String[] args) {
        String we = "We are back after covid";

        System.out.println(revers(we));
        int d = add(10,20);
        System.out.println(d);


    }

    //Revers String
    public static String revers(String we){
        String[] a = we.split("");

        String rev = "";

        for (int i = a.length-1; i>=0; i--){
            rev += a[i];
        }
   return rev;
    }

    //
    public static int add( int a , int b){
        int c = a+b;

        return c;
    }

}
