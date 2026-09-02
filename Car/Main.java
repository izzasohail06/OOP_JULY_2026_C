class Main{
    public static void main(String[] args) {
        Car tesla= new Car(false, 0, 18);
        tesla.on_off(false);
        tesla.drive();
        tesla.direction("r");
        tesla.display();
    }
}