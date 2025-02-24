public class Main {
    public static void main(String[] args) {
    MedicineMan[] medicineMan  = {new Nurse(),new FamilyDoctor()};


    }


    public String getMaxTrippleDoubler(BasketBaller[] players){
        int max = 0;
        String maxName = "";
        for (int i = 0; i < players.length; i++) {
            if (max<players[i].countTripleDoubles()){
                max = players[i].countTripleDoubles();
                maxName = players[i].getName();
            }
        }
        return maxName;
    }


public static Candidate mostSuitable(Candidate[] candidates, int type){
      if (type==1){
      return getMaxGrades(candidates,type);
      } else if (type==2) {
      return getMaxYear(candidates, type);
      }else{
       return getLowerSalary(candidates,type);
      }
}

public static Candidate getLowerSalary(Candidate[] candidates,int type){
        int min =  candidates[0].getSalary();
    Candidate candidate = null;
    for (int i = 0; i < candidates.length; i++) {
        if (candidates[i].suitableApplicant()==type){
            if (candidates[i].getSalary()<min){
                min = candidates[i].getSalary();
                candidate = candidates[i];
            }
        }}
    return candidate;
}

public static Candidate getMaxYear(Candidate[] candidates,int type){
    int max = 0;
    Candidate candidate = null;
    for (int i = 0; i < candidates.length; i++) {
        if (candidates[i].suitableApplicant()==type){
            if (candidates[i].getYear()>max){
                max = candidates[i].getYear();
                candidate = candidates[i];
            }
        }}
    return candidate;
}

public static Candidate getMaxGrades(Candidate[] candidates,int type){
        int max = 0;
        Candidate candidate = null;
    for (int i = 0; i < candidates.length; i++) {
        if (candidates[i].suitableApplicant()==type){
            if (candidates[i].getAvg()>max){
                max = candidates[i].getAvg();
                candidate = candidates[i];
            }
        }
    }
    return candidate;
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