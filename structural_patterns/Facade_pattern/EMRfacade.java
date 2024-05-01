package structural_patterns.Facade_pattern;

public class EMRfacade implements EMR {
    private MedicalRecord medicalRecord;

     public EMRfacade() {
        medicalRecord = new MedicalRecord();
    }

    public void addPatientData(String key, String value) {
        medicalRecord.addData(key, value);
    }

    public String getPatientData(String key) {
        return medicalRecord.getData(key);
    }

    public void createPrescription(String medication) {
        Prescription prescription = new Prescription(medication);
        // Logic to save prescription to database or other system
        System.out.println("Prescription created for: " + prescription.getMedication());
    }

    public void scheduleAppointment(String date) {
        Appointment appointment = new Appointment(date);
        // Logic to schedule appointment in calendar or appointment system
        System.out.println("Appointment scheduled for: " + appointment.getDate());
    }
}
