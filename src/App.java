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
        System.out.println(sum);
        
        
    }
}

