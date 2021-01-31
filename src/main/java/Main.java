
public class Main {
    static int userInputFloor = 2;
    static int userInputNextFloor = 3;
    static int userInputWeight = 150;

    public static void main(String[] args) {

        PassengerLift passengerLift = new PassengerLift("Пассажирский лифт",100, 500, 55.5);
        DisabledLift disabledLift = new DisabledLift("Лифт для инвалидов",100, 700, 45.5);
        ServiceLift serviceLift = new ServiceLift("Грузовой лифт",100, 1500, 25.5);

        moveLiftToArray(passengerLift,disabledLift,serviceLift);

    }

    public static void moveLiftToArray (RegularLift ... v){
        RegularLift [] array = new RegularLift[v.length];
        for(int i = 0, j = 1; i < v.length; i++, j++){

            array[i] = v[i];

            System.out.println(j + ") " +v[i].name());
            System.out.println("Максимальный этаж: " + v[i].getMaxFloor());
            System.out.println("Максимальный перевозимый вес: " + v[i].getMaxWeight());
            System.out.println("Максимальная скорость: " + v[i].getSpeed());

            System.out.println("Может перевозить на " + userInputFloor + " этаж, при весе "
                    + userInputWeight + " кг - "+ v[i].moveToFloor(userInputFloor, userInputWeight));

            if(userInputFloor == userInputNextFloor){
                System.out.println("И лифт уже на этом этаже ");
            }
            System.out.println("************************");
            System.out.println("                        ");
        }

    }
}
