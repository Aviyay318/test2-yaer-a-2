public class Library {
    private String name;
    private Movie[] movies;



    public int longestMovie(){
        if (this.movies.length==0){
            return 0;
        }else {
           int max =0;
            for (int i = 0; i < this.movies.length; i++) {
                if (max<this.movies[i].getDuration()){
                    max = this.movies[i].getDuration();
                }
            }
            return max;
        }

    }


    public boolean addMovie(Movie movie){
        boolean toAdd = true;
        for (int i = 0; i < this.movies.length; i++) {
            String currentMovie = this.movies[i].getName();
            if (currentMovie.equals(movie.getName())){
                toAdd= false;
                break;
            }
        }
        if (toAdd){
            Movie [] tempMovie = new Movie[this.movies.length+1];
            for (int i = 0; i < this.movies.length; i++) {
               tempMovie[i] = this.movies[i];
            }
            tempMovie[tempMovie.length-1] = movie;
            this.movies = tempMovie;
        }
return toAdd;
    }
}
