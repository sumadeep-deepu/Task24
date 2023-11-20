package Task22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee{
   private int id;
   private String name;

    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        return "Employeeid : "+id+" name : "+name;
    }

}


public class EmployeeStreams {


    private List<Employee> employeeList=new ArrayList<>();

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }


    public void deleteEmployee(int empId){
        employeeList.removeIf(e->e.getId()==empId);

    }

    public List<Employee> listEmployees(){
        return new ArrayList<>(employeeList);
    }

    public Optional<Employee> findById(int empId){
        return employeeList.stream().filter(e->e.getId()==empId).findFirst();
    }

    public List<Employee> sortById(){
        return employeeList.stream().sorted(Comparator.comparingInt(e->e.getId())).collect(Collectors.toList());
    }

    public List<Employee> sortByName(){
        return employeeList.stream().sorted(Comparator.comparing(e->e.getName())).collect(Collectors.toList());
    }

    public static void main(String[] args) {
       
        EmployeeStreams empManagement=new EmployeeStreams();

        empManagement.addEmployee(new Employee(1, "sumadeep"));
        empManagement.addEmployee(new Employee(3, "charan"));
        empManagement.addEmployee(new Employee(2, "deepak"));


        List<Employee> employees=empManagement.listEmployees();
        System.out.println(employees);

        int empId=3;
        Optional<Employee> foundEmployee=empManagement.findById(empId);
        System.out.println();
        System.out.println(foundEmployee);

        List<Employee> sortedByID=empManagement.sortById();
        System.out.println();
        System.out.println(sortedByID);

        List<Employee> sortedByName=empManagement.sortByName();
        System.out.println();
        System.out.println(sortedByName);

        int deleteById=2;
        empManagement.deleteEmployee(deleteById);
        System.out.println();
        System.out.println("deleted");
        System.out.println();
        System.out.println(empManagement.listEmployees());
        
    }
    
}
