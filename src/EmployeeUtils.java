public class EmployeeUtils {
    public static double getAllSalaries(Employee[] employees){
        double salarySum = 0;
        for (Employee employee : employees) {
            salarySum += employee.getSalary();
        }
        return salarySum;
    }
}
