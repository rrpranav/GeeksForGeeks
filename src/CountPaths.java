package com.company;

import java.util.Stack;

/**
 * Created by rajar on 3/7/17.
 */
public class CountPaths {

    public static void main(String[] args) {
        int total = 0;
        int rows = 3;
        int columns = 3;
        System.out.println(countPaths(rows,columns));
    }

    public static int countPaths(int m, int n){
        if( m == 1 || n == 1){
            return  1;
        }
        return countPaths(m-1, n ) + countPaths(m, n-1);
    }
}


/*

43 33 23 13
42 32 22 12
41 31 21 11




*/