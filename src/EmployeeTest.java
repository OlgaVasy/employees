//Ex.3.12: EmployeeTest class

public class EmployeeTest {

   public static void main(String[] args) {

      Employee employee1 = new Employee("David", "Grey", 4200.00);
      Employee employee2 = new Employee("Rachel", "Smith", 3100.00);

      //display initial data
      System.out.printf("%s %s yearly salary: $%.2f%n", employee1.getName(), employee1.getFamily(), employee1.getYearlySalary());
      System.out.printf("%s %s yearly salary: $%.2f%n", employee2.getName(), employee2.getFamily(), employee2.getYearlySalary());
      System.out.println();

      //display raise of salary
      System.out.println("after a 10% raise");
      System.out.println();
      System.out.printf("%s %s yearly salary: $%.2f%n", employee1.getName(), employee1.getFamily(), employee1.getNewSalary());
      System.out.printf("%s %s yearly salary: $%.2f%n", employee2.getName(), employee2.getFamily(), employee2.getNewSalary());

   }
}
