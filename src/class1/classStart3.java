package class1;

import java.util.HashMap;
import java.util.Map;

public class classStart3 {

    public static void main(String[] args) {

        Student stud1 = new Student("stud1", 15, 90); //x001
        Student stud2 = new Student("stud2", 16, 80); //x002

        Student[] stud = new Student[]{stud1, stud2};

        for(Student s : stud){
            System.out.println("Name : " + s.getName() + " Age : " + s.getAge() + " Grad : " + s.getGrade());
        }

    }
}
