import java.util.Scanner;

public class SchoolishCard extends Card {
    private int paymentOfFood;
    Scanner scanner = new Scanner (System.in);
    public SchoolishCard(String title, String nameClient,int paymentOfFood) {
        super(title,nameClient);
        this.paymentOfFood = paymentOfFood ;
    }
    public SchoolishCard(String title, String nameClient){
        super (title,nameClient);
        this.paymentOfFood = scanner.nextInt();
    }



    @Override
    public void paySomething(){
        System.out.println(this.title+" "+this.nameClient+" "+this.paymentOfFood);
    }
}
