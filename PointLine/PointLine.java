class PointLine {
    private Point p1;
    private Point p2;
    private double length;
    private static int count;

    //null constructor
    PointLine(){
        this.p1 = new Point();
        this.p2 = new Point();
        this.length = 0;
        count++;
    }

    //parameterized constructor
    PointLine(Point p1, Point p2){
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.length = 0;
        count++;
    }

    //copy constructor
    PointLine(PointLine l){
        this.p1 = new Point(l.p1);
        this.p2 = new Point(l.p2);
        this.length = l.length;
        count++;
    }

    //setter
    public void set(Point p1, Point p2){
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
    }

    //getter
    public Point get_p1(){
        return this.p1;
    }

    public Point get_p2(){
        return this.p2;
    }

    public double get_length(){
        return this.length;
    }

    //calculate length
    // public void calculateLength(){
    //     double x = p2.get_x() - p1.get_x();
    //     double y = p2.get_y() - p1.get_y();
    //     this.length = Math.sqrt(x * x + y * y);
    // }
    public double calculateLength(Point n){
        double a = this.ge
        return 0;
    }

    //midpoint
    public Point midpoint(){
        double x = (p1.get_x() + p2.get_x()) / 2;
        double y = (p1.get_y() + p2.get_y()) / 2;
        return new Point(x, y);
        
    }

    //check horizontal
    public boolean isHorizontal(){
        
        return p1.get_y() == p2.get_y();
    }

    // check vertical
    public boolean isVertical(){
        count++;
        return p1.get_x() == p2.get_x();
    }

    // display
    void display(){
        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);
        System.out.println("Length: " + this.length);
        System.out.println("Object Count: "+ count);
        System.out.println(".................................");
    }

    // object count
    static int getObjectCount(){
        return count;
    }

    // toString
    public String toString(){

        return "p1 = " + p1 + "\np2 = " + p2 +"\nlength = " + length ;
    }
}