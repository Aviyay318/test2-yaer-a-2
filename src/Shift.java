public class Shift {
    private MedicineMan[] medicines;
    private Patient[] patients;


    public Patient[] getPatientsByType(int type){
        int count = 0;
        for (int i = 0; i < this.patients.length; i++) {
            if (this.patients[i].getType()==type&&this.patients[i].isUrgent()){
                count++;
            }
        }
        Patient[] tempPatients = new Patient[count];
        int index = 0;
        for (int i = 0; i < this.patients.length; i++) {
            if (this.patients[i].getType()==type&&this.patients[i].isUrgent()){
              tempPatients[index] = this.patients[i];
              index++;
            }
        }
        return tempPatients;
    }
    
    
    
    
    
    public String mostYear(){
        int max = 0;
        String maxName = "";
        for (int i = 0; i < this.medicines.length; i++) {
            if (this.medicines[i].getYear()>max){
                max = this.medicines[i].getYear();
                maxName = this.medicines[i].getName();
            }
        }
        return maxName;
    }
}
