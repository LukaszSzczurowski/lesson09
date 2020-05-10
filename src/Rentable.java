public interface Rentable {

    void rent(String name, String lastName, String id);
    void handOver();
    boolean isRent();
}
