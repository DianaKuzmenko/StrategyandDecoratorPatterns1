/**
 * Created by Diana on 17/3/16.
 */
public enum FlowerType {
    ROMASHKA, MAK, ROSA, TULPAN;

    public String toString(){
        switch (this){
            case ROMASHKA:
                return "Romashka";
            case MAK:
                return "mak";
            case ROSA:
                return "rosa";
            case TULPAN:
                return "tulpan";
            default:
                return "no flower";
        }
    }
}
