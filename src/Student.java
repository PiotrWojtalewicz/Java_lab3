public class Student extends Osoba {
protected String department;
protected String FieldOfStudy;
 public Student(String name, String surname, int age, String department, String FieldOfStudy){
     super(name, surname, age);
     this.department = department;
     this.FieldOfStudy = FieldOfStudy;
 }
}
