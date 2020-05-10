public class MotorBike extends Vehicle {
    private int speedLimit;

    public MotorBike(String name, int year, int speedLimit) {
        super(name, year);
        this.speedLimit = speedLimit;
    }

    @Override
    public String turnLeft() {
        return LEFT;
    }

    @Override
    public String turnRight() {
        return RIGHT;
    }

    @Override
    public String goForward() {
        return FORWARD;
    }

    @Override
    public String goBack() {
        return BACK;
    }
}
