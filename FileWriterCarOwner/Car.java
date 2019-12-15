
 public class Car {
    private String number;
    private String markaaa;
    private Owner owner;


     public Car(String number, String markaaa) {
         this.number = number;
         this.markaaa = markaaa;

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

     public Owner getOwner() {
         return owner;
     }

     public void setOwner(Owner owner) {
         this.owner = owner;
     }

}