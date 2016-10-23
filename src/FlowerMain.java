
import java.util.Arrays;

/**
 * Created by matt on 10/3/16.
 */
public class FlowerMain {

    public static void main(String args[]) {
        FlowerBucket bucket = new FlowerBucket();
        Flower mak = new Flower(FlowerColor.GREEN, 12, true, 12.5, FlowerType.MAK);
        Flower romashka = new Flower(FlowerColor.RED, 12, true, 12.5, FlowerType.ROMASHKA);

        FlowerSpec findFlower = new FlowerSpec(FlowerColor.RED, 12, FlowerType.ROMASHKA);

        bucket.addFlower(mak);
        bucket.addFlower(romashka);

        System.out.println(bucket.getFlower("poppy"));
        System.out.println(bucket.searchFlower(findFlower));

    }
}
