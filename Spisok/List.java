import java.util.Scanner;

public class List {
    Node now;
    Node incoming;

    public void add(String value) {
        System.out.println("Список пополнился");
        Node h = new Node();
        h.setNext(null);
        h.setValue(value);
        if (now == null) {
            now = h;
            incoming = h;
        } else {
            incoming.setNext(h);
            incoming = h;
        }
    }



    public List(){
        this.now = null;
        this.incoming = null;
    }
    public Node getNow(){
        return now;
    }
    public Node setNow(){
        this.now = now;
        return now;
    }
    public Node getIncoming(){
        return incoming;
    }
    public Node setIncoming(){
        this.incoming = incoming;
        return incoming;
    }
}
