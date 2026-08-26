class Triangle{
    private double sideA;
    private double sideB;
    private double sideC;
    private boolean isRight;
    private boolean isIso;
    private boolean isScal;
    private boolean isEqual;
    private static int count;
    private double p;

    //null constructor
    Triangle(){
        this.sideA = 1.0;
        this.sideB = 1.0;
        this.sideC = 1.0;
    }

    //by default equilateral triangle
    Triangle(double x){
        this.sideA = x;
        this.sideB = x;
        this.sideC = x;
    }

    //by default isosceles triangle
    Triangle(double x, double y){
        this.sideA = x;
        this.sideB = x;
        this.sideC = y;
    }

    //by default scalene triangle
    Triangle(double x, double y, double z){
        this.sideA = x;
        this.sideB = y;
        this.sideC = z;
    }

    //copy constructor
    Triangle(Triangle t){
        this.sideA = t.sideA;
        this.sideB = t.sideB;
        this.sideC = t.sideC;
    }

    //setter
    public void set(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    //getter
    public double get_sideA(){
        return this.sideA;
    }
    public double get_sideB(){
        return this.sideB;
    }
    public double get_sideC(){
        return this.sideC;
    }

    //methods
    public double perimeter(){
        this.count++;
        return this.p = this.sideA + this.sideB + this.sideC;
    }

    //right-angled triangle
    public boolean isRightAngle(){
        this.count++;
        if(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2) == Math.pow(this.sideC, 2)){
            return this.isRight = true;
        }else{
            return this.isRight = false;
        }
    }

    //equilateral triangle
    public boolean isEquilateral(){
        this.count++;
        if(this.sideA == this.sideB && this.sideA == this.sideC && this.sideB == this.sideC){
            return this.isEqual = true;
        }else{
            return this.isEqual = false;
        }

    }

    //Isosceles triangle
    public boolean isIsosceles(){
        this.count++;
        if((this.sideA ==this.sideB || this.sideA == this.sideC || this.sideB == this.sideC) && !isEquilateral()){
            return this.isIso = true;
        }else{
            return this.isIso = false;
        }
    }

    //Scalene triangle
    public boolean isScalene(){
        this.count++;
        if(this.sideA != this.sideB && this.sideA != this.sideC && this.sideB != this.sideC){
            return this.isScal = true;
        }else{
            return this.isScal = false;
        }
    }

    //object count
    private static double objectCount(){
        return this.count;
    }

    //toSring method
    public String toString(){
        return "side A: " + sideA +"side B: " + sideB +"side C" + sideC;
    }

    public void display(){
        System.out.println("Side A: " +sideA);
        System.out.println("Side B: " +sideB);
        System.out.println("Side C: " +sideC);
        System.out.println("Perimeter: " +p);
        System.out.println("Right-Angled Triangle: " +isRight);
        System.out.println("Isosceles Triangle: " +isIso);
        System.out.println("Scalene Triangle: " +isScal);
        System.out.println("Equilateral Triangle: " + isEqual);
        System.out.println("Object Count: " +count);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
}