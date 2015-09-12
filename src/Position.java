/**
 * Created by ExcalibuR on 9/10/2015.
 */
public enum Position {

    TOP(0), JUNGLE(1), MID(2), ADC(3), SUP(4), FLEX1(5), FLEX2(6), FLEX3(7), NA(8);


    private final int arrayID;

    Position(int id){
        arrayID = id;
    }

    public int getArrayID() {
        return arrayID;
    }

    public Position getNext() {
        return this.ordinal() < Position.values().length - 1
                ? Position.values()[this.ordinal() + 1]
                : null;
    }

}
