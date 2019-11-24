import java.sql.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String command = null;
        Car car = null;
        Information information = null;
        Owner owner = null;
        List<Car> cars = new ArrayList<Car>();
        List<Owner> owners = new ArrayList<Owner>();
        while (true) {
            command = scanner.nextLine();
            if (command.equals("Новая машина")) {
                car = createCar();
                cars.add(car);
            } else if (command.equals("Найти машину")) {
                Car car1 = findCurrentCar(cars);
                if (car1 == null) {
                    System.out.println("Данной машины не существует");
                }

                else {
                    System.out.println(information.getCarInfo(car));
                    System.out.println(owner.getName());
                    System.out.println(owner.getSurname());
                    System.out.println(owner.getBirthDate());
                    System.out.println(owner.getNumberOfCars());
                }
            } else if (command.equals("Изменить информацию о машине")) {
                changeInfo(car);
            }
            else if (command.equals("Новый клиент")){
               createOwner();
               owners.add(owner);
            }
                if (command.equals("Найти владельца")){
                Owner owner1 = Information.findOwner(owners,command);
                if (owner1 == null) {
                    System.out.println("Данного владельца нет");
                }

            }
                else if (command.equals("Поменять информацию о владельце")){
                    changeOwnerInfo(owner);
                }
                else if(command.equals("Куплена машина")){
                    System.out.println("Введите имя владельца");
                    command = scanner.nextLine();
                    owner = Information.findOwner(owners,command);
                    System.out.println("Введите номер машины");
                    command = scanner.nextLine();
                    car = Information.findCar(cars, command);
                    car.setOwner(owner);
                    for (int numberOfCars = 0; ;numberOfCars++);
                }
        }
    }
    private static Car findCurrentCar (List <Car> cars) {
        System.out.println("Введите номера машины");
        String number = scanner.nextLine();
        for (Car car : cars) {
            if (car.getNumber().equals(number)) {
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
        Date production = new Date(System.currentTimeMillis());
        Car car = new Car(number,markaaa,production);
        return car;
    }
    private static Owner createOwner(){
        System.out.println("Имя");
        String name = scanner.nextLine();
        System.out.println("Фамилия");
        String surname = scanner.nextLine();
        Owner owner = new Owner(name,surname, new Date(System.currentTimeMillis()));
        return owner;
    }


    private static void changeInfo(Car car) {
        System.out.println("Введите новые номера у машины");
        String number = scanner.nextLine();
        car.setNumber(number);
        System.out.println("Введите новую марку");
        String markaaa = scanner.nextLine();
        car.setMarkaaa(markaaa);
        Date production = new Date(System.currentTimeMillis());
        car.setProduction(production);
    }
    private static void changeOwnerInfo(Owner owner){
        System.out.println("Введите новое имя владельца");
        String name = scanner.nextLine();
        owner.setName(name);
        System.out.println("Введите новую фамилию владельца");
        String surname = scanner.nextLine();
        owner.setSurname(surname);
        Date birthDate = new Date(System.currentTimeMillis());
        owner.setBirthDate(birthDate);
    }
}