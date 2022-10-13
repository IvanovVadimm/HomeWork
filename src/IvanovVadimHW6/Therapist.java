package IvanovVadimHW6;

public class Therapist extends Doctor {

    private int planLechPatient;


    public Therapist(){

    }

    public Therapist(int planLechPatient) {
        this.planLechPatient = planLechPatient;
    }

    @Override
    public void treat() {
        System.out.println("Therapist is treating");
    }

    public void setTreatmentPlan() {

        if (this.planLechPatient == 1) {
            Surgeon surgeon = new Surgeon();
            surgeon.treat();
        } else if (this.planLechPatient == 2) {
            Dentist dentist = new Dentist();
            dentist.treat();
        } else {
            Therapist therapist = new Therapist();
            therapist.treat();
        }
    }
}
