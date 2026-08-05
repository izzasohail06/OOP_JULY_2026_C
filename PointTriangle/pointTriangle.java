import java.io.PrintStream;
import java.util.Arrays;

public class pointTriangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public pointTriangle() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
    }

    public pointTriangle(Point var1, Point var2, Point var3) {
        this.p1 = new Point(var1);
        this.p2 = new Point(var2);
        this.p3 = new Point(var3);
    }

    public pointTriangle(pointTriangle var1) {
        this.p1 = new Point(var1.p1);
        this.p2 = new Point(var1.p2);
        this.p3 = new Point(var1.p3);
    }

    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public Point getP3() {
        return this.p3;
    }

    public double perimeter() {
        return this.p1.distance(this.p2) + this.p2.distance(this.p3) + this.p3.distance(this.p1);
    }

    public double area() {
        double var1 = this.p1.distance(this.p2);
        double var3 = this.p2.distance(this.p3);
        double var5 = this.p3.distance(this.p1);
        double var7 = (var1 + var3 + var5) / (double)2.0F;
        return Math.sqrt(var7 * (var7 - var1) * (var7 - var3) * (var7 - var5));
    }

    public boolean isRightAngle() {
        double[] var1 = new double[]{this.p1.distance(this.p2), this.p2.distance(this.p3), this.p3.distance(this.p1)};
        Arrays.sort(var1);
        double var2 = var1[0];
        double var4 = var1[1];
        double var6 = var1[2];
        return Math.pow(var2, (double)2.0F) + Math.pow(var4, (double)2.0F) == Math.pow(var6, (double)2.0F);
    }

    public boolean isIsosceles() {
        return this.p1.distance(this.p2) == this.p2.distance(this.p3) || this.p2.distance(this.p3) == this.p3.distance(this.p1) || this.p3.distance(this.p1) == this.p1.distance(this.p2);
    }

    public boolean isEquilateral() {
        return this.p1.distance(this.p2) == this.p2.distance(this.p3) && this.p2.distance(this.p3) == this.p3.distance(this.p1);
    }

    public boolean isConcurrent(pointTriangle var1) {
        double[] var2 = new double[]{this.p1.distance(this.p2), this.p2.distance(this.p3), this.p3.distance(this.p1)};
        double[] var3 = new double[]{var1.p1.distance(var1.p2), var1.p2.distance(var1.p3), var1.p3.distance(var1.p1)};
        Arrays.sort(var2);
        Arrays.sort(var3);
        return var2[0] == var3[0] && var2[1] == var3[1] && var2[2] == var3[2];
    }

    public void display() {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(this.p1);
        var10000.println("Triangle: " + var10001 + ", " + String.valueOf(this.p2) + ", " + String.valueOf(this.p3));
        System.out.println("Perimeter: " + this.perimeter());
        System.out.println("Area: " + this.area());
        System.out.println("Is Right Angle: " + this.isRightAngle());
        System.out.println("Is Isosceles: " + this.isIsosceles());
        System.out.println("Is Equilateral: " + this.isEquilateral());
    }

    public String toString() {
        String var10000 = String.valueOf(this.p1);
        return "Triangle: " + var10000 + ", " + String.valueOf(this.p2) + ", " + String.valueOf(this.p3);
    }
}