import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new TransportationalCard("",""));
        cards.add(new SchoolishCard("",""));


        for (Card card : cards){
            card.paySomething();
        }
    }
}
