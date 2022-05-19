package javaTest;

import java.util.ArrayList;
import java.util.List;

public class SortingTest {

    public static void main (String[]args){

        int a [] = {1,2,3,4,5,5,6,1,7,8,9,0};

        int tem;
        for (int i = 1;i <a.length; i++){
            for (int j= i;j>0; j--){

                if (a[j] < a[j-1]){

                    tem = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tem;
                }
            }
            }
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i]);

        }
        System.out.println("===================================================");
        List<Integer> list = new ArrayList<Integer>();
        list.add(a[0]);

        for(int i=1; i<a.length; i++){
            if (a[i] != a[i-1]){
                list.add(a[i]);
            }
        }
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        }
    }


