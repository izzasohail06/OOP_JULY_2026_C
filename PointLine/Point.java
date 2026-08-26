public class Point {
    private double x;
    private double y;
    private double distance;

    Point(){
        this.x = 3;
        this.y = 3;
    }

    Point(double x, double  y){
        this.x = x;
        this.y = y;

    }
    
    Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public void set(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public double get_x(){
        return this.x;
    }
    public double get_y(){
        return this.y;
    }

    public void add(Point n){
        this.x += n.x;
        this.y += n.y;
    }
    public void add(Point n , Point m ){
        this.x = n.x + m.x;
        this.y = n.y + m.y;
    }

    public void sub(Point n){
        this.x -= n.x;
        this.y -= n.y;
    }
    public void sub(Point n , Point m ){
        this.x = n.x - m.x;
        this.y = n.y - m.y;
    }
    public void distance(Point n , Point m){
        double solve = Math.pow(m.x - n.x, 2) + Math.pow(m.y - n.y, 2);
        this.distance = Math.sqrt(solve);

    }
    public void display(){
        System.out.println("x ==>" + this.x);
        System.out.println("y ==>" + this.y);
        System.out.println("distance ==> " + this.distance);
    }

    public String toString(){
        return "Point 1: " + this.x + "\nPoint 2: " + this.y;
    }
    
    
}