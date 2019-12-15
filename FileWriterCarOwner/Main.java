import java.io.*;
import java.sql.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static PrintWriter printWriter;
    public static FileWriter fileWriter;
    public static List<Car> cars = new ArrayList<>();
    public static List<Owner> owners = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String command = null;
        Car car = null;
        Information information = null;
        Owner owner = null;
        loadOwners();
        loadCars();
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
                    System.out.println(information.getOwnerInfo(owner));

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
                else if(command.equals("Куплена машина")) {
                    System.out.println("Введите имя владельца");
                    command = scanner.nextLine();
                    owner = Information.findOwner(owners, command);
                    System.out.println("Введите номер машины");
                    command = scanner.nextLine();
                    car = Information.findCar(cars, command);
                    int numberOfCars = 0;
                    owner.setNumberOfCars(numberOfCars);
                    for (numberOfCars = 0; ; numberOfCars++) ;
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

    private static Car createCar() throws IOException {
        System.out.println("Введите номер");
        String number = scanner.nextLine();
        System.out.println("Введите марку");
        String markaaa = scanner.nextLine();
        Date production = new Date(System.currentTimeMillis());
        Car car = new Car(number,markaaa);
        cars.add(car);
        writeCars(cars);
        return car;
    }
    private static Owner createOwner() throws IOException {
        System.out.println("Имя");
        String name = scanner.nextLine();
        System.out.println("Фамилия");
        String surname = scanner.nextLine();
        Owner owner = new Owner(name,surname);
        owners.add(owner);
        writeOwners(owner);
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
    }
    private static void changeOwnerInfo(Owner owner){
        System.out.println("Введите новое имя владельца");
        String name = scanner.nextLine();
        owner.setName(name);
        System.out.println("Введите новую фамилию владельца");
        String surname = scanner.nextLine();
        owner.setSurname(surname);
        Date birthDate = new Date(System.currentTimeMillis());
    }
    public static loadOwners( ) throws FileNotFoundException {
        String fr;
        Scanner scanner;
        scanner = new Scanner(new File("Владельцы.txt"));
        String[] space;
        while (scanner.hasNextLine()) {
            fr = scanner.nextLine();
            space = fr.split(" ");
            owners.add(new Owner(space[0], space[1]));
        }
    }
    public static loadCars () throws FileNotFoundException{
            String fr;
            Scanner scanner;
            scanner = new Scanner(new File("Машины.txt"));
            String [] space;
            while (scanner.hasNextLine()){
                fr = scanner.nextLine();
                space = fr.split(" ");
                cars.add(new Car(space [0], space [1]));
            }
        }

    public static void writeCars(List<Car> cars) throws IOException {
        printWriter = new PrintWriter(new FileWriter(new File("cars.txt")),true);
        for(Car car: cars){
            printWriter.println(car.getNumber() + " " + car.getMarkaaa());
        }
    }
    public static void writeOwners(Owner owner) throws IOException {
        fileWriter = new FileWriter("owners.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(owner.getName() + " " + owner.getSurname() + " " + owner.getNumberOfCars());
        bufferedWriter.close();
    }
}