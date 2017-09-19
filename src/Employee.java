// Ex.3.13: Employee class
//Olga Vasilyeva

public class Employee {

   private String name, family; //first name and last name
   private double salary; //monthly salary

   // a constructor that initializes the three instance variables
   public Employee(String name, String family, double salary){

      //assign names to instance variables
      this.name = name;

      this.family = family;

      if (salary > 0)
         this.salary = salary;
   }

   //methods to set and retrieve the variables
   public void setName(String name){
      this.name = name;
   }
   public String getName(){
      return name;
   }
   public void setFamily(String family){
      this.family = family;
   }
   public String getFamily(){
      return family;
   }
   public void setSalary(double salary){
         this.salary = salary;
   }
   public double getSalary(){
      return salary;
   }

   //method that calculates yearly salary
   public double getYearlySalary(){
      double yearlySalary = salary * 12;
      return yearlySalary;
   }
   public double getNewSalary(){
      double salary2 = (salary + salary * 0.1) * 12;
      return salary2;
   }

}
