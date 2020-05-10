public interface Moveable {
    public static final String LEFT = "LEWO";
    public static final String RIGHT = "PRAWO";
    public static final String FORWARD = "DO PRZODU";
    public static final String BACK = "DO TYŁU";
    String turnLeft();
    String turnRight();
    String goForward();
    String goBack();
}
