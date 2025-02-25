public abstract class Shape {
    private String name;
    private int [] sideOfShape;

    public Shape(String name, int sideOfShape){
        this.name = name;
        this.sideOfShape = new int[sideOfShape];
    }




    public int getHekif(){
        int sum = 0;
        for (int i = 0; i < this.sideOfShape.length; i++) {
            sum+=this.sideOfShape[i];
        }
        return sum;
    }

    public abstract int calculateArea();

    public String toString(){
        return this.name + " , " + this.sideOfShape.length;
    }
}
