//2.Reverse a string without using stringbuffer reverse() method

package com.company;

public class Reverse {
    public static void main(String[] args) {
        String str = "prachi";
        String revstr = " ";

        for(int i=str.length()-1;i>=0;i--)
        {
            revstr=  revstr+str.charAt(i);
        }
        System.out.println(revstr);
    }
}
