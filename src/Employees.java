public class Employees {

    public int employeeId;
    public String employeeName;
    public String employeeAddress;
    public String employeePhoneNumber;
    public String employeeEmail;

    public Employees(int employeeId, String employeeName, String employeeAddress, String employeePhoneNumber, String employeeEmail) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeeEmail = employeeEmail;
    }

   public void showData(){
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee Address: "+employeeAddress);
        System.out.println("Employee Phone Number: "+employeePhoneNumber);
        System.out.println("Employee Email: "+employeeEmail);
   }
}
