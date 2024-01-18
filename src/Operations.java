import java.util.ArrayList;
import java.util.Scanner;

public class Operations {

    public static void addEmployee(ArrayList<Employees> employeesList) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter new id:");
        int newId=myObj.nextInt();

        myObj.nextLine();

        System.out.println("Enter new name:");
        String newName = myObj.nextLine();

        System.out.println("Enter new address:");
        String newAddress = myObj.nextLine();

        System.out.println("Enter new phone number:");
        String newPhoneNumber = myObj.nextLine();

        System.out.println("Enter new email:");
        String newEmail = myObj.nextLine();
        employeesList.add(new Employees(newId, newName, newAddress, newPhoneNumber, newEmail));

    }

    public static void updateEmployee(ArrayList<Employees> employeesList) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter id to update: ");
        int IdNumber = scan.nextInt();

        Employees employee = employeesList.get(IdNumber);

            Scanner myObj = new Scanner(System.in);

            System.out.println("Enter new name:");
            String newName = myObj.nextLine();

            System.out.println("Enter new address:");
            String newAddress = myObj.nextLine();

            System.out.println("Enter new phone number:");
            String newPhoneNumber = myObj.nextLine();

            System.out.println("Enter new email:");
            String newEmail = myObj.nextLine();

            employee.employeeName = newName;
            employee.employeeAddress = newAddress;
            employee.employeePhoneNumber = newPhoneNumber;
            employee.employeeEmail = newEmail;

            employeesList.set(IdNumber, employee);

            System.out.println("Employee information has been updated successfully.");
    }

    public static void seedEmployee(ArrayList<Employees> employeesList, int id, String name, String address, String phoneNumber, String email) {
        employeesList.add(new Employees(id, name, address, phoneNumber, email));
        System.out.println("Default employee added with ID: " + id);
    }

    public static void deleteEmployee(ArrayList<Employees> employeesList){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter id to delete: ");
        int IdNumber = scan.nextInt();
        for (int i = 0; i < employeesList.size(); i++) {
            Employees employee = employeesList.get(i);
            if (employee.employeeId == IdNumber) {
                employeesList.remove(i);
                i--;
            }
        }
    }
}
