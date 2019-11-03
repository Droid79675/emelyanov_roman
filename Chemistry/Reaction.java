public class Reaction {
    public String number;
    public String info;


    public Reaction(String number, String info){
        this.number = number;
        this.info = info;
    }
    public String getNumber(){
        return number;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public String getInfo(){
        return info;
    }
    public void setInfo(String info){
        this.info = info;
    }
}
