public class Day{
    Integer positive;
    Integer hospitalizedCurrently;
    Integer hospitalizedCumulative;
    Integer recovered;
    Integer death;
    Integer date;
    Integer deathIncrease;
    Integer positiveIncrease;
    String state;

    //getters
    public Integer getPositive(){
        return positive;
    }
    public Integer getHospitalizedCurrently(){
        return hospitalizedCurrently;
    }
    public Integer getHospitalizedCumulative(){
        return hospitalizedCumulative;
    }
    public Integer getRecovered(){
        return recovered;
    }
    public Integer getDeath(){
        return death;
    }
    public Integer getDate(){
        return date;
    }
    public Integer getDeathIncrease(){
        return deathIncrease;
    }
    public Integer getPositiveIncrease(){
        return positiveIncrease;
    }
    public String getState(){
        return state;
    }

    //Setters
    public void setPositive(Integer positive){
        this.positive = positive;
    }
    public void setHospitalizedCurrently(Integer hospitalizedCurrently){
        this.hospitalizedCurrently = hospitalizedCurrently;
    }
    public void setHospitalizedCumulative(Integer hospitalizedCumulative){
        this.hospitalizedCumulative = hospitalizedCumulative;
    }
    public void setRecovered(Integer recovered){
        this.recovered = recovered;
    }
    public void setDeath(Integer death){
        this.death = death;
    }
    public void setDate(Integer date){
        this.date = date;
    }
    public void setDeathIncrease(Integer deathIncrease){
        this.deathIncrease = deathIncrease;
    }
    public void setPositiveIncrease(Integer positiveIncrease){
        this.positiveIncrease = positiveIncrease;
    }
    public void setState(String state){
        this.state = state;
    }

    public String toString(){
        return "Positive: " + positive + " State: " + state;
    }
}