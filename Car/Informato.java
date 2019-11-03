import java.sql.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Informato {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String command = null;
        Car car = null;
        List<Car> cars = new ArrayList<Car>();
        while (true) {
            command = scanner.nextLine();
            if (command.equals("Куплена машина")) {
                car = createCar();
                cars.add(car);
            } else if (command.equals("Найти машину")) {
                Car car1 = findCurrentCar(cars);
                if (car1 == null) {
                    System.out.println("Данной машины не существует");
                } else {
                    System.out.println(car.getMarkaaa());
                    System.out.println(car.getProduction());
                    System.out.println(car.getOwner());
                }
            } else if (command.equals("Перекупка машины")) {
                changeInfo(car);
            }
        }
    }
    private static Car findCurrentCar (List <Car> cars) {
        System.out.println("Введите номера машины");
        String string = scanner.nextLine();
        for (Car car : cars) {
            if (car.getNumber().equals(string)) {
                return car;
            }
        }
         return null;
    }

    private static Car createCar() {
        System.out.println("Введите номер");
        String number = scanner.nextLine();
        System.out.println("Введите марку");
        String markaaa = scanner.nextLine();
        System.out.println("Введите ФИО покупателя");
        String owner = scanner.nextLine();
        Date production = new Date(System.currentTimeMillis());
        Car car = new Car(number,markaaa,production,owner);
        return car;
    }




    private static void changeInfo(Car car) {
        System.out.println("Введите ФИО нового владельца");
        String owner = scanner.nextLine();
        car.setOwner(owner);
        System.out.println("Введите новые номера у машины");
        String number = scanner.nextLine();
        car.setNumber(number);
    }
}