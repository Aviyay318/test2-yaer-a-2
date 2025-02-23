public class Truck extends GasCar{
    public Truck(String model, int year, int km, int tank) {
        super(model, year, km, tank);
    }
    public int getPrice(){
        return super.getPrice() + 300;
    }
}
