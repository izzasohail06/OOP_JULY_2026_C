public class Main {
    public static void main(String[] args) {
        Calculator casio = new Calculator();
        casio.sol(2, 3, '*');
        casio.contSol(3, '/');
        casio.contSol(5, '+');
        casio.display();
    }
}