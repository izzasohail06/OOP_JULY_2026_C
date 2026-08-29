class Main{
    public static void main(String[] args){

        Point p1 = new Point(2,0);
        Point p2 = new Point(8,0);

        PointLine l1 = new PointLine(p1, p2);
        l1.calculateLength();
        l1.display();

        PointLine l2 = new PointLine(l1);
        l2.display();

        System.out.println(l1);
        System.out.println(l2);

    }
}