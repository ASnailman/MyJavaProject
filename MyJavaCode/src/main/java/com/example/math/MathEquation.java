package com.example.math;

import com.example.myjavacode.MathHK;

import static com.example.myjavacode.MathHK.Add;
import static com.example.myjavacode.MathHK.Sub;
import static com.example.myjavacode.MathHK.Multiply;

public class MathEquation {

    public static void main(String[] args) {

        int a=2;
        int b=5;
        int q=8;
        int s=3;
        int x;

       x = Add(a, b);
        System.out.println(x);
       x = Sub(x, q);
        System.out.println(x);
       x = Multiply(x,s);
        System.out.println(x);
    }
}
