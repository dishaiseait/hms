class BillingInvoicing {
    public static void generateInvoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        System.out.println("Invoice generated for " + name + ": $" + amount);
    }
}