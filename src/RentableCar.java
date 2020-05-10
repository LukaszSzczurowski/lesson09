public class RentableCar extends Car implements Rentable{

    private boolean isRent;
    private Person person;

    public RentableCar(String name, int year, int numberSeets) {
        super(name, year, numberSeets);
        this.isRent = false;
        person = new Person();
    }

    @Override
    public void rent(String name, String lastName, String id) {
        person.setName(name);
        person.setLastName(lastName);
        person.setId(id);
        isRent = true;
    }

    @Override
    public void handOver() {
        person.setName(null);
        person.setLastName(null);
        person.setId(null);
        isRent = false;
    }

    @Override
    public boolean isRent() {
        return isRent;
    }

    @Override
    public String toString() {
        String infoCar = super.toString();
        if (isRent) {
            return infoCar + " - Wynajety przez: " + person.getName() + "" + person.getLastName() + " nr id: " + person.getId();
        }
        return infoCar;
    }
}
