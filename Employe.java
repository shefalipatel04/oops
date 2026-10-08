class Employe{
    String name ;
    int employeeId;
    double salary ;
  Employe(String name , int employeeId , double salary ){
    this.name = name ;
    this.employeeId = employeeId ;
    this.salary = salary;
  }  
  void displayDetails(){
    System.out.println("Name of employee : " + name);
     System.out.println("employee ID : " + employeeId);
      System.out.println("salary for employee :" + salary );
  }
  double caclulateBonus(){
    return salary*0.10;
  }
}
class Faculty extends Employe{
    String department;
    Faculty(String name , int employeeId , double salary , String department){
        super(name , employeeId , salary);
        this.department = department;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Department : " + department);
    }
        double caclulateBonus(){
        return salary*0.20;
    }
    
}
class AdministrativeStaff extends Employe{
    String designation;
    AdministrativeStaff(String name , int  employeeId , double salary, String designation){
        super(name , employeeId , salary);
        this.designation = designation;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Designation : " + designation);
    }
    double caclulateBonus(){
        return salary*0.15;
    }
}
class UniversityDemo{
    public static void main(String[] args){
        Employe employee = new Employe("Shyam" , 101 , 10000);
        Faculty faculty = new Faculty("Meet" , 102 , 12000 , "Computer Science " );
        AdministrativeStaff staff = new AdministrativeStaff("kripasha" , 103 , 50000 , "officer manager");
        System.out.println("Employee detailed");
        employee.displayDetails();
        System.out.println("employee bonus " + employee.caclulateBonus());

        System.out.println("Faculty detailed");
        faculty.displayDetails();
        System.out.println("faculty bonus " + faculty.caclulateBonus());

        System.out.println("Adminsitative detailed");
        staff.displayDetails();
        System.out.println("staff bonus" + staff.caclulateBonus());
    }
}
