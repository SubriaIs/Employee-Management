import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Employees> employeesList = new ArrayList<>();

        Operations opt = new Operations();

        opt.seedEmployee(employeesList, 0,"subria", "123 Main St", "555-1234", "subria@example.com");
        opt.seedEmployee(employeesList, 1, "subrikka", "456 Oak St", "555-5678", "subrikka@example.com");

        Boolean continueLoop = true;

        while (continueLoop) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose correct option. ");
            System.out.println("0 is for exiting the program.");
            System.out.println("1 is for add employee.");
            System.out.println("2 is for delete employee.");
            System.out.println("3 is to display all employees' info.");
            System.out.println("4 is for updating an employee.");
            System.out.println("Enter option number: ");

            int num = scan.nextInt();
            switch (num) {
                case 0:
                    continueLoop = false;
                    System.out.println("Thanks for using the employee management program.");
                    break;
                case 1:
                    System.out.println("Welcome to add new employee.");
                    opt.addEmployee(employeesList);

                    break;
                case 2:
                    opt.deleteEmployee(employeesList);
                    break;
                case 3:
                    for (Employees employee : employeesList) {
                        if (employee != null) {
                            employee.showData();
                            System.out.println();
                        }
                    }
                    break;
                case 4:
                    opt.updateEmployee(employeesList);
                    break;
                default:
                    System.out.println("Choose correct option:");
            }
        }
    }
}
