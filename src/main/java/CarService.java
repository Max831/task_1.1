public class CarService {

    public void distance(Car car) {
        if (car.getChargeFuel() > 0 && car.getVolumeFuel() >= 0) {
            if (car.getVolumeFuel() == 0){
                System.out.println("Empty Fuel. Distance = 0");
            } else {
                car.setDistance((int) (car.getVolumeFuel() / car.getChargeFuel() *100));
                System.out.println(car.getDistance());
            }
        } else {
            System.out.println("Incorrect parameters");
        }
    }
}
