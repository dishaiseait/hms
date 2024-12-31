import java.util.Scanner;

public class HospitalManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Patient Registration");
            System.out.println("2. Appointment Scheduling");
            System.out.println("3. Electronic Health Records (EHR)");
            System.out.println("4. Billing and Invoicing");
            System.out.println("5. Inventory Management");
            System.out.println("6. Staff Management");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    PatientRegistration.registerPatient();
                    break;
                case 2:
                    AppointmentScheduling.scheduleAppointment();
                    break;
                case 3:
                    ElectronicHealthRecords.viewEHR();
                    break;
                case 4:
                    BillingInvoicing.generateInvoice();
                    break;
                case 5:
                    InventoryManagement.manageInventory();
                    break;
                case 6:
                    StaffManagement.manageStaff();
                    break;
                case 7:
                    exit = true;
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}