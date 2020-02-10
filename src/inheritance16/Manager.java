package inheritance16;

public class Manager extends Employee{
    private int level;
    public Manager(){
        super();
        level=99;
    }
    public double calculatePay(double h){
        return h*super.getRate()+((double)level/100);
    }
    public String toString(){
        return "Manager; name: "+super.getName()+" rate: "+super.getRate()+" level: "+level;
    }
    public Object clone(){
        return new Manager();//super.getName(), super.getRate(), level
    }
}
