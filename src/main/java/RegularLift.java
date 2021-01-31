public class RegularLift implements Lift {
    private int maxWeight;
    private double speed;
    private int maxFloor;
    private String name;

    RegularLift(String name, int maxFloor, int maxWeight, double speed) {
        this.maxFloor = maxFloor;
        this.maxWeight = maxWeight;
        this.speed = speed;
        this.name = name;

    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int getMaxFloor() {
        return maxFloor;

    }

    @Override
    public int getMaxWeight() {
        return maxWeight;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public boolean moveToFloor(int floor, int weight) {
        if (maxFloor < floor || maxWeight < weight) {
            return false;
        } else {
            return true;
        }
    }
}