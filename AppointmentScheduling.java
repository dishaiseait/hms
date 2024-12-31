class Appointment {
    String patientName;
    String date;
    String time;

    public Appointment(String patientName, String date, String time) {
        this.patientName = patientName;
        this.date = date;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Appointment for " + patientName + " on " + date + " at " + time;
    }
}

class AppointmentScheduling {
    private static List<Appointment> appointments = new ArrayList<>();

    public static void scheduleAppointment() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter appointment date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter appointment time (HH:MM): ");
        String time = scanner.nextLine();

        appointments.add(new Appointment(name, date, time));
        System.out.println("Appointment scheduled successfully!");
    }
}