package structural_patterns.Facade_pattern;

import java.util.HashMap;
import java.util.Map;

public class MedicalRecord {
    private Map<String, String> patientData;

    public MedicalRecord() {
        patientData = new HashMap<>();
    }

    public void addData(String key, String value) {
        patientData.put(key, value);
    }

    public String getData(String key) {
        return patientData.get(key);
    }
}
