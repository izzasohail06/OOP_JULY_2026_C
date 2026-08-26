package PointCircle;

public class Main {
    public static void main(String[] args){

        Point p1 = new Point(5,5);

        PointCircle c1 = new PointCircle(p1, 4);

        c1.calculateDiameter();
        c1.calculateArea();
        c1.calculateCircumference();

        c1.display();

        PointCircle c2 = new PointCircle(c1);
        c2.display();

        System.out.println(c1);
        System.out.println(c2);

    }
}
    

