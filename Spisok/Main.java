
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Node next;
        Node thic;
        String command;
        String value;

        Scanner sc = new Scanner(System.in);
        List list = new List();
        while (true) {
            command = sc.nextLine();
            if (command.equals("1")) {
                System.out.println("Накалякайте цифирку");
                value = sc.nextLine();
                list.add(value);

            }
            if (list.getNow() != null) {
                next = list.getNow();
                System.out.println(next.getValue());
                thic = next.getNext();
                while (thic != null) {
                    System.out.println(thic.getValue());
                    thic = thic.getNext();

                }
            }
            else{
                System.out.println("Нани в списке - пусто!");
            }
            if (command.equals("2")){
                System.out.println("Я лохъ, не смог реализовать функцию удаления цифирки из списка((");
            }

        }

    }
}