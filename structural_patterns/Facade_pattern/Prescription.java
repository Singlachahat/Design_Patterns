package structural_patterns.Facade_pattern;

public class Prescription {
    private String medication;

    public Prescription(String medication) {
        this.medication = medication;
    }

    public String getMedication() {
        return medication;
    }
}
