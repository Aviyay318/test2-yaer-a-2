public class Triangl extends Shape {
    private boolean isYesharZ;

    public Triangl(String name,boolean isYesharZ){
        super(name,3);
        this.isYesharZ = isYesharZ;
    }

    public int calculateArea(){
        return 5*2;
    }

    public String toString(){
        return super.toString() + " ," +this.isYesharZ;
    }

}
