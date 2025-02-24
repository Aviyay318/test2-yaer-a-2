public class Movie {
    private String name;
    private String director;
    private int duration;

    public int getDuration(){
        return this.duration;
    }


   public String getName(){
       return this.name;
   }

    public String toString(){
        return "Movie {" + this.name + " } was directed by {" +  this.director + "}";
    }

}
