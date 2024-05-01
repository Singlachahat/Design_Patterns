package structural_patterns.Facade_pattern;

public interface EMR {
    void addPatientData(String key, String value);
    String getPatientData(String key);
    void createPrescription(String medication);
    void scheduleAppointment(String date);
}
