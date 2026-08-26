public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(3);
        Triangle t3 = new Triangle(2, 4);
        Triangle t4 = new Triangle(8, 6, 10);
        Triangle t5 = new Triangle(t3);
        // t3.isRightAngle();
        // t3.isIsosceles();
        // t3.isScalene();
        // t3.perimeter();
        // t3.toString();
        // t3.display();

        // t4.isRightAngle();
        // t4.isIsosceles();
        // t4.isScalene();
        // t4.perimeter();
        // t4.toString();
        // t4.display();

        // t2.isRightAngle();
        // t2.isIsosceles();
        // t2.isScalene();
        // t2.isEquilateral();
        // t2.perimeter();
        // t2.toString();
        // t2.display();

        t5.isRightAngle();
        t5.isIsosceles();
        t5.isScalene();
        t5.isEquilateral();
        t5.perimeter();
        t5.toString();
        t5.display();

    }

}
