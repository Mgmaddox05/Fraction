import java.io.*;
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction()
    {
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
        
    }

    public Fraction Add(Fraction other)
    {
       
        // Finding LCM
        int denominator2 = lcm(this.denominator, other.denominator);
        
        //Adding Numerators
        int multiply = denominator2/this.denominator;
        int multiply2 = denominator2/other.denominator;
        int newNum1 = this.numerator * multiply;
        int newNum2 = other.numerator * multiply2;
        int numerator = newNum1 + newNum2;
        
        Fraction fracSum = new Fraction(numerator, denominator2);
        
        fracSum.reduce();
        
         
        return fracSum;
    }

    public Fraction Multiply(Fraction other)
    {
        int numerator = this.numerator*other.numerator;
        int denominator = this.denominator*other.denominator;
        Fraction fracMul = new Fraction(numerator, denominator);
        fracMul.reduce();
        return fracMul;
    }

    public String toString()
    {
        return numerator + " " + "/" + " " + denominator;
    }
    
    private void reduce()
    {
       int divisior = gcd(numerator, denominator);
       System.out.println(divisior + " Div"); 
        numerator = numerator/divisior;
       denominator = denominator/divisior;
        
    }

    static int gcd(int a, int b)
    {
        if(b == 0)
        {
            return a;
        }
        return gcd(b, a % b);
    }
     
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }
        
}
