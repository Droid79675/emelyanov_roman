import java.util.Scanner;

public class TransportationalCard extends Card {
    private int paymentOfTransporting;
    String command = null;
    Scanner scanner = new Scanner(System.in);
    public TransportationalCard(String title, String nameClient,int paymentOfTransporting) {
        super(title, nameClient);
        this.paymentOfTransporting = paymentOfTransporting;
    }

    public TransportationalCard(String title, String nameClient){
        super(title, nameClient);
        System.out.println("Являетесь ли вы школьником или студентом или пенсионером?");
        command = scanner.nextLine();
        if (command.equals("Да")){
        this.paymentOfTransporting = 25;
        }
        else if (command.equals("Нет")){
            this.paymentOfTransporting = 27;
        }
    }

    @Override
    public void paySomething(){
        System.out.println(this.title +" "+this.nameClient+" "+ this.paymentOfTransporting);
    }
}
