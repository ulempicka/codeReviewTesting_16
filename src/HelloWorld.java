public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world from github");
        Employee[] employees = {new Employee("a", "b", 1500)};
        EmployeeUtils.getAllSalaries(employees);
    }
}
