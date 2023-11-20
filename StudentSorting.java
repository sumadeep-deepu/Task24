package Task22;
import java.util.*;
import java.util.stream.Collectors;

class Student{
    private int id;
    private String name;
    private double Cgpa;

    public Student(int id,String name,double Cgpa){
        this.id=id;
        this.name=name;
        this.Cgpa=Cgpa;

    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Double getCgpa(){
        return Cgpa;
    }

    public String toString(){
        return "Id : "+id+" Name : "+name+" Cgpa : "+Cgpa;
    }

}

public class StudentSorting {

    public static void main(String[] args) {
        
        List<Student> students=new ArrayList<>();

        students.add(new Student(2, "sumadeep", 3.59));
        students.add(new Student(1, "deepak", 3.37));
        students.add(new Student(3, "deepak", 3.37));

        List<Student> sortedStudents=
        students.stream().sorted(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName).thenComparing(Student::getId)).collect(Collectors.toList());
        System.out.println(sortedStudents);

    }


    
}
