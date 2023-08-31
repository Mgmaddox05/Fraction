public class App {
    public static void main(String[] args) throws Exception {
        Fraction frac = new Fraction(1, 3);
        Fraction frac2 = new Fraction(1,6);
        Fraction frac3 = new Fraction(1, 4);
        Fraction frac4 = new Fraction(3,6);
        Fraction frac5 = new Fraction(3, 8);
        Fraction frac6 = new Fraction(2,5);
        Fraction sum = frac.Add(frac2);
        Fraction sum1 = frac3.Add(frac4);
        Fraction sum2 = frac5.Add(frac6);
        Fraction mul1 = frac.Multiply(frac2);
        Fraction mul2 = frac3.Multiply(frac4);
        Fraction mul3 = frac5.Multiply(frac6);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(mul1);
        System.out.println(mul2);
        System.out.println(mul3);
        
        
    }
}

