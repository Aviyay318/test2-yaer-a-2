public class Main {
    public static void main(String[] args) {
//        int x = 4;
//        System.out.println(x);
//        Vehicle vehicle = new Vehicle("t",1990,25);
//        System.out.println(vehicle);
        GasCar gasCar = new GasCar("m", 1997 ,50,80);
        System.out.println(gasCar);


    }
    public static String longestPlaylist(Playlist[] playlists){
        int max = 0;
        String playListName = "";
        for (int i = 0; i < playlists.length; i++) {
            if (max<playlists[i].size()){
                max = playlists[i].size();
                playListName = playlists[i].getName();
            }
        }
return playListName;
    }
}