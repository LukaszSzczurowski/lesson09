public class Car extends Vehicle {
    private int numberSeets;

    public Car(String name, int year, int numberSeets) {
        super(name, year);
        this.numberSeets = numberSeets;
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

    @Override
    public String toString() {
        return "Samochód marki: " + getName() + ", rocznik: " + getYear() + ", liczba miejsc: " + numberSeets;
    }
}
