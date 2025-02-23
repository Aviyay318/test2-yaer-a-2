public class Playlist {
    private String name;
    private Song[] songs;

public String getName(){
    return this.name;
}
    public int size(){
        int sum = 0;
        for (int i = 0; i < this.songs.length; i++) {
            sum+=this.songs[i].getLength();
        }
        return sum;
    }

    public boolean exists(String name, String performerName){
        for (int i = 0; i < this.songs.length; i++) {
            if (this.songs[i].getName().equals(name)&&this.songs[i].getPerformerName().equals(performerName)){
                return true;
            }
        }
        return false;
    }
    public boolean existsTwo(String name, String performerName){
        for (int i = 0; i < this.songs.length; i++) {
            if (this.songs[i].isEquals(performerName,name)){
                return true;
            }
        }
        return false;
    }

}
