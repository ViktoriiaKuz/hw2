public class ServiceLift extends RegularLift {


    ServiceLift(String name, int maxFloor, int maxWeight, double speed) {
        super(name, maxFloor, maxWeight, speed);
    }

    @Override
    public boolean moveToFloor(int floor, int weight) {

        if (getMaxFloor() < floor || getMaxWeight() < weight) {
            return false;
        } else if(floor < 0) {
            return true;
        }
        else {
            return true;
        }

    }
}
