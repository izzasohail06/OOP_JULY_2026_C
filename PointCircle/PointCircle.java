package PointCircle;

public class PointCircle {
    private Point center;
    private double radius;
    private double diameter;
    private double area;
    private double circumference;
    private static int count;

    // null constructor
    PointCircle(){
        this.center = new Point();
        this.radius = 1;
        this.diameter = 0;
        this.area = 0;
        this.circumference = 0;
        count++;
    }

    // parameterized constructor
    PointCircle(Point center, double radius){
        this.center = new Point(center);
        this.radius = radius;
        this.diameter = 0;
        this.area = 0;
        this.circumference = 0;
        count++;
    }

    // copy constructor
    PointCircle(PointCircle c){
        this.center = new Point(c.center);
        this.radius = c.radius;
        this.diameter = c.diameter;
        this.area = c.area;
        this.circumference = c.circumference;
        count++;
    }

    // setter
    public void set(Point center, double radius){
        this.center = new Point(center);
        this.radius = radius;
    }

    // setter
    public void set_center(Point center){
        this.center = new Point(center);
    }

    // setter
    public void set_radius(double radius){
        this.radius = radius;
    }

    // getters
    public Point get_center(){
        return this.center;
    }

    public double get_radius(){
        return this.radius;
    }

    public double get_diameter(){
        return this.diameter;
    }

    public double get_area(){
        return this.area;
    }

    public double get_circumference(){
        return this.circumference;
    }

    // calculate diameter
    public void calculateDiameter(){
        count++;
        this.diameter = 2 * this.radius;
    }

    // area
    public void calculateArea(){
        count++;
        this.area = Math.PI * this.radius * this.radius;
    }

    // circumference
    public void calculateCircumference(){
        count++;
        this.circumference = 2 * Math.PI * this.radius;
    }

    // display
    public void display(){

        System.out.println("Center ==> " + center);
        System.out.println("Radius ==> " + this.radius);
        System.out.println("Diameter ==> " + this.diameter);
        System.out.println("Area ==> " + this.area);
        System.out.println("Circumference ==> " + this.circumference);
        System.out.println("Object Count ==> "+ count);
    }

    // object count
    public static int getObjectCount(){
        return count;
    }

    // toString
    public String toString(){
        return "\ncenter = " + center +"\nradius = " + radius +"\ndiameter = " + diameter +"\narea = " + area +"\ncircumference = " + circumference;
    }
}


