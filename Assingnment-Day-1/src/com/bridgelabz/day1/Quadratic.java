package com.bridgelabz.day1;

import java.util.Scanner;

public class Quadratic
{
    private float a;
    private float b;
    private float c;
    private float d;
    private float r1;
    private float r2;

    public Quadratic(float x, float y, float z)
    {
        a = x;
        b = y;
        c = z;
        d = 0;
    }

    public void calculate() {
        d= (b * b) - (4 * a * c);
        if (d < 0)
            System.out.println("Roots not possible");
        else {
            r1 = (float)((-b + Math.sqrt(d)) / (2 * a));
            r2 = (float)((-b - Math.sqrt(d)) / (2 * a));
            System.out.println("r1=" + r1);
            System.out.println("r2=" + r2);
        }
    }
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        float x = in.nextFloat();
        System.out.print("Enter b: ");
        float y = in.nextFloat();
        System.out.print("Enter z: ");
        float z = in.nextFloat();
        
        Quadratic obj = new Quadratic(x,y,z);
        obj.calculate();
    }
}