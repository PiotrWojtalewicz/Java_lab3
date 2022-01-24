public class Student extends Osoba {
protected String department;
protected String fieldOfStudy;
 public Student(String name, String surname, int age, String department, String fieldOfStudy){
     super(name, surname, age);
     this.department = department;
     this.fieldOfStudy = fieldOfStudy;
 }

    public String getDepartment() {
        return department;
    }
    void setDepartment(String department){
     if (department.length()>=1){
         this.department = department;
     }


    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }
    void setFieldOfStudy(String fieldOfStudy){
        if (fieldOfStudy.length()>=1){
            this.fieldOfStudy = fieldOfStudy;
        }
 }
    @Override

    public String toString() {
        return "Student: {" +
                "name= " + super.name + '\'' +
                ", surname= " + surname + '\'' +
                ", age= " + age + '\'' +
                ", department= " + department + '\'' +
                ", fieldOfStudy= " + fieldOfStudy + '\''+
                '}';
    }
}
