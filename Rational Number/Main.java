public class Main{
    public static void main(String[] args) {
        RationalNumber r1 = new RationalNumber(2,4);
        RationalNumber r2 = new RationalNumber(4,2);
        RationalNumber r3 = new RationalNumber(6,3);
        RationalNumber r4 = new RationalNumber(r2);
        //using toString
        System.out.println("First Rational Number: " + r1);
        System.out.println("Second Rational Number: " + r2);
        System.out.println("Third Rational Number: " + r3);

        RationalNumber add = r1.Add(r2);
        System.out.println("Addition: "+add);
        RationalNumber sub = r3.Sub(r1);
        System.out.println("Subtraction: "+sub);
        RationalNumber mul = r2.Multiply(r4);
        System.out.println("Multiplication: "+mul);
        RationalNumber div = r2.Div(r1);
        System.out.println("Division: "+div);
    }
}