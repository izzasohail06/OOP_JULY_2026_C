class Point {
    private double x;
    private double y;

    //null constructor
    Point(){
        this.x = 3;
        this.y = 3;
    }

    //parameterized constructor
    Point(double x, double  y){
        this.x = x;
        this.y = y;

    }
    
    //copy constructor
    Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    //setter
    public void set(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    //getter
    public double getx(){
        return this.x;
    }
    public double gety(){
        return this.y;
    }

    //add function

    // public void add(Point n){
    //     this.x += n.x;
    //     this.y += n.y;
    // }
    public Point add(Point n , Point m ){
        double a = n.x + m.x;
        double b = n.y + m.y;
        return new Point(a,b);
    }

    //subtract function

    // public void sub(Point n){
    //     this.x -= n.x;
    //     this.y -= n.y;
    // }
    public Point sub(Point n , Point m ){
        double a = n.x - m.x;
        double b = n.y - m.y;
        return new Point(a,b);
    }

    //distance function
    public double distance(Point n , Point m){
        double solve = Math.pow(m.x - n.x, 2) + Math.pow(m.y - n.y, 2);
        return Math.sqrt(solve);

    }
    public void display(){
        System.out.println("x ==>" + this.x);
        System.out.println("y ==>" + this.y);
   
    }

    public String toString(){
        return "Point 1: " + this.x + "\nPoint 2: " + this.y;
    }
    
    
}