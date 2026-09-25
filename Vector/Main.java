package Vector;

public class Main {
    public static void main(String[] args) {
        Vector v1 = new Vector(12,8,7);
        Vector v2 = new Vector(7, 2, 14);
        Vector v3 = v1.projection(v2);
        Vector v4 = v1.crossProduct(v2);

        System.out.println("Projection: "+v3);
        System.out.println("Cross Product: "  + v4);
    }
    
}
