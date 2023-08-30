public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Fraction frac = new Fraction();
        Fraction frac2 = new Fraction(2, 1);
        Fraction sum = frac.Add(frac2);
        System.out.print(sum.ToString());
    }
}

