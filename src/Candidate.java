public class Candidate {
    private int year;
    private int salary;
    private String[] languages;
    private int avg;


    private int howMuchL(){
        int count = 0;
        for (int i = 0; i < this.languages.length; i++) {
            if (this.languages[i].equals("PYTHON")||this.languages[i].equals("JAVA")||this.languages[i].equals("JAVASCRIPT")){
                count++;
            }
        }
        return count;
    }

    public int getSalary(){
        return  this.salary;
    }


    public int getAvg(){
        return this.avg;
    }
    public int getYear(){
        return this.year;
    }

    public int suitableApplicant(){
        if (this.avg>=80&&howMuchL()>=2&&this.salary<=16000){
            return 1;
        }
        if(this.year>=3&&howMuchL()==3&&this.salary<=30000){
            return 2;
        }
        return 0;
    }
}
