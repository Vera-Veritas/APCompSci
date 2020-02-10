package inheritance16;

public class Worker extends Employee{
    private int years;
    public Worker(){
        super();
        years=11;
    }
    public double calculatePay(double h){
        if(years>10)
        return h*super.getRate()*1.2;
        else
        return h*super.getRate();
    }
    public String toString(){
        return "Worker; name: "+super.getName()+" rate: "+super.getRate()+" years: "+years;
    }

}


