class Car {

    int yearModel;
    String make;
    int speed;

    public void accelerate() {
        speed += 5;
    }

    public void brake() {
        if (speed <= 0) {
            speed = 0;
        } else {
            speed -= 5;
        }
    }
}