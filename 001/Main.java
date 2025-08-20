public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(); // Create Object \\
        // Set value of public method \\
        e1.id = "6810610045";
        e1.name = "Chayanon Thuenwong";
        e1.salary = 50000;

        // Set value of private method by function \\
        e1.setAddress("Saraburi");
        e1.setPostCode("18120");

        System.out.println("Hello " + e1.name + " ID : " + e1.id + " \nSalary : " + e1.salary);
        // Display value of private method \\
        e1.DisplayEmployee();
        
        Employee e2 = new Employee();
        e2.setPostCode("10120");
        // Display selected value from Method \\
        System.out.println(e2.getPostcode());
    }
}