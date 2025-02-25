public class Agency {
    private Proprty[] proprties;
    
    public int getSumMeter(){
        int sum = 0;
        for (int i = 0; i < this.proprties.length; i++) {
            sum+=this.proprties[i].getSizeMeter();
        }
        return sum;
    }
    
    public String getMaxProprty(){
        int max = 0;
        String maxName = "";

        for (int i = 0; i < this.proprties.length; i++) {
            int count = 0;
            Seller currentSeller = this.proprties[i].getSeller();
            for (int j = i+1; j < this.proprties.length; j++) {
              Seller tempSeller  = this.proprties[j].getSeller();
              if (currentSeller.getFullName().equals(tempSeller.getFullName())){
                  count++;
              }
            }
            if (max<count){
                max = count;
                maxName = this.proprties[i].getSeller().getFullName();
            }
        }
        return maxName;
    }
}
