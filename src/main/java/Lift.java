public interface Lift {

        String name();

        int getMaxFloor();


        int getMaxWeight();


        double getSpeed();


        boolean moveToFloor(int floor, int weight);

    }
