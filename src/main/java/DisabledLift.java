import java.util.Date;

public class DisabledLift extends RegularLift {



    DisabledLift(String name, int maxFloor, int maxWeight, double speed) {
        super(name, maxFloor, maxWeight, speed);
    }

    @Override
    public boolean moveToFloor(int floor, int weight) {

        if (getMaxFloor() < floor  || floor < 0|| getMaxWeight() < weight) {
            return false;
        } else if (getSpeed() > 70) {
            return false;
        }
        else {
            return true;
        }

    }
}
