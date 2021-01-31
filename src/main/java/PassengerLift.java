public class PassengerLift extends RegularLift {


    PassengerLift(String name, int maxFloor, int maxWeight, double speed) {
        super(name, maxFloor, maxWeight, speed);

    }

    @Override
    public boolean moveToFloor(int floor, int weight) {

        if (getMaxFloor() < floor || floor < 0 || getMaxWeight() < weight ) {
            return false;
        } else if (getSpeed() > 10 && getMaxFloor() == getMaxWeight()) {
            return true;
        } else {
            return true;
        }
    }
}
