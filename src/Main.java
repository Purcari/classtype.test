public class Main {
    public static void main(String[] args) {
        Person sabina = new Person("Sabina Bedeu","25-06-1986");
        System.out.println("sabina");
        Professor myTeacher = new Professor();
        Student myStudent = new Student();

    }
}
     public class Person {

         private double height;
         private double weight;
         private int age;
         private char sex;
         private String fullName;
         private String dateofBirth;

         public Person(String fullName, String dateofBirth, int height, int weight, char sex) {
             this.fullName = fullName;
             this.dateofBirth = dateofBirth;
             this.height = height;
             this.weight = weight;
             this.sex = sex;
         }

         public Person(String fullName, String dateofBirth) {
             this.fullName = fullName;
             this.dateofBirth = dateofBirth;
         }

         public Person() {

         }

         public void setFullName(String fullName) {
             this.fullName = fullName;
         }

         public String getFullName() {
             return this.fullName;
         }

         public void setAge(int age) {
             if (this.age < age) {
                 System.out.println("Error! Age cannot be less than current age.");
             } else {
                 if (age < 0 || age >= 120) {
                     System.out.println("Error! Age is invalid.");
                     this.age = 0;
                 } else {
                     this.age = age;
                 }
             }
         }

         @Override
         public String toString() {
             return "Name: " + fullName + " Date of birth: " + dateofBirth + "Age: " + age;
         }


    import java.util.ArrayLst;

    public class Professor extends  Person {
        String speciality;
        ArrayList <String> groups;

        public Professor (String speciality) {
            super();
            this.speciality = speciality;
        }
    }
    import java.util.ArrayList;

    public class Student extends Person {
        ArrayList <String> groups;
        String subjects;
    }





}