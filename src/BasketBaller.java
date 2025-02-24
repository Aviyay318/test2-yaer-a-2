public class BasketBaller {
    private String name;
    private int [] points;
    private int [] rebounds;
    private int [] assists;




public String getName(){
    return this.name;
}






    private int howMuchPRA(int i){
       int countDS = 0;
       if (this.points[i]>=10&&this.points[i]<=99){
           countDS++;
       }
        if (this.rebounds[i]>=10&&this.rebounds[i]<=99){
            countDS++;
        }
        if (this.assists[i]>=10&&this.assists[i]<=99){
            countDS++;
        }
        return countDS;
    }
























   public int countDoubleDoubles(){
       int count = 0;
       for (int i = 0; i < this.points.length; i++) {
           if (howMuchPRA(i)==2){
               count++;
           }
       }
       return count;
   }
    public int countTripleDoubles(){
        int count = 0;
        for (int i = 0; i < this.points.length; i++) {
            if (howMuchPRA(i)==3){
                count++;
            }
        }
        return count;
    }



}
