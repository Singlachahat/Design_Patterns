package structural_patterns.Facade_pattern;

public class Main {
    public static void main(String[] args) {
        EMR emrFacade = new EMRfacade();

        //Add patient data
        emrFacade.addPatientData("Name", "John Doe");
        emrFacade.addPatientData("DOB", "1990-01-01");
        emrFacade.addPatientData("Blood Type", "A+");

        // Retrieve patient data
        System.out.println("Patient Name: " + emrFacade.getPatientData("Name"));
        System.out.println("Patient DOB: " + emrFacade.getPatientData("DOB"));
        System.out.println("Patient Blood Type: " + emrFacade.getPatientData("Blood Type"));

        // Create prescription
        emrFacade.createPrescription("Acetaminophen");

        // Schedule appointment
        emrFacade.scheduleAppointment("2024-05-01");
        //System.out.println(emrFacade.MedicalRecord.patientData);
        
    }
}

