/**
 * Created by cs.ucu.edu.ua on 10/17/2016.
 */
public enum FlowerColor {

    GREEN, RED, BLUE, BLACK;

    public String toString() {
        switch (this) {
            case GREEN:
                return "green";
            case RED:
                return "red";
            case BLUE:
                return "blue";
            case BLACK:
                return "black";
            default:
                return "no color";
        }
    }
}