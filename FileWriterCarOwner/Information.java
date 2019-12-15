import java.util.List;
import java.util.Scanner;

public class Information {
    private static int numberOfCallsCarInfo = 0;
    private static int numberOfCallsOwnerInfo = 0;
    private static Scanner scanner;

    public static String getOwnerInfo(Owner owner){
        numberOfCallsOwnerInfo++;
        return "" + owner.getName() + " " + owner.getSurname() + " " + owner.getNumberOfCars();
    }

    public static String getCarInfo(Car car){
        numberOfCallsCarInfo++;
        return "" + car.getNumber() + " " + car.getMarkaaa() + car.getProduction();
    }
    public static Car findCar(List<Car> cars, String command) {
        for(Car car: cars){
            if(car.getNumber().equals(command)){
                return car;
            }
        }
        return null;
    }

    public static Owner findOwner(List<Owner> owners, String command) {
        System.out.println("Введите фамилию владельца");
        for(Owner owner: owners){
            if(owner.getSurname().equals(command)){
                return owner;
            }
        }
        return null;
    }
}
