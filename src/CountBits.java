package com.company;

public class CountBits {

    public static void main(String[] args) {


        int myNum = 17 ;
        int result = 0;
        for (int i = 1 ; i <= myNum ; i++){
            result = result + bitCount(i);
        }
        System.out.print(result);
    }

    public static int bitCount(int i){
        int result = 0;
        while (i > 0) {
            if (i % 2 == 1) {
                result++;
            }
            i = i / 2;
        }
        return result;
    }
}
