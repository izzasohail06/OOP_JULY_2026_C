public class Main{
    public static void main(String[] args){
        Point p1 = new Point(0,0);
        Point p2 = new Point(8,0);
        Point p3 = new Point(0,9);

        pointTriangle t1 = new pointTriangle(p1, p2, p3);
        t1.display();

        pointTriangle t2 = new pointTriangle(t1);
        t2.display();

        System.out.println(t1);
        System.out.println(t2);

    }
}