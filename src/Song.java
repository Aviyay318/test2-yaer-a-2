public class Song {
    private String performerName;
    private String name;
    private int length;


    public Song(String performerName,int length,String name){
        this.length = length;
        this.name = name;
        this.performerName = performerName;
    }
    public int getLength(){
        return this.length;
    }
public String toString(){
        return this.name + "/" + this.performerName + " : " + this.length;
}

public boolean isEquals(String performerName,String name){
    boolean isEquals = false;
        if (this.name.equals(name)&&this.performerName.equals(performerName)){
            isEquals = true;
        }
      return isEquals;
}

public String getName(){
        return this.name;
}
    public String getPerformerName(){
        return this.performerName;
    }

}
