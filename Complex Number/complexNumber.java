public class complexNumber {
    private double real;
    private double img;
    private double mod;


     complexNumber() {
        this.real = 0;
        this.img = 0;
    }
     complexNumber(double real, double imag) {
        this.real = real;
        this.img = img;
 
    }
    complexNumber(complexNumber a) {
        this.real = a.real;
        this.img = a.img;
     
    }
    //add
    void add( complexNumber c){
        this.real += c.real ;
        this.img += c.img ;
    }

    void sub( complexNumber c){
        this.real -= c.real;
        this.img -= c.img;
    }
    
     void modulus(){
        this.mod = Math.sqrt(Math.pow(this.real,2) + Math.pow(this.img, 2));
    }
    
    void display(){
        System.out.println("real ==> " + real );
        System.out.println("imaginary ==> " + img );
        System.out.println("modulus ==> " + mod );


    }
    
}