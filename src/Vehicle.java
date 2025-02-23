public abstract class Vehicle {
    private String model;
    private int year;
    private int km;

    public Vehicle(String model, int year, int km) {
        this.model = model;
        this.year = year;
        this.km = km;
    }

    public int getPrice() {
        return 400;
    }

    public int getYearWithPrice(){
        return this.year*25;
    }

    public String toString(){
          return "model: " + this.model  + " , year: " + this.year  +" , km: "+this.km;
    }
}
