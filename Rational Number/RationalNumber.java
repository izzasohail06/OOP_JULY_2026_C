class RationalNumber{
    private int numerator;
    private int denominator;

    //null constructor
    RationalNumber(){
        this.numerator = 0;
        this.denominator = 0;
    }

    //parameterized constructor
    RationalNumber(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //copy constructor
    RationalNumber(RationalNumber r){
        this.numerator = r.numerator;
        this.denominator = r.denominator;
    }

    //setter
    public void set(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //getter
    public int get_numerator(){
        return this.numerator;
    }
    public int get_denominator(){
        return this.denominator;
    }
    
    //addition
    public RationalNumber Add(RationalNumber r){
        int num = (this.numerator * r.denominator) + (this.denominator * r.numerator);
        int den = this.denominator * r.denominator;
        return new RationalNumber(num,den);
        
    }

    // //subtraction
    public RationalNumber Sub(RationalNumber r){
        int num = (this.numerator * r.denominator) - (this.denominator * r.numerator);
        int den = this.denominator * r.denominator;
        return new RationalNumber(num,den);
        
    }

    //multiply
    public RationalNumber Multiply(RationalNumber r){
        int num = this.numerator * r.numerator;
        int den = this.denominator * r.denominator;
        return new RationalNumber(num,den);
    }

    //divide
    public RationalNumber Div(RationalNumber r){
        if (r.numerator == 0) {
            System.out.println("Invalid.");
            return new RationalNumber();
        }
        int num = this.numerator * r.denominator;
        int den = this.denominator * r.numerator;
        return new RationalNumber(num,den);
        
    }

    //reciprocal
    public RationalNumber reciprocate() {
        return new RationalNumber(denominator, numerator);
    }

    //toString method
    public String toString(){
        return numerator + "/" + denominator;
    }

    //display
    public void display(){
        System.out.println("Numerator: " +this.numerator);
        System.out.println("Denominator: " +this.denominator);
        System.out.println(".............................");
        
        
    }
}