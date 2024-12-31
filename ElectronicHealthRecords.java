class HealthRecord {
    String patientName;
    String diagnosis;
    String treatment;

    public HealthRecord(String patientName, String diagnosis, String treatment) {
        this.patientName = patientName;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    @Override
    public String toString() {
        return "Patient: " + patientName + ", Diagnosis: " + diagnosis + ", Treatment: " + treatment;
    }
}

class ElectronicHealthRecords {
    private static List<HealthRecord> healthRecords = new ArrayList<>();

    public static void viewEHR() {
        if (healthRecords.isEmpty()) {
            System.out.println("No health records available.");
        } else {
            for (HealthRecord record : healthRecords) {
                System.out.println(record);
            }
        }
    }
}