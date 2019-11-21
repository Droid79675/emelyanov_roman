public class Substance {
    public int number;
    public double molarmass;
    public int period;
    public int group;
    public String name;

    public Substance(int number, double molarmass, int period, int group, String name) {
        this.number = number;
        this.molarmass = molarmass;
        this.period = period;
        this.group = group;
        this.name = name;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public double getMolarmass(){
        return molarmass;
    }
    public void setMolarmass(double molarmass){
        this.molarmass = molarmass;
    }
    public int getPeriod(){
        return period;
    }
    public void setPeriod(int period){
        this.period = period;
    }
    public int getGroup(){
        return group;
    }
    public void setGroup(int group){
        this.group = group;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
