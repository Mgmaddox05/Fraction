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
        int numerator = this.numerator + other.numerator;
        Fraction fracSum = new Fraction();
        return fracSum;
    }

    public String ToString()
    {
        return numerator + " " + "/" + " " + denominator;
    }
}
