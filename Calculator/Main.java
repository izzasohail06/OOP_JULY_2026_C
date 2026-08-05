public class Main {
    public static void main(String[] args) {
        calculator casio = new calculator();
        casio.sol(2, 3, '*');
        casio.contSol(3, '/');
        casio.contSol(5, '+');
        casio.display();
    }
}