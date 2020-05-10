public class AppRent {
    public static void main(String[] args) {
        RentableCar rentableCar = new RentableCar("Audi",2020,4);
        System.out.println(rentableCar);

        rentableCar.rent("Bartek","Kosa", "43r3");
        System.out.println(rentableCar);

    }
}
