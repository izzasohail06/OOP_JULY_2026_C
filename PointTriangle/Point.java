public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public Point add(Point p) {
        return new Point(this.x + p.x, this.y + p.y);
    }

    public Point subtract(Point p) {
        return new Point(this.x - p.x, this.y - p.y);
    }

    public double distance(Point p) {
        double distance = Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
        return distance;
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.y - p1.y) * (p2.y - p1.y) + (p2.x - p1.x) * (p2.x - p1.x));
    }

    public void display() {
        System.out.println("Point(" + this.x + ", " + this.y + ")");
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}