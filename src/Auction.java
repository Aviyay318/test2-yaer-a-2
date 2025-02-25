public class Auction { //מכרז
   private Product product ;
   private Proposal[] proposals;
   private int minimalOffer;
   private int minimalParticipants;


public int getWinner(){
    int max =  0;
   int winnerIndex = 0;

    for (int i = 0; i < this.proposals.length; i++) {
        if (this.proposals[i].getBid()>max){
            max = this.proposals[i].getBid();
            winnerIndex = i;
        }
    }
    return winnerIndex;
}
public String getSecond(int index){
    int secondMax =  0;
    for (int i = 0; i < this.proposals.length; i++) {
        if (this.proposals[i].getBid()>secondMax  &&  this.proposals[index].getBid()!=this.proposals[i].getBid()){
            secondMax = this.proposals[i].getBid();

        }
    }
String text = this.proposals[index].getName() + " " + this.product.getDescription()+ " " + secondMax;
    return text;

}

   public String toString(){
       String text = "";
       if (this.proposals.length<this.minimalParticipants){
           text = "המכרז לא ייתקיים";
       }else {
int maxIndex = getWinner();
 text=getSecond(maxIndex);
       }
   }















   public boolean addProposal(Proposal toAdd){
       boolean addProposal = false;
       if (toAdd.getBid()>this.minimalOffer){
           Proposal [] tempProposal = new Proposal[this.proposals.length+1];
           for (int i = 0; i < this.proposals.length; i++) {
               tempProposal[i]= this.proposals[i];
           }
           tempProposal[tempProposal.length-1] = toAdd;
           this.proposals = tempProposal;
           addProposal = true;
       }
       return addProposal;
   }
}
