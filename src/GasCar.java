public class GasCar extends Vehicle {
    private int tank;
    public GasCar(String model, int year, int km,int tank) {
        super(model, year, km);
        this.tank =tank;
    }
    public boolean setTank(int tank){
        if (tank>=20 && tank<=100){
            this.tank = tank;
            return true;
        }
        return false;
    }

    public String toString(){
        return super.toString() +  " tank:  " + this.tank;
    }

    public int getPrice(){
        int price = super.getPrice() + getYearWithPrice();
        return price;
    }
}
