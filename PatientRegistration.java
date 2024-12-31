import java.util.ArrayList;
import java.util.List;

class Patient {
    String name;
    int age;
    String contact;

    public Patient(String name, int age, String contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Contact: " + contact;
    }
}

class PatientRegistration {
    private static List<Patient> patients = new ArrayList<>();

    public static void registerPatient() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter patient age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter patient contact: ");
        String contact = scanner.nextLine();

        patients.add(new Patient(name, age, contact));
        System.out.println("Patient registered successfully!");
    }
}