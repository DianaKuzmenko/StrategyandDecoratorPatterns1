/**
 * Created by Diana on 17/3/16.
 */
public class FlowerSpec {
    protected FlowerColor color;
    protected double length;
    protected FlowerType type;

    public FlowerSpec(FlowerColor color, double length, FlowerType type){
        this.color = color;
        this.length = length;
        this.type = type;
    }
    public FlowerType getType() {return type;}
    public double getLength() {return length;}
    public FlowerColor getColor(){return color;}
}
