public class SubstanceN1 {
    public String number;
    public String molarmass;
    public String period;
    public String group;
    public String complicasy;
    public String name;

    public SubstanceN1(String number, String molarmass, String period, String group, String complicasy, String name) {
        this.number = number;
        this.molarmass = molarmass;
        this.period = period;
        this.group = group;
        this.complicasy = complicasy;
        this.name = name;
    }
    public String getNumber(){
        return number;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public String getMolarmass(){
        return molarmass;
    }
    public void setMolarmass(String molarmass){
        this.molarmass = molarmass;
    }
    public String getPeriod(){
        return period;
    }
    public void setPeriod(String period){
        this.period = period;
    }
    public String getGroup(){
        return group;
    }
    public void setGroup(String group){
        this.group = group;
    }
    public String getComplicasy(){
        return complicasy;
    }
    public void setComplicasy(String complicasy){
        this.complicasy = complicasy;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
