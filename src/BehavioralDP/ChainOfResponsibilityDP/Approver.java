package BehavioralDP.ChainOfResponsibilityDP;

// yetki dagilimi icin abstract class
public abstract class Approver {

    Approver chief;

    // parametreli constructor
    public Approver(Approver chief) {
        this.chief = chief;
    }

    // onaylanabilecek kredi limiti
    abstract boolean approveLoan(int amount);
}
