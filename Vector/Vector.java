package Vector;

public class Vector {

    private double delx;
    private double dely;
    private double delz;

    //null constructor
    public Vector() {
        this.delx = 0;
        this.dely = 0;
        this.delz = 0;
    }

    //parameterized constructor
    public Vector(double delx, double dely, double delz) {
        this.delx = delx;
        this.dely = dely;
        this.delz = delz;
    }

    //copy constructor
    public Vector(Vector obj) {
        this.delx = obj.delx;
        this.dely = obj.dely;
        this.delz = obj.delz;
    }

    //vector addition
    public Vector add(Vector obj) {
        return new Vector(this.delx + obj.delx, this.dely + obj.dely, this.delz + obj.delz);
    }

    //dot product of vectors
    public double dotProduct(Vector obj) {
        return this.delx * obj.delx + this.dely * obj.dely + this.delz * obj.delz;
    }

    //cross product of vectors
    public Vector crossProduct(Vector obj) {
        double i = (this.dely * obj.delz) - (obj.dely * this.dely);
        double j = -1 * ((this.delx * obj.delz) - (obj.delx * this.delz));
        double k = (this.delx * obj.dely) - (obj.delx * this.dely);
        return new Vector(i, j, k);
    }

    //magnitude of vectors
    public double magnitude() {
        double sum = this.delx * this.delx + this.dely * this.dely + this.delz * this.delz;
        return Math.sqrt(sum);
    }

    //projection of vectors
    public Vector projection(Vector obj) {
        double ab = this.dotProduct(obj);
        System.out.println(ab);
        double bsqrt = Math.pow(obj.magnitude(), 2);
        System.out.println(bsqrt);
        return new Vector((ab / bsqrt) * obj.delx, (ab / bsqrt) * obj.dely, (ab / bsqrt) * obj.delz);
    }

    //Unit Vector
    public Vector unitVector(){
        double mag = this.magnitude(); 
        return new Vector(this.delx/mag,this.dely/mag,this.delz/mag);
    }

    @Override
    public String toString() {
        return String.format("(%.2fi, %.2fj, %.2fk)", this.delx, this.dely, this.delz);
    }

}

