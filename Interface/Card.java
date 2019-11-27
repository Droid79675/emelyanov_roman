import java.util.Scanner;

public class Card implements CanPay {
    public String title;
    public String nameClient;
    Scanner scanner = new Scanner(System.in);

    public Card (String title,String nameClient){
        System.out.println("Введите название карты");
        this.title = scanner.nextLine();
        System.out.println("Введите ФИО обладателя карточки");
        this.nameClient = scanner.nextLine();
    }



    @Override
    public void paySomething() {
        System.out.println(this.title);

    }
}
