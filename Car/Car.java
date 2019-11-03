import java.sql.Date;

 public class Car {
    private String number;
    private String markaaa;
    private Date production;
    private String owner;


     public Car(String number, String markaaa, Date production, String owner) {
         this.number = number;
         this.markaaa = markaaa;
         this.production = production;
         this.owner = owner;
     }

     public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMarkaaa() {
        return markaaa;
    }

    public void setMarkaaa(String markaaa) {
        this.markaaa = markaaa;
    }

    public Date getProduction() {
        return production;
    }

    public void setProduction(Date production) {
        this.production = production;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}