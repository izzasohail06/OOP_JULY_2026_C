class Car {
    private boolean key;
    private float speed;
    private float distance;
    private float direction;
    private float fuelTankCapacity;

    // parametrize constructor
    public Car(boolean key, float speed, float fuelTankCapacity) {
        this.key = key;
        this.fuelTankCapacity = fuelTankCapacity;
        this.speed = speed;
        this.distance = distance;
        this.direction = direction;
    }

    // null constructor
    public Car() {
        this.key = true;
        this.fuelTankCapacity = 1;
        this.speed = 60;
        this.distance = 0;
        this.direction = 90;
    }

    //copy constructor
    Car(Car obj){
        this.key = obj.key;
        this.fuelTankCapacity = obj.fuelTankCapacity;
        this.speed = obj.speed;
        this.distance = obj.distance;
        this.direction = obj.direction;
    }

    // start
    public void on_off(boolean key) {
        this.key = !key;
    }

    // drive
    public void drive() {
        while (this.fuelTankCapacity != 0) {
            this.speed += 10;
            this.fuelTankCapacity--;
            this.distance += 1;
        }
    }

    // direction
    public void direction(String move) {
        if (move == "left")
            this.direction = 180;
        else if (move == "right")
            this.direction = 0;
        else if (move == "forward")
            this.direction = 90;
        else if (move == "reverse")
            this.direction = 270;
    }

    // display
    public void display() {
        System.out.println("key status --> " + key + "\n" + "speed --> " + speed + "\n" + "fuel -->" + fuelTankCapacity
                + "\n" + "distance covered -->" + distance + " km" + "\n" + "direction --> " + direction
                + " degree turn");
    }
}
